package templates.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.Link;

public class StringFormatter {

	public static final String SL_COMMENT_DEFAULT = "//";

	@SuppressWarnings("unused")
	static private HashMap<String, Set<String>> languages = new HashMap<String, Set<String>>();

	static private Set<String> links = new HashSet<String>();

	private static String slComment;

	private static String quote;

	private static String mlCommentEnd;

	private static String mlCommentStart;

	static public final CodeBlock removeIndent(CodeBlock cb) {
		if(cb.getContents().size() > 0 && cb.getContents().get(0) instanceof Code){
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

	public static String urlDecode(String url) throws UnsupportedEncodingException {
		return URLDecoder.decode(url, "ISO-8859-1");
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
	static public String highlightKeywords(String t, final LangDef lang){
		if(lang != null && t != null){
			StringFormatter.mlCommentStart = "/*";
			StringFormatter.mlCommentEnd = "*/";
			StringFormatter.slComment = "//";
			if(slComment == null){
				StringFormatter.slComment = SL_COMMENT_DEFAULT;
			}
			StringFormatter.quote = "\"";
			List<String> keywords = lang.getKeywords();
			StringBuilder result = new StringBuilder();
			String[] toks;
			do{
				toks = splitToNext(t);
				result.append(addHighlighting(keywords, toks[0]));
				switch(toks.length){
				case 3:
					t = toks[2];
				case 2:
					result.append(toks[1]);
					break;
				default: // do nothing
					;
				}
			} while(toks.length == 3);
			return result.toString();
		}
		return t;
	}

	private static String[] splitToNext(String input){
		int slC = -1, mlCStart = -1, quoteStart = -1;
		String slComment = StringFormatter.slComment;
		String mlCommentStart = StringFormatter.mlCommentStart;
		slC = input.indexOf(slComment);
		if(mlCommentEnd != null) {
			mlCStart = input.indexOf(mlCommentStart);
		}
		quoteStart = input.indexOf(quote);
		int min = Integer.MAX_VALUE;
		if(slComment != "" && slC >= 0 && slC < min){
			min = slC;
		}
		if(mlCommentStart != "" && mlCStart >= 0 && mlCStart < min){
			min = mlCStart;
		}
		if(quoteStart >= 0 && quoteStart < min){
			min = quoteStart;
		}
		String[] res;
		if(min < Integer.MAX_VALUE){
			if(min == slC){
				res = breakApart(input, slC, slComment.length(), "\n");
				res[1] = "<span class=\"comment\" >" + res[1].substring(0, res[1].length()-1) + "</span>\n";
				return res;
			} else if(min == mlCStart){
				res = breakApart(input, min, mlCommentStart.length(), mlCommentEnd);
				res[1] = "<span class=\"comment\" >" + res[1] + "</span>";
				return res;
			} else if(min == quoteStart) {
				res = breakApart(input, min, quote.length(), quote);
				res[1] = "<span class=\"string\" >" + res[1] + "</span>";
				return res;
			}
		}
		return new String[] {input};
	}

	private static String[] breakApart(String input, int startIndex, int len, String end) {
		String[] ret = { "", "", "" };
		ret[0] = input.substring(0, startIndex);
		ret[1] = input.substring(startIndex);
		if(ret[1].contains(end)){
			String rest = input.substring(startIndex);
			// split up and stuff
			ret[1] = rest.substring(0, rest.indexOf(end, len) + end.length());
			ret[2] = rest.substring(rest.indexOf(end, len) + end.length());
			return ret;
		}
		return Arrays.copyOf(ret, 2);
	}

	private static String addHighlighting(List<String> keywords, String text) {
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
		return text;
	}

	public static String percentToFloat(String percent){
		return (Float.parseFloat(percent.replaceAll("%", ""))/100) +"";
	}

	private static String makePattern(String keyword) {
		return "(?<![\\w])"+keyword+"(?!\\w)";
	}

}
