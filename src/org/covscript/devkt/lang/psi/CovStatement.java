// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface CovStatement extends PsiElement {

  @Nullable
  CovBlockStatement getBlockStatement();

  @Nullable
  CovBreak getBreak();

  @Nullable
  CovCollapsedStatement getCollapsedStatement();

  @Nullable
  CovComment getComment();

  @Nullable
  CovContinue getContinue();

  @Nullable
  CovExpr getExpr();

  @Nullable
  CovForStatement getForStatement();

  @Nullable
  CovFunctionDeclaration getFunctionDeclaration();

  @Nullable
  CovIfStatement getIfStatement();

  @Nullable
  CovImportDeclaration getImportDeclaration();

  @Nullable
  CovLoopUntilStatement getLoopUntilStatement();

  @Nullable
  CovNamespaceDeclaration getNamespaceDeclaration();

  @Nullable
  CovReturnStatement getReturnStatement();

  @Nullable
  CovStructDeclaration getStructDeclaration();

  @Nullable
  CovSwitchStatement getSwitchStatement();

  @Nullable
  CovThrowStatement getThrowStatement();

  @Nullable
  CovTryCatchStatement getTryCatchStatement();

  @Nullable
  CovVariableDeclaration getVariableDeclaration();

  @Nullable
  CovWhileStatement getWhileStatement();

}
