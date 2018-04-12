// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.covscript.devkt.lang.psi.impl.ICovStatement;
import org.jetbrains.kotlin.com.intellij.psi.PsiNameIdentifierOwner;
import org.covscript.devkt.lang.psi.impl.ICovExpr;
import org.jetbrains.kotlin.com.intellij.psi.PsiLanguageInjectionHost;
import org.covscript.devkt.lang.psi.impl.ICovImportDeclaration;
import org.covscript.devkt.lang.psi.impl.ICovStructDeclaration;
import org.covscript.devkt.lang.psi.impl.ICovVariableDeclaration;
import org.covscript.devkt.lang.psi.impl.ICovUsingDeclaration;
import org.covscript.devkt.lang.psi.impl.ICovFunctionDeclaration;

public class CovVisitor extends PsiElementVisitor {

  public void visitApplyFunction(@NotNull CovApplyFunction o) {
    visitExpr(o);
  }

  public void visitApplyIndex(@NotNull CovApplyIndex o) {
    visitExpr(o);
  }

  public void visitArrayLit(@NotNull CovArrayLit o) {
    visitExpr(o);
  }

  public void visitAssign(@NotNull CovAssign o) {
    visitExpr(o);
  }

  public void visitBlockStatement(@NotNull CovBlockStatement o) {
    visitPsiElement(o);
  }

  public void visitBodyOfSomething(@NotNull CovBodyOfSomething o) {
    visitPsiElement(o);
  }

  public void visitBooleanLit(@NotNull CovBooleanLit o) {
    visitExpr(o);
  }

  public void visitBracketExpr(@NotNull CovBracketExpr o) {
    visitExpr(o);
  }

  public void visitBreak(@NotNull CovBreak o) {
    visitPsiElement(o);
  }

  public void visitCharLit(@NotNull CovCharLit o) {
    visitExpr(o);
  }

  public void visitCollapsedStatement(@NotNull CovCollapsedStatement o) {
    visitPsiElement(o);
  }

  public void visitComment(@NotNull CovComment o) {
    visitPsiLanguageInjectionHost(o);
    // visitPsiComment(o);
  }

  public void visitCompareLevelOp(@NotNull CovCompareLevelOp o) {
    visitExpr(o);
  }

  public void visitContinue(@NotNull CovContinue o) {
    visitPsiElement(o);
  }

  public void visitDerefOp(@NotNull CovDerefOp o) {
    visitExpr(o);
  }

  public void visitDivOp(@NotNull CovDivOp o) {
    visitExpr(o);
  }

  public void visitExpr(@NotNull CovExpr o) {
    visitICovExpr(o);
  }

  public void visitFileHeader(@NotNull CovFileHeader o) {
    visitPsiElement(o);
  }

  public void visitForIterate(@NotNull CovForIterate o) {
    visitPsiElement(o);
  }

  public void visitForStatement(@NotNull CovForStatement o) {
    visitPsiNameIdentifierOwner(o);
  }

  public void visitForTo(@NotNull CovForTo o) {
    visitPsiElement(o);
  }

  public void visitFunctionDeclaration(@NotNull CovFunctionDeclaration o) {
    visitICovFunctionDeclaration(o);
  }

  public void visitFunctionLit(@NotNull CovFunctionLit o) {
    visitExpr(o);
  }

  public void visitIfStatement(@NotNull CovIfStatement o) {
    visitPsiElement(o);
  }

  public void visitImportDeclaration(@NotNull CovImportDeclaration o) {
    visitICovImportDeclaration(o);
  }

  public void visitIndex(@NotNull CovIndex o) {
    visitPsiElement(o);
  }

  public void visitLogicOp(@NotNull CovLogicOp o) {
    visitExpr(o);
  }

  public void visitLoopUntilStatement(@NotNull CovLoopUntilStatement o) {
    visitPsiElement(o);
  }

  public void visitMemberAccess(@NotNull CovMemberAccess o) {
    visitExpr(o);
  }

  public void visitMinusOp(@NotNull CovMinusOp o) {
    visitExpr(o);
  }

  public void visitNamespaceDeclaration(@NotNull CovNamespaceDeclaration o) {
    visitPsiElement(o);
  }

  public void visitNegOp(@NotNull CovNegOp o) {
    visitExpr(o);
  }

  public void visitNewExpr(@NotNull CovNewExpr o) {
    visitExpr(o);
  }

  public void visitNotOp(@NotNull CovNotOp o) {
    visitExpr(o);
  }

  public void visitNullLit(@NotNull CovNullLit o) {
    visitExpr(o);
  }

  public void visitNumber(@NotNull CovNumber o) {
    visitExpr(o);
  }

  public void visitOpAssign(@NotNull CovOpAssign o) {
    visitExpr(o);
  }

  public void visitPackageDeclaration(@NotNull CovPackageDeclaration o) {
    visitPsiElement(o);
  }

  public void visitPairOp(@NotNull CovPairOp o) {
    visitExpr(o);
  }

  public void visitPlusOp(@NotNull CovPlusOp o) {
    visitExpr(o);
  }

  public void visitPowOp(@NotNull CovPowOp o) {
    visitExpr(o);
  }

  public void visitRemOp(@NotNull CovRemOp o) {
    visitExpr(o);
  }

  public void visitReturnStatement(@NotNull CovReturnStatement o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull CovStatement o) {
    visitICovStatement(o);
  }

  public void visitString(@NotNull CovString o) {
    visitExpr(o);
    // visitICovString(o);
  }

  public void visitStructDeclaration(@NotNull CovStructDeclaration o) {
    visitICovStructDeclaration(o);
  }

  public void visitSuffixedExpr(@NotNull CovSuffixedExpr o) {
    visitExpr(o);
  }

  public void visitSwitchStatement(@NotNull CovSwitchStatement o) {
    visitPsiElement(o);
  }

  public void visitSymbol(@NotNull CovSymbol o) {
    visitExpr(o);
    // visitICovSymbol(o);
  }

  public void visitTernaryOp(@NotNull CovTernaryOp o) {
    visitExpr(o);
  }

  public void visitThrowStatement(@NotNull CovThrowStatement o) {
    visitPsiElement(o);
  }

  public void visitTimesOp(@NotNull CovTimesOp o) {
    visitExpr(o);
  }

  public void visitTryCatchStatement(@NotNull CovTryCatchStatement o) {
    visitPsiNameIdentifierOwner(o);
  }

  public void visitTypeidExpr(@NotNull CovTypeidExpr o) {
    visitExpr(o);
  }

  public void visitUnaryExpr(@NotNull CovUnaryExpr o) {
    visitExpr(o);
  }

  public void visitUsingDeclaration(@NotNull CovUsingDeclaration o) {
    visitICovUsingDeclaration(o);
  }

  public void visitVariableDeclaration(@NotNull CovVariableDeclaration o) {
    visitICovVariableDeclaration(o);
  }

  public void visitWhileStatement(@NotNull CovWhileStatement o) {
    visitPsiElement(o);
  }

  @SuppressWarnings("WeakerAccess") public void visitICovExpr(@NotNull ICovExpr o) {
    visitElement(o);
  }

  public void visitICovFunctionDeclaration(@NotNull ICovFunctionDeclaration o) {
    visitElement(o);
  }

  public void visitICovImportDeclaration(@NotNull ICovImportDeclaration o) {
    visitElement(o);
  }

  public void visitICovStatement(@NotNull ICovStatement o) {
    visitElement(o);
  }

  public void visitICovStructDeclaration(@NotNull ICovStructDeclaration o) {
    visitElement(o);
  }

  public void visitICovUsingDeclaration(@NotNull ICovUsingDeclaration o) {
    visitElement(o);
  }

  public void visitICovVariableDeclaration(@NotNull ICovVariableDeclaration o) {
    visitElement(o);
  }

  public void visitPsiLanguageInjectionHost(@NotNull PsiLanguageInjectionHost o) {
    visitElement(o);
  }

  public void visitPsiNameIdentifierOwner(@NotNull PsiNameIdentifierOwner o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
