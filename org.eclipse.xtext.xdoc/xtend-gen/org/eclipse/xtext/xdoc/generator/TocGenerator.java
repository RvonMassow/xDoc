package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
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
  private AbstractSectionExtension sectionExtension;
  
  @Inject
  private EclipseNamingExtensions eclipseNamingExtensions;
  
  @Inject
  private PlainText plainText;
  
  @Inject
  private Utils utils;
  
  public StringConcatenation generateToc(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>");
    _builder.newLine();
    _builder.append("<toc topic=\"contents/");
    String _fullURL = this.eclipseNamingExtensions.getFullURL(doc);
    _builder.append(_fullURL, "");
    _builder.append("\" label=\"");
    TextOrMarkup _title = doc.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    {
      EList<Chapter> _chapters = doc.getChapters();
      for(Chapter c : _chapters) {
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
  
  public StringConcatenation genTocEntry(final Chapter c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<topic href=\"contents/");
    String _fullURL = this.eclipseNamingExtensions.getFullURL(c);
    _builder.append(_fullURL, "");
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
        StringConcatenation _genTocEntry = this.genTocEntry(ss);
        _builder.append(_genTocEntry, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</topic>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genTocEntry(final AbstractSection section) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<topic href=\"contents/");
    String _fullURL = this.eclipseNamingExtensions.getFullURL(section);
    _builder.append(_fullURL, "");
    _builder.append("\" label=\"");
    TextOrMarkup _title = section.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(section);
      for(AbstractSection ss : _sections) {
        _builder.append("\t");
        StringConcatenation _genTocEntry = this.genTocEntry(ss);
        _builder.append(_genTocEntry, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</topic>");
    _builder.newLine();
    return _builder;
  }
}