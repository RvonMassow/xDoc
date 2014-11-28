package org.eclipse.xtext.xdoc.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
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

@SuppressWarnings("all")
public class HtmlGenerator implements IGenerator {
  @Inject
  @Extension
  private Utils utils;
  
  @Inject
  @Extension
  private PlainText plaintext;
  
  @Inject
  @Extension
  private HTMLNamingExtensions naming;
  
  @Inject
  @Extension
  private AbstractSectionExtension ase;
  
  @Inject
  @Extension
  private GitExtensions git;
  
  @Inject
  @Extension
  private JavaDocExtension jdoc;
  
  @Inject
  @Extension
  private PHPPhoenixGenerator ppg;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<XdocFile> _filter = Iterables.<XdocFile>filter(_iterable, XdocFile.class);
      for (final XdocFile file : _filter) {
        AbstractSection _mainSection = file.getMainSection();
        if ((_mainSection instanceof Document)) {
          AbstractSection _mainSection_1 = file.getMainSection();
          this.generate(((Document) _mainSection_1), fsa);
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        throw new RuntimeException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void generate(final Document doc, final IFileSystemAccess fsa) {
    final CharSequence leftNav = this.leftNavToc(doc);
    this.ppg.generatePHP(doc, fsa);
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _body = this.body(doc, leftNav);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    fsa.generateFile("_index.html", Outlets.WEB_SITE, _builder);
    EList<Chapter> _chapters = doc.getChapters();
    boolean _isEmpty = _chapters.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Chapter> _chapters_1 = doc.getChapters();
      for (final Chapter chapter : _chapters_1) {
        CharSequence _elementIdForSubToc = this.elementIdForSubToc(((Chapter) chapter));
        this.generate(chapter, fsa, leftNav, _elementIdForSubToc);
      }
    } else {
      EList<Part> _parts = doc.getParts();
      for (final Part part : _parts) {
        EList<Chapter> _chapters_2 = part.getChapters();
        for (final Chapter chapter_1 : _chapters_2) {
          CharSequence _elementIdForSubToc_1 = this.elementIdForSubToc(((Chapter) chapter_1));
          this.generate(chapter_1, fsa, leftNav, _elementIdForSubToc_1);
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
    _builder.append(_fullURL, "\t");
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
    _builder.append(_fullURL, "\t");
    _builder.append("\" >Next</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("</span>");
    _builder.newLine();
    return _builder;
  }
  
  public void generateFile(final AbstractSection section, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
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
    _builder.append(leftNav, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div id=\"midcolumn\">");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _generate = this.generate(section, fsa, leftNav, leftNavUnfoldSubTocId);
    _builder.append(_generate, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<div id=\"disqus_thread\"></div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\" src=\"documentationRoot.js\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("/* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("var disqus_shortname = \'xtext\'; // required: replace example with your forum shortname");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("// The following are highly recommended additional parameters. Remove the slashes in front to use.");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("var disqus_identifier = \'");
    String _localId = this.naming.getLocalId(section);
    _builder.append(_localId, "\t\t    ");
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("var disqus_url = documentationRoot+\'");
    String _resourceURL_1 = this.naming.getResourceURL(section);
    String _replace = _resourceURL_1.replace(".html", ".php");
    _builder.append(_replace, "\t\t    ");
    _builder.append("\';");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("/* * * DON\'T EDIT BELOW THIS LINE * * */");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("(function() {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("var dsq = document.createElement(\'script\'); dsq.type = \'text/javascript\'; dsq.async = true;");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("dsq.src = \'http://\' + disqus_shortname + \'.disqus.com/embed.js\';");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("(document.getElementsByTagName(\'head\')[0] || document.getElementsByTagName(\'body\')[0]).appendChild(dsq);");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("})();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("<noscript>Please enable JavaScript to view the <a href=\"http://disqus.com/?ref_noscript\">comments powered by Disqus.</a></noscript>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<br style=\"clear:both;height:1em;\">");
    _builder.newLine();
    fsa.generateFile(_decode, Outlets.WEB_SITE, _builder);
  }
  
  protected CharSequence _generate(final ChapterRef chap, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
    CharSequence _xblockexpression = null;
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
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final SectionRef section, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
    CharSequence _xblockexpression = null;
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
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final Section2Ref section2, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
    CharSequence _xblockexpression = null;
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
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final Chapter chap, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
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
    _builder.append(_c, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = chap.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(chap);
      for(final AbstractSection sec : _sections) {
        CharSequence _generate = this.generate(sec, fsa, leftNav, leftNavUnfoldSubTocId);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section sec, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
    StringConcatenation _builder = new StringConcatenation();
    String _localId = this.naming.getLocalId(sec);
    CharSequence _anchor = this.anchor(_localId);
    _builder.append(_anchor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<span style=\"float:left; border-top: 1px dotted #d4d4dd; margin-left: 0; margin-top: 5px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding: 5px 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding-top: 5px;\"></span><a style=\"float: right\" href=\"#\">Top</a>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<br style=\"clear:both\"></br>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "\t");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    CharSequence _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "\t");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "\t");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _c = this.toc(sec);
    _builder.append(_c, "\t");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(final TextOrMarkup c : _contents) {
        _builder.append("\t");
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(sec);
      for(final AbstractSection sec2 : _sections) {
        _builder.append("\t");
        CharSequence _generate = this.generate(sec2, fsa, leftNav, leftNavUnfoldSubTocId);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section2 sec, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
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
      for(final TextOrMarkup c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(sec);
      for(final AbstractSection sec3 : _sections) {
        CharSequence _generate = this.generate(sec3, fsa, leftNav, leftNavUnfoldSubTocId);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section3 sec, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
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
      for(final TextOrMarkup c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(sec);
      for(final AbstractSection c_1 : _sections) {
        CharSequence _generate = this.generate(c_1, fsa, leftNav, leftNavUnfoldSubTocId);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section4 sec, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
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
      for(final TextOrMarkup c : _contents) {
        CharSequence _genText_1 = this.genText(c);
        _builder.append(_genText_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String tag(final AbstractSection section) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (section instanceof Document) {
        _matched=true;
        _switchResult = "h1";
      }
    }
    if (!_matched) {
      if (section instanceof Chapter) {
        _matched=true;
        _switchResult = "h1";
      }
    }
    if (!_matched) {
      if (section instanceof Section) {
        _matched=true;
        _switchResult = "h1";
      }
    }
    if (!_matched) {
      if (section instanceof Section2) {
        _matched=true;
        _switchResult = "h2";
      }
    }
    if (!_matched) {
      if (section instanceof Section3) {
        _matched=true;
        _switchResult = "h3";
      }
    }
    if (!_matched) {
      if (section instanceof Section4) {
        _matched=true;
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
  
  public CharSequence toc(final AbstractSection section) {
    CharSequence _xifexpression = null;
    List<? extends AbstractSection> _sections = this.ase.sections(section);
    boolean _isEmpty = _sections.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
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
  
  public CharSequence subToc(final AbstractSection section) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      List<? extends AbstractSection> _sections = this.ase.sections(section);
      for(final AbstractSection ss : _sections) {
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
  
  protected CharSequence _tocEntry(final Chapter chapter) {
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
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        CharSequence _subToc = this.subToc(chapter);
        _builder.append(_subToc, "");
      }
    }
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _tocEntry(final AbstractSection section) {
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
  
  public CharSequence leftNavToc(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateLogo = this.generateLogo();
    _builder.append(_generateLogo, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<ul id=\"leftnav\">");
    _builder.newLine();
    {
      List<? extends AbstractSection> _sections = this.ase.sections(doc);
      for(final AbstractSection c : _sections) {
        CharSequence _leftNavTocEntry = this.leftNavTocEntry(c);
        _builder.append(_leftNavTocEntry, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _leftNavTocEntry(final Part part) {
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
      for(final AbstractSection ss : _sections) {
        CharSequence _leftNavTocEntry = this.leftNavTocEntry(ss);
        _builder.append(_leftNavTocEntry, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence leftNavSubToc(final Chapter chap) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul style=\"display: none;\" id=\"");
    CharSequence _elementIdForSubToc = this.elementIdForSubToc(chap);
    _builder.append(_elementIdForSubToc, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections = this.ase.sections(chap);
      for(final AbstractSection ss : _sections) {
        CharSequence _leftNavTocEntry = this.leftNavTocEntry(ss);
        _builder.append(_leftNavTocEntry, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _leftNavTocEntry(final Chapter chapter) {
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
    String _string = _genNonParText.toString();
    String _escapeHtml = StringEscapeUtils.escapeHtml(_string);
    _builder.append(_escapeHtml, "");
    _builder.append("</a></div>");
    _builder.newLineIfNotEmpty();
    {
      List<? extends AbstractSection> _sections_1 = this.ase.sections(chapter);
      boolean _isEmpty_1 = _sections_1.isEmpty();
      boolean _not = (!_isEmpty_1);
      if (_not) {
        CharSequence _leftNavSubToc = this.leftNavSubToc(chapter);
        _builder.append(_leftNavSubToc, "");
      }
    }
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _leftNavTocEntry(final AbstractSection section) {
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
    String _string = _genNonParText.toString();
    String _escapeHtml = StringEscapeUtils.escapeHtml(_string);
    _builder.append(_escapeHtml, "");
    _builder.append("</a></li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genAuthors(final Document doc) {
    CharSequence _xifexpression = null;
    TextOrMarkup _authors = doc.getAuthors();
    boolean _notEquals = (!Objects.equal(_authors, null));
    if (_notEquals) {
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
  
  public CharSequence genNonParText(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(final EObject c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _genText(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    {
      EList<EObject> _contents = tom.getContents();
      for(final EObject c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final CodeBlock cb) {
    CharSequence _xifexpression = null;
    EList<EObject> _contents = cb.getContents();
    boolean _isEmpty = _contents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      CharSequence _xifexpression_1 = null;
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
        CharSequence _xblockexpression = null;
        {
          final CodeBlock block = StringUtils.removeIndent(cb);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("<div class=\"literallayout\">");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("<div class=\"incode\">");
          _builder_1.newLine();
          _builder_1.append("\t\t");
          _builder_1.append("<p class=\"code\">");
          _builder_1.newLine();
          {
            EList<EObject> _contents_2 = block.getContents();
            for(final EObject code : _contents_2) {
              _builder_1.append("\t\t\t");
              LangDef _language_1 = cb.getLanguage();
              CharSequence _generateCode_1 = this.generateCode(code, _language_1);
              _builder_1.append(_generateCode_1, "\t\t\t");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append("\t\t");
          _builder_1.append("</p>");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("</div>");
          _builder_1.newLine();
          _builder_1.append("</div>");
          _builder_1.newLine();
          _xblockexpression = _builder_1;
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _genText(final CodeRef cRef) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      boolean _and = false;
      JvmDeclaredType _element = cRef.getElement();
      if (!(_element instanceof JvmAnnotationType)) {
        _and = false;
      } else {
        TextOrMarkup _altText = cRef.getAltText();
        boolean _equals = Objects.equal(_altText, null);
        _and = _equals;
      }
      if (_and) {
        _xifexpression = "@";
      }
      final String prefix = _xifexpression;
      JvmDeclaredType _element_1 = cRef.getElement();
      final String jDocLink = this.jdoc.genJavaDocLink(_element_1);
      JvmDeclaredType _element_2 = cRef.getElement();
      final String gitLink = this.git.gitLink(_element_2);
      JvmDeclaredType _element_3 = cRef.getElement();
      char _charAt = ".".charAt(0);
      String _qualifiedName = _element_3.getQualifiedName(_charAt);
      String _unescapeXdocChars = this.utils.unescapeXdocChars(_qualifiedName);
      final String fqn = StringEscapeUtils.escapeHtml(_unescapeXdocChars);
      CharSequence _xifexpression_1 = null;
      TextOrMarkup _altText_1 = cRef.getAltText();
      boolean _notEquals = (!Objects.equal(_altText_1, null));
      if (_notEquals) {
        TextOrMarkup _altText_2 = cRef.getAltText();
        _xifexpression_1 = this.genNonParText(_altText_2);
      } else {
        JvmDeclaredType _element_4 = cRef.getElement();
        _xifexpression_1 = this.dottedSimpleName(_element_4);
      }
      final CharSequence text = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _notEquals_1 = (!Objects.equal(jDocLink, null));
      if (_notEquals_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<a class=\"jdoc\" href=\"");
        JvmDeclaredType _element_5 = cRef.getElement();
        String _genJavaDocLink = this.jdoc.genJavaDocLink(_element_5);
        _builder.append(_genJavaDocLink, "");
        _builder.append("\" title=\"");
        _builder.append(fqn, "");
        _builder.append("\">");
        _builder.append(prefix, "");
        _builder.append(text, "");
        _builder.append("</abbr></a>");
        _xifexpression_2 = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<abbr title=\"");
        _builder_1.append(fqn, "");
        _builder_1.append("\" >");
        _builder_1.append(prefix, "");
        _builder_1.append(text, "");
        _builder_1.append("</abbr>");
        _xifexpression_2 = _builder_1.toString();
      }
      String ret = _xifexpression_2;
      CharSequence _xifexpression_3 = null;
      boolean _notEquals_2 = (!Objects.equal(gitLink, null));
      if (_notEquals_2) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append(ret, "");
        _builder_2.append(" <a class=\"srcLink\" href=\"");
        _builder_2.append(gitLink, "");
        _builder_2.append("\" title=\"View Source Code\" >(src)</a>");
        _xifexpression_3 = _builder_2;
      } else {
        _xifexpression_3 = ret;
      }
      _xblockexpression = _xifexpression_3;
    }
    return _xblockexpression;
  }
  
  public String dottedSimpleName(final JvmDeclaredType type) {
    String _xifexpression = null;
    JvmDeclaredType _declaringType = type.getDeclaringType();
    boolean _notEquals = (!Objects.equal(_declaringType, null));
    if (_notEquals) {
      JvmDeclaredType _declaringType_1 = type.getDeclaringType();
      String _dottedSimpleName = this.dottedSimpleName(_declaringType_1);
      String _plus = (_dottedSimpleName + ".");
      String _simpleName = type.getSimpleName();
      _xifexpression = (_plus + _simpleName);
    } else {
      _xifexpression = type.getSimpleName();
    }
    return _xifexpression;
  }
  
  protected CharSequence _genText(final Emphasize em) {
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
  
  public CharSequence generate(final List<TextOrMarkup> tomList) {
    CharSequence _xifexpression = null;
    int _size = tomList.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(tomList);
      _xifexpression = this.genNonParText(_head);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final TextOrMarkup tom : tomList) {
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
  
  protected CharSequence _generateCode(final MarkupInCode mic, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genText = this.genText(mic);
    _builder.append(_genText, "");
    return _builder;
  }
  
  protected CharSequence _genText(final TextPart tp) {
    String _text = tp.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    return StringEscapeUtils.escapeHtml(_unescapeXdocChars);
  }
  
  protected CharSequence _genText(final Anchor a) {
    return null;
  }
  
  protected CharSequence _genText(final Ref ref) {
    CharSequence _xblockexpression = null;
    {
      String _xifexpression = null;
      Identifiable _ref = ref.getRef();
      if ((_ref instanceof AbstractSection)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("title=\"Go to &quot;");
        Identifiable _ref_1 = ref.getRef();
        TextOrMarkup _title = ((AbstractSection) _ref_1).getTitle();
        CharSequence _genPlainText = this.plaintext.genPlainText(_title);
        _builder.append(_genPlainText, "");
        _builder.append("&quot;\"");
        _xifexpression = _builder.toString();
      }
      final String title = _xifexpression;
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
          _builder_1.append("</a>");
        } else {
          _builder_1.append("<a href=\"");
          Identifiable _ref_4 = ref.getRef();
          String _fullPHPURL_1 = this.naming.getFullPHPURL(_ref_4);
          _builder_1.append(_fullPHPURL_1, "");
          _builder_1.append("\" ");
          _builder_1.append(title, "");
          _builder_1.append(">");
          {
            EList<TextOrMarkup> _contents_1 = ref.getContents();
            for(final TextOrMarkup tom : _contents_1) {
              CharSequence _genNonParText = this.genNonParText(tom);
              _builder_1.append(_genNonParText, "");
            }
          }
          _builder_1.append("</a>");
        }
      }
      _xblockexpression = _builder_1;
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
      boolean _notEquals = (!Objects.equal(_text, null));
      if (_notEquals) {
        String _text_1 = link.getText();
        _builder.append(_text_1, "");
      } else {
        String _url_1 = link.getUrl();
        _builder.append(_url_1, "");
      }
    }
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _genText(final OrderedList ol) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      EList<Item> _items = ol.getItems();
      for(final Item i : _items) {
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
  
  protected CharSequence _genText(final UnorderedList ol) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<Item> _items = ol.getItems();
      for(final Item i : _items) {
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
  
  protected CharSequence _genText(final Item item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    EList<TextOrMarkup> _contents = item.getContents();
    CharSequence _generate = this.generate(_contents);
    _builder.append(_generate, "");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genText(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table>");
    _builder.newLine();
    {
      EList<TableRow> _rows = table.getRows();
      for(final TableRow tr : _rows) {
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
  
  public CharSequence genRow(final TableRow tr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<TableData> _data = tr.getData();
      for(final TableData td : _data) {
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
  
  public CharSequence genData(final TableData td) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<td>");
    EList<TextOrMarkup> _contents = td.getContents();
    CharSequence _generate = this.generate(_contents);
    _builder.append(_generate, "");
    _builder.append("</td>");
    return _builder;
  }
  
  protected CharSequence _genText(final ImageRef img) {
    CharSequence _xblockexpression = null;
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
        boolean _notEquals = (!Objects.equal(_name, null));
        if (_notEquals) {
          _builder.append("<a>");
          String _name_1 = img.getName();
          _builder.append(_name_1, "");
          _builder.append("</a>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("<a class=\"gallery\" rel=\"prettyPhoto[all]\" title=\"");
      String _caption = img.getCaption();
      String _unescapeXdocChars_1 = this.utils.unescapeXdocChars(_caption);
      String _escapeHtml = StringEscapeUtils.escapeHtml(_unescapeXdocChars_1);
      _builder.append(_escapeHtml, "");
      _builder.append("\" href=\"");
      String _path_1 = img.getPath();
      String _unescapeXdocChars_2 = this.utils.unescapeXdocChars(_path_1);
      String _replaceAll = _unescapeXdocChars_2.replaceAll("\\.\\./", "");
      _builder.append(_replaceAll, "");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("<img src=\"");
      String _path_2 = img.getPath();
      String _unescapeXdocChars_3 = this.utils.unescapeXdocChars(_path_2);
      String _replaceAll_1 = _unescapeXdocChars_3.replaceAll("\\.\\./", "");
      _builder.append(_replaceAll_1, "\t");
      _builder.append("\" ");
      _builder.newLineIfNotEmpty();
      {
        String _clazz = img.getClazz();
        boolean _nullOrEmpty = this.utils.nullOrEmpty(_clazz);
        boolean _not = (!_nullOrEmpty);
        if (_not) {
          _builder.append("\t\t");
          _builder.append("class=\"");
          String _clazz_1 = img.getClazz();
          String _unescapeXdocChars_4 = this.utils.unescapeXdocChars(_clazz_1);
          _builder.append(_unescapeXdocChars_4, "\t\t");
          _builder.append("\" ");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t\t");
          _builder.append("width=\"600px\"");
          _builder.newLine();
        }
      }
      {
        String _style = img.getStyle();
        boolean _nullOrEmpty_1 = this.utils.nullOrEmpty(_style);
        boolean _not_1 = (!_nullOrEmpty_1);
        if (_not_1) {
          _builder.append("\t\t");
          _builder.append("style=\"");
          String _style_1 = img.getStyle();
          String _unescapeXdocChars_5 = this.utils.unescapeXdocChars(_style_1);
          _builder.append(_unescapeXdocChars_5, "\t\t");
          _builder.append("\" ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("/>");
      _builder.newLine();
      _builder.append("</a>");
      _builder.newLine();
      _builder.append("<div class=\"caption\">");
      _builder.newLine();
      _builder.append("\t");
      String _caption_1 = img.getCaption();
      String _unescapeXdocChars_6 = this.utils.unescapeXdocChars(_caption_1);
      String _escapeHtml_1 = StringEscapeUtils.escapeHtml(_unescapeXdocChars_6);
      _builder.append(_escapeHtml_1, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</div>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public void copy(final String fromRelativeFileName, final Resource res) {
    try {
      final ByteBuffer buffer = ByteBuffer.allocateDirect((16 * 1024));
      final URI uri = res.getURI();
      boolean _isPlatformResource = uri.isPlatformResource();
      if (_isPlatformResource) {
        URI _trimSegments = uri.trimSegments(1);
        String _string = _trimSegments.toString();
        String _plus = (_string + "/");
        String _plus_1 = (_plus + fromRelativeFileName);
        final URI inPath = URI.createURI(_plus_1);
        int _segmentCount = uri.segmentCount();
        int _minus = (_segmentCount - 2);
        URI _trimSegments_1 = uri.trimSegments(_minus);
        URI _appendSegment = _trimSegments_1.appendSegment(Outlets.WEB_SITE_PATH_NAME);
        String _string_1 = _appendSegment.toString();
        String _plus_2 = (_string_1 + "/");
        String _replaceAll = fromRelativeFileName.replaceAll("\\.\\.", "");
        String _plus_3 = (_plus_2 + _replaceAll);
        final URI outPath = URI.createURI(_plus_3);
        ResourceSet _resourceSet = res.getResourceSet();
        URIConverter _uRIConverter = _resourceSet.getURIConverter();
        InputStream _createInputStream = _uRIConverter.createInputStream(inPath);
        final ReadableByteChannel inChannel = Channels.newChannel(_createInputStream);
        ResourceSet _resourceSet_1 = res.getResourceSet();
        URIConverter _uRIConverter_1 = _resourceSet_1.getURIConverter();
        OutputStream _createOutputStream = _uRIConverter_1.createOutputStream(outPath);
        final WritableByteChannel outChannel = Channels.newChannel(_createOutputStream);
        while ((inChannel.read(buffer) != (-1))) {
          {
            buffer.flip();
            outChannel.write(buffer);
            buffer.compact();
          }
        }
        buffer.flip();
        while (buffer.hasRemaining()) {
          outChannel.write(buffer);
        }
        outChannel.close();
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        throw new RuntimeException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
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
    _builder.append("<a href=\"index.php\"><img src=\"logo.png\" style=\"margin-left:10px; width:155px\"/></a>");
    _builder.newLine();
    _builder.append("</div>");
    return _builder;
  }
  
  public CharSequence generate(final AbstractSection chap, final IFileSystemAccess fsa, final CharSequence leftNav, final CharSequence leftNavUnfoldSubTocId) {
    if (chap instanceof ChapterRef) {
      return _generate((ChapterRef)chap, fsa, leftNav, leftNavUnfoldSubTocId);
    } else if (chap instanceof Section2Ref) {
      return _generate((Section2Ref)chap, fsa, leftNav, leftNavUnfoldSubTocId);
    } else if (chap instanceof SectionRef) {
      return _generate((SectionRef)chap, fsa, leftNav, leftNavUnfoldSubTocId);
    } else if (chap instanceof Chapter) {
      return _generate((Chapter)chap, fsa, leftNav, leftNavUnfoldSubTocId);
    } else if (chap instanceof Section) {
      return _generate((Section)chap, fsa, leftNav, leftNavUnfoldSubTocId);
    } else if (chap instanceof Section2) {
      return _generate((Section2)chap, fsa, leftNav, leftNavUnfoldSubTocId);
    } else if (chap instanceof Section3) {
      return _generate((Section3)chap, fsa, leftNav, leftNavUnfoldSubTocId);
    } else if (chap instanceof Section4) {
      return _generate((Section4)chap, fsa, leftNav, leftNavUnfoldSubTocId);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(chap, fsa, leftNav, leftNavUnfoldSubTocId).toString());
    }
  }
  
  public CharSequence tocEntry(final AbstractSection chapter) {
    if (chapter instanceof Chapter) {
      return _tocEntry((Chapter)chapter);
    } else if (chapter != null) {
      return _tocEntry(chapter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(chapter).toString());
    }
  }
  
  public CharSequence leftNavTocEntry(final AbstractSection chapter) {
    if (chapter instanceof Chapter) {
      return _leftNavTocEntry((Chapter)chapter);
    } else if (chapter instanceof Part) {
      return _leftNavTocEntry((Part)chapter);
    } else if (chapter != null) {
      return _leftNavTocEntry(chapter);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(chapter).toString());
    }
  }
  
  public CharSequence genText(final EObject a) {
    if (a instanceof Anchor) {
      return _genText((Anchor)a);
    } else if (a instanceof CodeBlock) {
      return _genText((CodeBlock)a);
    } else if (a instanceof CodeRef) {
      return _genText((CodeRef)a);
    } else if (a instanceof Emphasize) {
      return _genText((Emphasize)a);
    } else if (a instanceof ImageRef) {
      return _genText((ImageRef)a);
    } else if (a instanceof Link) {
      return _genText((Link)a);
    } else if (a instanceof OrderedList) {
      return _genText((OrderedList)a);
    } else if (a instanceof Ref) {
      return _genText((Ref)a);
    } else if (a instanceof Table) {
      return _genText((Table)a);
    } else if (a instanceof Todo) {
      return _genText((Todo)a);
    } else if (a instanceof UnorderedList) {
      return _genText((UnorderedList)a);
    } else if (a instanceof Item) {
      return _genText((Item)a);
    } else if (a instanceof TextOrMarkup) {
      return _genText((TextOrMarkup)a);
    } else if (a instanceof TextPart) {
      return _genText((TextPart)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
  
  public CharSequence generateCode(final EObject code, final LangDef lang) {
    if (code instanceof Code
         && lang != null) {
      return _generateCode((Code)code, lang);
    } else if (code instanceof MarkupInCode
         && lang != null) {
      return _generateCode((MarkupInCode)code, lang);
    } else if (code instanceof Code
         && lang == null) {
      return _generateCode((Code)code, (Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(code, lang).toString());
    }
  }
}
