// This is a generated file. Not intended for manual editing.
package org.covscript.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.covscript.lang.psi.impl.ICovStructDeclaration;

public interface CovStructDeclaration extends ICovStructDeclaration {

  @NotNull
  List<CovExpr> getExprList();

  @NotNull
  List<CovFunctionDeclaration> getFunctionDeclarationList();

  @NotNull
  List<CovVariableDeclaration> getVariableDeclarationList();

}
