package org.eclipse.xtext.xdoc.formatting;

import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;

public class NullFormatter implements IFormatter {

	public ITokenStream createFormatterStream(String initalIndentation,
			ITokenStream outputStream, boolean preserveWhitespaces) {
		return outputStream;
	}

}
