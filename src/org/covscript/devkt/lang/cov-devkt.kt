package org.covscript.devkt.lang

import org.covscript.devkt.lang.psi.CovSymbol
import org.covscript.devkt.lang.psi.CovTypes
import org.ice1000.devkt.ASTToken
import org.ice1000.devkt.openapi.*
import org.ice1000.devkt.openapi.ui.IconLoader
import org.ice1000.devkt.openapi.util.CompletionElement
import org.ice1000.devkt.ui.DevKtDocumentHandler
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType
import javax.swing.Icon

class CovScript<TextAttributes> : ExtendedDevKtLanguage<TextAttributes>(
		CovLanguage.INSTANCE,
		CovParserDefinition()) {
	override fun satisfies(fileName: String) = fileName.endsWith(".csc") or fileName.endsWith(".csp")
	override val lineCommentStart: String get() = "# "
	override val icon: Icon = IconLoader.getIcon("/icons/csc.png")
	override val initialCompletionElementList = listOf("if",
			"else",
			"end",
			"new",
			"gcnew",
			"typeid",
			"while",
			"for",
			"package",
			"using",
			"true",
			"false",
			"null",
			"import",
			"var",
			"const",
			"namespace",
			"function",
			"break",
			"continue",
			"return",
			"block",
			"to",
			"iterate",
			"until",
			"loop",
			"step",
			"throw",
			"try",
			"catch",
			"struct",
			"switch",
			"case",
			"default",
			"not",
			"and",
			"or",
			"override",
			"extends"
	).mapTo(HashSet()) {
		CompletionElement(it, type = "Keyword")
	} + listOf(object : CompletionElement("system.out.println", "sout") {
		override fun afterInsert(documentHandler: DevKtDocumentHandler<*>) = documentHandler.insert("(")
	})

	override fun invokeAutoPopup(currentElement: ASTToken, inputString: String): Boolean {
		return inputString == ">" || super.invokeAutoPopup(currentElement, inputString)
	}

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
		CovTypes.NUM -> colorScheme.numbers
		CovTypes.STR -> colorScheme.string
		CovTypes.CHAR -> colorScheme.charLiteral
		CovTypes.COLLAPSER_BEGIN, CovTypes.COLLAPSER_END -> colorScheme.macro
		in CovTokenType.KEYWORDS_LIST -> colorScheme.keywords
		in CovTokenType.OPERATOR_LIST -> colorScheme.operators
		in CovTokenType.COMMENTS -> colorScheme.lineComments
		else -> super.attributesOf(type, colorScheme)
	}

	private fun symbol(
			element: CovSymbol,
			document: AnnotationHolder<TextAttributes>,
			colorScheme: ColorScheme<TextAttributes>) {
		when {
			element.isFunctionName -> document.highlight(element, colorScheme.function)
			element.isNamespaceName -> document.highlight(element, colorScheme.namespace)
			element.isConstVar -> document.highlight(element, colorScheme.property)
			element.isVar -> document.highlight(element, colorScheme.variable)
		}
	}
}
