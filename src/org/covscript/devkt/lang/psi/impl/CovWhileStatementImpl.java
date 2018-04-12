// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import org.covscript.devkt.lang.psi.CovBodyOfSomething;
import org.covscript.devkt.lang.psi.CovExpr;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.covscript.devkt.lang.psi.CovWhileStatement;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
public class CovWhileStatementImpl extends ASTWrapperPsiElement implements CovWhileStatement {

  public CovWhileStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitWhileStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CovBodyOfSomething getBodyOfSomething() {
    return findChildByClass(CovBodyOfSomething.class);
  }

  @Override
  @Nullable
  public CovExpr getExpr() {
    return findChildByClass(CovExpr.class);
  }

}
