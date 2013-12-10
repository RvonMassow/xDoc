package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.generator.EclipseHelpUriUtil;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Part;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;

@SuppressWarnings("all")
public class TocGenerator {
  @Inject
  @Extension
  private AbstractSectionExtension sectionExtension;
  
  @Inject
  @Extension
  private EclipseNamingExtensions eclipseNamingExtensions;
  
  @Inject
  @Extension
  private PlainText plainText;
  
  public CharSequence generateToc(final Document doc, final EclipseHelpUriUtil uriUtil) {
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
      for(final Chapter c : _chapters) {
        _builder.append("\t");
        CharSequence _genTocEntry = this.genTocEntry(c, uriUtil);
        _builder.append(_genTocEntry, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Part> _parts = doc.getParts();
      for(final Part p : _parts) {
        _builder.append("\t");
        CharSequence _genTocEntry_1 = this.genTocEntry(p, uriUtil);
        _builder.append(_genTocEntry_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</toc>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genTocEntry(final Chapter c, final EclipseHelpUriUtil uriUtil) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<topic href=\"contents/");
    URI _targetURI = uriUtil.getTargetURI(c);
    _builder.append(_targetURI, "");
    _builder.append("\" label=\"");
    TextOrMarkup _title = c.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    {
      EList<Section> _subSections = c.getSubSections();
      for(final Section ss : _subSections) {
        _builder.append("\t");
        CharSequence _genTocEntry = this.genTocEntry(ss, uriUtil);
        _builder.append(_genTocEntry, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</topic>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genTocEntry(final AbstractSection section, final EclipseHelpUriUtil uriUtil) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<topic href=\"contents/");
    URI _targetURI = uriUtil.getTargetURI(section);
    _builder.append(_targetURI, "");
    _builder.append("\" label=\"");
    TextOrMarkup _title = section.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections = this.sectionExtension.sections(section);
      for(final AbstractSection ss : _sections) {
        _builder.append("\t");
        CharSequence _genTocEntry = this.genTocEntry(ss, uriUtil);
        _builder.append(_genTocEntry, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</topic>");
    _builder.newLine();
    return _builder;
  }
}
