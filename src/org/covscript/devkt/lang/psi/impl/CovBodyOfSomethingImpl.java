// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import java.util.List;

import org.covscript.devkt.lang.psi.CovBodyOfSomething;
import org.covscript.devkt.lang.psi.CovStatement;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
public class CovBodyOfSomethingImpl extends CovBodyOfSomethingMixin implements CovBodyOfSomething {

  public CovBodyOfSomethingImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitBodyOfSomething(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CovStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CovStatement.class);
  }

}
