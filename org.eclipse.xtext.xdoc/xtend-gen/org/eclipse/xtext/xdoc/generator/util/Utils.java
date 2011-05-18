package org.eclipse.xtext.xdoc.generator.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Set;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.generator.util.lexer.Common;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;

@SuppressWarnings("all")
public class Utils {
  
  public Iterable<? extends AbstractSection> _subSection(final Document doc) {
    EList<Chapter> _chapters = doc==null?(EList<Chapter>)null:doc.getChapters();
    return _chapters;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final Chapter section) {
    EList<Section> _subSections = section==null?(EList<Section>)null:section.getSubSections();
    return _subSections;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final Section section) {
    EList<Section2> _subSections = section==null?(EList<Section2>)null:section.getSubSections();
    return _subSections;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final Section2 section) {
    EList<Section3> _subSections = section==null?(EList<Section3>)null:section.getSubSections();
    return _subSections;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final Section3 section) {
    EList<Section4> _subSections = section==null?(EList<Section4>)null:section.getSubSections();
    return _subSections;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final AbstractSection section) {
    ArrayList<AbstractSection> _newArrayList = CollectionLiterals.<AbstractSection>newArrayList();
    return _newArrayList;
  }
  
  public String urlDecode(final String s) throws UnsupportedEncodingException {
    String _decode = URLDecoder.decode(s, "ISO-8859-1");
    return _decode;
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
  
  public String formatCode(final String text, final LangDef language) {
    String _xifexpression = null;
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(text, null);
    if (_operator_notEquals) {
      String _highlightedHtmlCode = this.getHighlightedHtmlCode(text, language);
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
    String _replace = s.replace(" ", "&nbsp;");
    String _replace_1 = _replace.replace("\n", "</br>");
    String _replace_2 = _replace_1.replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
    return _replace_2;
  }
  
  public Iterable<? extends AbstractSection> subSection(final AbstractSection section) {
    if ((section instanceof Chapter)) {
      return _subSection((Chapter)section);
    } else if ((section instanceof Document)) {
      return _subSection((Document)section);
    } else if ((section instanceof Section)) {
      return _subSection((Section)section);
    } else if ((section instanceof Section2)) {
      return _subSection((Section2)section);
    } else if ((section instanceof Section3)) {
      return _subSection((Section3)section);
    } else if ((section instanceof AbstractSection)) {
      return _subSection((AbstractSection)section);
    } else {
      throw new IllegalArgumentException();
    }
  }
}