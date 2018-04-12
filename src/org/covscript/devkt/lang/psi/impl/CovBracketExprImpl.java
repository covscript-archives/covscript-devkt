// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import org.covscript.devkt.lang.psi.CovBracketExpr;
import org.covscript.devkt.lang.psi.CovExpr;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
public class CovBracketExprImpl extends CovExprImpl implements CovBracketExpr {

  public CovBracketExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitBracketExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CovExpr getExpr() {
    return findChildByClass(CovExpr.class);
  }

}
