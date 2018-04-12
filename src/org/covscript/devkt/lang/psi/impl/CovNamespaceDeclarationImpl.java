// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import org.covscript.devkt.lang.psi.CovBodyOfSomething;
import org.covscript.devkt.lang.psi.CovNamespaceDeclaration;
import org.covscript.devkt.lang.psi.CovSymbol;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
public class CovNamespaceDeclarationImpl extends CovNamespaceDeclarationMixin implements CovNamespaceDeclaration {

  public CovNamespaceDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitNamespaceDeclaration(this);
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
  public CovSymbol getSymbol() {
    return findChildByClass(CovSymbol.class);
  }

}
