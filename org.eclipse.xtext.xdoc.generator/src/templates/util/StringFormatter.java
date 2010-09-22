package templates.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;

public class StringFormatter {
	
	static public final CodeBlock removeIndent(CodeBlock cb){
		if(cb.getContents().get(0) instanceof Code){
			String code = ((Code)cb.getContents().get(0)).getContents();
			int indent = code.length();
			String[] split = code.split("\n");
			
			indent -= code.replaceAll("^(\n)?\\s*", "\\1").length();
			if(indent <1)
				return cb;
			String string = "\n\\s{"+indent+"}";
//			System.out.println(code);
//			System.out.println(indent + string+"<--");
			for(int i = 0; i < cb.getContents().size(); i++){
				if (cb.getContents().get(i) instanceof Code) {
					code = ((Code) cb.getContents().get(i)).getContents();
					code = code.replaceAll(string, "\n");
					((Code)cb.getContents().get(i)).setContents(code);
//					System.out.println(code);
				}
			}
		}
		return cb;
	}

	static public String encode(String s){
		try {
			return URLEncoder.encode(s, "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
	}
}
