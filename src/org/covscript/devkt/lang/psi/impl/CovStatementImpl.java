// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import org.covscript.devkt.lang.psi.*;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.covscript.lang.psi.*;

public class CovStatementImpl extends CovStatementMixin implements CovStatement {

  public CovStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CovBlockStatement getBlockStatement() {
    return findChildByClass(CovBlockStatement.class);
  }

  @Override
  @Nullable
  public CovBreak getBreak() {
    return findChildByClass(CovBreak.class);
  }

  @Override
  @Nullable
  public CovCollapsedStatement getCollapsedStatement() {
    return findChildByClass(CovCollapsedStatement.class);
  }

  @Override
  @Nullable
  public CovComment getComment() {
    return findChildByClass(CovComment.class);
  }

  @Override
  @Nullable
  public CovContinue getContinue() {
    return findChildByClass(CovContinue.class);
  }

  @Override
  @Nullable
  public CovExpr getExpr() {
    return findChildByClass(CovExpr.class);
  }

  @Override
  @Nullable
  public CovForStatement getForStatement() {
    return findChildByClass(CovForStatement.class);
  }

  @Override
  @Nullable
  public CovFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(CovFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public CovIfStatement getIfStatement() {
    return findChildByClass(CovIfStatement.class);
  }

  @Override
  @Nullable
  public CovImportDeclaration getImportDeclaration() {
    return findChildByClass(CovImportDeclaration.class);
  }

  @Override
  @Nullable
  public CovLoopUntilStatement getLoopUntilStatement() {
    return findChildByClass(CovLoopUntilStatement.class);
  }

  @Override
  @Nullable
  public CovNamespaceDeclaration getNamespaceDeclaration() {
    return findChildByClass(CovNamespaceDeclaration.class);
  }

  @Override
  @Nullable
  public CovReturnStatement getReturnStatement() {
    return findChildByClass(CovReturnStatement.class);
  }

  @Override
  @Nullable
  public CovStructDeclaration getStructDeclaration() {
    return findChildByClass(CovStructDeclaration.class);
  }

  @Override
  @Nullable
  public CovSwitchStatement getSwitchStatement() {
    return findChildByClass(CovSwitchStatement.class);
  }

  @Override
  @Nullable
  public CovThrowStatement getThrowStatement() {
    return findChildByClass(CovThrowStatement.class);
  }

  @Override
  @Nullable
  public CovTryCatchStatement getTryCatchStatement() {
    return findChildByClass(CovTryCatchStatement.class);
  }

  @Override
  @Nullable
  public CovVariableDeclaration getVariableDeclaration() {
    return findChildByClass(CovVariableDeclaration.class);
  }

  @Override
  @Nullable
  public CovWhileStatement getWhileStatement() {
    return findChildByClass(CovWhileStatement.class);
  }

}
