// This is a generated file. Not intended for manual editing.
package org.covscript.lang.psi;

import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.covscript.lang.CovElementType;
import org.covscript.lang.CovTokenType;
import org.covscript.lang.psi.impl.*;

public interface CovTypes {

  IElementType APPLY_FUNCTION = new CovElementType("APPLY_FUNCTION");
  IElementType APPLY_INDEX = new CovElementType("APPLY_INDEX");
  IElementType ARRAY_LIT = new CovElementType("ARRAY_LIT");
  IElementType ASSIGN = new CovElementType("ASSIGN");
  IElementType BLOCK_STATEMENT = new CovElementType("BLOCK_STATEMENT");
  IElementType BODY_OF_SOMETHING = new CovElementType("BODY_OF_SOMETHING");
  IElementType BOOLEAN_LIT = new CovElementType("BOOLEAN_LIT");
  IElementType BRACKET_EXPR = new CovElementType("BRACKET_EXPR");
  IElementType BREAK = new CovElementType("BREAK");
  IElementType CHAR_LIT = new CovElementType("CHAR_LIT");
  IElementType COLLAPSED_STATEMENT = new CovElementType("COLLAPSED_STATEMENT");
  IElementType COMMENT = new CovElementType("COMMENT");
  IElementType COMPARE_LEVEL_OP = new CovElementType("COMPARE_LEVEL_OP");
  IElementType CONTINUE = new CovElementType("CONTINUE");
  IElementType DEREF_OP = new CovElementType("DEREF_OP");
  IElementType DIV_OP = new CovElementType("DIV_OP");
  IElementType EXPR = new CovElementType("EXPR");
  IElementType FILE_HEADER = new CovElementType("FILE_HEADER");
  IElementType FOR_ITERATE = new CovElementType("FOR_ITERATE");
  IElementType FOR_STATEMENT = new CovElementType("FOR_STATEMENT");
  IElementType FOR_TO = new CovElementType("FOR_TO");
  IElementType FUNCTION_DECLARATION = new CovElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_LIT = new CovElementType("FUNCTION_LIT");
  IElementType IF_STATEMENT = new CovElementType("IF_STATEMENT");
  IElementType IMPORT_DECLARATION = new CovElementType("IMPORT_DECLARATION");
  IElementType INDEX = new CovElementType("INDEX");
  IElementType LOGIC_OP = new CovElementType("LOGIC_OP");
  IElementType LOOP_UNTIL_STATEMENT = new CovElementType("LOOP_UNTIL_STATEMENT");
  IElementType MEMBER_ACCESS = new CovElementType("MEMBER_ACCESS");
  IElementType MINUS_OP = new CovElementType("MINUS_OP");
  IElementType NAMESPACE_DECLARATION = new CovElementType("NAMESPACE_DECLARATION");
  IElementType NEG_OP = new CovElementType("NEG_OP");
  IElementType NEW_EXPR = new CovElementType("NEW_EXPR");
  IElementType NOT_OP = new CovElementType("NOT_OP");
  IElementType NULL_LIT = new CovElementType("NULL_LIT");
  IElementType NUMBER = new CovElementType("NUMBER");
  IElementType OP_ASSIGN = new CovElementType("OP_ASSIGN");
  IElementType PACKAGE_DECLARATION = new CovElementType("PACKAGE_DECLARATION");
  IElementType PAIR_OP = new CovElementType("PAIR_OP");
  IElementType PLUS_OP = new CovElementType("PLUS_OP");
  IElementType POW_OP = new CovElementType("POW_OP");
  IElementType REM_OP = new CovElementType("REM_OP");
  IElementType RETURN_STATEMENT = new CovElementType("RETURN_STATEMENT");
  IElementType STATEMENT = new CovElementType("STATEMENT");
  IElementType STRING = new CovElementType("STRING");
  IElementType STRUCT_DECLARATION = new CovElementType("STRUCT_DECLARATION");
  IElementType SUFFIXED_EXPR = new CovElementType("SUFFIXED_EXPR");
  IElementType SWITCH_STATEMENT = new CovElementType("SWITCH_STATEMENT");
  IElementType SYMBOL = new CovElementType("SYMBOL");
  IElementType TERNARY_OP = new CovElementType("TERNARY_OP");
  IElementType THROW_STATEMENT = new CovElementType("THROW_STATEMENT");
  IElementType TIMES_OP = new CovElementType("TIMES_OP");
  IElementType TRY_CATCH_STATEMENT = new CovElementType("TRY_CATCH_STATEMENT");
  IElementType TYPEID_EXPR = new CovElementType("TYPEID_EXPR");
  IElementType UNARY_EXPR = new CovElementType("UNARY_EXPR");
  IElementType USING_DECLARATION = new CovElementType("USING_DECLARATION");
  IElementType VARIABLE_DECLARATION = new CovElementType("VARIABLE_DECLARATION");
  IElementType WHILE_STATEMENT = new CovElementType("WHILE_STATEMENT");

  IElementType AND_KEYWORD = new CovTokenType("AND_KEYWORD");
  IElementType AND_SYM = new CovTokenType("AND_SYM");
  IElementType ARROW = new CovTokenType("ARROW");
  IElementType BLOCK_KEYWORD = new CovTokenType("BLOCK_KEYWORD");
  IElementType BREAK_KEYWORD = new CovTokenType("BREAK_KEYWORD");
  IElementType CASE_KEYWORD = new CovTokenType("CASE_KEYWORD");
  IElementType CATCH_KEYWORD = new CovTokenType("CATCH_KEYWORD");
  IElementType CHAR = new CovTokenType("CHAR");
  IElementType COLLAPSER_BEGIN = new CovTokenType("COLLAPSER_BEGIN");
  IElementType COLLAPSER_END = new CovTokenType("COLLAPSER_END");
  IElementType COLON_SYM = new CovTokenType("COLON_SYM");
  IElementType COMMA = new CovTokenType("COMMA");
  IElementType CONST_KEYWORD = new CovTokenType("CONST_KEYWORD");
  IElementType CONTINUE_KEYWORD = new CovTokenType("CONTINUE_KEYWORD");
  IElementType DEC_SYM = new CovTokenType("DEC_SYM");
  IElementType DEFAULT_KEYWORD = new CovTokenType("DEFAULT_KEYWORD");
  IElementType DIV_ASS = new CovTokenType("DIV_ASS");
  IElementType DIV_SYM = new CovTokenType("DIV_SYM");
  IElementType DOT = new CovTokenType("DOT");
  IElementType ELSE_KEYWORD = new CovTokenType("ELSE_KEYWORD");
  IElementType END_KEYWORD = new CovTokenType("END_KEYWORD");
  IElementType EOL = new CovTokenType("EOL");
  IElementType EQ = new CovTokenType("EQ");
  IElementType EQ_SYM = new CovTokenType("EQ_SYM");
  IElementType EXTENDS_KEYWORD = new CovTokenType("EXTENDS_KEYWORD");
  IElementType FALSE_KEYWORD = new CovTokenType("FALSE_KEYWORD");
  IElementType FOR_KEYWORD = new CovTokenType("FOR_KEYWORD");
  IElementType FUNCTION_KEYWORD = new CovTokenType("FUNCTION_KEYWORD");
  IElementType GCNEW_KEYWORD = new CovTokenType("GCNEW_KEYWORD");
  IElementType GE_SYM = new CovTokenType("GE_SYM");
  IElementType GT_SYM = new CovTokenType("GT_SYM");
  IElementType IF_KEYWORD = new CovTokenType("IF_KEYWORD");
  IElementType IMPORT_KEYWORD = new CovTokenType("IMPORT_KEYWORD");
  IElementType INC_SYM = new CovTokenType("INC_SYM");
  IElementType ITERATE_KEYWORD = new CovTokenType("ITERATE_KEYWORD");
  IElementType LEFT_BRACKET = new CovTokenType("LEFT_BRACKET");
  IElementType LEFT_B_BRACKET = new CovTokenType("LEFT_B_BRACKET");
  IElementType LEFT_S_BRACKET = new CovTokenType("LEFT_S_BRACKET");
  IElementType LE_SYM = new CovTokenType("LE_SYM");
  IElementType LINE_COMMENT = new CovTokenType("LINE_COMMENT");
  IElementType LOOP_KEYWORD = new CovTokenType("LOOP_KEYWORD");
  IElementType LT_SYM = new CovTokenType("LT_SYM");
  IElementType MINUS_ASS = new CovTokenType("MINUS_ASS");
  IElementType MINUS_SYM = new CovTokenType("MINUS_SYM");
  IElementType NAMESPACE_KEYWORD = new CovTokenType("NAMESPACE_KEYWORD");
  IElementType NEW_KEYWORD = new CovTokenType("NEW_KEYWORD");
  IElementType NOT_KEYWORD = new CovTokenType("NOT_KEYWORD");
  IElementType NOT_SYM = new CovTokenType("NOT_SYM");
  IElementType NULL_KEYWORD = new CovTokenType("NULL_KEYWORD");
  IElementType NUM = new CovTokenType("NUM");
  IElementType OR_KEYWORD = new CovTokenType("OR_KEYWORD");
  IElementType OR_SYM = new CovTokenType("OR_SYM");
  IElementType OVERRIDE_KEYWORD = new CovTokenType("OVERRIDE_KEYWORD");
  IElementType PACKAGE_KEYWORD = new CovTokenType("PACKAGE_KEYWORD");
  IElementType PLUS_ASS = new CovTokenType("PLUS_ASS");
  IElementType PLUS_SYM = new CovTokenType("PLUS_SYM");
  IElementType POW_ASS = new CovTokenType("POW_ASS");
  IElementType POW_SYM = new CovTokenType("POW_SYM");
  IElementType QUESTION_SYM = new CovTokenType("QUESTION_SYM");
  IElementType REM_ASS = new CovTokenType("REM_ASS");
  IElementType REM_SYM = new CovTokenType("REM_SYM");
  IElementType RETURN_KEYWORD = new CovTokenType("RETURN_KEYWORD");
  IElementType RIGHT_BRACKET = new CovTokenType("RIGHT_BRACKET");
  IElementType RIGHT_B_BRACKET = new CovTokenType("RIGHT_B_BRACKET");
  IElementType RIGHT_S_BRACKET = new CovTokenType("RIGHT_S_BRACKET");
  IElementType STEP_KEYWORD = new CovTokenType("STEP_KEYWORD");
  IElementType STR = new CovTokenType("STR");
  IElementType STRUCT_KEYWORD = new CovTokenType("STRUCT_KEYWORD");
  IElementType SWITCH_KEYWORD = new CovTokenType("SWITCH_KEYWORD");
  IElementType SYM = new CovTokenType("SYM");
  IElementType THROW_KEYWORD = new CovTokenType("THROW_KEYWORD");
  IElementType TIMES_ASS = new CovTokenType("TIMES_ASS");
  IElementType TIMES_SYM = new CovTokenType("TIMES_SYM");
  IElementType TO_KEYWORD = new CovTokenType("TO_KEYWORD");
  IElementType TRUE_KEYWORD = new CovTokenType("TRUE_KEYWORD");
  IElementType TRY_KEYWORD = new CovTokenType("TRY_KEYWORD");
  IElementType TYPEID_KEYWORD = new CovTokenType("TYPEID_KEYWORD");
  IElementType UNTIL_KEYWORD = new CovTokenType("UNTIL_KEYWORD");
  IElementType UN_SYM = new CovTokenType("UN_SYM");
  IElementType USING_KEYWORD = new CovTokenType("USING_KEYWORD");
  IElementType VAR_KEYWORD = new CovTokenType("VAR_KEYWORD");
  IElementType WHILE_KEYWORD = new CovTokenType("WHILE_KEYWORD");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == APPLY_FUNCTION) {
        return new CovApplyFunctionImpl(node);
      }
      else if (type == APPLY_INDEX) {
        return new CovApplyIndexImpl(node);
      }
      else if (type == ARRAY_LIT) {
        return new CovArrayLitImpl(node);
      }
      else if (type == ASSIGN) {
        return new CovAssignImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new CovBlockStatementImpl(node);
      }
      else if (type == BODY_OF_SOMETHING) {
        return new CovBodyOfSomethingImpl(node);
      }
      else if (type == BOOLEAN_LIT) {
        return new CovBooleanLitImpl(node);
      }
      else if (type == BRACKET_EXPR) {
        return new CovBracketExprImpl(node);
      }
      else if (type == BREAK) {
        return new CovBreakImpl(node);
      }
      else if (type == CHAR_LIT) {
        return new CovCharLitImpl(node);
      }
      else if (type == COLLAPSED_STATEMENT) {
        return new CovCollapsedStatementImpl(node);
      }
      else if (type == COMMENT) {
        return new CovCommentImpl(node);
      }
      else if (type == COMPARE_LEVEL_OP) {
        return new CovCompareLevelOpImpl(node);
      }
      else if (type == CONTINUE) {
        return new CovContinueImpl(node);
      }
      else if (type == DEREF_OP) {
        return new CovDerefOpImpl(node);
      }
      else if (type == DIV_OP) {
        return new CovDivOpImpl(node);
      }
      else if (type == FILE_HEADER) {
        return new CovFileHeaderImpl(node);
      }
      else if (type == FOR_ITERATE) {
        return new CovForIterateImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new CovForStatementImpl(node);
      }
      else if (type == FOR_TO) {
        return new CovForToImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new CovFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_LIT) {
        return new CovFunctionLitImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new CovIfStatementImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new CovImportDeclarationImpl(node);
      }
      else if (type == INDEX) {
        return new CovIndexImpl(node);
      }
      else if (type == LOGIC_OP) {
        return new CovLogicOpImpl(node);
      }
      else if (type == LOOP_UNTIL_STATEMENT) {
        return new CovLoopUntilStatementImpl(node);
      }
      else if (type == MEMBER_ACCESS) {
        return new CovMemberAccessImpl(node);
      }
      else if (type == MINUS_OP) {
        return new CovMinusOpImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION) {
        return new CovNamespaceDeclarationImpl(node);
      }
      else if (type == NEG_OP) {
        return new CovNegOpImpl(node);
      }
      else if (type == NEW_EXPR) {
        return new CovNewExprImpl(node);
      }
      else if (type == NOT_OP) {
        return new CovNotOpImpl(node);
      }
      else if (type == NULL_LIT) {
        return new CovNullLitImpl(node);
      }
      else if (type == NUMBER) {
        return new CovNumberImpl(node);
      }
      else if (type == OP_ASSIGN) {
        return new CovOpAssignImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new CovPackageDeclarationImpl(node);
      }
      else if (type == PAIR_OP) {
        return new CovPairOpImpl(node);
      }
      else if (type == PLUS_OP) {
        return new CovPlusOpImpl(node);
      }
      else if (type == POW_OP) {
        return new CovPowOpImpl(node);
      }
      else if (type == REM_OP) {
        return new CovRemOpImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new CovReturnStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new CovStatementImpl(node);
      }
      else if (type == STRING) {
        return new CovStringImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new CovStructDeclarationImpl(node);
      }
      else if (type == SUFFIXED_EXPR) {
        return new CovSuffixedExprImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new CovSwitchStatementImpl(node);
      }
      else if (type == SYMBOL) {
        return new CovSymbolImpl(node);
      }
      else if (type == TERNARY_OP) {
        return new CovTernaryOpImpl(node);
      }
      else if (type == THROW_STATEMENT) {
        return new CovThrowStatementImpl(node);
      }
      else if (type == TIMES_OP) {
        return new CovTimesOpImpl(node);
      }
      else if (type == TRY_CATCH_STATEMENT) {
        return new CovTryCatchStatementImpl(node);
      }
      else if (type == TYPEID_EXPR) {
        return new CovTypeidExprImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new CovUnaryExprImpl(node);
      }
      else if (type == USING_DECLARATION) {
        return new CovUsingDeclarationImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new CovVariableDeclarationImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new CovWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
