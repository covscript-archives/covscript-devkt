// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import org.covscript.devkt.lang.psi.CovExpr;
import org.covscript.devkt.lang.psi.CovIndex;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
public class CovIndexImpl extends ASTWrapperPsiElement implements CovIndex {

  public CovIndexImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitIndex(this);
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

}
