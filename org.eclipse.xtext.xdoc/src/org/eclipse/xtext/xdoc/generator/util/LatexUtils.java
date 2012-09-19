package org.eclipse.xtext.xdoc.generator.util;

import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;

public class LatexUtils {
	
	public static String lstEscapeToTex() {
		return "�";
	}

	public static boolean block(TextOrMarkup c) {
		return (c.getContents().size() > 1)
				&& (((c.getContents().get(0) instanceof TextPart)
						&& ((TextPart) c.getContents().get(0)).getText()
								.matches("^\\s*$") && ((c.getContents().get(1)) instanceof CodeBlock)) || ((c
						.getContents().get(0) instanceof CodeBlock) && !inline((CodeBlock) c
						.getContents().get(0))));
	}

	public static boolean inline(CodeBlock c) {
		return c.getContents().size() == 1
				&& !c.getContents().get(0).toString().contains(LineSeparator.LINE_SEPARATOR);
	}
}
