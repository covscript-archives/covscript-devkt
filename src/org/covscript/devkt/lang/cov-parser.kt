package org.covscript.devkt.lang

import org.jetbrains.kotlin.com.intellij.lang.*
import org.jetbrains.kotlin.com.intellij.lexer.FlexAdapter
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.com.intellij.psi.*
import org.jetbrains.kotlin.com.intellij.psi.tree.*
import org.covscript.devkt.lang.psi.CovTypes
import org.jetbrains.kotlin.com.intellij.extapi.psi.PsiFileBase
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class CovLexerAdapter : FlexAdapter(CovLexer())

class CovFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CovLanguage.INSTANCE) {
	override fun getFileType() = CovFileType
}

object CovFileType : LanguageFileType(CovLanguage.INSTANCE) {
	override fun getDefaultExtension() = COV_EXTENSION
	override fun getIcon(): Icon? = null
	override fun getName() = COV_NAME
	override fun getDescription() = "CovScript Programming Language"
}

class CovParserDefinition : ParserDefinition {
	private companion object {
		private val FILE = IFileElementType(CovLanguage.INSTANCE)
	}

	override fun createFile(viewProvider: FileViewProvider) = CovFile(viewProvider)
	override fun createParser(project: Project?) = CovParser()
	override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?) = ParserDefinition.SpaceRequirements.MAY
	override fun createLexer(project: Project?) = CovLexerAdapter()
	override fun getFileNodeType() = FILE
	override fun createElement(astNode: ASTNode?): PsiElement = CovTypes.Factory.createElement(astNode)
	override fun getStringLiteralElements() = CovTokenType.STRINGS
	override fun getCommentTokens() = CovTokenType.COMMENTS
	override fun getWhitespaceTokens(): TokenSet = TokenSet.WHITE_SPACE
}

class CovTokenType(debugName: String) : IElementType(debugName, CovLanguage.INSTANCE) {
	companion object {
		@JvmField val COMMENTS = TokenSet.create(CovTypes.LINE_COMMENT, CovTypes.COMMENT)
		@JvmField val STRINGS = TokenSet.create(CovTypes.STR, CovTypes.CHAR, CovTypes.STRING, CovTypes.CHAR_LIT)
		@JvmField val SYMBOLS = TokenSet.create(CovTypes.SYM, CovTypes.SYMBOL)
		fun fromText(name: String, project: Project): PsiElement = PsiFileFactory
				.getInstance(project)
				.createFileFromText(CovLanguage.INSTANCE, name)
				.firstChild

		@JvmField val KEYWORDS_LIST = TokenSet.create(
				CovTypes.IF_KEYWORD,
				CovTypes.ELSE_KEYWORD,
				CovTypes.END_KEYWORD,
				CovTypes.NEW_KEYWORD,
				CovTypes.GCNEW_KEYWORD,
				CovTypes.TYPEID_KEYWORD,
				CovTypes.WHILE_KEYWORD,
				CovTypes.FOR_KEYWORD,
				CovTypes.PACKAGE_KEYWORD,
				CovTypes.USING_KEYWORD,
				CovTypes.TRUE_KEYWORD,
				CovTypes.FALSE_KEYWORD,
				CovTypes.NULL_KEYWORD,
				CovTypes.IMPORT_KEYWORD,
				CovTypes.VAR_KEYWORD,
				CovTypes.CONST_KEYWORD,
				CovTypes.NAMESPACE_KEYWORD,
				CovTypes.FUNCTION_KEYWORD,
				CovTypes.BREAK_KEYWORD,
				CovTypes.CONTINUE_KEYWORD,
				CovTypes.RETURN_KEYWORD,
				CovTypes.BLOCK_KEYWORD,
				CovTypes.TO_KEYWORD,
				CovTypes.ITERATE_KEYWORD,
				CovTypes.UNTIL_KEYWORD,
				CovTypes.LOOP_KEYWORD,
				CovTypes.STEP_KEYWORD,
				CovTypes.THROW_KEYWORD,
				CovTypes.TRY_KEYWORD,
				CovTypes.CATCH_KEYWORD,
				CovTypes.STRUCT_KEYWORD,
				CovTypes.SWITCH_KEYWORD,
				CovTypes.CASE_KEYWORD,
				CovTypes.DEFAULT_KEYWORD,
				CovTypes.NOT_KEYWORD,
				CovTypes.AND_KEYWORD,
				CovTypes.OR_KEYWORD,
				CovTypes.OVERRIDE_KEYWORD,
				CovTypes.EXTENDS_KEYWORD
		)

		@JvmField val OPERATOR_LIST = TokenSet.create(
				CovTypes.QUESTION_SYM,
				CovTypes.COLON_SYM,
				CovTypes.DIV_ASS,
				CovTypes.PLUS_ASS,
				CovTypes.MINUS_ASS,
				CovTypes.TIMES_ASS,
				CovTypes.POW_ASS,
				CovTypes.REM_ASS,
				CovTypes.QUESTION_SYM,
				CovTypes.PLUS_SYM,
				CovTypes.MINUS_SYM,
				CovTypes.TIMES_SYM,
				CovTypes.DIV_SYM,
				CovTypes.REM_SYM,
				CovTypes.POW_SYM,
				CovTypes.COLON_SYM,
				CovTypes.NOT_SYM,
				CovTypes.AND_SYM,
				CovTypes.OR_SYM,
				CovTypes.LT_SYM,
				CovTypes.GT_SYM,
				CovTypes.EQ_SYM,
				CovTypes.LE_SYM,
				CovTypes.GE_SYM,
				CovTypes.UN_SYM
		)
	}
}

class CovElementType(debugName: String) : IElementType(debugName, CovLanguage.INSTANCE)
