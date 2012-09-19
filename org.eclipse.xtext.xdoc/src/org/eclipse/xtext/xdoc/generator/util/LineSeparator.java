package org.eclipse.xtext.xdoc.generator.util;

public class LineSeparator {

	public final static String LINE_SEPARATOR = System.getProperty ("line.separator");
	
	public static String asRegEx () {
		if (LINE_SEPARATOR.equals("\n")) return "\\n";
		if (LINE_SEPARATOR.equals("\r\n")) return "\\r\\n";
		return LINE_SEPARATOR;
	}
}
