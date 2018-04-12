// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import java.util.List;

import org.covscript.devkt.lang.psi.CovAssign;
import org.covscript.devkt.lang.psi.CovExpr;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
public class CovAssignImpl extends CovExprImpl implements CovAssign {

  public CovAssignImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitAssign(this);
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
