package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.XdocGenerator;
import org.eclipse.xtext.xdoc.generator.util.HTMLNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.StringUtils;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.MarkupInCode;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
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
  private XdocGenerator helpGen;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) throws RuntimeException {
    try {
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
      Iterable<XdocFile> _filter = IterableExtensions.<XdocFile>filter(_allContentsIterable, org.eclipse.xtext.xdoc.xdoc.XdocFile.class);
      for (XdocFile file : _filter) {
        AbstractSection _mainSection = file.getMainSection();
        if ((_mainSection instanceof org.eclipse.xtext.xdoc.xdoc.Document)) {
          AbstractSection _mainSection_1 = file.getMainSection();
          this.generate(_mainSection_1, fsa);
        }
      }
    } catch (Exception e) { 
      RuntimeException _runtimeException = new RuntimeException(e);
      throw _runtimeException;
    }
  }
  
  protected StringConcatenation _generate(final Document doc, final IFileSystemAccess fsa) throws UnsupportedEncodingException {
    StringConcatenation _xblockexpression = null;
    {
      String _fileName = this.naming.fileName(doc);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("  ");
      TextOrMarkup _title = doc.getTitle();
      StringConcatenation _header = this.header(_title);
      _builder.append(_header, "  ");
      _builder.newLineIfNotEmpty();
      StringConcatenation _body = this.body(doc);
      _builder.append(_body, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</html>");
      _builder.newLine();
      fsa.generateFile(_fileName, _builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _xblockexpression = (_builder_1);
    }
    return _xblockexpression;
  }
  
  protected StringConcatenation _generate(final Chapter chap, final IFileSystemAccess fsa) throws UnsupportedEncodingException {
    StringConcatenation _xblockexpression = null;
    {
      String _fileName = this.naming.fileName(chap);
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
      _builder.newLine();
      _builder.append("<");
      String _tag = this.tag(chap);
      _builder.append(_tag, "");
      _builder.append(">");
      TextOrMarkup _title_1 = chap.getTitle();
      StringConcatenation _genNonParText = this.genNonParText(_title_1);
      _builder.append(_genNonParText, "");
      _builder.append("</");
      String _tag_1 = this.tag(chap);
      _builder.append(_tag_1, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      StringConcatenation _c = this.toc(chap);
      _builder.append(_c, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<TextOrMarkup> _contents = chap.getContents();
        for(TextOrMarkup c : _contents) {
          CharSequence _genText = this.genText(c);
          _builder.append(_genText, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      fsa.generateFile(_fileName, _builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _xblockexpression = (_builder_1);
    }
    return _xblockexpression;
  }
  
  protected StringConcatenation _generate(final Section sec, final IFileSystemAccess fsa) {
    StringConcatenation _xblockexpression = null;
    {
      String _fileName = this.naming.fileName(sec);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<");
      String _tag = this.tag(sec);
      _builder.append(_tag, "");
      _builder.append(">");
      TextOrMarkup _title = sec.getTitle();
      StringConcatenation _genNonParText = this.genNonParText(_title);
      _builder.append(_genNonParText, "");
      _builder.append("</");
      String _tag_1 = this.tag(sec);
      _builder.append(_tag_1, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      {
        EList<TextOrMarkup> _contents = sec.getContents();
        for(TextOrMarkup c : _contents) {
        }
      }
      fsa.generateFile(_fileName, _builder);
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
  
  protected StringConcatenation _generate(final Section2 sec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    StringConcatenation _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Section3 sec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    String _tag = this.tag(sec);
    _builder.append(_tag, "");
    _builder.append(">");
    TextOrMarkup _title = sec.getTitle();
    StringConcatenation _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</");
    String _tag_1 = this.tag(sec);
    _builder.append(_tag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Section4 sec) {
    StringConcatenation _builder = new StringConcatenation();
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
      }
    }
    return _builder;
  }
  
  public StringConcatenation header(final TextOrMarkup title) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<title>");
    CharSequence _genPlainText = this.plaintext.genPlainText(title);
    _builder.append(_genPlainText, "  ");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation body(final Document doc) throws UnsupportedEncodingException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<body>");
    _builder.newLine();
    StringConcatenation _genAuthors = this.genAuthors(doc);
    _builder.append(_genAuthors, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _c = this.toc(doc);
    _builder.append(_c, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</body>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation toc(final AbstractSection as) throws UnsupportedEncodingException {
    StringConcatenation _xifexpression = null;
    List<? extends AbstractSection> _subSection = this.utils.subSection(as);
    boolean _isEmpty = _subSection.isEmpty();
    boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
    if (_operator_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div class=\"toc\" >");
      _builder.newLine();
      _builder.append("  ");
      StringConcatenation _subToc = this.subToc(as);
      _builder.append(_subToc, "  ");
      _builder.newLineIfNotEmpty();
      _builder.append("</div>");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public StringConcatenation subToc(final AbstractSection as) throws UnsupportedEncodingException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      List<? extends AbstractSection> _subSection = this.utils.subSection(as);
      for(AbstractSection ss : _subSection) {
        _builder.append("  ");
        StringConcatenation _cEntry = this.tocEntry(ss);
        _builder.append(_cEntry, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _tocEntry(final Chapter chapter) throws UnsupportedEncodingException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    String _fileName = this.naming.fileName(chapter);
    String _urlEncode = this.utils.urlEncode(_fileName);
    _builder.append(_urlEncode, "");
    _builder.append("\" >");
    TextOrMarkup _title = chapter.getTitle();
    StringConcatenation _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</a>");
    {
      List<? extends AbstractSection> _subSection = this.utils.subSection(chapter);
      boolean _isEmpty = _subSection.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        _builder.newLineIfNotEmpty();
        StringConcatenation _subToc = this.subToc(chapter);
        _builder.append(_subToc, "");
      }
    }
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _tocEntry(final Section section) throws UnsupportedEncodingException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li><a href=\"");
    String _fileName = this.naming.fileName(section);
    String _urlEncode = this.utils.urlEncode(_fileName);
    _builder.append(_urlEncode, "");
    _builder.append("\" >");
    TextOrMarkup _title = section.getTitle();
    StringConcatenation _genNonParText = this.genNonParText(_title);
    _builder.append(_genNonParText, "");
    _builder.append("</a></li>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation genAuthors(final Document doc) {
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
  
  public StringConcatenation genNonParText(final TextOrMarkup tom) {
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
  
  protected CharSequence _genText(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject c : _contents) {
        _builder.append("<p>");
        _builder.newLine();
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genText(final CodeBlock cb) {
    StringConcatenation _xifexpression = null;
    boolean _isInlineCode = this.utils.isInlineCode(cb);
    if (_isInlineCode) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<span class=\"inlinecode\">");
      EList<EObject> _contents = cb.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      LangDef _language = cb.getLanguage();
      StringConcatenation _generateCode = this.generateCode(((Code) _head), _language);
      _builder.append(_generateCode, "");
      _builder.append("</span>");
      _xifexpression = _builder;
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
          EList<EObject> _contents_1 = block.getContents();
          for(EObject code : _contents_1) {
            LangDef _language_1 = cb.getLanguage();
            StringConcatenation _generateCode_1 = this.generateCode(code, _language_1);
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
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  protected StringConcatenation _generateCode(final Code code, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, lang);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  protected StringConcatenation _generateCode(final Code code, final Void lang) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, null);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  protected StringConcatenation _generateCode(final MarkupInCode mic, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genText = this.genText(mic);
    _builder.append(_genText, "");
    return _builder;
  }
  
  protected CharSequence _genText(final TextPart tp) {
    String _text = tp.getText();
    return _text;
  }
  
  public StringConcatenation generate(final AbstractSection chap, final IFileSystemAccess fsa) throws UnsupportedEncodingException {
    if ((chap instanceof Chapter)
         && (fsa instanceof IFileSystemAccess)) {
      return _generate((Chapter)chap, (IFileSystemAccess)fsa);
    } else if ((chap instanceof Document)
         && (fsa instanceof IFileSystemAccess)) {
      return _generate((Document)chap, (IFileSystemAccess)fsa);
    } else if ((chap instanceof Section)
         && (fsa instanceof IFileSystemAccess)) {
      return _generate((Section)chap, (IFileSystemAccess)fsa);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public StringConcatenation generate(final AbstractSection sec) {
    if ((sec instanceof Section2)) {
      return _generate((Section2)sec);
    } else if ((sec instanceof Section3)) {
      return _generate((Section3)sec);
    } else if ((sec instanceof Section4)) {
      return _generate((Section4)sec);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public StringConcatenation tocEntry(final AbstractSection chapter) throws UnsupportedEncodingException {
    if ((chapter instanceof Chapter)) {
      return _tocEntry((Chapter)chapter);
    } else if ((chapter instanceof Section)) {
      return _tocEntry((Section)chapter);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public CharSequence genText(final EObject cb) {
    if ((cb instanceof CodeBlock)) {
      return _genText((CodeBlock)cb);
    } else if ((cb instanceof TextOrMarkup)) {
      return _genText((TextOrMarkup)cb);
    } else if ((cb instanceof TextPart)) {
      return _genText((TextPart)cb);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public StringConcatenation generateCode(final EObject code, final Object lang) {
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
      throw new IllegalArgumentException();
    }
  }
}