package org.covscript.devkt.lang.psi.impl

import org.covscript.devkt.lang.CovTokenType
import org.covscript.devkt.lang.orFalse
import org.covscript.devkt.lang.psi.*
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement
import org.jetbrains.kotlin.com.intellij.lang.ASTNode
import org.jetbrains.kotlin.com.intellij.psi.*
import org.jetbrains.kotlin.com.intellij.psi.scope.PsiScopeProcessor
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil

interface ICovVariableDeclaration : PsiNameIdentifierOwner

abstract class CovVariableDeclarationMixin(node: ASTNode) : CovVariableDeclaration, TrivialDeclaration(node) {
	private var idCache: PsiElement? = null
	override fun getNameIdentifier() = idCache
			?: children.firstOrNull { it is CovSymbol }.also { idCache = it }

	override fun subtreeChanged() {
		idCache = null
		super.subtreeChanged()
	}
}

abstract class TrivialDeclaration(node: ASTNode) : ASTWrapperPsiElement(node), PsiNameIdentifierOwner {
	private var refCache: Array<PsiReference>? = null
	override fun setName(newName: String) = also {
		nameIdentifier.run { CovTokenType.fromText(newName, project).let(::replace) }
		references.forEach { it.handleElementRename(newName) }
	}

	override fun getName() = nameIdentifier?.text
	open val startPoint: PsiElement
		get() = PsiTreeUtil.getParentOfType(this, CovStatement::class.java, true)?.parent ?: parent

	override fun getReferences() = refCache
			?: nameIdentifier
					?.let { collectFrom(startPoint, it.text, it) }
					?.also { refCache = it }
			?: emptyArray()

	override fun processDeclarations(
			processor: PsiScopeProcessor, substitutor: ResolveState, lastParent: PsiElement?, place: PsiElement) =
			nameIdentifier?.processDeclarations(processor, substitutor, lastParent, place).orFalse() and
					processDeclTrivial(processor, substitutor, lastParent, place)

	override fun subtreeChanged() {
		refCache = null
		super.subtreeChanged()
	}
}

interface ICovFunctionDeclaration : PsiNameIdentifierOwner

abstract class CovFunctionDeclarationMixin(node: ASTNode) : CovFunctionDeclaration, TrivialDeclaration(node) {
	private var nameCache: PsiElement? = null
	override fun getNameIdentifier() = nameCache
			?: children.firstOrNull { it is CovSymbol }.also { nameCache = it }

	override fun processDeclarations(
			processor: PsiScopeProcessor, substitutor: ResolveState, lastParent: PsiElement?, place: PsiElement) =
			symbolList.asReversed().all {
				it.processDeclarations(processor, substitutor, lastParent, place)
			} and processDeclTrivial(processor, substitutor, lastParent, place)

	override fun subtreeChanged() {
		nameCache = null
		super.subtreeChanged()
	}
}

abstract class CovExprMixin(node: ASTNode) : ASTWrapperPsiElement(node), CovExpr

abstract class CovForStatementMixin(node: ASTNode) : TrivialDeclaration(node),
		CovForStatement {
	override fun getNameIdentifier() = symbol
}

abstract class CovNamespaceDeclarationMixin(node: ASTNode) : CovNamespaceDeclaration, TrivialDeclaration(node) {
	override fun getNameIdentifier() = symbol
}

interface ICovStructDeclaration : PsiNameIdentifierOwner {
	override fun getNameIdentifier(): CovExpr?
}

interface ICovSymbol : PsiNameIdentifierOwner, CovExpr {
	val isException: Boolean
	val isLoopVar: Boolean
	val isParameter: Boolean
	val isVar: Boolean
	val isConstVar: Boolean
	val isFunctionName: Boolean
	val isStructName: Boolean
	val isNamespaceName: Boolean
	val isDeclaration: Boolean
}

abstract class CovSymbolMixin(node: ASTNode) : CovSymbol, CovExprMixin(node) {
	final override val isException: Boolean get() = parent.let { it is CovTryCatchStatement && it.nameIdentifier === this }
	final override val isLoopVar: Boolean get() = parent.let { it is CovForStatement && it.nameIdentifier === this }
	final override val isVar: Boolean get() = parent.let { it is CovVariableDeclaration && it.nameIdentifier === this }
	final override val isConstVar: Boolean get() = isVar && parent.firstChild.node.elementType == CovTypes.CONST_KEYWORD
	final override val isParameter: Boolean get() = parent.let { it is CovFunctionDeclaration && it.nameIdentifier !== this }
	final override val isNamespaceName: Boolean get() = parent is CovNamespaceDeclaration
	final override val isStructName: Boolean get() = parent.let { it is CovStructDeclaration && it.nameIdentifier === this }
	final override val isFunctionName: Boolean get() = parent.let { it is CovFunctionDeclaration && it.nameIdentifier === this }
	final override val isDeclaration: Boolean
		get() = isException ||
				isLoopVar ||
				isVar ||
				isConstVar ||
				isNamespaceName ||
				isFunctionName ||
				isStructName ||
				isParameter

	override fun getNameIdentifier() = this
	override fun getName() = text
	override fun setName(name: String) = CovTokenType.fromText(name, project).also { replace(it) }
}
