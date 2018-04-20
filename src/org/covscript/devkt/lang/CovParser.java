// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang;

import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.lang.LightPsiParser;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;

import static org.covscript.devkt.lang.psi.CovTypes.*;
import static org.jetbrains.kotlin.com.intellij.lang.PsiBuilder.*;
import static org.jetbrains.kotlin.com.intellij.lang.parser.GeneratedParserUtilBase.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CovParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == BLOCK_STATEMENT) {
      r = blockStatement(b, 0);
    }
    else if (t == BODY_OF_SOMETHING) {
      r = bodyOfSomething(b, 0);
    }
    else if (t == BREAK) {
      r = break_$(b, 0);
    }
    else if (t == COLLAPSED_STATEMENT) {
      r = collapsedStatement(b, 0);
    }
    else if (t == COMMENT) {
      r = comment(b, 0);
    }
    else if (t == CONTINUE) {
      r = continue_$(b, 0);
    }
    else if (t == EXPR) {
      r = expr(b, 0, -1);
    }
    else if (t == FILE_HEADER) {
      r = fileHeader(b, 0);
    }
    else if (t == FOR_ITERATE) {
      r = forIterate(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = forStatement(b, 0);
    }
    else if (t == FOR_TO) {
      r = forTo(b, 0);
    }
    else if (t == FUNCTION_DECLARATION) {
      r = functionDeclaration(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = ifStatement(b, 0);
    }
    else if (t == IMPORT_DECLARATION) {
      r = importDeclaration(b, 0);
    }
    else if (t == INDEX) {
      r = index(b, 0);
    }
    else if (t == LOOP_UNTIL_STATEMENT) {
      r = loopUntilStatement(b, 0);
    }
    else if (t == NAMESPACE_DECLARATION) {
      r = namespaceDeclaration(b, 0);
    }
    else if (t == PACKAGE_DECLARATION) {
      r = packageDeclaration(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = returnStatement(b, 0);
    }
    else if (t == STATEMENT) {
      r = statement(b, 0);
    }
    else if (t == STRUCT_DECLARATION) {
      r = structDeclaration(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = switchStatement(b, 0);
    }
    else if (t == THROW_STATEMENT) {
      r = throwStatement(b, 0);
    }
    else if (t == TRY_CATCH_STATEMENT) {
      r = tryCatchStatement(b, 0);
    }
    else if (t == USING_DECLARATION) {
      r = usingDeclaration(b, 0);
    }
    else if (t == VARIABLE_DECLARATION) {
      r = variableDeclaration(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = whileStatement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
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
  static boolean assignOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignOperator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIV_ASS);
    if (!r) r = consumeToken(b, PLUS_ASS);
    if (!r) r = consumeToken(b, MINUS_ASS);
    if (!r) r = consumeToken(b, TIMES_ASS);
    if (!r) r = consumeToken(b, POW_ASS);
    if (!r) r = consumeToken(b, REM_ASS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BLOCK_KEYWORD endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean blockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStatement")) return false;
    if (!nextTokenIs(b, BLOCK_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT, null);
    r = consumeToken(b, BLOCK_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, endOfLine(b, l + 1));
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (statement endOfLine)*
  public static boolean bodyOfSomething(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyOfSomething")) return false;
    Marker m = enter_section_(b, l, _NONE_, BODY_OF_SOMETHING, "<body of something>");
    int c = current_position_(b);
    while (true) {
      if (!bodyOfSomething_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bodyOfSomething", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // statement endOfLine
  private static boolean bodyOfSomething_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyOfSomething_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BREAK_KEYWORD
  public static boolean break_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_$")) return false;
    if (!nextTokenIs(b, BREAK_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BREAK_KEYWORD);
    exit_section_(b, m, BREAK, r);
    return r;
  }

  /* ********************************************************** */
  // COLLAPSER_BEGIN primaryStatement? COLLAPSER_END
  public static boolean collapsedStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collapsedStatement")) return false;
    if (!nextTokenIs(b, COLLAPSER_BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLLAPSER_BEGIN);
    r = r && collapsedStatement_1(b, l + 1);
    r = r && consumeToken(b, COLLAPSER_END);
    exit_section_(b, m, COLLAPSED_STATEMENT, r);
    return r;
  }

  // primaryStatement?
  private static boolean collapsedStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collapsedStatement_1")) return false;
    primaryStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LINE_COMMENT
  public static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    if (!nextTokenIs(b, LINE_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LT_SYM
  //  | GT_SYM
  //  | GE_SYM
  //  | LE_SYM
  //  | EQ_SYM
  //  | UN_SYM
  static boolean compareOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compareOperator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT_SYM);
    if (!r) r = consumeToken(b, GT_SYM);
    if (!r) r = consumeToken(b, GE_SYM);
    if (!r) r = consumeToken(b, LE_SYM);
    if (!r) r = consumeToken(b, EQ_SYM);
    if (!r) r = consumeToken(b, UN_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE_KEYWORD
  public static boolean continue_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_$")) return false;
    if (!nextTokenIs(b, CONTINUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTINUE_KEYWORD);
    exit_section_(b, m, CONTINUE, r);
    return r;
  }

  /* ********************************************************** */
  // EOL+
  static boolean endOfLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfLine")) return false;
    if (!nextTokenIs(b, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "endOfLine", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // fileHeader*
  //  statement*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_0(b, l + 1);
    r = r && file_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // fileHeader*
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!fileHeader(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // statement*
  private static boolean file_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // usingDeclaration
  //  | importDeclaration
  //  | packageDeclaration
  //  | comment
  //  | endOfLine
  public static boolean fileHeader(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fileHeader")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_HEADER, "<file header>");
    r = usingDeclaration(b, l + 1);
    if (!r) r = importDeclaration(b, l + 1);
    if (!r) r = packageDeclaration(b, l + 1);
    if (!r) r = comment(b, l + 1);
    if (!r) r = endOfLine(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ITERATE_KEYWORD expr
  public static boolean forIterate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forIterate")) return false;
    if (!nextTokenIs(b, ITERATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ITERATE_KEYWORD);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, FOR_ITERATE, r);
    return r;
  }

  /* ********************************************************** */
  // FOR_KEYWORD symbol (forTo | forIterate) endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean forStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement")) return false;
    if (!nextTokenIs(b, FOR_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_STATEMENT, null);
    r = consumeToken(b, FOR_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, symbol(b, l + 1));
    r = p && report_error_(b, forStatement_2(b, l + 1)) && r;
    r = p && report_error_(b, endOfLine(b, l + 1)) && r;
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // forTo | forIterate
  private static boolean forStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = forTo(b, l + 1);
    if (!r) r = forIterate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQ expr TO_KEYWORD expr (STEP_KEYWORD expr)?
  public static boolean forTo(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forTo")) return false;
    if (!nextTokenIs(b, EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, TO_KEYWORD);
    r = r && expr(b, l + 1, -1);
    r = r && forTo_4(b, l + 1);
    exit_section_(b, m, FOR_TO, r);
    return r;
  }

  // (STEP_KEYWORD expr)?
  private static boolean forTo_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forTo_4")) return false;
    forTo_4_0(b, l + 1);
    return true;
  }

  // STEP_KEYWORD expr
  private static boolean forTo_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forTo_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STEP_KEYWORD);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FUNCTION_KEYWORD symbol LEFT_BRACKET (symbol (COMMA symbol)*)? RIGHT_BRACKET
  //    OVERRIDE_KEYWORD? endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    if (!nextTokenIs(b, FUNCTION_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, null);
    r = consumeToken(b, FUNCTION_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, symbol(b, l + 1));
    r = p && report_error_(b, consumeToken(b, LEFT_BRACKET)) && r;
    r = p && report_error_(b, functionDeclaration_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, RIGHT_BRACKET)) && r;
    r = p && report_error_(b, functionDeclaration_5(b, l + 1)) && r;
    r = p && report_error_(b, endOfLine(b, l + 1)) && r;
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (symbol (COMMA symbol)*)?
  private static boolean functionDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3")) return false;
    functionDeclaration_3_0(b, l + 1);
    return true;
  }

  // symbol (COMMA symbol)*
  private static boolean functionDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    r = r && functionDeclaration_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA symbol)*
  private static boolean functionDeclaration_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionDeclaration_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_3_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA symbol
  private static boolean functionDeclaration_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OVERRIDE_KEYWORD?
  private static boolean functionDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_5")) return false;
    consumeToken(b, OVERRIDE_KEYWORD);
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
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, IF_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, null);
    r = consumeToken(b, IF_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1, -1));
    r = p && report_error_(b, endOfLine(b, l + 1)) && r;
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && report_error_(b, ifStatement_4(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (
  //    ELSE_KEYWORD endOfLine
  //     bodyOfSomething
  //   )?
  private static boolean ifStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_4")) return false;
    ifStatement_4_0(b, l + 1);
    return true;
  }

  // ELSE_KEYWORD endOfLine
  //     bodyOfSomething
  private static boolean ifStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && bodyOfSomething(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT_KEYWORD symbol
  public static boolean importDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DECLARATION, null);
    r = consumeToken(b, IMPORT_KEYWORD);
    p = r; // pin = 1
    r = r && symbol(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LEFT_S_BRACKET expr RIGHT_S_BRACKET
  public static boolean index(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index")) return false;
    if (!nextTokenIs(b, LEFT_S_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_S_BRACKET);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, RIGHT_S_BRACKET);
    exit_section_(b, m, INDEX, r);
    return r;
  }

  /* ********************************************************** */
  // AND_KEYWORD
  //  | AND_SYM
  //  | OR_KEYWORD
  //  | OR_SYM
  static boolean logicOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logicOperator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND_KEYWORD);
    if (!r) r = consumeToken(b, AND_SYM);
    if (!r) r = consumeToken(b, OR_KEYWORD);
    if (!r) r = consumeToken(b, OR_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOOP_KEYWORD endOfLine
  //   bodyOfSomething
  //  (UNTIL_KEYWORD expr endOfLine)?
  //  END_KEYWORD
  public static boolean loopUntilStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loopUntilStatement")) return false;
    if (!nextTokenIs(b, LOOP_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LOOP_UNTIL_STATEMENT, null);
    r = consumeToken(b, LOOP_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, endOfLine(b, l + 1));
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && report_error_(b, loopUntilStatement_3(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (UNTIL_KEYWORD expr endOfLine)?
  private static boolean loopUntilStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loopUntilStatement_3")) return false;
    loopUntilStatement_3_0(b, l + 1);
    return true;
  }

  // UNTIL_KEYWORD expr endOfLine
  private static boolean loopUntilStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loopUntilStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNTIL_KEYWORD);
    r = r && expr(b, l + 1, -1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAMESPACE_KEYWORD symbol endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean namespaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceDeclaration")) return false;
    if (!nextTokenIs(b, NAMESPACE_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_DECLARATION, null);
    r = consumeToken(b, NAMESPACE_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, symbol(b, l + 1));
    r = p && report_error_(b, endOfLine(b, l + 1)) && r;
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PACKAGE_KEYWORD symbol
  public static boolean packageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATION, null);
    r = consumeToken(b, PACKAGE_KEYWORD);
    p = r; // pin = 1
    r = r && symbol(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  static boolean primaryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryStatement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfLine(b, l + 1);
    if (!r) r = importDeclaration(b, l + 1);
    if (!r) r = throwStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = variableDeclaration(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    if (!r) r = structDeclaration(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = switchStatement(b, l + 1);
    if (!r) r = blockStatement(b, l + 1);
    if (!r) r = forStatement(b, l + 1);
    if (!r) r = loopUntilStatement(b, l + 1);
    if (!r) r = tryCatchStatement(b, l + 1);
    if (!r) r = comment(b, l + 1);
    if (!r) r = namespaceDeclaration(b, l + 1);
    if (!r) r = break_$(b, l + 1);
    if (!r) r = continue_$(b, l + 1);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN_KEYWORD expr?
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, RETURN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN_KEYWORD);
    r = r && returnStatement_1(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expr?
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // primaryStatement
  //  | collapsedStatement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = primaryStatement(b, l + 1);
    if (!r) r = collapsedStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRUCT_KEYWORD symbol (EXTENDS_KEYWORD expr)? endOfLine
  //   ((variableDeclaration | functionDeclaration) endOfLine)*
  //  END_KEYWORD
  public static boolean structDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration")) return false;
    if (!nextTokenIs(b, STRUCT_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATION, null);
    r = consumeToken(b, STRUCT_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, symbol(b, l + 1));
    r = p && report_error_(b, structDeclaration_2(b, l + 1)) && r;
    r = p && report_error_(b, endOfLine(b, l + 1)) && r;
    r = p && report_error_(b, structDeclaration_4(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (EXTENDS_KEYWORD expr)?
  private static boolean structDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_2")) return false;
    structDeclaration_2_0(b, l + 1);
    return true;
  }

  // EXTENDS_KEYWORD expr
  private static boolean structDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS_KEYWORD);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((variableDeclaration | functionDeclaration) endOfLine)*
  private static boolean structDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!structDeclaration_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (variableDeclaration | functionDeclaration) endOfLine
  private static boolean structDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structDeclaration_4_0_0(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // variableDeclaration | functionDeclaration
  private static boolean structDeclaration_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableDeclaration(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SWITCH_KEYWORD expr endOfLine
  //   (
  //    (CASE_KEYWORD expr | DEFAULT_KEYWORD) endOfLine
  //     bodyOfSomething
  //    END_KEYWORD endOfLine
  //   )*
  //  END_KEYWORD
  public static boolean switchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement")) return false;
    if (!nextTokenIs(b, SWITCH_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_STATEMENT, null);
    r = consumeToken(b, SWITCH_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1, -1));
    r = p && report_error_(b, endOfLine(b, l + 1)) && r;
    r = p && report_error_(b, switchStatement_3(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (
  //    (CASE_KEYWORD expr | DEFAULT_KEYWORD) endOfLine
  //     bodyOfSomething
  //    END_KEYWORD endOfLine
  //   )*
  private static boolean switchStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!switchStatement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switchStatement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (CASE_KEYWORD expr | DEFAULT_KEYWORD) endOfLine
  //     bodyOfSomething
  //    END_KEYWORD endOfLine
  private static boolean switchStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switchStatement_3_0_0(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && bodyOfSomething(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CASE_KEYWORD expr | DEFAULT_KEYWORD
  private static boolean switchStatement_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = switchStatement_3_0_0_0(b, l + 1);
    if (!r) r = consumeToken(b, DEFAULT_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // CASE_KEYWORD expr
  private static boolean switchStatement_3_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement_3_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE_KEYWORD);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // THROW_KEYWORD expr
  public static boolean throwStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throwStatement")) return false;
    if (!nextTokenIs(b, THROW_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROW_KEYWORD);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, THROW_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // TRY_KEYWORD endOfLine
  //   bodyOfSomething
  //  CATCH_KEYWORD symbol endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean tryCatchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryCatchStatement")) return false;
    if (!nextTokenIs(b, TRY_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRY_CATCH_STATEMENT, null);
    r = consumeToken(b, TRY_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, endOfLine(b, l + 1));
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, CATCH_KEYWORD)) && r;
    r = p && report_error_(b, symbol(b, l + 1)) && r;
    r = p && report_error_(b, endOfLine(b, l + 1)) && r;
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // USING_KEYWORD symbol (DOT symbol)*
  public static boolean usingDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usingDeclaration")) return false;
    if (!nextTokenIs(b, USING_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USING_DECLARATION, null);
    r = consumeToken(b, USING_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, symbol(b, l + 1));
    r = p && usingDeclaration_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (DOT symbol)*
  private static boolean usingDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usingDeclaration_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!usingDeclaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "usingDeclaration_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT symbol
  private static boolean usingDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usingDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (CONST_KEYWORD)? VAR_KEYWORD symbol EQ expr
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    if (!nextTokenIs(b, "<variable declaration>", CONST_KEYWORD, VAR_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variableDeclaration_0(b, l + 1);
    r = r && consumeToken(b, VAR_KEYWORD);
    p = r; // pin = 2
    r = r && report_error_(b, symbol(b, l + 1));
    r = p && report_error_(b, consumeToken(b, EQ)) && r;
    r = p && expr(b, l + 1, -1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (CONST_KEYWORD)?
  private static boolean variableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_0")) return false;
    consumeToken(b, CONST_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // WHILE_KEYWORD expr endOfLine
  //   bodyOfSomething
  //  END_KEYWORD
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    if (!nextTokenIs(b, WHILE_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, null);
    r = consumeToken(b, WHILE_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, expr(b, l + 1, -1));
    r = p && report_error_(b, endOfLine(b, l + 1)) && r;
    r = p && report_error_(b, bodyOfSomething(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = notOp(b, l + 1);
    if (!r) r = negOp(b, l + 1);
    if (!r) r = derefOp(b, l + 1);
    if (!r) r = unaryExpr(b, l + 1);
    if (!r) r = newExpr(b, l + 1);
    if (!r) r = typeidExpr(b, l + 1);
    if (!r) r = functionLit(b, l + 1);
    if (!r) r = number(b, l + 1);
    if (!r) r = booleanLit(b, l + 1);
    if (!r) r = nullLit(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = charLit(b, l + 1);
    if (!r) r = arrayLit(b, l + 1);
    if (!r) r = symbol(b, l + 1);
    if (!r) r = bracketExpr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, EQ)) {
        r = expr(b, l, -1);
        exit_section_(b, l, m, ASSIGN, r, true, null);
      }
      else if (g < 0 && assignOperator(b, l + 1)) {
        r = expr(b, l, -1);
        exit_section_(b, l, m, OP_ASSIGN, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, QUESTION_SYM)) {
        r = report_error_(b, expr(b, l, 1));
        r = expr(b, l + 1, 1) && r;
        exit_section_(b, l, m, TERNARY_OP, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, COLON_SYM)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, PAIR_OP, r, true, null);
      }
      else if (g < 3 && logicOperator(b, l + 1)) {
        r = expr(b, l, 3);
        exit_section_(b, l, m, LOGIC_OP, r, true, null);
      }
      else if (g < 5 && compareOperator(b, l + 1)) {
        r = expr(b, l, 5);
        exit_section_(b, l, m, COMPARE_LEVEL_OP, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, PLUS_SYM)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, PLUS_OP, r, true, null);
      }
      else if (g < 6 && consumeTokenSmart(b, MINUS_SYM)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, MINUS_OP, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, DIV_SYM)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, DIV_OP, r, true, null);
      }
      else if (g < 7 && consumeTokenSmart(b, TIMES_SYM)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, TIMES_OP, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, REM_SYM)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, REM_OP, r, true, null);
      }
      else if (g < 8 && consumeTokenSmart(b, POW_SYM)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, POW_OP, r, true, null);
      }
      else if (g < 9 && suffixedExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, SUFFIXED_EXPR, r, true, null);
      }
      else if (g < 11 && index(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, APPLY_INDEX, r, true, null);
      }
      else if (g < 11 && applyFunction_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, APPLY_FUNCTION, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, DOT)) {
        r = expr(b, l, 11);
        exit_section_(b, l, m, MEMBER_ACCESS, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean notOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notOp")) return false;
    if (!nextTokenIsSmart(b, NOT_KEYWORD, NOT_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = notOp_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 4);
    exit_section_(b, l, m, NOT_OP, r, p, null);
    return r || p;
  }

  // NOT_SYM | NOT_KEYWORD
  private static boolean notOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NOT_SYM);
    if (!r) r = consumeTokenSmart(b, NOT_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean negOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "negOp")) return false;
    if (!nextTokenIsSmart(b, MINUS_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, MINUS_SYM);
    p = r;
    r = p && expr(b, l, 6);
    exit_section_(b, l, m, NEG_OP, r, p, null);
    return r || p;
  }

  public static boolean derefOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "derefOp")) return false;
    if (!nextTokenIsSmart(b, TIMES_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, TIMES_SYM);
    p = r;
    r = p && expr(b, l, 7);
    exit_section_(b, l, m, DEREF_OP, r, p, null);
    return r || p;
  }

  public static boolean unaryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpr")) return false;
    if (!nextTokenIsSmart(b, DEC_SYM, INC_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryExpr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 9);
    exit_section_(b, l, m, UNARY_EXPR, r, p, null);
    return r || p;
  }

  // INC_SYM | DEC_SYM
  private static boolean unaryExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INC_SYM);
    if (!r) r = consumeTokenSmart(b, DEC_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  // INC_SYM | DEC_SYM
  private static boolean suffixedExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffixedExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INC_SYM);
    if (!r) r = consumeTokenSmart(b, DEC_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean newExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newExpr")) return false;
    if (!nextTokenIsSmart(b, GCNEW_KEYWORD, NEW_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = newExpr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 10);
    exit_section_(b, l, m, NEW_EXPR, r, p, null);
    return r || p;
  }

  // NEW_KEYWORD | GCNEW_KEYWORD
  private static boolean newExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NEW_KEYWORD);
    if (!r) r = consumeTokenSmart(b, GCNEW_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean typeidExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeidExpr")) return false;
    if (!nextTokenIsSmart(b, TYPEID_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, TYPEID_KEYWORD);
    p = r;
    r = p && expr(b, l, 10);
    exit_section_(b, l, m, TYPEID_EXPR, r, p, null);
    return r || p;
  }

  // LEFT_BRACKET (expr (COMMA expr)*)? RIGHT_BRACKET
  private static boolean applyFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_BRACKET);
    r = r && applyFunction_0_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr (COMMA expr)*)?
  private static boolean applyFunction_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunction_0_1")) return false;
    applyFunction_0_1_0(b, l + 1);
    return true;
  }

  // expr (COMMA expr)*
  private static boolean applyFunction_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunction_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && applyFunction_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expr)*
  private static boolean applyFunction_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunction_0_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!applyFunction_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "applyFunction_0_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA expr
  private static boolean applyFunction_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunction_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_S_BRACKET RIGHT_S_BRACKET
  //  LEFT_BRACKET
  //  (
  //   symbol
  //   (COMMA symbol)*
  //  )?
  //  RIGHT_BRACKET ARROW
  //   expr
  public static boolean functionLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLit")) return false;
    if (!nextTokenIsSmart(b, LEFT_S_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, LEFT_S_BRACKET, RIGHT_S_BRACKET, LEFT_BRACKET);
    r = r && functionLit_3(b, l + 1);
    r = r && consumeTokensSmart(b, 0, RIGHT_BRACKET, ARROW);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, FUNCTION_LIT, r);
    return r;
  }

  // (
  //   symbol
  //   (COMMA symbol)*
  //  )?
  private static boolean functionLit_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLit_3")) return false;
    functionLit_3_0(b, l + 1);
    return true;
  }

  // symbol
  //   (COMMA symbol)*
  private static boolean functionLit_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLit_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    r = r && functionLit_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA symbol)*
  private static boolean functionLit_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLit_3_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionLit_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionLit_3_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA symbol
  private static boolean functionLit_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLit_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUM
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIsSmart(b, NUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NUM);
    exit_section_(b, m, NUMBER, r);
    return r;
  }

  // TRUE_KEYWORD | FALSE_KEYWORD
  public static boolean booleanLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanLit")) return false;
    if (!nextTokenIsSmart(b, FALSE_KEYWORD, TRUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LIT, "<boolean lit>");
    r = consumeTokenSmart(b, TRUE_KEYWORD);
    if (!r) r = consumeTokenSmart(b, FALSE_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NULL_KEYWORD
  public static boolean nullLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nullLit")) return false;
    if (!nextTokenIsSmart(b, NULL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NULL_KEYWORD);
    exit_section_(b, m, NULL_LIT, r);
    return r;
  }

  // STR
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIsSmart(b, STR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, STR);
    exit_section_(b, m, STRING, r);
    return r;
  }

  // CHAR
  public static boolean charLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charLit")) return false;
    if (!nextTokenIsSmart(b, CHAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, CHAR);
    exit_section_(b, m, CHAR_LIT, r);
    return r;
  }

  // LEFT_B_BRACKET (expr (COMMA expr)*)? RIGHT_B_BRACKET
  public static boolean arrayLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayLit")) return false;
    if (!nextTokenIsSmart(b, LEFT_B_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_B_BRACKET);
    r = r && arrayLit_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_B_BRACKET);
    exit_section_(b, m, ARRAY_LIT, r);
    return r;
  }

  // (expr (COMMA expr)*)?
  private static boolean arrayLit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayLit_1")) return false;
    arrayLit_1_0(b, l + 1);
    return true;
  }

  // expr (COMMA expr)*
  private static boolean arrayLit_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayLit_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && arrayLit_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expr)*
  private static boolean arrayLit_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayLit_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!arrayLit_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayLit_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA expr
  private static boolean arrayLit_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayLit_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYM
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    if (!nextTokenIsSmart(b, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SYM);
    exit_section_(b, m, SYMBOL, r);
    return r;
  }

  public static boolean bracketExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketExpr")) return false;
    if (!nextTokenIsSmart(b, LEFT_BRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LEFT_BRACKET);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, consumeToken(b, RIGHT_BRACKET)) && r;
    exit_section_(b, l, m, BRACKET_EXPR, r, p, null);
    return r || p;
  }

}
