package org.eclipse.xtext.xdoc.generator.util.lexer;

import java.io.File;
import java.net.URL;

import org.antlr.Tool;

public class GenerateLexer {
	
	public static void main(String[] args) {
		final Tool tool = new Tool();
		URL resource = GenerateLexer.class.getResource("Common.g");
		tool.addGrammarFile(resource.getFile());
		String path = resource.getPath().replace(File.separator+"bin"+File.separator, File.separator+"/src/"+File.separator);
		path = path.substring(0, path.length()-"/Common.g".length());
		tool.setOutputDirectory(path);
		tool.process();
	}
}
