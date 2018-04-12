// This is a generated file. Not intended for manual editing.
package org.covscript.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.covscript.lang.psi.*;

public class CovIfStatementImpl extends ASTWrapperPsiElement implements CovIfStatement {

  public CovIfStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CovBodyOfSomething> getBodyOfSomethingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CovBodyOfSomething.class);
  }

  @Override
  @Nullable
  public CovExpr getExpr() {
    return findChildByClass(CovExpr.class);
  }

}
