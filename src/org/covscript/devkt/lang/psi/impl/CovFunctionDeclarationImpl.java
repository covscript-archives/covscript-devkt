// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import java.util.List;

import org.covscript.devkt.lang.psi.CovBodyOfSomething;
import org.covscript.devkt.lang.psi.CovFunctionDeclaration;
import org.covscript.devkt.lang.psi.CovSymbol;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.covscript.lang.psi.*;

public class CovFunctionDeclarationImpl extends CovFunctionDeclarationMixin implements CovFunctionDeclaration {

  public CovFunctionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitFunctionDeclaration(this);
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
  @NotNull
  public List<CovSymbol> getSymbolList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CovSymbol.class);
  }

}
