// This is a generated file. Not intended for manual editing.
package org.covscript.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.covscript.lang.psi.*;

public class CovApplyFunctionImpl extends CovExprImpl implements CovApplyFunction {

  public CovApplyFunctionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitApplyFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CovExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CovExpr.class);
  }

}
