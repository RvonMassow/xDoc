package org.eclipse.xtext.xdoc.generator.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.generator.util.StringUtils;
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
    EList<Chapter> _chapters = doc.getChapters();
    return _chapters;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final Chapter section) {
    EList<Section> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final Section section) {
    EList<Section2> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final Section2 section) {
    EList<Section3> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final Section3 section) {
    EList<Section4> _subSections = section.getSubSections();
    return _subSections;
  }
  
  public Iterable<? extends AbstractSection> _subSection(final AbstractSection section) {
    ArrayList<? extends AbstractSection> _newArrayList = CollectionLiterals.<AbstractSection>newArrayList();
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
    boolean _operator_equals = ObjectExtensions.operator_equals(((Object)_size), ((Object)1));
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
    return _replaceAll_9;
  }
  
  public String unescapeXdocChars(final String s) {
    String _replaceAll = s.replaceAll("\\\\\\[", "[");
    String _replaceAll_1 = _replaceAll.replaceAll("\\\\\\]", "]");
    return _replaceAll_1;
  }
  
  public String prepareListingsString(final String s) {
    String _replaceAll = s.replaceAll("^\n", "");
    return _replaceAll;
  }
  
  public String escapeHTMLChars(final String s) {
    String _replaceAll = s.replaceAll("&", "&amp;");
    String _replaceAll_1 = _replaceAll.replaceAll("\'", "&apos;");
    String _replaceAll_2 = _replaceAll_1.replaceAll("<", "&lt;");
    String _replaceAll_3 = _replaceAll_2.replaceAll(">", "&gt;");
    return _replaceAll_3;
  }
  
  public String formatCode(final String text, final LangDef language) {
    String _escapeHTMLChars = this.escapeHTMLChars(text);
    String _replaceAll = _escapeHTMLChars.replaceAll(" ", "&nbsp;");
    String _replaceAll_1 = _replaceAll.replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;");
    String _replaceAll_2 = _replaceAll_1.replaceAll("\n", "<br />\n");
    String _highlightKeywords = StringUtils.highlightKeywords(_replaceAll_2, language);
    return _highlightKeywords;
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