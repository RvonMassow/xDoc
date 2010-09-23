package org.eclipse.xtext.xdoc.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

public class XDocJavaValidator extends AbstractXDocJavaValidator {

	@Check
	public void checkCodeLineLength(Code c) {
		String[] lines = c.getContents().split("\n");
		for (String string : lines) {
			if (string.replaceAll("\t", "    ").length() >= 74) {
				warning("Code line might break in PDF output",
						XdocPackage.CODE__CONTENTS);
			}
		}
	}

}
