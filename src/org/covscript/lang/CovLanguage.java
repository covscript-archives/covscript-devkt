package org.covscript.lang;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.lang.Language;
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType;

import static org.covscript.lang.Cov_constantsKt.*;

/**
 * @author ice1000
 */
public final class CovLanguage extends Language {
	public static final @NotNull CovLanguage INSTANCE = new CovLanguage();

	private CovLanguage() {
		super(COV_NAME, "text/" + COV_EXTENSION, "text/" + COV_PKG_EXTENSION);
	}

	@Override public @NotNull LanguageFileType getAssociatedFileType() {
		return CovFileType.INSTANCE;
	}

	@Override @Contract(pure = true) public boolean isCaseSensitive() {
		return false;
	}
}
