package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.generator.Outlets;
import org.eclipse.xtext.xdoc.generator.PHPPhoenixGenerator;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.util.GitExtensions;
import org.eclipse.xtext.xdoc.generator.util.HTMLNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.JavaDocExtension;
import org.eclipse.xtext.xdoc.generator.util.StringUtils;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Anchor;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.CodeRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.ImageRef;
import org.eclipse.xtext.xdoc.xdoc.Item;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.Link;
import org.eclipse.xtext.xdoc.xdoc.MarkupInCode;
import org.eclipse.xtext.xdoc.xdoc.OrderedList;
import org.eclipse.xtext.xdoc.xdoc.Part;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableData;
import org.eclipse.xtext.xdoc.xdoc.TableRow;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.Todo;
import org.eclipse.xtext.xdoc.xdoc.UnorderedList;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HtmlGenerator implements IGenerator {
  
  @Inject
  private Utils utils;
  
  @Inject
  private PlainText plaintext;
  
  @Inject
  private HTMLNamingExtensions naming;
  
  @Inject
  private AbstractSectionExtension ase;
  
  @Inject
  private GitExtensions git;
  
  @Inject
  private JavaDocExtension jdoc;
  
  @Inject
  private PHPPhoenixGenerator ppg;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) throws RuntimeException {
    try {
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
      Iterable<XdocFile> _filter = IterableExtensions.<XdocFile>filter(_allContentsIterable, org.eclipse.xtext.xdoc.xdoc.XdocFile.class);
      for (XdocFile file : _filter) {
        AbstractSection _mainSection = file.getMainSection();
        if ((_mainSection instanceof org.eclipse.xtext.xdoc.xdoc.Document)) {
          AbstractSection _mainSection_1 = file.getMainSection();
          this.generate(((Document) _mainSection_1), fsa);
        }
      }
    } catch (Exception e) { 
      RuntimeException _runtimeException = new RuntimeException(e);
      throw _runtimeException;
    }
  }
  
  public void generate(final Document doc, final IFileSystemAccess fsa) throws RuntimeException {
    {
      CharSequence _leftNavToc = this.leftNavToc(doc);
      final CharSequence leftNav = _leftNavToc;
      this.ppg.generatePHP(doc, fsa);
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _body = this.body(doc, leftNav);
      _builder.append(_body, "");
      _builder.newLineIfNotEmpty();
      fsa.generateFile("_index.html", Outlets.WEB_SITE, _builder);
      EList<Chapter> _chapters = doc.getChapters();
      boolean _isEmpty = _chapters.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        EList<Chapter> _chapters_1 = doc.getChapters();
        for (Chapter chapter : _chapters_1) {
          CharSequence _elementIdForSubToc = this.elementIdForSubToc(((Chapter) chapter));
          this.generate(chapter, fsa, leftNav, _elementIdForSubToc);
        }
      } else {
        EList<Part> _parts = doc.getParts();
        for (Part part : _parts) {
          EList<Chapter> _chapters_2 = part.getChapters();
          for (Chapter chapter_1 : _chapters_2) {
            CharSequence _elementIdForSubToc_1 = this.elementIdForSubToc(((Chapter) chapter_1));
            this.generate(chapter_1, fsa, leftNav, _elementIdForSubToc_1);
          }
        }
      }
    }
  }
  
  public CharSequence genPrevButton(final AbstractSection section) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span class=\"prev_button\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<a href=\"");
    String _fullURL = this.naming.getFullURL(section);
    _builder.append(_fullURL, "	");
    _builder.append("\" >Previous</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("</span>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genNextButton(final AbstractSection section) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span class=\"next_button\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<a href=\"");
    String _fullURL = this.naming.getFullURL(section);
    _builder.append(_fullURL, "	");
    _builder.append("\" >Next</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("</span>");
    _builder.newLine();
    return _builder;
  }
  
  public void generateFile(final AbstractSection section, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    {
      this.ppg.generatePHP(section, fsa);
      String _resourceURL = this.naming.getResourceURL(section);
      String _decode = URLDecoder.decode(_resourceURL);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<br style=\"clear:both;height:1em;\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<div id=\"leftcol\">");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(leftNav, "		");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<div id=\"midcolumn\">");
      _builder.newLine();
      _builder.append("\t\t");
      CharSequence _generate = this.generate(section, fsa, leftNav, leftNavUnfoldSubTocId);
      _builder.append(_generate, "		");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<br style=\"clear:both;height:1em;\">");
      _builder.newLine();
      fsa.generateFile(_decode, Outlets.WEB_SITE, _builder);
    }
  }
  
  protected CharSequence _generate(final ChapterRef chap, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      Chapter _chapter = chap.getChapter();
      String _fullURL = this.naming.getFullURL(chap);
      this.generateFile(_chapter, fsa, leftNav, _fullURL);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<a href=\"");
      String _fullURL_1 = this.naming.getFullURL(chap);
      _builder.append(_fullURL_1, "");
      _builder.append("\"><");
      String _tag = this.tag(chap);
      _builder.append(_tag, "");
      _builder.append(">");
      CharSequence _genPlainText = this.plaintext.genPlainText(chap);
      _builder.append(_genPlainText, "");
      _builder.append("</");
      String _tag_1 = this.tag(chap);
      _builder.append(_tag_1, "");
      _builder.append("></a>");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final SectionRef section, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      Section _section = section.getSection();
      String _fullURL = this.naming.getFullURL(section);
      this.generateFile(_section, fsa, leftNav, _fullURL);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<a href=\"");
      String _fullURL_1 = this.naming.getFullURL(section);
      _builder.append(_fullURL_1, "");
      _builder.append("\"><");
      String _tag = this.tag(section);
      _builder.append(_tag, "");
      _builder.append(">");
      CharSequence _genPlainText = this.plaintext.genPlainText(section);
      _builder.append(_genPlainText, "");
      _builder.append("</");
      String _tag_1 = this.tag(section);
      _builder.append(_tag_1, "");
      _builder.append("></a>");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final Section2Ref section2, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      Section2 _section2 = section2.getSection2();
      String _fullURL = this.naming.getFullURL(section2);
      this.generateFile(_section2, fsa, leftNav, _fullURL);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<a href=\"");
      String _fullURL_1 = this.naming.getFullURL(section2);
      _builder.append(_fullURL_1, "");
      _builder.append("\"><");
      String _tag = this.tag(section2);
      _builder.append(_tag, "");
      _builder.append(">");
      CharSequence _genPlainText = this.plaintext.genPlainText(section2);
      _builder.append(_genPlainText, "");
      _builder.append("</");
      String _tag_1 = this.tag(section2);
      _builder.append(_tag_1, "");
      _builder.append("></a>");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final Chapter chap, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    String _localId = this.naming.getLocalId(chap);
    CharSequence _anchor = this.anchor(_localId);
    _builder.append(_anchor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _tag = this.tag(chap);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = chap.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</");
    String _tag_1 = this.tag(chap);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _c = this.toc(chap);
    _builder.append(_c, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = chap.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(chap);
      for(AbstractSection sec : _sections) {
        CharSequence _generate = this.generate(sec, fsa, leftNav, leftNavUnfoldSubTocId);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section sec, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _localId = this.naming.getLocalId(sec);
    CharSequence _anchor = this.anchor(_localId);
    _builder.append(_anchor, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<span style=\"float:left; border-top: 1px dotted #d4d4dd; margin-left: 0; margin-top: 5px;");
    _builder.newLine();
    _builder.append("padding: 5px 0;");
    _builder.newLine();
    _builder.append("padding-top: 5px;\"></span><a style=\"float: right\" href=\"#\">Top</a>");
    _builder.newLine();
    _builder.append("<br style=\"clear:both\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "	");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "	");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "	");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _c = this.toc(sec);
    _builder.append(_c, "		");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        _builder.append("\t");
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(sec);
      for(AbstractSection sec2 : _sections) {
        _builder.append("\t");
        CharSequence _generate = this.generate(sec2, fsa, leftNav, leftNavUnfoldSubTocId);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section2 sec, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    String _localId = this.naming.getLocalId(sec);
    CharSequence _anchor = this.anchor(_localId);
    _builder.append(_anchor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(sec);
      for(AbstractSection sec3 : _sections) {
        CharSequence _generate = this.generate(sec3, fsa, leftNav, leftNavUnfoldSubTocId);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section3 sec, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    String _localId = this.naming.getLocalId(sec);
    CharSequence _anchor = this.anchor(_localId);
    _builder.append(_anchor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(sec);
      for(AbstractSection c_1 : _sections) {
        CharSequence _generate = this.generate(c_1, fsa, leftNav, leftNavUnfoldSubTocId);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section4 sec, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    String _localId = this.naming.getLocalId(sec);
    CharSequence _anchor = this.anchor(_localId);
    _builder.append(_anchor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    CharSequence _genText = this.genText(_title);
    _builder.append(_genText, "");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _genText_1 = this.genText(c);
        _builder.append(_genText_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String tag(final AbstractSection section) {
    String _switchResult = null;
    final AbstractSection section_1 = section;
    boolean matched = false;
    if (!matched) {
      if (section_1 instanceof Document) {
        final Document section_2 = (Document) section_1;
        matched=true;
        _switchResult = "h1";
      }
    }
    if (!matched) {
      if (section_1 instanceof Chapter) {
        final Chapter section_3 = (Chapter) section_1;
        matched=true;
        _switchResult = "h1";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section) {
        final Section section_4 = (Section) section_1;
        matched=true;
        _switchResult = "h1";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section2) {
        final Section2 section_5 = (Section2) section_1;
        matched=true;
        _switchResult = "h2";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section3) {
        final Section3 section_6 = (Section3) section_1;
        matched=true;
        _switchResult = "h3";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section4) {
        final Section4 section_7 = (Section4) section_1;
        matched=true;
        _switchResult = "h4";
      }
    }
    return _switchResult;
  }
  
  public CharSequence body(final Document doc, final CharSequence leftNav) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<br style=\"clear:both;height:1em;\">");
    _builder.newLine();
    _builder.append("<div id=\"leftcol\">");
    _builder.newLine();
    _builder.append("", "");
    _builder.newLineIfNotEmpty();
    _builder.append(leftNav, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<br style=\"clear:both;height:1em;\">");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toc(final AbstractSection section) throws RuntimeException {
    StringConcatenation _xifexpression = null;
    List<? extends AbstractSection> _sections = this.ase.sections(section);
    boolean _isEmpty = _sections.isEmpty();
    boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
    if (_operator_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"toc\">");
      _builder.newLine();
      _builder.append("  ");
      CharSequence _subToc = this.subToc(section);
      _builder.append(_subToc, "  ");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence subToc(final AbstractSection section) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      List<? extends AbstractSection> _sections = this.ase.sections(section);
      for(AbstractSection ss : _sections) {
        _builder.append("  ");
        CharSequence _cEntry = this.tocEntry(ss);
        _builder.append(_cEntry, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _tocEntry(final Chapter chapter) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    String _fullPHPURL = this.naming.getFullPHPURL(chapter);
    _builder.append(_fullPHPURL, "");
    _builder.append("\" >");
    TextOrMarkup _title = chapter.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</a>");
    {
      List<? extends AbstractSection> _sections = this.ase.sections(chapter);
      boolean _isEmpty = _sections.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        _builder.newLineIfNotEmpty();
        CharSequence _subToc = this.subToc(chapter);
        _builder.append(_subToc, "");
      }
    }
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _tocEntry(final AbstractSection section) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    String _fullPHPURL = this.naming.getFullPHPURL(section);
    _builder.append(_fullPHPURL, "");
    _builder.append("\" >");
    TextOrMarkup _title = section.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</a></li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence leftNavToc(final Document doc) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateLogo = this.generateLogo();
    _builder.append(_generateLogo, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<ul id=\"leftnav\">");
    _builder.newLine();
    {
      List<? extends AbstractSection> _sections = this.ase.sections(doc);
      for(AbstractSection c : _sections) {
        CharSequence _leftNavTocEntry = this.leftNavTocEntry(c);
        _builder.append(_leftNavTocEntry, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _leftNavTocEntry(final Part part) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li class=\"partentry\" >");
    _builder.newLine();
    TextOrMarkup _title = part.getTitle();
    CharSequence _genPlainText = this.plaintext.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</li>");
    _builder.newLine();
    {
      List<? extends AbstractSection> _sections = this.ase.sections(part);
      for(AbstractSection ss : _sections) {
        CharSequence _leftNavTocEntry = this.leftNavTocEntry(ss);
        _builder.append(_leftNavTocEntry, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence leftNavSubToc(final Chapter chap) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul style=\"display: none;\" id=\"");
    CharSequence _elementIdForSubToc = this.elementIdForSubToc(chap);
    _builder.append(_elementIdForSubToc, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections = this.ase.sections(chap);
      for(AbstractSection ss : _sections) {
        CharSequence _leftNavTocEntry = this.leftNavTocEntry(ss);
        _builder.append(_leftNavTocEntry, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _leftNavTocEntry(final Chapter chapter) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li class=\"separator\"><div class=\"separator\">");
    _builder.newLine();
    _builder.append("<img src=\"triangle.gif\" style=\"height:12px; margin-right: 2px; ");
    {
      List<? extends AbstractSection> _sections = this.ase.sections(chapter);
      boolean _isEmpty = _sections.isEmpty();
      if (_isEmpty) {
        _builder.append("display:none");
      }
    }
    _builder.append("\"  /><img src=\"triangle-90.gif\" style=\"display:none; margin-right: 2px\" height=\"12px\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("<a href=\"");
    String _fullPHPURL = this.naming.getFullPHPURL(chapter);
    _builder.append(_fullPHPURL, "");
    _builder.append("\">");
    TextOrMarkup _title = chapter.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</a></div>");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections_1 = this.ase.sections(chapter);
      boolean _isEmpty_1 = _sections_1.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty_1);
      if (_operator_not) {
        CharSequence _leftNavSubToc = this.leftNavSubToc(chapter);
        _builder.append(_leftNavSubToc, "");
      }
    }
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _leftNavTocEntry(final AbstractSection section) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li id=\"");
    String _fullURL = this.naming.getFullURL(section);
    _builder.append(_fullURL, "");
    _builder.append("\" ><a href=\"");
    String _fullPHPURL = this.naming.getFullPHPURL(section);
    _builder.append(_fullPHPURL, "");
    _builder.append("\" >");
    TextOrMarkup _title = section.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</a></li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genAuthors(final Document doc) throws RuntimeException {
    StringConcatenation _xifexpression = null;
    TextOrMarkup _authors = doc.getAuthors();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_authors, null);
    if (_operator_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"authors\">");
      _builder.newLine();
      TextOrMarkup _authors_1 = doc.getAuthors();
      CharSequence _genText = this.genText(_authors_1);
      _builder.append(_genText, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence genNonParText(final TextOrMarkup tom) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _genText(final TextOrMarkup tom) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final CodeBlock cb) throws RuntimeException {
    StringConcatenation _xifexpression = null;
    EList<EObject> _contents = cb.getContents();
    boolean _isEmpty = _contents.isEmpty();
    boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
    if (_operator_not) {
      StringConcatenation _xifexpression_1 = null;
      boolean _isInlineCode = this.utils.isInlineCode(cb);
      if (_isInlineCode) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<span class=\"inlinecode\">");
        EList<EObject> _contents_1 = cb.getContents();
        EObject _head = IterableExtensions.<EObject>head(_contents_1);
        LangDef _language = cb.getLanguage();
        CharSequence _generateCode = this.generateCode(((Code) _head), _language);
        _builder.append(_generateCode, "");
        _builder.append("</span>");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _xblockexpression = null;
        {
          CodeBlock _removeIndent = StringUtils.removeIndent(cb);
          final CodeBlock block = _removeIndent;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("<div class=\"literallayout\">");
          _builder_1.newLine();
          _builder_1.append("<div class=\"incode\">");
          _builder_1.newLine();
          _builder_1.append("<p class=\"code\">");
          _builder_1.newLine();
          {
            EList<EObject> _contents_2 = block.getContents();
            for(EObject code : _contents_2) {
              LangDef _language_1 = cb.getLanguage();
              CharSequence _generateCode_1 = this.generateCode(code, _language_1);
              _builder_1.append(_generateCode_1, "");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append("</p>");
          _builder_1.newLine();
          _builder_1.append("</div>");
          _builder_1.newLine();
          _builder_1.append("</div>");
          _builder_1.newLine();
          _xblockexpression = (_builder_1);
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _genText(final CodeRef cRef) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _operator_and = false;
      JvmDeclaredType _element = cRef.getElement();
      if (!(_element instanceof org.eclipse.xtext.common.types.JvmAnnotationType)) {
        _operator_and = false;
      } else {
        TextOrMarkup _altText = cRef.getAltText();
        boolean _operator_equals = ObjectExtensions.operator_equals(_altText, null);
        _operator_and = BooleanExtensions.operator_and((_element instanceof org.eclipse.xtext.common.types.JvmAnnotationType), _operator_equals);
      }
      if (_operator_and) {
        _xifexpression = "@";
      }
      final String prefix = _xifexpression;
      JvmDeclaredType _element_1 = cRef.getElement();
      String _genJavaDocLink = this.jdoc.genJavaDocLink(_element_1);
      final String jDocLink = _genJavaDocLink;
      JvmDeclaredType _element_2 = cRef.getElement();
      String _gitLink = this.git.gitLink(_element_2);
      final String gitLink = _gitLink;
      JvmDeclaredType _element_3 = cRef.getElement();
      char _charAt = ".".charAt(0);
      String _qualifiedName = _element_3.getQualifiedName(_charAt);
      String _unescapeXdocChars = this.utils.unescapeXdocChars(_qualifiedName);
      String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
      final String fqn = _escapeHTMLChars;
      CharSequence _xifexpression_1 = null;
      TextOrMarkup _altText_1 = cRef.getAltText();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_altText_1, null);
      if (_operator_notEquals) {
        TextOrMarkup _altText_2 = cRef.getAltText();
        CharSequence _genNonParText = this.genNonParText(_altText_2);
        _xifexpression_1 = _genNonParText;
      } else {
        JvmDeclaredType _element_4 = cRef.getElement();
        String _dottedSimpleName = this.dottedSimpleName(_element_4);
        _xifexpression_1 = _dottedSimpleName;
      }
      final CharSequence text = _xifexpression_1;
      StringConcatenation _xifexpression_2 = null;
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(jDocLink, null);
      if (_operator_notEquals_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<a class=\"jdoc\" href=\"");
        JvmDeclaredType _element_5 = cRef.getElement();
        String _genJavaDocLink_1 = this.jdoc.genJavaDocLink(_element_5);
        _builder.append(_genJavaDocLink_1, "");
        _builder.append("\" title=\"");
        _builder.append(fqn, "");
        _builder.append("\">");
        _builder.append(prefix, "");
        _builder.append(text, "");
        _builder.append("</abbr></a>");
        _xifexpression_2 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<abbr title=\"");
        _builder_1.append(fqn, "");
        _builder_1.append("\" >");
        _builder_1.append(prefix, "");
        _builder_1.append(text, "");
        _builder_1.append("</abbr>");
        _xifexpression_2 = _builder_1;
      }
      StringConcatenation ret = _xifexpression_2;
      StringConcatenation _xifexpression_3 = null;
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(gitLink, null);
      if (_operator_notEquals_2) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(ret, "");
        _builder_2.append(" <a class=\"srcLink\" href=\"");
        _builder_2.append(gitLink, "");
        _builder_2.append("\" title=\"View Source Code\" >(src)</a>");
        _xifexpression_3 = _builder_2;
      } else {
        _xifexpression_3 = ret;
      }
      _xblockexpression = (_xifexpression_3);
    }
    return _xblockexpression;
  }
  
  public String dottedSimpleName(final JvmDeclaredType type) {
    String _xifexpression = null;
    JvmDeclaredType _declaringType = type.getDeclaringType();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_declaringType, null);
    if (_operator_notEquals) {
      JvmDeclaredType _declaringType_1 = type.getDeclaringType();
      String _dottedSimpleName = this.dottedSimpleName(_declaringType_1);
      String _operator_plus = StringExtensions.operator_plus(_dottedSimpleName, ".");
      String _simpleName = type.getSimpleName();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _simpleName);
      _xifexpression = _operator_plus_1;
    } else {
      String _simpleName_1 = type.getSimpleName();
      _xifexpression = _simpleName_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _genText(final Emphasize em) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    EList<TextOrMarkup> _contents = em.getContents();
    CharSequence _generate = this.generate(_contents);
    _builder.append(_generate, "");
    _builder.append("</em>");
    return _builder;
  }
  
  protected CharSequence _genText(final Todo todo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"todo\" >");
    _builder.newLine();
    String _text = todo.getText();
    _builder.append(_text, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate(final List<TextOrMarkup> tomList) throws RuntimeException {
    CharSequence _xifexpression = null;
    int _size = tomList.size();
    boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)_size), ((Integer)1));
    if (_operator_equals) {
      TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(tomList);
      CharSequence _genNonParText = this.genNonParText(_head);
      _xifexpression = _genNonParText;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      {
        for(TextOrMarkup tom : tomList) {
          CharSequence _genText = this.genText(tom);
          _builder.append(_genText, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  protected CharSequence _generateCode(final Code code, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, lang);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  protected CharSequence _generateCode(final Code code, final Void lang) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, null);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  protected CharSequence _generateCode(final MarkupInCode mic, final LangDef lang) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genText = this.genText(mic);
    _builder.append(_genText, "");
    return _builder;
  }
  
  protected CharSequence _genText(final TextPart tp) {
    String _text = tp.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    return _unescapeXdocChars;
  }
  
  protected CharSequence _genText(final Anchor a) {
    return null;
  }
  
  protected CharSequence _genText(final Ref ref) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _xifexpression = null;
      Identifiable _ref = ref.getRef();
      if ((_ref instanceof org.eclipse.xtext.xdoc.xdoc.AbstractSection)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("title=\"Go to &quot;");
        Identifiable _ref_1 = ref.getRef();
        TextOrMarkup _title = ((AbstractSection) _ref_1).getTitle();
        CharSequence _genPlainText = this.plaintext.genPlainText(_title);
        _builder.append(_genPlainText, "");
        _builder.append("&quot;\"");
        _xifexpression = _builder;
      }
      final StringConcatenation title = _xifexpression;
      StringConcatenation _builder_1 = new StringConcatenation();
      {
        EList<TextOrMarkup> _contents = ref.getContents();
        boolean _isEmpty = _contents.isEmpty();
        if (_isEmpty) {
          _builder_1.append("<a href=\"");
          Identifiable _ref_2 = ref.getRef();
          String _fullPHPURL = this.naming.getFullPHPURL(_ref_2);
          _builder_1.append(_fullPHPURL, "");
          _builder_1.append("\" ");
          _builder_1.append(title, "");
          _builder_1.append(" >section ");
          Identifiable _ref_3 = ref.getRef();
          String _name = _ref_3.getName();
          _builder_1.append(_name, "");
          _builder_1.append("</a>");} else {
          _builder_1.append("<a href=\"");
          Identifiable _ref_4 = ref.getRef();
          String _fullPHPURL_1 = this.naming.getFullPHPURL(_ref_4);
          _builder_1.append(_fullPHPURL_1, "");
          _builder_1.append("\" ");
          _builder_1.append(title, "");
          _builder_1.append(">");
          {
            EList<TextOrMarkup> _contents_1 = ref.getContents();
            for(TextOrMarkup tom : _contents_1) {
              CharSequence _genNonParText = this.genNonParText(tom);
              _builder_1.append(_genNonParText, "");
            }
          }
          _builder_1.append("</a>");
        }
      }
      _xblockexpression = (_builder_1);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genText(final Link link) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    String _url = link.getUrl();
    _builder.append(_url, "");
    _builder.append("\" >");
    {
      String _text = link.getText();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_text, null);
      if (_operator_notEquals) {
        String _text_1 = link.getText();
        _builder.append(_text_1, "");} else {
        String _url_1 = link.getUrl();
        _builder.append(_url_1, "");
      }
    }
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _genText(final OrderedList ol) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      EList<Item> _items = ol.getItems();
      for(Item i : _items) {
        _builder.append("  ");
        CharSequence _genText = this.genText(i);
        _builder.append(_genText, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final UnorderedList ol) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<Item> _items = ol.getItems();
      for(Item i : _items) {
        _builder.append("  ");
        CharSequence _genText = this.genText(i);
        _builder.append(_genText, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final Item item) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    EList<TextOrMarkup> _contents = item.getContents();
    CharSequence _generate = this.generate(_contents);
    _builder.append(_generate, "");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genText(final Table table) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table>");
    _builder.newLine();
    {
      EList<TableRow> _rows = table.getRows();
      for(TableRow tr : _rows) {
        _builder.append("  ");
        CharSequence _genRow = this.genRow(tr);
        _builder.append(_genRow, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genRow(final TableRow tr) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<TableData> _data = tr.getData();
      for(TableData td : _data) {
        _builder.append("  ");
        CharSequence _genData = this.genData(td);
        _builder.append(_genData, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</tr>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genData(final TableData td) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<td>");
    EList<TextOrMarkup> _contents = td.getContents();
    CharSequence _generate = this.generate(_contents);
    _builder.append(_generate, "");
    _builder.append("</td>");
    return _builder;
  }
  
  protected CharSequence _genText(final ImageRef img) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      String _path = img.getPath();
      String _unescapeXdocChars = this.utils.unescapeXdocChars(_path);
      Resource _eResource = img.eResource();
      this.copy(_unescapeXdocChars, _eResource);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"image\" >");
      _builder.newLine();
      {
        String _name = img.getName();
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
        if (_operator_notEquals) {
          _builder.append("<a>");
          String _name_1 = img.getName();
          _builder.append(_name_1, "");
          _builder.append("</a>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("<img src=\"");
      String _path_1 = img.getPath();
      String _unescapeXdocChars_1 = this.utils.unescapeXdocChars(_path_1);
      String _replaceAll = _unescapeXdocChars_1.replaceAll("\\.\\./", "");
      _builder.append(_replaceAll, "");
      _builder.append("\" ");
      _builder.newLineIfNotEmpty();
      {
        String _clazz = img.getClazz();
        boolean _nullOrEmpty = this.utils.nullOrEmpty(_clazz);
        boolean _operator_not = BooleanExtensions.operator_not(_nullOrEmpty);
        if (_operator_not) {
          _builder.append("\t");
          _builder.append("class=\"");
          String _clazz_1 = img.getClazz();
          String _unescapeXdocChars_2 = this.utils.unescapeXdocChars(_clazz_1);
          _builder.append(_unescapeXdocChars_2, "	");
          _builder.append("\" ");
          _builder.newLineIfNotEmpty();} else {
          _builder.append("\t");
          _builder.append("width=\"600px\"");
          _builder.newLine();
        }
      }
      {
        String _style = img.getStyle();
        boolean _nullOrEmpty_1 = this.utils.nullOrEmpty(_style);
        boolean _operator_not_1 = BooleanExtensions.operator_not(_nullOrEmpty_1);
        if (_operator_not_1) {
          _builder.append("\t");
          _builder.append("style=\"");
          String _style_1 = img.getStyle();
          String _unescapeXdocChars_3 = this.utils.unescapeXdocChars(_style_1);
          _builder.append(_unescapeXdocChars_3, "	");
          _builder.append("\" ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("/>");
      _builder.newLine();
      _builder.append("<div class=\"caption\">");
      _builder.newLine();
      String _caption = img.getCaption();
      String _unescapeXdocChars_4 = this.utils.unescapeXdocChars(_caption);
      String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars_4);
      _builder.append(_escapeHTMLChars, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public void copy(final String fromRelativeFileName, final Resource res) throws RuntimeException {
    try {
      {
        int _operator_multiply = IntegerExtensions.operator_multiply(((Integer)16), ((Integer)1024));
        ByteBuffer _allocateDirect = ByteBuffer.allocateDirect(_operator_multiply);
        final ByteBuffer buffer = _allocateDirect;
        URI _uRI = res.getURI();
        final URI uri = _uRI;
        String relOutDirRoot = "";
        String inDir = "";
        boolean _isPlatformResource = uri.isPlatformResource();
        if (_isPlatformResource) {
          {
            URI _trimSegments = uri.trimSegments(1);
            String _string = _trimSegments.toString();
            String _operator_plus = StringExtensions.operator_plus(_string, "/");
            String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, fromRelativeFileName);
            URI _createURI = URI.createURI(_operator_plus_1);
            final URI inPath = _createURI;
            int _segmentCount = uri.segmentCount();
            int _operator_minus = IntegerExtensions.operator_minus(((Integer)_segmentCount), ((Integer)2));
            URI _trimSegments_1 = uri.trimSegments(_operator_minus);
            URI _appendSegment = _trimSegments_1.appendSegment(Outlets.WEB_SITE_PATH_NAME);
            String _string_1 = _appendSegment.toString();
            String _operator_plus_2 = StringExtensions.operator_plus(_string_1, "/");
            String _replaceAll = fromRelativeFileName.replaceAll("\\.\\.", "");
            String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _replaceAll);
            URI _createURI_1 = URI.createURI(_operator_plus_3);
            final URI outPath = _createURI_1;
            ResourceSet _resourceSet = res.getResourceSet();
            URIConverter _uRIConverter = _resourceSet.getURIConverter();
            InputStream _createInputStream = _uRIConverter.createInputStream(inPath);
            ReadableByteChannel _newChannel = Channels.newChannel(_createInputStream);
            final ReadableByteChannel inChannel = _newChannel;
            ResourceSet _resourceSet_1 = res.getResourceSet();
            URIConverter _uRIConverter_1 = _resourceSet_1.getURIConverter();
            OutputStream _createOutputStream = _uRIConverter_1.createOutputStream(outPath);
            WritableByteChannel _newChannel_1 = Channels.newChannel(_createOutputStream);
            final WritableByteChannel outChannel = _newChannel_1;
            int _read = inChannel.read(buffer);
            int _operator_minus_1 = IntegerExtensions.operator_minus(1);
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)_read), ((Integer)_operator_minus_1));
            Boolean _xwhileexpression = _operator_notEquals;
            while (_xwhileexpression) {
              {
                buffer.flip();
                outChannel.write(buffer);
                buffer.compact();
              }
              int _read_1 = inChannel.read(buffer);
              int _operator_minus_2 = IntegerExtensions.operator_minus(1);
              boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_read_1), ((Integer)_operator_minus_2));
              _xwhileexpression = _operator_notEquals_1;
            }
            buffer.flip();
            boolean _hasRemaining = buffer.hasRemaining();
            Boolean _xwhileexpression_1 = _hasRemaining;
            while (_xwhileexpression_1) {
              outChannel.write(buffer);
              boolean _hasRemaining_1 = buffer.hasRemaining();
              _xwhileexpression_1 = _hasRemaining_1;
            }
            outChannel.close();
          }
        }
      }
    } catch (Exception e) { 
      RuntimeException _runtimeException = new RuntimeException(e);
      throw _runtimeException;
    }
  }
  
  public CharSequence anchor(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    _builder.append(name, "");
    _builder.append("\" ></a>");
    return _builder;
  }
  
  public CharSequence elementIdForSubToc(final Chapter chap) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("subToc_");
    String _fullURL = this.naming.getFullURL(chap);
    _builder.append(_fullURL, "");
    return _builder;
  }
  
  public CharSequence generateLogo() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"nav-logo\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<a href=\"index.php\"><img src=\"http://wiki.eclipse.org/images/thumb/d/db/Xtext_logo.png/450px-Xtext_logo.png\" style=\"margin-left:30px; width:125px\"/></a>");
    _builder.newLine();
    _builder.append("</div>");
    return _builder;
  }
  
  public CharSequence javaScriptForNavigation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("<script type=\"text/javascript\"> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function initTocMenu(ActiveSubTocElementId){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var menu = document.getElementById(\"leftnav\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var chapters = menu.children;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("addHideSubsectionFunction(chapters);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("document.getElementById(ActiveSubTocElementId).style.display = \"block\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function addHideSubsectionFunction(items){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (var i = 0; i < items.length; i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (items[i].firstElementChild ){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("items[i].firstElementChild.onclick = function(){toc_toggle_subsections(this.parentNode);};");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("items[i].firstElementChild.style.cursor = \"pointer\";");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function toc_toggle_subsections(chap){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if ( chap.children[1].style.display != \"none\" ) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("chap.children[1].style.display = \"none\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("chap.children[1].style.display = \"block\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function highlightCurrentSection(sec) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("document.getElementById(sec).style.backgroundColor= \"#D0D0D0\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate(final AbstractSection chap, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) throws RuntimeException {
    if ((chap instanceof ChapterRef)
         && (fsa instanceof IFileSystemAccess)
         && (leftNav instanceof CharSequence)
         && (leftNavUnfoldSubTocId instanceof CharSequence)) {
      return _generate((ChapterRef)chap, (IFileSystemAccess)fsa, (CharSequence)leftNav, (CharSequence)leftNavUnfoldSubTocId);
    } else if ((chap instanceof Section2Ref)
         && (fsa instanceof IFileSystemAccess)
         && (leftNav instanceof CharSequence)
         && (leftNavUnfoldSubTocId instanceof CharSequence)) {
      return _generate((Section2Ref)chap, (IFileSystemAccess)fsa, (CharSequence)leftNav, (CharSequence)leftNavUnfoldSubTocId);
    } else if ((chap instanceof SectionRef)
         && (fsa instanceof IFileSystemAccess)
         && (leftNav instanceof CharSequence)
         && (leftNavUnfoldSubTocId instanceof CharSequence)) {
      return _generate((SectionRef)chap, (IFileSystemAccess)fsa, (CharSequence)leftNav, (CharSequence)leftNavUnfoldSubTocId);
    } else if ((chap instanceof Chapter)
         && (fsa instanceof IFileSystemAccess)
         && (leftNav instanceof CharSequence)
         && (leftNavUnfoldSubTocId instanceof CharSequence)) {
      return _generate((Chapter)chap, (IFileSystemAccess)fsa, (CharSequence)leftNav, (CharSequence)leftNavUnfoldSubTocId);
    } else if ((chap instanceof Section)
         && (fsa instanceof IFileSystemAccess)
         && (leftNav instanceof CharSequence)
         && (leftNavUnfoldSubTocId instanceof CharSequence)) {
      return _generate((Section)chap, (IFileSystemAccess)fsa, (CharSequence)leftNav, (CharSequence)leftNavUnfoldSubTocId);
    } else if ((chap instanceof Section2)
         && (fsa instanceof IFileSystemAccess)
         && (leftNav instanceof CharSequence)
         && (leftNavUnfoldSubTocId instanceof CharSequence)) {
      return _generate((Section2)chap, (IFileSystemAccess)fsa, (CharSequence)leftNav, (CharSequence)leftNavUnfoldSubTocId);
    } else if ((chap instanceof Section3)
         && (fsa instanceof IFileSystemAccess)
         && (leftNav instanceof CharSequence)
         && (leftNavUnfoldSubTocId instanceof CharSequence)) {
      return _generate((Section3)chap, (IFileSystemAccess)fsa, (CharSequence)leftNav, (CharSequence)leftNavUnfoldSubTocId);
    } else if ((chap instanceof Section4)
         && (fsa instanceof IFileSystemAccess)
         && (leftNav instanceof CharSequence)
         && (leftNavUnfoldSubTocId instanceof CharSequence)) {
      return _generate((Section4)chap, (IFileSystemAccess)fsa, (CharSequence)leftNav, (CharSequence)leftNavUnfoldSubTocId);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chap, fsa, leftNav, leftNavUnfoldSubTocId).toString());
    }
  }
  
  public CharSequence tocEntry(final AbstractSection chapter) throws RuntimeException {
    if ((chapter instanceof Chapter)) {
      return _tocEntry((Chapter)chapter);
    } else if ((chapter instanceof AbstractSection)) {
      return _tocEntry((AbstractSection)chapter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chapter).toString());
    }
  }
  
  public CharSequence leftNavTocEntry(final AbstractSection chapter) throws RuntimeException {
    if ((chapter instanceof Chapter)) {
      return _leftNavTocEntry((Chapter)chapter);
    } else if ((chapter instanceof Part)) {
      return _leftNavTocEntry((Part)chapter);
    } else if ((chapter instanceof AbstractSection)) {
      return _leftNavTocEntry((AbstractSection)chapter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chapter).toString());
    }
  }
  
  public CharSequence genText(final EObject a) throws RuntimeException {
    if ((a instanceof Anchor)) {
      return _genText((Anchor)a);
    } else if ((a instanceof CodeBlock)) {
      return _genText((CodeBlock)a);
    } else if ((a instanceof CodeRef)) {
      return _genText((CodeRef)a);
    } else if ((a instanceof Emphasize)) {
      return _genText((Emphasize)a);
    } else if ((a instanceof ImageRef)) {
      return _genText((ImageRef)a);
    } else if ((a instanceof Link)) {
      return _genText((Link)a);
    } else if ((a instanceof OrderedList)) {
      return _genText((OrderedList)a);
    } else if ((a instanceof Ref)) {
      return _genText((Ref)a);
    } else if ((a instanceof Table)) {
      return _genText((Table)a);
    } else if ((a instanceof Todo)) {
      return _genText((Todo)a);
    } else if ((a instanceof UnorderedList)) {
      return _genText((UnorderedList)a);
    } else if ((a instanceof Item)) {
      return _genText((Item)a);
    } else if ((a instanceof TextOrMarkup)) {
      return _genText((TextOrMarkup)a);
    } else if ((a instanceof TextPart)) {
      return _genText((TextPart)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(a).toString());
    }
  }
  
  public CharSequence generateCode(final EObject code, final Object lang) throws RuntimeException {
    if ((code instanceof Code)
         && (lang instanceof LangDef)) {
      return _generateCode((Code)code, (LangDef)lang);
    } else if ((code instanceof MarkupInCode)
         && (lang instanceof LangDef)) {
      return _generateCode((MarkupInCode)code, (LangDef)lang);
    } else if ((code instanceof Code)
         && (lang == null)) {
      return _generateCode((Code)code, (Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(code, lang).toString());
    }
  }
}