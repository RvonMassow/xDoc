package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.io.UnsupportedEncodingException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  
  @Inject
  private EclipseNamingExtensions eclipseNamingExtensions;
  
  @Inject
  private PlainText plainText;
  
  @Inject
  private Utils utils;
  
  public StringConcatenation generateToc(final Document doc) throws UnsupportedEncodingException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<toc topic=\"contents/");
    EList<Chapter> _chapters = doc.getChapters();
    Chapter _head = IterableExtensions.<Chapter>head(_chapters);
    String _fileName = this.eclipseNamingExtensions.fileName(_head);
    _builder.append(_fileName, "");
    _builder.append("\" label=\"");
    TextOrMarkup _title = doc.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    {
      EList<Chapter> _chapters_1 = doc.getChapters();
      for(Chapter c : _chapters_1) {
        _builder.append("\t");
        StringConcatenation _genTocEntry = this.genTocEntry(c);
        _builder.append(_genTocEntry, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</toc>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genTocEntry(final Chapter c) throws UnsupportedEncodingException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<topic href=\"contents/");
    String _fileName = this.eclipseNamingExtensions.fileName(c);
    _builder.append(_fileName, "");
    String _urlSuffix = this.eclipseNamingExtensions.urlSuffix(c);
    _builder.append(_urlSuffix, "");
    _builder.append("\" label=\"");
    TextOrMarkup _title = c.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    {
      EList<Section> _subSections = c.getSubSections();
      for(Section ss : _subSections) {
        _builder.append("\t");
        StringConcatenation _genTocEntry = this.genTocEntry(ss, c);
        _builder.append(_genTocEntry, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</topic>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genTocEntry(final AbstractSection aS, final Chapter container) throws UnsupportedEncodingException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<topic href=\"contents/");
    String _fileName = this.eclipseNamingExtensions.fileName(container);
    String _urlDecode = this.utils.urlDecode(_fileName);
    _builder.append(_urlDecode, "");
    String _urlSuffix = this.eclipseNamingExtensions.urlSuffix(aS);
    _builder.append(_urlSuffix, "");
    _builder.append("\" label=\"");
    TextOrMarkup _title = aS.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    {
      Iterable<? extends AbstractSection> _subSection = this.utils.subSection(aS);
      for(AbstractSection ss : ((Iterable<AbstractSection>) _subSection)) {
        _builder.append("\t");
        StringConcatenation _genTocEntry = this.genTocEntry(ss, container);
        _builder.append(_genTocEntry, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</topic>");
    _builder.newLine();
    return _builder;
  }
}