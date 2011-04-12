package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TocGenerator {
  @Inject private EclipseNamingExtensions eclipseNamingExtensions;
  @Inject private PlainText plainText;
  @Inject private Utils utils;
  
  public StringConcatenation generateToc(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<toc topic=\"contents/");
    EList<Chapter> _chapters = doc.getChapters();
    Chapter _get = _chapters.get(0);
    String _fileName = this.eclipseNamingExtensions.fileName(_get);
    _builder.append(_fileName, "");
    _builder.append(".html\" label=\"");
    final Document typeConverted_doc = (Document)doc;
    TextOrMarkup _title = typeConverted_doc.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Chapter> _chapters_1 = doc.getChapters();
      for(Chapter c : _chapters_1) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        StringConcatenation _genTocEntry = this.genTocEntry(c);
        _builder.append(_genTocEntry, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</toc>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genTocEntry(final Chapter c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<topic href=\"contents/");
    final Chapter typeConverted_c = (Chapter)c;
    String _fileName = this.eclipseNamingExtensions.fileName(typeConverted_c);
    _builder.append(_fileName, "");
    _builder.append(".html");
    final Chapter typeConverted_c_1 = (Chapter)c;
    String _urlSuffix = this.eclipseNamingExtensions.urlSuffix(typeConverted_c_1);
    _builder.append(_urlSuffix, "");
    _builder.append("\" label=\"");
    final Chapter typeConverted_c_2 = (Chapter)c;
    TextOrMarkup _title = typeConverted_c_2.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Section> _subSections = c.getSubSections();
      for(Section ss : _subSections) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        final Section typeConverted_ss = (Section)ss;
        StringConcatenation _genTocEntry = this.genTocEntry(typeConverted_ss, c);
        _builder.append(_genTocEntry, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</topic>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genTocEntry(final AbstractSection aS, final Chapter container) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<topic href=\"contents/");
    String _xtrycatchfinallyexpression = null;
    try {
      final Chapter typeConverted_container = (Chapter)container;
      String _fileName = this.eclipseNamingExtensions.fileName(typeConverted_container);
      String _urlDecode = this.utils.urlDecode(_fileName);
      _xtrycatchfinallyexpression = _urlDecode;
    } catch (Exception e) { 
      _xtrycatchfinallyexpression = null;
    }
    _builder.append(_xtrycatchfinallyexpression, "");
    _builder.append(".html");
    String _urlSuffix = this.eclipseNamingExtensions.urlSuffix(aS);
    _builder.append(_urlSuffix, "");
    _builder.append("\" label=\"");
    TextOrMarkup _title = aS.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Object _subSection = this.utils.subSection(aS);
      for(AbstractSection ss : ((java.lang.Iterable<org.eclipse.xtext.xdoc.xdoc.AbstractSection>) _subSection)) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        StringConcatenation _genTocEntry = this.genTocEntry(ss, container);
        _builder.append(_genTocEntry, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</topic>");
    _builder.newLine();
    return _builder;
  }
}