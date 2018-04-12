// This is a generated file. Not intended for manual editing.
package org.covscript.devkt.lang.psi;

import java.util.List;

import org.covscript.devkt.lang.psi.impl.ICovStructDeclaration;
import org.jetbrains.annotations.*;
public interface CovStructDeclaration extends ICovStructDeclaration {

  @NotNull
  List<CovExpr> getExprList();

  @NotNull
  List<CovFunctionDeclaration> getFunctionDeclarationList();

  @NotNull
  List<CovVariableDeclaration> getVariableDeclarationList();

}
