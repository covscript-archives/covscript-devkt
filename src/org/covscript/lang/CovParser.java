// This is a generated file. Not intended for manual editing.
package org.covscript.lang;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.lang.LightPsiParser;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder.Marker;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;

import static org.covscript.lang.psi.CovTypes.*;
import static org.jetbrains.kotlin.com.intellij.lang.parser.GeneratedParserUtilBase.*;
@SuppressWarnings("ALL")
public class CovParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == BLOCK_STATEMENT) {
      result_ = blockStatement(builder_, 0);
    }
    else if (root_ == BODY_OF_SOMETHING) {
      result_ = bodyOfSomething(builder_, 0);
    }
    else if (root_ == BREAK) {
      result_ = break_$(builder_, 0);
    }
    else if (root_ == COLLAPSED_STATEMENT) {
      result_ = collapsedStatement(builder_, 0);
    }
    else if (root_ == COMMENT) {
      result_ = comment(builder_, 0);
    }
    else if (root_ == CONTINUE) {
      result_ = continue_$(builder_, 0);
    }
    else if (root_ == EXPR) {
      result_ = expr(builder_, 0, -1);
    }
    else if (root_ == FILE_HEADER) {
      result_ = fileHeader(builder_, 0);
    }
    else if (root_ == FOR_ITERATE) {
      result_ = forIterate(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT) {
      result_ = forStatement(builder_, 0);
    }
    else if (root_ == FOR_TO) {
      result_ = forTo(builder_, 0);
    }
    else if (root_ == FUNCTION_DECLARATION) {
      result_ = functionDeclaration(builder_, 0);
    }
    else if (root_ == IF_STATEMENT) {
      result_ = ifStatement(builder_, 0);
    }
    else if (root_ == IMPORT_DECLARATION) {
      result_ = importDeclaration(builder_, 0);
    }
    else if (root_ == INDEX) {
      result_ = index(builder_, 0);
    }
    else if (root_ == LOOP_UNTIL_STATEMENT) {
      result_ = loopUntilStatement(builder_, 0);
    }
    else if (root_ == NAMESPACE_DECLARATION) {
      result_ = namespaceDeclaration(builder_, 0);
    }
    else if (root_ == PACKAGE_DECLARATION) {
      result_ = packageDeclaration(builder_, 0);
    }
    else if (root_ == RETURN_STATEMENT) {
      result_ = returnStatement(builder_, 0);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, 0);
    }
    else if (root_ == STRUCT_DECLARATION) {
      result_ = structDeclaration(builder_, 0);
    }
    else if (root_ == SWITCH_STATEMENT) {
      result_ = switchStatement(builder_, 0);
    }
    else if (root_ == THROW_STATEMENT) {
      result_ = throwStatement(builder_, 0);
    }
    else if (root_ == TRY_CATCH_STATEMENT) {
      result_ = tryCatchStatement(builder_, 0);
    }
    else if (root_ == USING_DECLARATION) {
      result_ = usingDeclaration(builder_, 0);
    }
    else if (root_ == VARIABLE_DECLARATION) {
      result_ = variableDeclaration(builder_, 0);
    }
    else if (root_ == WHILE_STATEMENT) {
      result_ = whileStatement(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return file(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(APPLY_FUNCTION, APPLY_INDEX, ARRAY_LIT, ASSIGN,
      BOOLEAN_LIT, BRACKET_EXPR, CHAR_LIT, COMPARE_LEVEL_OP,
      DEREF_OP, DIV_OP, EXPR, FUNCTION_LIT,
      LOGIC_OP, MEMBER_ACCESS, MINUS_OP, NEG_OP,
      NEW_EXPR, NOT_OP, NULL_LIT, NUMBER,
      OP_ASSIGN, PAIR_OP, PLUS_OP, POW_OP,
      REM_OP, STRING, SUFFIXED_EXPR, SYMBOL,
      TERNARY_OP, TIMES_OP, TYPEID_EXPR, UNARY_EXPR),
  };

  /* ********************************************************** */
  // DIV_ASS
  //  | PLUS_ASS
  //  | MINUS_ASS
  //  | TIMES_ASS
  //  | POW_ASS
  //  | REM_ASS
  static boolean assignOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DIV_ASS);
    if (!result_) result_ = consumeToken(builder_, PLUS_ASS);
    if (!result_) result_ = consumeToken(builder_, MINUS_ASS);
    if (!result_) result_ = consumeToken(builder_, TIMES_ASS);
    if (!result_) result_ = consumeToken(builder_, POW_ASS);
    if (!result_) result_ = consumeToken(builder_, REM_ASS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // BLOCK_KEYWORD endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean blockStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockStatement")) return false;
    if (!nextTokenIs(builder_, BLOCK_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_STATEMENT, null);
    result_ = consumeToken(builder_, BLOCK_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, endOfLine(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (statement endOfLine)*
  public static boolean bodyOfSomething(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bodyOfSomething")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BODY_OF_SOMETHING, "<body of something>");
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bodyOfSomething_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bodyOfSomething", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // statement endOfLine
  private static boolean bodyOfSomething_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bodyOfSomething_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // BREAK_KEYWORD
  public static boolean break_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "break_$")) return false;
    if (!nextTokenIs(builder_, BREAK_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BREAK_KEYWORD);
    exit_section_(builder_, marker_, BREAK, result_);
    return result_;
  }

  /* ********************************************************** */
  // COLLAPSER_BEGIN primaryStatement? COLLAPSER_END
  public static boolean collapsedStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "collapsedStatement")) return false;
    if (!nextTokenIs(builder_, COLLAPSER_BEGIN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLLAPSER_BEGIN);
    result_ = result_ && collapsedStatement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLLAPSER_END);
    exit_section_(builder_, marker_, COLLAPSED_STATEMENT, result_);
    return result_;
  }

  // primaryStatement?
  private static boolean collapsedStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "collapsedStatement_1")) return false;
    primaryStatement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LINE_COMMENT
  public static boolean comment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comment")) return false;
    if (!nextTokenIs(builder_, LINE_COMMENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LINE_COMMENT);
    exit_section_(builder_, marker_, COMMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // LT_SYM
  //  | GT_SYM
  //  | GE_SYM
  //  | LE_SYM
  //  | EQ_SYM
  //  | UN_SYM
  static boolean compareOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compareOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT_SYM);
    if (!result_) result_ = consumeToken(builder_, GT_SYM);
    if (!result_) result_ = consumeToken(builder_, GE_SYM);
    if (!result_) result_ = consumeToken(builder_, LE_SYM);
    if (!result_) result_ = consumeToken(builder_, EQ_SYM);
    if (!result_) result_ = consumeToken(builder_, UN_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONTINUE_KEYWORD
  public static boolean continue_$(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continue_$")) return false;
    if (!nextTokenIs(builder_, CONTINUE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONTINUE_KEYWORD);
    exit_section_(builder_, marker_, CONTINUE, result_);
    return result_;
  }

  /* ********************************************************** */
  // EOL+
  static boolean endOfLine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfLine")) return false;
    if (!nextTokenIs(builder_, EOL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EOL);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!consumeToken(builder_, EOL)) break;
      if (!empty_element_parsed_guard_(builder_, "endOfLine", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // fileHeader*
  //  statement*
  static boolean file(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = file_0(builder_, level_ + 1);
    result_ = result_ && file_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // fileHeader*
  private static boolean file_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!fileHeader(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "file_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // statement*
  private static boolean file_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "file_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // usingDeclaration
  //  | importDeclaration
  //  | packageDeclaration
  //  | comment
  //  | endOfLine
  public static boolean fileHeader(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fileHeader")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FILE_HEADER, "<file header>");
    result_ = usingDeclaration(builder_, level_ + 1);
    if (!result_) result_ = importDeclaration(builder_, level_ + 1);
    if (!result_) result_ = packageDeclaration(builder_, level_ + 1);
    if (!result_) result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = endOfLine(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ITERATE_KEYWORD expr
  public static boolean forIterate(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forIterate")) return false;
    if (!nextTokenIs(builder_, ITERATE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ITERATE_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, FOR_ITERATE, result_);
    return result_;
  }

  /* ********************************************************** */
  // FOR_KEYWORD symbol (forTo | forIterate) endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean forStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forStatement")) return false;
    if (!nextTokenIs(builder_, FOR_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_STATEMENT, null);
    result_ = consumeToken(builder_, FOR_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, symbol(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, forStatement_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, endOfLine(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // forTo | forIterate
  private static boolean forStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forStatement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = forTo(builder_, level_ + 1);
    if (!result_) result_ = forIterate(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // EQ expr TO_KEYWORD expr (STEP_KEYWORD expr)?
  public static boolean forTo(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forTo")) return false;
    if (!nextTokenIs(builder_, EQ)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, TO_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && forTo_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_TO, result_);
    return result_;
  }

  // (STEP_KEYWORD expr)?
  private static boolean forTo_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forTo_4")) return false;
    forTo_4_0(builder_, level_ + 1);
    return true;
  }

  // STEP_KEYWORD expr
  private static boolean forTo_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forTo_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STEP_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // FUNCTION_KEYWORD symbol LEFT_BRACKET (symbol (COMMA symbol)*)? RIGHT_BRACKET
  //    OVERRIDE_KEYWORD? endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean functionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration")) return false;
    if (!nextTokenIs(builder_, FUNCTION_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_DECLARATION, null);
    result_ = consumeToken(builder_, FUNCTION_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, symbol(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, LEFT_BRACKET)) && result_;
    result_ = pinned_ && report_error_(builder_, functionDeclaration_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RIGHT_BRACKET)) && result_;
    result_ = pinned_ && report_error_(builder_, functionDeclaration_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, endOfLine(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (symbol (COMMA symbol)*)?
  private static boolean functionDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration_3")) return false;
    functionDeclaration_3_0(builder_, level_ + 1);
    return true;
  }

  // symbol (COMMA symbol)*
  private static boolean functionDeclaration_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    result_ = result_ && functionDeclaration_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA symbol)*
  private static boolean functionDeclaration_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration_3_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!functionDeclaration_3_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionDeclaration_3_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA symbol
  private static boolean functionDeclaration_3_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration_3_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && symbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OVERRIDE_KEYWORD?
  private static boolean functionDeclaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDeclaration_5")) return false;
    consumeToken(builder_, OVERRIDE_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // IF_KEYWORD expr endOfLine
  //   bodyOfSomething
  //   (
  //    ELSE_KEYWORD endOfLine
  //     bodyOfSomething
  //   )?
  //  END_KEYWORD
  public static boolean ifStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifStatement")) return false;
    if (!nextTokenIs(builder_, IF_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IF_STATEMENT, null);
    result_ = consumeToken(builder_, IF_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1, -1));
    result_ = pinned_ && report_error_(builder_, endOfLine(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ifStatement_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (
  //    ELSE_KEYWORD endOfLine
  //     bodyOfSomething
  //   )?
  private static boolean ifStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifStatement_4")) return false;
    ifStatement_4_0(builder_, level_ + 1);
    return true;
  }

  // ELSE_KEYWORD endOfLine
  //     bodyOfSomething
  private static boolean ifStatement_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifStatement_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && bodyOfSomething(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IMPORT_KEYWORD symbol
  public static boolean importDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importDeclaration")) return false;
    if (!nextTokenIs(builder_, IMPORT_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IMPORT_DECLARATION, null);
    result_ = consumeToken(builder_, IMPORT_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && symbol(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // LEFT_S_BRACKET expr RIGHT_S_BRACKET
  public static boolean index(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "index")) return false;
    if (!nextTokenIs(builder_, LEFT_S_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LEFT_S_BRACKET);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, RIGHT_S_BRACKET);
    exit_section_(builder_, marker_, INDEX, result_);
    return result_;
  }

  /* ********************************************************** */
  // AND_KEYWORD
  //  | AND_SYM
  //  | OR_KEYWORD
  //  | OR_SYM
  static boolean logicOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "logicOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, AND_SYM);
    if (!result_) result_ = consumeToken(builder_, OR_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, OR_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LOOP_KEYWORD endOfLine
  //   bodyOfSomething
  //  (UNTIL_KEYWORD expr endOfLine)?
  //  END_KEYWORD
  public static boolean loopUntilStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "loopUntilStatement")) return false;
    if (!nextTokenIs(builder_, LOOP_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LOOP_UNTIL_STATEMENT, null);
    result_ = consumeToken(builder_, LOOP_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, endOfLine(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, loopUntilStatement_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (UNTIL_KEYWORD expr endOfLine)?
  private static boolean loopUntilStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "loopUntilStatement_3")) return false;
    loopUntilStatement_3_0(builder_, level_ + 1);
    return true;
  }

  // UNTIL_KEYWORD expr endOfLine
  private static boolean loopUntilStatement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "loopUntilStatement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, UNTIL_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NAMESPACE_KEYWORD symbol endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean namespaceDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceDeclaration")) return false;
    if (!nextTokenIs(builder_, NAMESPACE_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMESPACE_DECLARATION, null);
    result_ = consumeToken(builder_, NAMESPACE_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, symbol(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, endOfLine(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // PACKAGE_KEYWORD symbol
  public static boolean packageDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "packageDeclaration")) return false;
    if (!nextTokenIs(builder_, PACKAGE_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PACKAGE_DECLARATION, null);
    result_ = consumeToken(builder_, PACKAGE_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && symbol(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // endOfLine
  //  | importDeclaration
  //  | throwStatement
  //  | returnStatement
  //  | variableDeclaration
  //  | functionDeclaration
  //  | structDeclaration
  //  | ifStatement
  //  | whileStatement
  //  | switchStatement
  //  | blockStatement
  //  | forStatement
  //  | loopUntilStatement
  //  | tryCatchStatement
  //  | comment
  //  | namespaceDeclaration
  //  | break
  //  | continue
  //  | expr
  static boolean primaryStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primaryStatement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = endOfLine(builder_, level_ + 1);
    if (!result_) result_ = importDeclaration(builder_, level_ + 1);
    if (!result_) result_ = throwStatement(builder_, level_ + 1);
    if (!result_) result_ = returnStatement(builder_, level_ + 1);
    if (!result_) result_ = variableDeclaration(builder_, level_ + 1);
    if (!result_) result_ = functionDeclaration(builder_, level_ + 1);
    if (!result_) result_ = structDeclaration(builder_, level_ + 1);
    if (!result_) result_ = ifStatement(builder_, level_ + 1);
    if (!result_) result_ = whileStatement(builder_, level_ + 1);
    if (!result_) result_ = switchStatement(builder_, level_ + 1);
    if (!result_) result_ = blockStatement(builder_, level_ + 1);
    if (!result_) result_ = forStatement(builder_, level_ + 1);
    if (!result_) result_ = loopUntilStatement(builder_, level_ + 1);
    if (!result_) result_ = tryCatchStatement(builder_, level_ + 1);
    if (!result_) result_ = comment(builder_, level_ + 1);
    if (!result_) result_ = namespaceDeclaration(builder_, level_ + 1);
    if (!result_) result_ = break_$(builder_, level_ + 1);
    if (!result_) result_ = continue_$(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // RETURN_KEYWORD expr?
  public static boolean returnStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnStatement")) return false;
    if (!nextTokenIs(builder_, RETURN_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETURN_KEYWORD);
    result_ = result_ && returnStatement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, RETURN_STATEMENT, result_);
    return result_;
  }

  // expr?
  private static boolean returnStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnStatement_1")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // primaryStatement
  //  | collapsedStatement
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = primaryStatement(builder_, level_ + 1);
    if (!result_) result_ = collapsedStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // STRUCT_KEYWORD symbol (EXTENDS_KEYWORD expr)? endOfLine
  //   ((variableDeclaration | functionDeclaration) endOfLine)*
  //  END_KEYWORD
  public static boolean structDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDeclaration")) return false;
    if (!nextTokenIs(builder_, STRUCT_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRUCT_DECLARATION, null);
    result_ = consumeToken(builder_, STRUCT_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, symbol(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, structDeclaration_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, endOfLine(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, structDeclaration_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (EXTENDS_KEYWORD expr)?
  private static boolean structDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDeclaration_2")) return false;
    structDeclaration_2_0(builder_, level_ + 1);
    return true;
  }

  // EXTENDS_KEYWORD expr
  private static boolean structDeclaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDeclaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTENDS_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ((variableDeclaration | functionDeclaration) endOfLine)*
  private static boolean structDeclaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDeclaration_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!structDeclaration_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "structDeclaration_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (variableDeclaration | functionDeclaration) endOfLine
  private static boolean structDeclaration_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDeclaration_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = structDeclaration_4_0_0(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // variableDeclaration | functionDeclaration
  private static boolean structDeclaration_4_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDeclaration_4_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variableDeclaration(builder_, level_ + 1);
    if (!result_) result_ = functionDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SWITCH_KEYWORD expr endOfLine
  //   (
  //    (CASE_KEYWORD expr | DEFAULT_KEYWORD) endOfLine
  //     bodyOfSomething
  //    END_KEYWORD endOfLine
  //   )*
  //  END_KEYWORD
  public static boolean switchStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchStatement")) return false;
    if (!nextTokenIs(builder_, SWITCH_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SWITCH_STATEMENT, null);
    result_ = consumeToken(builder_, SWITCH_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1, -1));
    result_ = pinned_ && report_error_(builder_, endOfLine(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, switchStatement_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (
  //    (CASE_KEYWORD expr | DEFAULT_KEYWORD) endOfLine
  //     bodyOfSomething
  //    END_KEYWORD endOfLine
  //   )*
  private static boolean switchStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchStatement_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!switchStatement_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "switchStatement_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (CASE_KEYWORD expr | DEFAULT_KEYWORD) endOfLine
  //     bodyOfSomething
  //    END_KEYWORD endOfLine
  private static boolean switchStatement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchStatement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = switchStatement_3_0_0(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && bodyOfSomething(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // CASE_KEYWORD expr | DEFAULT_KEYWORD
  private static boolean switchStatement_3_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchStatement_3_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = switchStatement_3_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DEFAULT_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // CASE_KEYWORD expr
  private static boolean switchStatement_3_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "switchStatement_3_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // THROW_KEYWORD expr
  public static boolean throwStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "throwStatement")) return false;
    if (!nextTokenIs(builder_, THROW_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THROW_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, THROW_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // TRY_KEYWORD endOfLine
  //   bodyOfSomething
  //  CATCH_KEYWORD symbol endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean tryCatchStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tryCatchStatement")) return false;
    if (!nextTokenIs(builder_, TRY_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRY_CATCH_STATEMENT, null);
    result_ = consumeToken(builder_, TRY_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, endOfLine(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, CATCH_KEYWORD)) && result_;
    result_ = pinned_ && report_error_(builder_, symbol(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, endOfLine(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // USING_KEYWORD symbol (DOT symbol)*
  public static boolean usingDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "usingDeclaration")) return false;
    if (!nextTokenIs(builder_, USING_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, USING_DECLARATION, null);
    result_ = consumeToken(builder_, USING_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, symbol(builder_, level_ + 1));
    result_ = pinned_ && usingDeclaration_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (DOT symbol)*
  private static boolean usingDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "usingDeclaration_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!usingDeclaration_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "usingDeclaration_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // DOT symbol
  private static boolean usingDeclaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "usingDeclaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && symbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (CONST_KEYWORD)? VAR_KEYWORD symbol EQ expr
  public static boolean variableDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDeclaration")) return false;
    if (!nextTokenIs(builder_, "<variable declaration>", CONST_KEYWORD, VAR_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    result_ = variableDeclaration_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, VAR_KEYWORD);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, symbol(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, EQ)) && result_;
    result_ = pinned_ && expr(builder_, level_ + 1, -1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (CONST_KEYWORD)?
  private static boolean variableDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDeclaration_0")) return false;
    consumeToken(builder_, CONST_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // WHILE_KEYWORD expr endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean whileStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whileStatement")) return false;
    if (!nextTokenIs(builder_, WHILE_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WHILE_STATEMENT, null);
    result_ = consumeToken(builder_, WHILE_KEYWORD);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr(builder_, level_ + 1, -1));
    result_ = pinned_ && report_error_(builder_, endOfLine(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, bodyOfSomething(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END_KEYWORD) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(assign) BINARY(opAssign)
  // 1: BINARY(ternaryOp)
  // 2: BINARY(pairOp)
  // 3: BINARY(logicOp)
  // 4: PREFIX(notOp)
  // 5: BINARY(compareLevelOp)
  // 6: BINARY(plusOp) BINARY(minusOp) PREFIX(negOp)
  // 7: BINARY(divOp) BINARY(timesOp) PREFIX(derefOp)
  // 8: BINARY(remOp) BINARY(powOp)
  // 9: PREFIX(unaryExpr) POSTFIX(suffixedExpr)
  // 10: PREFIX(newExpr) PREFIX(typeidExpr)
  // 11: POSTFIX(applyIndex) POSTFIX(applyFunction) ATOM(functionLit) BINARY(memberAccess)
  // 12: ATOM(number) ATOM(booleanLit) ATOM(nullLit) ATOM(string)
  //    ATOM(charLit) ATOM(arrayLit) ATOM(symbol) PREFIX(bracketExpr)
  public static boolean expr(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    addVariant(builder_, "<expr>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr>");
    result_ = notOp(builder_, level_ + 1);
    if (!result_) result_ = negOp(builder_, level_ + 1);
    if (!result_) result_ = derefOp(builder_, level_ + 1);
    if (!result_) result_ = unaryExpr(builder_, level_ + 1);
    if (!result_) result_ = newExpr(builder_, level_ + 1);
    if (!result_) result_ = typeidExpr(builder_, level_ + 1);
    if (!result_) result_ = functionLit(builder_, level_ + 1);
    if (!result_) result_ = number(builder_, level_ + 1);
    if (!result_) result_ = booleanLit(builder_, level_ + 1);
    if (!result_) result_ = nullLit(builder_, level_ + 1);
    if (!result_) result_ = string(builder_, level_ + 1);
    if (!result_) result_ = charLit(builder_, level_ + 1);
    if (!result_) result_ = arrayLit(builder_, level_ + 1);
    if (!result_) result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = bracketExpr(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && expr_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "expr_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && consumeTokenSmart(builder_, EQ)) {
        result_ = expr(builder_, level_, -1);
        exit_section_(builder_, level_, marker_, ASSIGN, result_, true, null);
      }
      else if (priority_ < 0 && assignOperator(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, -1);
        exit_section_(builder_, level_, marker_, OP_ASSIGN, result_, true, null);
      }
      else if (priority_ < 1 && consumeTokenSmart(builder_, QUESTION_SYM)) {
        result_ = report_error_(builder_, expr(builder_, level_, 1));
        result_ = expr(builder_, level_ + 1, 1) && result_;
        exit_section_(builder_, level_, marker_, TERNARY_OP, result_, true, null);
      }
      else if (priority_ < 2 && consumeTokenSmart(builder_, COLON_SYM)) {
        result_ = expr(builder_, level_, 2);
        exit_section_(builder_, level_, marker_, PAIR_OP, result_, true, null);
      }
      else if (priority_ < 3 && logicOperator(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 3);
        exit_section_(builder_, level_, marker_, LOGIC_OP, result_, true, null);
      }
      else if (priority_ < 5 && compareOperator(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 5);
        exit_section_(builder_, level_, marker_, COMPARE_LEVEL_OP, result_, true, null);
      }
      else if (priority_ < 6 && consumeTokenSmart(builder_, PLUS_SYM)) {
        result_ = expr(builder_, level_, 6);
        exit_section_(builder_, level_, marker_, PLUS_OP, result_, true, null);
      }
      else if (priority_ < 6 && consumeTokenSmart(builder_, MINUS_SYM)) {
        result_ = expr(builder_, level_, 6);
        exit_section_(builder_, level_, marker_, MINUS_OP, result_, true, null);
      }
      else if (priority_ < 7 && consumeTokenSmart(builder_, DIV_SYM)) {
        result_ = expr(builder_, level_, 7);
        exit_section_(builder_, level_, marker_, DIV_OP, result_, true, null);
      }
      else if (priority_ < 7 && consumeTokenSmart(builder_, TIMES_SYM)) {
        result_ = expr(builder_, level_, 7);
        exit_section_(builder_, level_, marker_, TIMES_OP, result_, true, null);
      }
      else if (priority_ < 8 && consumeTokenSmart(builder_, REM_SYM)) {
        result_ = expr(builder_, level_, 8);
        exit_section_(builder_, level_, marker_, REM_OP, result_, true, null);
      }
      else if (priority_ < 8 && consumeTokenSmart(builder_, POW_SYM)) {
        result_ = expr(builder_, level_, 8);
        exit_section_(builder_, level_, marker_, POW_OP, result_, true, null);
      }
      else if (priority_ < 9 && suffixedExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, SUFFIXED_EXPR, result_, true, null);
      }
      else if (priority_ < 11 && index(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, APPLY_INDEX, result_, true, null);
      }
      else if (priority_ < 11 && applyFunction_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, APPLY_FUNCTION, result_, true, null);
      }
      else if (priority_ < 11 && consumeTokenSmart(builder_, DOT)) {
        result_ = expr(builder_, level_, 11);
        exit_section_(builder_, level_, marker_, MEMBER_ACCESS, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  public static boolean notOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notOp")) return false;
    if (!nextTokenIsSmart(builder_, NOT_KEYWORD, NOT_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = notOp_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 4);
    exit_section_(builder_, level_, marker_, NOT_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // NOT_SYM | NOT_KEYWORD
  private static boolean notOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, NOT_SYM);
    if (!result_) result_ = consumeTokenSmart(builder_, NOT_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean negOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "negOp")) return false;
    if (!nextTokenIsSmart(builder_, MINUS_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, MINUS_SYM);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 6);
    exit_section_(builder_, level_, marker_, NEG_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean derefOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "derefOp")) return false;
    if (!nextTokenIsSmart(builder_, TIMES_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, TIMES_SYM);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 7);
    exit_section_(builder_, level_, marker_, DEREF_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean unaryExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryExpr")) return false;
    if (!nextTokenIsSmart(builder_, DEC_SYM, INC_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = unaryExpr_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 9);
    exit_section_(builder_, level_, marker_, UNARY_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // INC_SYM | DEC_SYM
  private static boolean unaryExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, INC_SYM);
    if (!result_) result_ = consumeTokenSmart(builder_, DEC_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // INC_SYM | DEC_SYM
  private static boolean suffixedExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "suffixedExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, INC_SYM);
    if (!result_) result_ = consumeTokenSmart(builder_, DEC_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean newExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "newExpr")) return false;
    if (!nextTokenIsSmart(builder_, GCNEW_KEYWORD, NEW_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = newExpr_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 10);
    exit_section_(builder_, level_, marker_, NEW_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // NEW_KEYWORD | GCNEW_KEYWORD
  private static boolean newExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "newExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, NEW_KEYWORD);
    if (!result_) result_ = consumeTokenSmart(builder_, GCNEW_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean typeidExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeidExpr")) return false;
    if (!nextTokenIsSmart(builder_, TYPEID_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, TYPEID_KEYWORD);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 10);
    exit_section_(builder_, level_, marker_, TYPEID_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // LEFT_BRACKET (expr (COMMA expr)*)? RIGHT_BRACKET
  private static boolean applyFunction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunction_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LEFT_BRACKET);
    result_ = result_ && applyFunction_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (expr (COMMA expr)*)?
  private static boolean applyFunction_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunction_0_1")) return false;
    applyFunction_0_1_0(builder_, level_ + 1);
    return true;
  }

  // expr (COMMA expr)*
  private static boolean applyFunction_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunction_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && applyFunction_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA expr)*
  private static boolean applyFunction_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunction_0_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!applyFunction_0_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "applyFunction_0_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA expr
  private static boolean applyFunction_0_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunction_0_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_S_BRACKET RIGHT_S_BRACKET
  //  LEFT_BRACKET
  //  (
  //   symbol
  //   (COMMA symbol)*
  //  )?
  //  RIGHT_BRACKET ARROW
  //   expr
  public static boolean functionLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionLit")) return false;
    if (!nextTokenIsSmart(builder_, LEFT_S_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, LEFT_S_BRACKET, RIGHT_S_BRACKET, LEFT_BRACKET);
    result_ = result_ && functionLit_3(builder_, level_ + 1);
    result_ = result_ && consumeTokensSmart(builder_, 0, RIGHT_BRACKET, ARROW);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, FUNCTION_LIT, result_);
    return result_;
  }

  // (
  //   symbol
  //   (COMMA symbol)*
  //  )?
  private static boolean functionLit_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionLit_3")) return false;
    functionLit_3_0(builder_, level_ + 1);
    return true;
  }

  // symbol
  //   (COMMA symbol)*
  private static boolean functionLit_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionLit_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    result_ = result_ && functionLit_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA symbol)*
  private static boolean functionLit_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionLit_3_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!functionLit_3_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionLit_3_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA symbol
  private static boolean functionLit_3_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionLit_3_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, COMMA);
    result_ = result_ && symbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NUM
  public static boolean number(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "number")) return false;
    if (!nextTokenIsSmart(builder_, NUM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, NUM);
    exit_section_(builder_, marker_, NUMBER, result_);
    return result_;
  }

  // TRUE_KEYWORD | FALSE_KEYWORD
  public static boolean booleanLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "booleanLit")) return false;
    if (!nextTokenIsSmart(builder_, FALSE_KEYWORD, TRUE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BOOLEAN_LIT, "<boolean lit>");
    result_ = consumeTokenSmart(builder_, TRUE_KEYWORD);
    if (!result_) result_ = consumeTokenSmart(builder_, FALSE_KEYWORD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // NULL_KEYWORD
  public static boolean nullLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nullLit")) return false;
    if (!nextTokenIsSmart(builder_, NULL_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, NULL_KEYWORD);
    exit_section_(builder_, marker_, NULL_LIT, result_);
    return result_;
  }

  // STR
  public static boolean string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string")) return false;
    if (!nextTokenIsSmart(builder_, STR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, STR);
    exit_section_(builder_, marker_, STRING, result_);
    return result_;
  }

  // CHAR
  public static boolean charLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "charLit")) return false;
    if (!nextTokenIsSmart(builder_, CHAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, CHAR);
    exit_section_(builder_, marker_, CHAR_LIT, result_);
    return result_;
  }

  // LEFT_B_BRACKET (expr (COMMA expr)*)? RIGHT_B_BRACKET
  public static boolean arrayLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayLit")) return false;
    if (!nextTokenIsSmart(builder_, LEFT_B_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LEFT_B_BRACKET);
    result_ = result_ && arrayLit_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RIGHT_B_BRACKET);
    exit_section_(builder_, marker_, ARRAY_LIT, result_);
    return result_;
  }

  // (expr (COMMA expr)*)?
  private static boolean arrayLit_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayLit_1")) return false;
    arrayLit_1_0(builder_, level_ + 1);
    return true;
  }

  // expr (COMMA expr)*
  private static boolean arrayLit_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayLit_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && arrayLit_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA expr)*
  private static boolean arrayLit_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayLit_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!arrayLit_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arrayLit_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA expr
  private static boolean arrayLit_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayLit_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, COMMA);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SYM
  public static boolean symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol")) return false;
    if (!nextTokenIsSmart(builder_, SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, SYM);
    exit_section_(builder_, marker_, SYMBOL, result_);
    return result_;
  }

  public static boolean bracketExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketExpr")) return false;
    if (!nextTokenIsSmart(builder_, LEFT_BRACKET)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, LEFT_BRACKET);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, -1);
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RIGHT_BRACKET)) && result_;
    exit_section_(builder_, level_, marker_, BRACKET_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

}
