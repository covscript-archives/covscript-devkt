// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import java.util.List;

import org.covscript.devkt.lang.psi.CovBodyOfSomething;
import org.covscript.devkt.lang.psi.CovSymbol;
import org.covscript.devkt.lang.psi.CovTryCatchStatement;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
public class CovTryCatchStatementImpl extends CovTryCatchDeclarationMixin implements CovTryCatchStatement {

  public CovTryCatchStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitTryCatchStatement(this);
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
  public CovSymbol getSymbol() {
    return findChildByClass(CovSymbol.class);
  }

}
