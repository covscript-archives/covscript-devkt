package org.covscript.lang

import org.ice1000.devkt.config.ColorScheme
import org.ice1000.devkt.lang.*
import org.ice1000.devkt.ui.AnnotationHolder
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType

class CovScript<TextAttributes> : ExtendedProgrammingLanguage<TextAttributes>(
		CovScriptAnnotator<TextAttributes>(),
		CovScriptSyntaxHighlighter<TextAttributes>(),
		CovLanguage.INSTANCE,
		CovParserDefinition()) {
	override fun satisfies(fileName: String) = fileName.endsWith(".csc") or fileName.endsWith(".csp")
}

class CovScriptSyntaxHighlighter<TextAttributes> : SyntaxHighlighter<TextAttributes> {
	override fun attributesOf(type: IElementType, colorScheme: ColorScheme<TextAttributes>) = when (type) {
		in CovTokenType.KEYWORDS_LIST -> colorScheme.keywords
		in CovTokenType.COMMENTS -> colorScheme.lineComments
		else -> null
	}
}

class CovScriptAnnotator<TextAttributes> : Annotator<TextAttributes> {
	override fun annotate(
			element: PsiElement,
			document: AnnotationHolder<TextAttributes>,
			colorScheme: ColorScheme<TextAttributes>) {
	}
}
