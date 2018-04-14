package org.covscript.devkt.lang

import org.covscript.devkt.lang.psi.CovSymbol
import org.covscript.devkt.lang.psi.CovTypes
import org.ice1000.devkt.config.ColorScheme
import org.ice1000.devkt.lang.*
import org.ice1000.devkt.ui.swing.AnnotationHolder
import org.jetbrains.kotlin.com.intellij.lexer.Lexer
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType

class CovScriptSyntaxHighlighter<TextAttributes> : SyntaxHighlighter<TextAttributes> {
	override fun attributesOf(type: IElementType, colorScheme: ColorScheme<TextAttributes>) = when (type) {
		in CovTokenType.KEYWORDS_LIST -> colorScheme.keywords
		in CovTokenType.COMMENTS -> colorScheme.lineComments
		CovTypes.NUM -> colorScheme.numbers
		CovTypes.STR, CovTypes.CHAR -> colorScheme.string
		CovTypes.COLLAPSER_BEGIN, CovTypes.COLLAPSER_END -> colorScheme.typeParam
		else -> null
	}
}

class CovScriptAnnotator<TextAttributes> : Annotator<TextAttributes> {
	override fun annotate(
			element: PsiElement,
			document: AnnotationHolder<TextAttributes>,
			colorScheme: ColorScheme<TextAttributes>) {
		when (element) {
			is CovSymbol -> symbol(element, document, colorScheme)
		}
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

class CovScript<TextAttributes> : ExtendedDevKtLanguage<TextAttributes>(
		CovLanguage.INSTANCE,
		CovParserDefinition()),
		Annotator<TextAttributes> by CovScriptAnnotator(),
		SyntaxHighlighter<TextAttributes> by CovScriptSyntaxHighlighter() {
	override fun satisfies(fileName: String) = fileName.endsWith(".csc") or fileName.endsWith(".csp")
	override val lineCommentStart: String get() = "# "
}
