package org.eclipse.xtext.xdoc.generator.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xdoc.generator.util.lexer.Common;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.XdocFactory;

@SuppressWarnings("all")
public class Utils {
  public boolean isInlineCode(final CodeBlock cb) {
    boolean _and = false;
    EList<EObject> _contents = cb.getContents();
    int _size = _contents.size();
    boolean _equals = (_size == 1);
    if (!_equals) {
      _and = false;
    } else {
      EList<EObject> _contents_1 = cb.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents_1);
      String _string = _head.toString();
      boolean _contains = _string.contains("\n");
      boolean _not = (!_contains);
      _and = _not;
    }
    return _and;
  }
  
  public String escapeLatexChars(final String s) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(s, null));
    if (_notEquals) {
      String _replaceAll = s.replaceAll("\\$", "\\\\\\$");
      String _replaceAll_1 = _replaceAll.replaceAll("\\{", "\\\\{");
      String _replaceAll_2 = _replaceAll_1.replaceAll("\\}", "\\\\}");
      String _replaceAll_3 = _replaceAll_2.replaceAll("\\\\(?![{}$])", "\\\\textbackslash{}");
      String _replaceAll_4 = _replaceAll_3.replaceAll("#", "\\\\#");
      String _replaceAll_5 = _replaceAll_4.replaceAll("%", "\\\\%");
      String _replaceAll_6 = _replaceAll_5.replaceAll("_", "\\\\_");
      String _replaceAll_7 = _replaceAll_6.replaceAll("\\^", "\\\\textasciicircum{}");
      String _replaceAll_8 = _replaceAll_7.replaceAll("&", "\\\\&");
      _xifexpression = _replaceAll_8.replaceAll("~", "\\\\textasciitilde{}");
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String unescapeXdocChars(final String s) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(s, null));
    if (_notEquals) {
      String _replaceAll = s.replaceAll("\\\\\\[", "[");
      String _replaceAll_1 = _replaceAll.replaceAll("\\\\\\]", "]");
      String _replaceAll_2 = _replaceAll_1.replaceAll("\\\\\\%", "%");
      _xifexpression = _replaceAll_2.replaceAll("\\\\\\:", ":");
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String prepareListingsString(final String s) {
    String _replaceAll = null;
    if (s!=null) {
      _replaceAll=s.replaceAll("^\n", "");
    }
    return _replaceAll;
  }
  
  public String escapeHTMLChars(final String s) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(s, null));
    if (_notEquals) {
      String _replace = s.replace("&", "&amp;");
      String _replace_1 = _replace.replace("\'", "&apos;");
      String _replace_2 = _replace_1.replace("<", "&lt;");
      String _replace_3 = _replace_2.replace(">", "&gt;");
      String _replace_4 = _replace_3.replace("«", "&laquo;");
      _xifexpression = _replace_4.replace("»", "&raquo;");
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String formatCode(final CharSequence text, final LangDef language) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(text, null));
    if (_notEquals) {
      String _string = text.toString();
      _xifexpression = this.getHighlightedHtmlCode(_string, language);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public Collection<String> defaultLangKeywords(final Set<AbstractSection> sections) {
    Collection<String> _xblockexpression = null;
    {
      Iterable<Document> _filter = Iterables.<Document>filter(sections, Document.class);
      final Document doc = IterableExtensions.<Document>head(_filter);
      EList<LangDef> _langDefs = doc.getLangDefs();
      final Function1<LangDef, Boolean> _function = new Function1<LangDef, Boolean>() {
        public Boolean apply(final LangDef e) {
          String _name = e.getName();
          return Boolean.valueOf(Objects.equal(_name, "__XdocDefaultLanguage__"));
        }
      };
      final LangDef lang = IterableExtensions.<LangDef>findFirst(_langDefs, _function);
      Collection<String> _xifexpression = null;
      boolean _notEquals = (!Objects.equal(lang, null));
      if (_notEquals) {
        _xifexpression = lang.getKeywords();
      } else {
        _xifexpression = CollectionLiterals.<String>emptySet();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String getHighlightedHtmlCode(final String code, final LangDef language) {
    final Common lexer = new Common();
    String _unescapeXdocChars = this.unescapeXdocChars(code);
    ANTLRStringStream _aNTLRStringStream = new ANTLRStringStream(_unescapeXdocChars);
    lexer.setCharStream(_aNTLRStringStream);
    Set<String> _xifexpression = null;
    boolean _notEquals = (!Objects.equal(language, null));
    if (_notEquals) {
      EList<String> _keywords = language.getKeywords();
      final Function1<String, String> _function = new Function1<String, String>() {
        public String apply(final String it) {
          return Utils.this.unescapeXdocChars(it);
        }
      };
      List<String> _map = ListExtensions.<String, String>map(_keywords, _function);
      _xifexpression = IterableExtensions.<String>toSet(_map);
    } else {
      _xifexpression = CollectionLiterals.<String>emptySet();
    }
    final Set<String> keywords = _xifexpression;
    Token token = lexer.nextToken();
    final StringBuilder result = new StringBuilder();
    while ((token.getType() != Token.EOF)) {
      {
        int _type = token.getType();
        final int t = _type;
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(t, Common.ID)) {
            _matched=true;
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
        if (!_matched) {
          if (Objects.equal(t, Common.WS)) {
            _matched=true;
            String _text_3 = token.getText();
            String _whitespace2Entities_1 = this.whitespace2Entities(_text_3);
            result.append(_whitespace2Entities_1);
          }
        }
        if (!_matched) {
          if ((((((t == Common.STRING) || (t == Common.RICH_TEXT)) || (t == Common.RICH_TEXT_END)) || (t == Common.RICH_TEXT_START)) || (t == Common.RICH_TEXT_INBETWEEN))) {
            _matched=true;
            StringBuilder _append_2 = result.append("<span class=\"string\">");
            String _text_4 = token.getText();
            String _whitespace2Entities_2 = this.whitespace2Entities(_text_4);
            StringBuilder _append_3 = _append_2.append(_whitespace2Entities_2);
            _append_3.append("</span>");
          }
        }
        if (!_matched) {
          if (((((t == Common.COMMENT_RICH_TEXT_END) || (t == Common.COMMENT_RICH_TEXT_INBETWEEN)) || (t == Common.ML_COMMENT)) || (t == Common.SL_COMMENT))) {
            _matched=true;
            StringBuilder _append_4 = result.append("<span class=\"comment\">");
            String _text_5 = token.getText();
            String _whitespace2Entities_3 = this.whitespace2Entities(_text_5);
            StringBuilder _append_5 = _append_4.append(_whitespace2Entities_3);
            _append_5.append("</span>");
          }
        }
        if (!_matched) {
          String _text_6 = token.getText();
          String _whitespace2Entities_4 = this.whitespace2Entities(_text_6);
          result.append(_whitespace2Entities_4);
        }
        Token _nextToken = lexer.nextToken();
        token = _nextToken;
      }
    }
    return result.toString();
  }
  
  public String whitespace2Entities(final String s) {
    String _escapeHTMLChars = this.escapeHTMLChars(s);
    String _replace = _escapeHTMLChars.replace(" ", "&nbsp;");
    String _replace_1 = _replace.replace("\n", "<br/>\n");
    return _replace_1.replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
  }
  
  public int calcIndent(final CodeBlock cb) {
    int _xifexpression = (int) 0;
    boolean _and = false;
    EList<EObject> _contents = cb.getContents();
    int _size = _contents.size();
    boolean _greaterThan = (_size > 0);
    if (!_greaterThan) {
      _and = false;
    } else {
      EList<EObject> _contents_1 = cb.getContents();
      EObject _get = _contents_1.get(0);
      _and = (_get instanceof Code);
    }
    if (_and) {
      int _xblockexpression = (int) 0;
      {
        EList<EObject> _contents_2 = cb.getContents();
        EObject _get_1 = _contents_2.get(0);
        final String code0 = ((Code) _get_1).getContents();
        int indent = code0.length();
        String _replaceAll = code0.replaceAll("^(\n*)\\s*", "$1");
        int _length = _replaceAll.length();
        int _minus = (indent - _length);
        _xblockexpression = indent = _minus;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public Code correctedCode(final String s) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(s);
    final Code _result;
    synchronized (_createCache_correctedCode) {
      if (_createCache_correctedCode.containsKey(_cacheKey)) {
        return _createCache_correctedCode.get(_cacheKey);
      }
      Code _createCode = XdocFactory.eINSTANCE.createCode();
      _result = _createCode;
      _createCache_correctedCode.put(_cacheKey, _result);
    }
    _init_correctedCode(_result, s);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Code> _createCache_correctedCode = CollectionLiterals.newHashMap();
  
  private void _init_correctedCode(final Code code, final String s) {
    code.setContents(s);
  }
  
  public boolean nullOrEmpty(final String s) {
    boolean _or = false;
    boolean _equals = Objects.equal(s, null);
    if (_equals) {
      _or = true;
    } else {
      String _trim = s.trim();
      int _length = _trim.length();
      boolean _equals_1 = (_length == 0);
      _or = _equals_1;
    }
    return _or;
  }
}
