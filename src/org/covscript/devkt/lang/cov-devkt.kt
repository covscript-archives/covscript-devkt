package org.covscript.devkt.lang

import org.covscript.devkt.lang.psi.CovSymbol
import org.covscript.devkt.lang.psi.CovTypes
import org.ice1000.devkt.openapi.*
import org.ice1000.devkt.openapi.ui.IconLoader
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType
import javax.swing.Icon

class CovScript<TextAttributes> : ExtendedDevKtLanguage<TextAttributes>(
		CovLanguage.INSTANCE,
		CovParserDefinition()) {
	override fun satisfies(fileName: String) = fileName.endsWith(".csc") or fileName.endsWith(".csp")
	override val lineCommentStart: String get() = "# "
	override val icon: Icon = IconLoader.getIcon("/icons/csc.png")

	override fun annotate(
			element: PsiElement,
			document: AnnotationHolder<TextAttributes>,
			colorScheme: ColorScheme<TextAttributes>) {
		when (element) {
			is CovSymbol -> symbol(element, document, colorScheme)
			else -> super.annotate(element, document, colorScheme)
		}
	}

	override fun attributesOf(type: IElementType, colorScheme: ColorScheme<TextAttributes>) = when (type) {
		in CovTokenType.KEYWORDS_LIST -> colorScheme.keywords
		in CovTokenType.OPERATOR_LIST -> colorScheme.operators
		in CovTokenType.COMMENTS -> colorScheme.lineComments
		CovTypes.NUM -> colorScheme.numbers
		CovTypes.STR -> colorScheme.string
		CovTypes.CHAR -> colorScheme.charLiteral
		CovTypes.COLLAPSER_BEGIN, CovTypes.COLLAPSER_END -> colorScheme.typeParam
		else -> super.attributesOf(type, colorScheme)
	}

	private fun symbol(
			element: CovSymbol,
			document: AnnotationHolder<TextAttributes>,
			colorScheme: ColorScheme<TextAttributes>) {
		when {
			element.isFunctionName -> document.highlight(element, colorScheme.function)
			element.isVar -> document.highlight(element, colorScheme.variable)
		}
	}
}
