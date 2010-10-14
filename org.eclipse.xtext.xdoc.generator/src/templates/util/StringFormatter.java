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
	
	@SuppressWarnings("unused")
	static private HashMap<String, Set<String>> languages = new HashMap<String, Set<String>>();
	
	static private Set<String> links = new HashSet<String>();
	
	static public final CodeBlock removeIndent(CodeBlock cb) {
		if(cb.getContents().get(0) instanceof Code){
			String code = ((Code)cb.getContents().get(0)).getContents();
			int indent = code.length();
			indent -= code.replaceAll("^(\n*)\\s*", "$1").length();
			String string = "\n\\s{"+indent+"}";
			for(int i = 0; i < cb.getContents().size(); i++) {
				if (cb.getContents().get(i) instanceof Code) {
					code = ((Code) cb.getContents().get(i)).getContents();
					code = code.replaceAll(string, "\n");
					if(i == 0) {
						code = code.replaceAll("^\n*", "");
					} else if(i == cb.getContents().size() - 1){
						code = code.replaceAll("\n*$", "");
					}
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

	/**
	 * Highlight keywords in a text.
	 * 
	 * @param text a piece of source code
	 * @param dirName a directory to read a language file from
	 * @param langName the name of the language
	 * @return the string with keywords highlighted
	 */
	static public String highlightKeywords(String text, final String dirName, final String langName){
		if(langName == null || dirName == null){
			return text;
		}
		File dir = new File(dirName.trim());
		if(dir.exists() && dir.isDirectory() && dir.canRead()){
			File[] langs = dir.listFiles(new FilenameFilter() {
				
				public boolean accept(File dir, String file) {
					return file.equals(langName.trim());
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
					String[] keywords = fileContents.toString().split("(?<!\\\\),");
					for (String keyword : keywords) {
						if(keyword.trim().equals("class")){
							text = text.replaceAll("(?<!<span )" + makePattern(keyword.trim()) + "(?!\\=\"keyword\">)",
									"<span class=\"keyword\">" + keyword.trim() + "</span>");
						} else if(keyword.trim().equals("span")){
							text = text.replaceAll("((?<!<)" + makePattern(keyword.trim()) + "(?!class\\=\"keyword\">)|(?<!</)span(?!>))",
									"<span class=\"keyword\">" + keyword.trim() + "</span>");
						} else if(keyword.trim().equals("keyword")){
							text = text.replaceAll("(?<!<span class=\")" + makePattern(keyword.trim()) + "(?!\">)",
									"<span class=\"keyword\">" + keyword.trim() + "</span>");
						} else {
							text = text.replaceAll(makePattern(keyword.trim()), "<span class=\"keyword\">" + keyword.trim() + "</span>");
						}
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

	public static String percentToFloat(String percent){
		return (Float.parseFloat(percent.replaceAll("%", ""))/100) +"";
	}

	private static String makePattern(String keyword) {
		return "(?<![\\w\\^])"+keyword+"(?!\\w)";
	}
}
