// This is a generated file. Not intended for manual editing.
package org.covscript.lang.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.covscript.lang.psi.*;

public class CovForStatementImpl extends CovForStatementMixin implements CovForStatement {

  public CovForStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitForStatement(this);
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
  public CovForIterate getForIterate() {
    return findChildByClass(CovForIterate.class);
  }

  @Override
  @Nullable
  public CovForTo getForTo() {
    return findChildByClass(CovForTo.class);
  }

  @Override
  @Nullable
  public CovSymbol getSymbol() {
    return findChildByClass(CovSymbol.class);
  }

}
