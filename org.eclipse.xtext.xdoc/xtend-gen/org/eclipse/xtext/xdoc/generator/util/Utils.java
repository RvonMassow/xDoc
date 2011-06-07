package org.eclipse.xtext.xdoc.generator.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.generator.util.lexer.Common;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.XdocFactory;

@SuppressWarnings("all")
public class Utils {
  
  public String urlDecode(final String s) throws UnsupportedEncodingException {
    String _decode = URLDecoder.decode(s, "ISO-8859-1");
    return _decode;
  }
  
  public String urlEncode(final String s) throws UnsupportedEncodingException {
    String _encode = URLEncoder.encode(s, "UTF-8");
    return _encode;
  }
  
  public boolean isInlineCode(final CodeBlock cb) {
    boolean _operator_and = false;
    EList<EObject> _contents = cb.getContents();
    int _size = _contents.size();
    boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)_size), ((Integer)1));
    if (!_operator_equals) {
      _operator_and = false;
    } else {
      EList<EObject> _contents_1 = cb.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents_1);
      String _string = _head.toString();
      boolean _contains = _string.contains("\n");
      boolean _operator_not = BooleanExtensions.operator_not(_contains);
      _operator_and = BooleanExtensions.operator_and(_operator_equals, _operator_not);
    }
    return _operator_and;
  }
  
  public String escapeLatexChars(final String s) {
    String _xifexpression = null;
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(s, null);
    if (_operator_notEquals) {
      String _replaceAll = s.replaceAll("\\$", "\\\\\\$");
      String _replaceAll_1 = _replaceAll.replaceAll("\\{", "\\\\{");
      String _replaceAll_2 = _replaceAll_1.replaceAll("\\}", "\\\\}");
      String _replaceAll_3 = _replaceAll_2.replaceAll("\\\\(?![{}$])", "\\\\textbackslash{}");
      String _replaceAll_4 = _replaceAll_3.replaceAll("#", "\\\\#");
      String _replaceAll_5 = _replaceAll_4.replaceAll("%", "\\\\%");
      String _replaceAll_6 = _replaceAll_5.replaceAll("_", "\\\\_");
      String _replaceAll_7 = _replaceAll_6.replaceAll("\\^", "\\\\textasciicircum{}");
      String _replaceAll_8 = _replaceAll_7.replaceAll("&", "\\\\&");
      String _replaceAll_9 = _replaceAll_8.replaceAll("~", "\\\\textasciitilde{}");
      _xifexpression = _replaceAll_9;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String unescapeXdocChars(final String s) {
    String _xifexpression = null;
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(s, null);
    if (_operator_notEquals) {
      String _replaceAll = s.replaceAll("\\\\\\[", "[");
      String _replaceAll_1 = _replaceAll.replaceAll("\\\\\\]", "]");
      _xifexpression = _replaceAll_1;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String prepareListingsString(final String s) {
    String _replaceAll = s==null?(String)null:s.replaceAll("^\n", "");
    return _replaceAll;
  }
  
  public String escapeHTMLChars(final String s) {
    String _xifexpression = null;
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(s, null);
    if (_operator_notEquals) {
      String _replaceAll = s.replaceAll("&", "&amp;");
      String _replaceAll_1 = _replaceAll.replaceAll("\'", "&apos;");
      String _replaceAll_2 = _replaceAll_1.replaceAll("<", "&lt;");
      String _replaceAll_3 = _replaceAll_2.replaceAll(">", "&gt;");
      _xifexpression = _replaceAll_3;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String formatCode(final CharSequence text, final LangDef language) {
    String _xifexpression = null;
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(text, null);
    if (_operator_notEquals) {
      String _string = text.toString();
      String _highlightedHtmlCode = this.getHighlightedHtmlCode(_string, language);
      _xifexpression = _highlightedHtmlCode;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String getHighlightedHtmlCode(final String code, final LangDef language) {
    {
      Common _common = new Common();
      final Common lexer = _common;
      ANTLRStringStream _aNTLRStringStream = new ANTLRStringStream(code);
      lexer.setCharStream(_aNTLRStringStream);
      Set<?> _xifexpression = null;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(language, null);
      if (_operator_notEquals) {
        EList<String> _keywords = language.getKeywords();
        Set<String> _set = IterableExtensions.<String>toSet(_keywords);
        _xifexpression = _set;
      } else {
        Set<?> _emptySet = CollectionLiterals.emptySet();
        _xifexpression = _emptySet;
      }
      final Set<?> keywords = _xifexpression;
      Token _nextToken = lexer.nextToken();
      Token token = _nextToken;
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder result = _stringBuilder;
      int _type = token.getType();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_type), ((Integer)Token.EOF));
      Boolean _xwhileexpression = _operator_notEquals_1;
      while (_xwhileexpression) {
        {
          int _type_1 = token.getType();
          final int __valOfSwitchOver = _type_1;
          boolean matched = false;
          if (!matched) {
            if (org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_equals(__valOfSwitchOver,Common.ID)) {
              matched=true;
              String _text = token.getText();
              boolean _contains = keywords.contains(_text);
              if (_contains) {
                StringBuilder _append = result.append("<span class=\"keyword\">");
                String _text_1 = token.getText();
                String _whitespace2Entities = this.whitespace2Entities(_text_1);
                StringBuilder _append_1 = _append.append(_whitespace2Entities);
                _append_1.append("</span>");
              } else {
                String _text_2 = token.getText();
                result.append(_text_2);
              }
            }
          }
          if (!matched) {
            if (org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_equals(__valOfSwitchOver,Common.WS)) {
              matched=true;
              String _text_3 = token.getText();
              String _whitespace2Entities_1 = this.whitespace2Entities(_text_3);
              result.append(_whitespace2Entities_1);
            }
          }
          if (!matched) {
            if (org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_equals(__valOfSwitchOver,Common.STRING)) {
              matched=true;
              StringBuilder _append_2 = result.append("<span class=\"string\">");
              String _text_4 = token.getText();
              String _whitespace2Entities_2 = this.whitespace2Entities(_text_4);
              StringBuilder _append_3 = _append_2.append(_whitespace2Entities_2);
              _append_3.append("</span>");
            }
          }
          if (!matched) {
            if (org.eclipse.xtext.xbase.lib.ObjectExtensions.operator_equals(__valOfSwitchOver,Common.COMMENT)) {
              matched=true;
              StringBuilder _append_4 = result.append("<span class=\"comment\">");
              String _text_5 = token.getText();
              String _whitespace2Entities_3 = this.whitespace2Entities(_text_5);
              StringBuilder _append_5 = _append_4.append(_whitespace2Entities_3);
              _append_5.append("</span>");
            }
          }
          if (!matched) {
            String _text_6 = token.getText();
            String _whitespace2Entities_4 = this.whitespace2Entities(_text_6);
            result.append(_whitespace2Entities_4);
          }
          Token _nextToken_1 = lexer.nextToken();
          token = _nextToken_1;
        }
        int _type_2 = token.getType();
        boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(((Integer)_type_2), ((Integer)Token.EOF));
        _xwhileexpression = _operator_notEquals_2;
      }
      String _string = result.toString();
      return _string;
    }
  }
  
  public String whitespace2Entities(final String s) {
    String _escapeHTMLChars = this.escapeHTMLChars(s);
    String _replace = _escapeHTMLChars.replace(" ", "&nbsp;");
    String _replace_1 = _replace.replace("\n", "</br>\n");
    String _replace_2 = _replace_1.replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
    return _replace_2;
  }
  
  public Integer calcIndent(final CodeBlock cb) {
    Integer _xifexpression = null;
    boolean _operator_and = false;
    EList<EObject> _contents = cb.getContents();
    int _size = _contents.size();
    boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)0));
    if (!_operator_greaterThan) {
      _operator_and = false;
    } else {
      EList<EObject> _contents_1 = cb.getContents();
      EObject _get = _contents_1.get(0);
      _operator_and = BooleanExtensions.operator_and(_operator_greaterThan, (_get instanceof org.eclipse.xtext.xdoc.xdoc.Code));
    }
    if (_operator_and) {
      int _xblockexpression = (int) 0;
      {
        EList<EObject> _contents_2 = cb.getContents();
        EObject _get_1 = _contents_2.get(0);
        String _contents_3 = ((Code) _get_1).getContents();
        final String code0 = _contents_3;
        int _length = code0.length();
        int indent = _length;
        String _replaceAll = code0.replaceAll("^(\n*)\\s*", "$1");
        int _length_1 = _replaceAll.length();
        int _operator_minus = IntegerExtensions.operator_minus(((Integer)indent), ((Integer)_length_1));
        int _indent = indent = _operator_minus;
        _xblockexpression = (_indent);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private final HashMap<ArrayList<?>,Code> _createCache_correctedCode = new HashMap<ArrayList<?>,Code>();
  
  public Code correctedCode(final String s) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(s);
    Code code;
    synchronized (_createCache_correctedCode) {
      if (_createCache_correctedCode.containsKey(_cacheKey)) {
        return _createCache_correctedCode.get(_cacheKey);
      }
      Code _createCode = XdocFactory.eINSTANCE.createCode();
      code = _createCode;
      _createCache_correctedCode.put(_cacheKey, code);
    }
    code.setContents(s);
    return code;
  }
}