package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.AbstractSectionExtension;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.XdocGenerator;
import org.eclipse.xtext.xdoc.generator.util.GitExtensions;
import org.eclipse.xtext.xdoc.generator.util.HTMLNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.JavaDocExtension;
import org.eclipse.xtext.xdoc.generator.util.StringUtils;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Anchor;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
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
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableData;
import org.eclipse.xtext.xdoc.xdoc.TableRow;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
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
  private XdocGenerator helpGen;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) throws RuntimeException {
    try {
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
      Iterable<XdocFile> _filter = IterableExtensions.<XdocFile>filter(_allContentsIterable, org.eclipse.xtext.xdoc.xdoc.XdocFile.class);
      for (XdocFile file : _filter) {
        AbstractSection _mainSection = file.getMainSection();
        if ((_mainSection instanceof org.eclipse.xtext.xdoc.xdoc.Document)) {
          {
            AbstractSection _mainSection_1 = file.getMainSection();
            Map<AbstractSection,String> _computeURLs = this.naming.computeURLs(((Document) _mainSection_1));
            final Map<AbstractSection,String> fileNames = _computeURLs;
            AbstractSection _mainSection_2 = file.getMainSection();
            this.generate(((Document) _mainSection_2), fsa, fileNames);
          }
        }
      }
    } catch (Exception e) { 
      RuntimeException _runtimeException = new RuntimeException(e);
      throw _runtimeException;
    }
  }
  
  public StringConcatenation generate(final Document doc, final IFileSystemAccess fsa, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      String _get = fileNames.get(doc);
      String _decode = URLDecoder.decode(_get);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("  ");
      TextOrMarkup _title = doc.getTitle();
      StringConcatenation _header = this.header(_title);
      _builder.append(_header, "  ");
      _builder.newLineIfNotEmpty();
      StringConcatenation _body = this.body(doc, fileNames);
      _builder.append(_body, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</html>");
      _builder.newLine();
      fsa.generateFile(_decode, _builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      List<? extends AbstractSection> _sections = this.ase.sections(doc);
      for (AbstractSection chapter : _sections) {
        {
          EList<Chapter> _chapters = doc.getChapters();
          int _indexOf = _chapters.indexOf(chapter);
          final int index = _indexOf;
          StringConcatenation _xifexpression = null;
          boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)index), ((Integer)0));
          if (_operator_greaterThan) {
            EList<Chapter> _chapters_1 = doc.getChapters();
            int _operator_minus = IntegerExtensions.operator_minus(((Integer)index), ((Integer)1));
            Chapter _get_1 = _chapters_1.get(_operator_minus);
            StringConcatenation _genPrevButton = this==null?(StringConcatenation)null:this.genPrevButton(_get_1, fileNames);
            _xifexpression = _genPrevButton;
          }
          final StringConcatenation prevS = _xifexpression;
          StringConcatenation _xifexpression_1 = null;
          EList<Chapter> _chapters_2 = doc.getChapters();
          int _size = _chapters_2.size();
          int _operator_minus_1 = IntegerExtensions.operator_minus(((Integer)_size), ((Integer)1));
          boolean _operator_lessThan = ComparableExtensions.<Integer>operator_lessThan(((Integer)index), ((Integer)_operator_minus_1));
          if (_operator_lessThan) {
            EList<Chapter> _chapters_3 = doc.getChapters();
            int _operator_plus = IntegerExtensions.operator_plus(((Integer)index), ((Integer)1));
            Chapter _get_2 = _chapters_3.get(_operator_plus);
            StringConcatenation _genNextButton = this==null?(StringConcatenation)null:this.genNextButton(_get_2, fileNames);
            _xifexpression_1 = _genNextButton;
          }
          final StringConcatenation nextS = _xifexpression_1;
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(prevS, "");
          _builder_2.append(nextS, "");
          this.generate(chapter, fsa, _builder_2, fileNames);
        }
      }
      StringConcatenation _builder_3 = new StringConcatenation();
      _xblockexpression = (_builder_3);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation genPrevButton(final AbstractSection as, final Map<AbstractSection,String> fileNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span class=\"prev_button\">");
    _builder.newLine();
    _builder.append("<a href=\"");
    String _get = fileNames.get(as);
    _builder.append(_get, "");
    _builder.append("\" >Previous</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("</span>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genNextButton(final AbstractSection as, final Map<AbstractSection,String> fileNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span class=\"next_button\">");
    _builder.newLine();
    _builder.append("<a href=\"");
    String _get = fileNames.get(as);
    _builder.append(_get, "");
    _builder.append("\" >Next</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("</span>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Chapter chap, final IFileSystemAccess fsa, final CharSequence buttons, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      String _get = fileNames.get(chap);
      String _decode = URLDecoder.decode(_get);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("  ");
      TextOrMarkup _title = chap.getTitle();
      StringConcatenation _header = this.header(_title);
      _builder.append(_header, "  ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      _builder.append("<div class=\"buttonbar\">");
      _builder.newLine();
      _builder.append(buttons, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("<div style=\"clear:both;\"></div>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("<");
      String _tag = this.tag(chap);
      _builder.append(_tag, "");
      _builder.append(">");
      TextOrMarkup _title_1 = chap.getTitle();
      StringConcatenation _genNonParText = this.genNonParText(_title_1, fileNames);
      _builder.append(_genNonParText, "");
      _builder.append("</");
      String _tag_1 = this.tag(chap);
      _builder.append(_tag_1, "");
      _builder.append(">");
      {
        String _name = chap.getName();
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
        if (_operator_notEquals) {
          _builder.newLineIfNotEmpty();
          _builder.append("<a name=\"");
          String _name_1 = chap.getName();
          _builder.append(_name_1, "");
          _builder.append("\"></a>");
        }
      }
      _builder.newLineIfNotEmpty();
      StringConcatenation _c = this.toc(chap, fileNames);
      _builder.append(_c, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<TextOrMarkup> _contents = chap.getContents();
        for(TextOrMarkup c : _contents) {
          CharSequence _genText = this.genText(c, fileNames);
          _builder.append(_genText, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("<div class=\"buttonbar\">");
      _builder.newLine();
      _builder.append(buttons, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("<div style=\"clear:both;\"></div>");
      _builder.newLine();
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      fsa.generateFile(_decode, _builder);
      List<? extends AbstractSection> _sections = this.ase.sections(chap);
      for (AbstractSection section : _sections) {
        {
          List<? extends AbstractSection> _sections_1 = this.ase.sections(chap);
          int _indexOf = _sections_1.indexOf(section);
          final int index = _indexOf;
          StringConcatenation _xifexpression = null;
          boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)index), ((Integer)0));
          if (_operator_greaterThan) {
            List<? extends AbstractSection> _sections_2 = this.ase.sections(chap);
            int _operator_minus = IntegerExtensions.operator_minus(((Integer)index), ((Integer)1));
            AbstractSection _get_1 = _sections_2.get(_operator_minus);
            StringConcatenation _genPrevButton = this==null?(StringConcatenation)null:this.genPrevButton(_get_1, fileNames);
            _xifexpression = _genPrevButton;
          }
          final StringConcatenation prevS = _xifexpression;
          StringConcatenation _xifexpression_1 = null;
          List<? extends AbstractSection> _sections_3 = this.ase.sections(chap);
          int _size = _sections_3.size();
          int _operator_minus_1 = IntegerExtensions.operator_minus(((Integer)_size), ((Integer)1));
          boolean _operator_lessThan = ComparableExtensions.<Integer>operator_lessThan(((Integer)index), ((Integer)_operator_minus_1));
          if (_operator_lessThan) {
            List<? extends AbstractSection> _sections_4 = this.ase.sections(chap);
            int _operator_plus = IntegerExtensions.operator_plus(((Integer)index), ((Integer)1));
            AbstractSection _get_2 = _sections_4.get(_operator_plus);
            StringConcatenation _genNextButton = this==null?(StringConcatenation)null:this.genNextButton(_get_2, fileNames);
            _xifexpression_1 = _genNextButton;
          }
          final StringConcatenation nextS = _xifexpression_1;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(prevS, "");
          _builder_1.append(nextS, "");
          this.generate(section, fsa, _builder_1, fileNames);
        }
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _xblockexpression = (_builder_2);
    }
    return _xblockexpression;
  }
  
  protected StringConcatenation _generate(final Section sec, final IFileSystemAccess fsa, final CharSequence buttons, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      String _get = fileNames.get(sec);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      TextOrMarkup _title = sec.getTitle();
      StringConcatenation _header = this.header(_title);
      _builder.append(_header, "");
      _builder.newLineIfNotEmpty();
      _builder.append("<body>");
      _builder.newLine();
      _builder.append("<div class=\"buttonbar\">");
      _builder.newLine();
      _builder.append(buttons, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("<div style=\"clear:both;\"></div>");
      _builder.newLine();
      _builder.newLine();
      String _labelName = this.naming.labelName(sec, fileNames);
      StringConcatenation _anchor = this.anchor(_labelName);
      _builder.append(_anchor, "");
      _builder.newLineIfNotEmpty();
      _builder.append("<");
      String _tag = this.tag(sec);
      _builder.append(_tag, "");
      _builder.append(">");
      TextOrMarkup _title_1 = sec.getTitle();
      StringConcatenation _genNonParText = this.genNonParText(_title_1, fileNames);
      _builder.append(_genNonParText, "");
      _builder.append("</");
      String _tag_1 = this.tag(sec);
      _builder.append(_tag_1, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      StringConcatenation _c = this.toc(sec, fileNames);
      _builder.append(_c, "");
      _builder.newLineIfNotEmpty();
      {
        EList<TextOrMarkup> _contents = sec.getContents();
        for(TextOrMarkup c : _contents) {
          CharSequence _genText = this.genText(c, fileNames);
          _builder.append(_genText, "");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        List<? extends AbstractSection> _sections = this.ase.sections(sec);
        for(AbstractSection sec2 : _sections) {
          StringConcatenation _generate = this.generate(sec2, fileNames);
          _builder.append(_generate, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("<div class=\"buttonbar\">");
      _builder.newLine();
      _builder.append(buttons, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("<div style=\"clear:both;\"></div>");
      _builder.newLine();
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      fsa.generateFile(_get, _builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _xblockexpression = (_builder_1);
    }
    return _xblockexpression;
  }
  
  public String tag(final AbstractSection as) {
    String _switchResult = null;
    final AbstractSection as_1 = as;
    boolean matched = false;
    if (!matched) {
      if (as_1 instanceof Document) {
        final Document as_2 = (Document) as_1;
        matched=true;
        _switchResult = "h1";
      }
    }
    if (!matched) {
      if (as_1 instanceof Chapter) {
        final Chapter as_3 = (Chapter) as_1;
        matched=true;
        _switchResult = "h1";
      }
    }
    if (!matched) {
      if (as_1 instanceof Section) {
        final Section as_4 = (Section) as_1;
        matched=true;
        _switchResult = "h1";
      }
    }
    if (!matched) {
      if (as_1 instanceof Section2) {
        final Section2 as_5 = (Section2) as_1;
        matched=true;
        _switchResult = "h2";
      }
    }
    if (!matched) {
      if (as_1 instanceof Section3) {
        final Section3 as_6 = (Section3) as_1;
        matched=true;
        _switchResult = "h3";
      }
    }
    if (!matched) {
      if (as_1 instanceof Section4) {
        final Section4 as_7 = (Section4) as_1;
        matched=true;
        _switchResult = "h4";
      }
    }
    return _switchResult;
  }
  
  protected StringConcatenation _generate(final Section2 sec, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    String _labelName = this.naming.labelName(sec, fileNames);
    StringConcatenation _anchor = this.anchor(_labelName);
    _builder.append(_anchor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    StringConcatenation _genNonParText = this.genNonParText(_title, fileNames);
    _builder.append(_genNonParText, "");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _genText = this.genText(c, fileNames);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(sec);
      for(AbstractSection sec3 : _sections) {
        StringConcatenation _generate = this.generate(sec3, fileNames);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Section3 sec, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    String _labelName = this.naming.labelName(sec, fileNames);
    StringConcatenation _anchor = this.anchor(_labelName);
    _builder.append(_anchor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    StringConcatenation _genNonParText = this.genNonParText(_title, fileNames);
    _builder.append(_genNonParText, "");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _genText = this.genText(c, fileNames);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _sections = this.ase.sections(sec);
      for(AbstractSection c_1 : _sections) {
        StringConcatenation _generate = this.generate(c_1, fileNames);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Section4 sec, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    String _labelName = this.naming.labelName(sec, fileNames);
    StringConcatenation _anchor = this.anchor(_labelName);
    _builder.append(_anchor, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    CharSequence _genText = this.genText(_title, fileNames);
    _builder.append(_genText, "");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _genText_1 = this.genText(c, fileNames);
        _builder.append(_genText_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation header(final TextOrMarkup title) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<META http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<title>");
    CharSequence _genPlainText = this.plaintext.genPlainText(title);
    _builder.append(_genPlainText, "  ");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<link href=\"book.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<link href=\"code.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation body(final Document doc, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<body>");
    _builder.newLine();
    StringConcatenation _genAuthors = this.genAuthors(doc, fileNames);
    _builder.append(_genAuthors, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _c = this.toc(doc, fileNames);
    _builder.append(_c, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</body>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation toc(final AbstractSection as, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xifexpression = null;
    List<? extends AbstractSection> _sections = this.ase.sections(as);
    boolean _isEmpty = _sections.isEmpty();
    boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
    if (_operator_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"toc\" >");
      _builder.newLine();
      _builder.append("  ");
      StringConcatenation _subToc = this.subToc(as, fileNames);
      _builder.append(_subToc, "  ");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public StringConcatenation subToc(final AbstractSection as, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      List<? extends AbstractSection> _sections = this.ase.sections(as);
      for(AbstractSection ss : _sections) {
        _builder.append("  ");
        StringConcatenation _cEntry = this.tocEntry(ss, fileNames);
        _builder.append(_cEntry, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _tocEntry(final Chapter chapter, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    String _get = fileNames.get(chapter);
    _builder.append(_get, "");
    _builder.append("\" >");
    TextOrMarkup _title = chapter.getTitle();
    StringConcatenation _genNonParText = this.genNonParText(_title, fileNames);
    _builder.append(_genNonParText, "");
    _builder.append("</a>");
    {
      List<? extends AbstractSection> _sections = this.ase.sections(chapter);
      boolean _isEmpty = _sections.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        _builder.newLineIfNotEmpty();
        StringConcatenation _subToc = this.subToc(chapter, fileNames);
        _builder.append(_subToc, "");
      }
    }
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _tocEntry(final AbstractSection section, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    String _get = fileNames.get(section);
    _builder.append(_get, "");
    _builder.append("\" >");
    TextOrMarkup _title = section.getTitle();
    StringConcatenation _genNonParText = this.genNonParText(_title, fileNames);
    _builder.append(_genNonParText, "");
    _builder.append("</a></li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation genAuthors(final Document doc, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xifexpression = null;
    TextOrMarkup _authors = doc.getAuthors();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_authors, null);
    if (_operator_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"authors\">");
      _builder.newLine();
      TextOrMarkup _authors_1 = doc.getAuthors();
      CharSequence _genText = this.genText(_authors_1, fileNames);
      _builder.append(_genText, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public StringConcatenation genNonParText(final TextOrMarkup tom, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject c : _contents) {
        CharSequence _genText = this.genText(c, fileNames);
        _builder.append(_genText, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _genText(final TextOrMarkup tom, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject c : _contents) {
        CharSequence _genText = this.genText(c, fileNames);
        _builder.append(_genText, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final CodeBlock cb, final Map<AbstractSection,String> fileNames) throws RuntimeException {
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
        StringConcatenation _generateCode = this.generateCode(((Code) _head), _language, fileNames);
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
              StringConcatenation _generateCode_1 = this.generateCode(code, _language_1, fileNames);
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
  
  protected CharSequence _genText(final CodeRef cRef, final Map<AbstractSection,String> fileNames) throws RuntimeException {
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
        StringConcatenation _genNonParText = this.genNonParText(_altText_2, fileNames);
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
        _builder.append("\" title=\"View JavaDoc\"><abbr title=\"");
        _builder.append(fqn, "");
        _builder.append("\" >");
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
  
  protected CharSequence _genText(final Emphasize em, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    EList<TextOrMarkup> _contents = em.getContents();
    StringConcatenation _generate = this.generate(_contents, fileNames);
    _builder.append(_generate, "");
    _builder.append("</em>");
    return _builder;
  }
  
  protected StringConcatenation _generate(final List<TextOrMarkup> tomList, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xifexpression = null;
    int _size = tomList.size();
    boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)_size), ((Integer)1));
    if (_operator_equals) {
      TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(tomList);
      StringConcatenation _genNonParText = this.genNonParText(_head, fileNames);
      _xifexpression = _genNonParText;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        for(TextOrMarkup tom : tomList) {
          CharSequence _genText = this.genText(tom, fileNames);
          _builder.append(_genText, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  protected StringConcatenation _generateCode(final Code code, final LangDef lang, final Map<AbstractSection,String> fileNames) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, lang, fileNames);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  protected StringConcatenation _generateCode(final Code code, final Void lang, final Map<AbstractSection,String> fileNames) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, null, fileNames);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  protected StringConcatenation _generateCode(final MarkupInCode mic, final LangDef lang, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genText = this.genText(mic, fileNames);
    _builder.append(_genText, "");
    return _builder;
  }
  
  protected CharSequence _genText(final TextPart tp, final Map<AbstractSection,String> fileNames) {
    String _text = tp.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    return _unescapeXdocChars;
  }
  
  protected CharSequence _genText(final Anchor a, final Map<AbstractSection,String> fileNames) {
    return null;
  }
  
  protected CharSequence _genText(final Ref ref, final Map<AbstractSection,String> fileNames) throws RuntimeException {
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
          Object _url = this.url(_ref_2, fileNames);
          _builder_1.append(_url, "");
          _builder_1.append("\" ");
          _builder_1.append(title, "");
          _builder_1.append(" >section ");
          Identifiable _ref_3 = ref.getRef();
          String _name = _ref_3.getName();
          _builder_1.append(_name, "");
          _builder_1.append("</a>");} else {
          _builder_1.append("<a href=\"");
          Identifiable _ref_4 = ref.getRef();
          Object _url_1 = this.url(_ref_4, fileNames);
          _builder_1.append(_url_1, "");
          _builder_1.append("\" ");
          _builder_1.append(title, "");
          _builder_1.append(">");
          {
            EList<TextOrMarkup> _contents_1 = ref.getContents();
            for(TextOrMarkup tom : _contents_1) {
              StringConcatenation _genNonParText = this.genNonParText(tom, fileNames);
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
  
  protected Object _url(final Anchor anchor, final Map<AbstractSection,String> fileNames) {
    URI _xblockexpression = null;
    {
      AbstractSection _containerOfType = EcoreUtil2.<AbstractSection>getContainerOfType(anchor, org.eclipse.xtext.xdoc.xdoc.AbstractSection.class);
      final AbstractSection section = _containerOfType;
      String _get = fileNames.get(section);
      final String fileName = _get;
      boolean _operator_equals = ObjectExtensions.operator_equals(fileName, null);
      if (_operator_equals) {
        return null;
      }
      URI _createURI = URI.createURI(fileName);
      final URI uri = _createURI;
      URI _trimFragment = uri.trimFragment();
      String _name = anchor.getName();
      String _operator_plus = StringExtensions.operator_plus("anchor-", _name);
      URI _appendFragment = _trimFragment.appendFragment(_operator_plus);
      final URI result = _appendFragment;
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  protected Object _url(final AbstractSection section, final Map<AbstractSection,String> fileNames) {
    String _get = fileNames.get(section);
    return _get;
  }
  
  protected CharSequence _genText(final Link link, final Map<AbstractSection,String> fileNames) {
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
  
  protected CharSequence _genText(final OrderedList ol, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      EList<Item> _items = ol.getItems();
      for(Item i : _items) {
        _builder.append("  ");
        CharSequence _genText = this.genText(i, fileNames);
        _builder.append(_genText, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final UnorderedList ol, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<Item> _items = ol.getItems();
      for(Item i : _items) {
        _builder.append("  ");
        CharSequence _genText = this.genText(i, fileNames);
        _builder.append(_genText, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final Item item, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    EList<TextOrMarkup> _contents = item.getContents();
    StringConcatenation _generate = this.generate(_contents, fileNames);
    _builder.append(_generate, "");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genText(final Table table, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table>");
    _builder.newLine();
    {
      EList<TableRow> _rows = table.getRows();
      for(TableRow tr : _rows) {
        _builder.append("  ");
        StringConcatenation _genRow = this.genRow(tr, fileNames);
        _builder.append(_genRow, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genRow(final TableRow tr, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<TableData> _data = tr.getData();
      for(TableData td : _data) {
        _builder.append("  ");
        StringConcatenation _genData = this.genData(td, fileNames);
        _builder.append(_genData, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</tr>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genData(final TableData td, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<td>");
    EList<TextOrMarkup> _contents = td.getContents();
    StringConcatenation _generate = this.generate(_contents, fileNames);
    _builder.append(_generate, "");
    _builder.append("</td>");
    return _builder;
  }
  
  protected CharSequence _genText(final ImageRef img, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    StringConcatenation _xblockexpression = null;
    {
      String _path = img.getPath();
      Resource _eResource = img.eResource();
      this.copy(_path, _eResource);
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
      _builder.append("", "");
      _builder.newLineIfNotEmpty();
      _builder.append("<img src=\"");
      String _path_1 = img.getPath();
      String _unescapeXdocChars = this.utils.unescapeXdocChars(_path_1);
      _builder.append(_unescapeXdocChars, "");
      _builder.append("\" ");
      {
        String _clazz = img.getClazz();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_clazz, null);
        if (_operator_notEquals_1) {
          _builder.append("class=\"");
          String _clazz_1 = img.getClazz();
          String _unescapeXdocChars_1 = this.utils.unescapeXdocChars(_clazz_1);
          _builder.append(_unescapeXdocChars_1, "");
          _builder.append("\" ");
        }
      }
      _builder.newLineIfNotEmpty();
      {
        boolean _operator_and = false;
        String _style = img.getStyle();
        boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_style, null);
        if (!_operator_notEquals_2) {
          _operator_and = false;
        } else {
          String _style_1 = img.getStyle();
          int _length = _style_1.length();
          boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)_length), ((Integer)0));
          boolean _operator_not = BooleanExtensions.operator_not(_operator_equals);
          _operator_and = BooleanExtensions.operator_and(_operator_notEquals_2, _operator_not);
        }
        if (_operator_and) {
          _builder.append(" style=\"");
          String _style_2 = img.getStyle();
          String _unescapeXdocChars_2 = this.utils.unescapeXdocChars(_style_2);
          _builder.append(_unescapeXdocChars_2, "");
          _builder.append("\" ");
        }
      }
      _builder.append("/>");
      _builder.newLineIfNotEmpty();
      _builder.append("<div class=\"caption\">");
      _builder.newLine();
      String _caption = img.getCaption();
      String _unescapeXdocChars_3 = this.utils.unescapeXdocChars(_caption);
      String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars_3);
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
  
  public Object copy(final String fromRelativeFileName, final Resource res) throws RuntimeException {
    Object _xtrycatchfinallyexpression = null;
    try {
      Object _xblockexpression = null;
      {
        int _operator_multiply = IntegerExtensions.operator_multiply(((Integer)16), ((Integer)1024));
        ByteBuffer _allocateDirect = ByteBuffer.allocateDirect(_operator_multiply);
        final ByteBuffer buffer = _allocateDirect;
        URI _uRI = res.getURI();
        final URI uri = _uRI;
        final String sepChar = File.separator;
        String relOutDirRoot = "";
        String inDir = "";
        Object _xifexpression = null;
        boolean _isPlatformResource = uri.isPlatformResource();
        if (_isPlatformResource) {
          {
            URI _trimSegments = uri.trimSegments(1);
            String _string = _trimSegments.toString();
            String _operator_plus = StringExtensions.operator_plus(_string, "/");
            String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, fromRelativeFileName);
            URI _createURI = URI.createURI(_operator_plus_1);
            final URI inPath = _createURI;
            URI _trimSegments_1 = uri.trimSegments(2);
            URI _appendSegment = _trimSegments_1.appendSegment("contents");
            String _string_1 = _appendSegment.toString();
            String _operator_plus_2 = StringExtensions.operator_plus(_string_1, "/");
            String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, fromRelativeFileName);
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
            int _operator_minus = IntegerExtensions.operator_minus(1);
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)_read), ((Integer)_operator_minus));
            Boolean _xwhileexpression = _operator_notEquals;
            while (_xwhileexpression) {
              {
                buffer.flip();
                outChannel.write(buffer);
                buffer.compact();
              }
              int _read_1 = inChannel.read(buffer);
              int _operator_minus_1 = IntegerExtensions.operator_minus(1);
              boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_read_1), ((Integer)_operator_minus_1));
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
        _xblockexpression = (_xifexpression);
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (Exception e) { 
      RuntimeException _runtimeException = new RuntimeException(e);
      throw _runtimeException;
    }
    return _xtrycatchfinallyexpression;
  }
  
  public StringConcatenation anchor(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    _builder.append(name, "");
    _builder.append("\" ></a>");
    return _builder;
  }
  
  public StringConcatenation generate(final AbstractSection chap, final IFileSystemAccess fsa, final CharSequence buttons, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    if ((chap instanceof Chapter)
         && (fsa instanceof IFileSystemAccess)
         && (buttons instanceof CharSequence)
         && (fileNames instanceof Map)) {
      return _generate((Chapter)chap, (IFileSystemAccess)fsa, (CharSequence)buttons, (Map<AbstractSection,String>)fileNames);
    } else if ((chap instanceof Section)
         && (fsa instanceof IFileSystemAccess)
         && (buttons instanceof CharSequence)
         && (fileNames instanceof Map)) {
      return _generate((Section)chap, (IFileSystemAccess)fsa, (CharSequence)buttons, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chap, fsa, buttons, fileNames).toString());
    }
  }
  
  public StringConcatenation generate(final Object sec, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    if ((sec instanceof Section2)
         && (fileNames instanceof Map)) {
      return _generate((Section2)sec, (Map<AbstractSection,String>)fileNames);
    } else if ((sec instanceof Section3)
         && (fileNames instanceof Map)) {
      return _generate((Section3)sec, (Map<AbstractSection,String>)fileNames);
    } else if ((sec instanceof Section4)
         && (fileNames instanceof Map)) {
      return _generate((Section4)sec, (Map<AbstractSection,String>)fileNames);
    } else if ((sec instanceof List)
         && (fileNames instanceof Map)) {
      return _generate((List<TextOrMarkup>)sec, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(sec, fileNames).toString());
    }
  }
  
  public StringConcatenation tocEntry(final AbstractSection chapter, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    if ((chapter instanceof Chapter)
         && (fileNames instanceof Map)) {
      return _tocEntry((Chapter)chapter, (Map<AbstractSection,String>)fileNames);
    } else if ((chapter instanceof AbstractSection)
         && (fileNames instanceof Map)) {
      return _tocEntry((AbstractSection)chapter, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chapter, fileNames).toString());
    }
  }
  
  public CharSequence genText(final EObject a, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    if ((a instanceof Anchor)
         && (fileNames instanceof Map)) {
      return _genText((Anchor)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof CodeBlock)
         && (fileNames instanceof Map)) {
      return _genText((CodeBlock)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof CodeRef)
         && (fileNames instanceof Map)) {
      return _genText((CodeRef)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof Emphasize)
         && (fileNames instanceof Map)) {
      return _genText((Emphasize)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof ImageRef)
         && (fileNames instanceof Map)) {
      return _genText((ImageRef)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof Link)
         && (fileNames instanceof Map)) {
      return _genText((Link)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof OrderedList)
         && (fileNames instanceof Map)) {
      return _genText((OrderedList)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof Ref)
         && (fileNames instanceof Map)) {
      return _genText((Ref)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof Table)
         && (fileNames instanceof Map)) {
      return _genText((Table)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof UnorderedList)
         && (fileNames instanceof Map)) {
      return _genText((UnorderedList)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof Item)
         && (fileNames instanceof Map)) {
      return _genText((Item)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof TextOrMarkup)
         && (fileNames instanceof Map)) {
      return _genText((TextOrMarkup)a, (Map<AbstractSection,String>)fileNames);
    } else if ((a instanceof TextPart)
         && (fileNames instanceof Map)) {
      return _genText((TextPart)a, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(a, fileNames).toString());
    }
  }
  
  public StringConcatenation generateCode(final EObject code, final Object lang, final Map<AbstractSection,String> fileNames) throws RuntimeException {
    if ((code instanceof Code)
         && (lang instanceof LangDef)
         && (fileNames instanceof Map)) {
      return _generateCode((Code)code, (LangDef)lang, (Map<AbstractSection,String>)fileNames);
    } else if ((code instanceof MarkupInCode)
         && (lang instanceof LangDef)
         && (fileNames instanceof Map)) {
      return _generateCode((MarkupInCode)code, (LangDef)lang, (Map<AbstractSection,String>)fileNames);
    } else if ((code instanceof Code)
         && (lang == null)
         && (fileNames instanceof Map)) {
      return _generateCode((Code)code, (Void)null, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(code, lang, fileNames).toString());
    }
  }
  
  public Object url(final Identifiable section, final Map<AbstractSection,String> fileNames) {
    if ((section instanceof AbstractSection)
         && (fileNames instanceof Map)) {
      return _url((AbstractSection)section, (Map<AbstractSection,String>)fileNames);
    } else if ((section instanceof Anchor)
         && (fileNames instanceof Map)) {
      return _url((Anchor)section, (Map<AbstractSection,String>)fileNames);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(section, fileNames).toString());
    }
  }
}