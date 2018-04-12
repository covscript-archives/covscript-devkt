package org.covscript.lang.psi

import org.covscript.lang.CovTokenType
import org.covscript.lang.psi.impl.treeWalkUp
import org.jetbrains.kotlin.com.intellij.openapi.util.Key
import org.jetbrains.kotlin.com.intellij.openapi.util.TextRange
import org.jetbrains.kotlin.com.intellij.psi.*
import org.jetbrains.kotlin.com.intellij.psi.impl.source.resolve.ResolveCache
import org.jetbrains.kotlin.com.intellij.psi.scope.PsiScopeProcessor
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil

class CovSymbolRef constructor(private val symbol: CovSymbol) : PsiPolyVariantReference {
	private var refTo: PsiNameIdentifierOwner? = null
	override fun getElement() = symbol
	override fun getRangeInElement() = TextRange(0, element.textLength)
	override fun bindToElement(ref: PsiElement) = ref.also { refTo = it as? PsiNameIdentifierOwner }
	override fun isSoft() = true
	override fun equals(other: Any?) = (other as? CovSymbolRef)?.element == element
	override fun hashCode() = element.hashCode()
	override fun getCanonicalText(): String = element.text
	override fun handleElementRename(newName: String) = CovTokenType
			.fromText(newName, element.project)
			.let(element::replace)
			.also { refTo?.setName(newName) }

	override fun getVariants(): Array<Any> = emptyArray()
	override fun isReferenceTo(o: PsiElement?) = o === refTo || o === resolve()
	override fun resolve() = refTo
			?: multiResolve(false)
					.firstOrNull()?.element.also { refTo = it as? PsiNameIdentifierOwner }

	override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
		if (element.isDeclaration or !element.isValid or element.project.isDisposed) return emptyArray()
		val file = element.containingFile ?: return emptyArray()
		return ResolveCache
				.getInstance(element.project)
				.resolveWithCaching(this, resolver, true, incompleteCode, file)
	}

	private companion object ResolverHolder {
		private val resolver = ResolveCache.PolyVariantResolver<CovSymbolRef> { ref, incompleteCode ->
			val processor = SymbolResolveProcessor(ref, incompleteCode)
			val file = ref.element.containingFile ?: return@PolyVariantResolver emptyArray()
			treeWalkUp(processor, ref.element, file)
			processor.candidateSet.toTypedArray()
		}
	}
}

abstract class ResolveProcessor<ResolveResult>(private val place: PsiElement) : PsiScopeProcessor {
	abstract val candidateSet: ArrayList<ResolveResult>
	override fun handleEvent(event: PsiScopeProcessor.Event, o: Any?) = Unit
	override fun <AnyNullable> getHint(hintKey: Key<AnyNullable>): AnyNullable? where AnyNullable : Any? = null
	protected val PsiElement.hasNoError get() = (this as? StubBasedPsiElement<*>)?.stub != null || !PsiTreeUtil.hasErrorElements(this)

	protected fun isInScope(element: PsiElement) = if (element is CovSymbol) when {
		element.isParameter or
				element.isException or
				element.isLoopVar -> PsiTreeUtil.isAncestor(element.parent, place, true)
		element.isDeclaration -> PsiTreeUtil.isAncestor(
				PsiTreeUtil.getParentOfType(element, CovStatement::class.java)?.parent, place, false)
		else -> false
	} else false
}

class SymbolResolveProcessor(private val name: String, place: PsiElement, val incompleteCode: Boolean) :
		ResolveProcessor<PsiElementResolveResult>(place) {
	constructor(ref: CovSymbolRef, incompleteCode: Boolean) : this(ref.canonicalText, ref.element, incompleteCode)

	override val candidateSet = ArrayList<PsiElementResolveResult>(3)
	fun accessible(element: PsiElement) = element.hasNoError && name == element.text && isInScope(element)
	override fun execute(element: PsiElement, resolveState: ResolveState) = when {
		candidateSet.isNotEmpty() -> false
		element is CovSymbol -> {
			val accessible = accessible(element) and element.isDeclaration
			if (accessible) candidateSet += PsiElementResolveResult(element, element.hasNoError)
			!accessible
		}
		else -> true
	}
}

