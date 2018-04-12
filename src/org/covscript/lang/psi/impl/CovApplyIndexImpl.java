// This is a generated file. Not intended for manual editing.
package org.covscript.lang.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.covscript.lang.psi.*;

public class CovApplyIndexImpl extends CovExprImpl implements CovApplyIndex {

  public CovApplyIndexImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitApplyIndex(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CovExpr getExpr() {
    return findNotNullChildByClass(CovExpr.class);
  }

  @Override
  @NotNull
  public CovIndex getIndex() {
    return findNotNullChildByClass(CovIndex.class);
  }

}
