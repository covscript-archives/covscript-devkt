// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import org.covscript.devkt.lang.psi.CovImportDeclaration;
import org.covscript.devkt.lang.psi.CovSymbol;
import org.covscript.devkt.lang.psi.CovVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
public class CovImportDeclarationImpl extends CovImportDeclarationMixin implements CovImportDeclaration {

  public CovImportDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitImportDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CovSymbol getSymbol() {
    return findChildByClass(CovSymbol.class);
  }

}
