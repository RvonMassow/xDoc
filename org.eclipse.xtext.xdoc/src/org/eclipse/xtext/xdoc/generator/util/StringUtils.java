package org.eclipse.xtext.xdoc.generator.util;

import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;

public class StringUtils {

	static public final CodeBlock removeIndent(CodeBlock cb) {
		if(cb.getContents().size() > 0 && cb.getContents().get(0) instanceof Code){
			String code = ((Code)cb.getContents().get(0)).getContents();
			int indent = code.length();
			indent -= code.replaceAll("^(\n*)\\s*", "$1").length();
			String string = "\n\\s{"+indent+"}";
			for(int i = 0; i < cb.getContents().size(); i++) {
				if (cb.getContents().get(i) instanceof Code) {
					code = ((Code) cb.getContents().get(i)).getContents();
					if(i == 0) {
						code = code.replaceAll("^\n*", "").replaceAll("^\\s{"+indent+"}", "");
					}
					if(i == cb.getContents().size() - 1){
						code = code.replaceAll("(\\s|\n)*$", "");
					}
					code = code.replaceAll(string, "\n");
					((Code)cb.getContents().get(i)).setContents(code);
				}
			}
			if(cb.getContents().get(cb.getContents().size()-1) instanceof Code) {
				Code lastLines = (Code) cb.getContents().get(cb.getContents().size() - 1);
				lastLines.setContents(lastLines.getContents().replaceAll("\\s*$", ""));
			}
		}
		return cb;
	}

}
