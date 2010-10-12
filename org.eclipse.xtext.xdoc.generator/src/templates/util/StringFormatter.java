package templates.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Link;

public class StringFormatter {
	
	static private HashMap<String, Set<String>> languages = new HashMap<String, Set<String>>();
	
	static private Set<String> links = new HashSet<String>();
	
	static public final CodeBlock removeIndent(CodeBlock cb){
		if(cb.getContents().get(0) instanceof Code){
			String code = ((Code)cb.getContents().get(0)).getContents();
			int indent = code.length();
			indent -= code.replaceAll("^(\n)?\\s*", "\\1").length();
			if(indent <1)
				return cb;
			String string = "\n\\s{"+indent+"}";
			for(int i = 0; i < cb.getContents().size(); i++){
				if (cb.getContents().get(i) instanceof Code) {
					code = ((Code) cb.getContents().get(i)).getContents();
					code = code.replaceAll(string, "\n");
					((Code)cb.getContents().get(i)).setContents(code);
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
	
	static public void storeLink(Link link){
		links.add(link.getUrl());
	}
	
	static public Set<String> getStoredLinks(){
		return links;
	}
	
	static public String highlightKeywords(String text, final String langName, String dirName){
		File dir = new File(dirName);
		if(dir.exists() && dir.isDirectory() && dir.canRead()){
			File[] langs = dir.listFiles(new FilenameFilter() {
				
				public boolean accept(File arg0, String arg1) {
					return arg0.equals(langName);
				}
			});
			if(langs.length != 1){
				return text;
			} else {
				File langFile = langs[0];
				if(!langFile.canRead()){
					return text;
				}
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(langFile)));
					StringBuilder fileContents = new StringBuilder();
					String current = null;
					while((current = br.readLine()) != null){
						fileContents.append(current);
					}
					String[] keywords = fileContents.toString().split("(?<!\\),");
					for (String keyword : keywords) {
						text = text.replaceAll(keyword.trim(), "<span class=\"keyword\">" + keyword.trim() + "</span>");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return text;
	}
}
