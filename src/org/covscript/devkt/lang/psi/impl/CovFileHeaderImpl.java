// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.covscript.devkt.lang.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class CovFileHeaderImpl extends ASTWrapperPsiElement implements CovFileHeader {

  public CovFileHeaderImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CovVisitor visitor) {
    visitor.visitFileHeader(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CovVisitor) accept((CovVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CovImportDeclaration getImportDeclaration() {
    return findChildByClass(CovImportDeclaration.class);
  }

  @Override
  @Nullable
  public CovPackageDeclaration getPackageDeclaration() {
    return findChildByClass(CovPackageDeclaration.class);
  }

  @Override
  @Nullable
  public CovUsingDeclaration getUsingDeclaration() {
    return findChildByClass(CovUsingDeclaration.class);
  }

}
