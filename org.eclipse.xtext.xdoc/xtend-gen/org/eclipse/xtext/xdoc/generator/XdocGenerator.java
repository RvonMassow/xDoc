package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.TocGenerator;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.GlossaryExtensions;
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
import org.eclipse.xtext.xdoc.xdoc.Todo;
import org.eclipse.xtext.xdoc.xdoc.UnorderedList;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XdocGenerator implements IGenerator {
  
  @Inject
  private Utils utils;
  
  @Inject
  private GlossaryExtensions glossaryExtensions;
  
  @Inject
  private EclipseNamingExtensions eclipseNamingExtensions;
  
  @Inject
  private TocGenerator tocGenerator;
  
  @Inject
  private PlainText plainText;
  
  public void doGenerate(final Resource res, final IFileSystemAccess access) throws RuntimeException {
    try {
      {
        EList<EObject> _contents = res.getContents();
        EObject _head = IterableExtensions.<EObject>head(_contents);
        AbstractSection _mainSection = ((XdocFile) _head)==null?(AbstractSection)null:((XdocFile) _head).getMainSection();
        final AbstractSection aS = _mainSection;
        if ((aS instanceof org.eclipse.xtext.xdoc.xdoc.Document)) {
          this.generate(aS, access);
        }
      }
    } catch (UnsupportedEncodingException e) { 
      RuntimeException _runtimeException = new RuntimeException(e);
      throw _runtimeException;
    }
  }
  
  protected void _generate(final Document document, final IFileSystemAccess access) throws UnsupportedEncodingException {
    {
      StringConcatenation _generateToc = this.tocGenerator.generateToc(document);
      access.generateFile("toc.xml", _generateToc);
      EList<Chapter> _chapters = document.getChapters();
      for (Chapter c : _chapters) {
        this.generate(c, access);
      }
    }
  }
  
  protected void _generate(final Chapter chapter, final IFileSystemAccess access) {
    String _fileName = this.eclipseNamingExtensions.fileName(chapter);
    String _decode = URLDecoder.decode(_fileName);
    CharSequence _generate = this.generate(chapter);
    access.generateFile(_decode, _generate);
  }
  
  protected CharSequence _generate(final Chapter aS) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" >");
    _builder.newLine();
    _builder.append("<title>");
    TextOrMarkup _title = aS.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<link href=\"book.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("<link href=\"code.css\" rel=\"stylesheet\" type=\"text/css\">");
    _builder.newLine();
    _builder.append("<link rel=\"home\" href=\"index.html\" title=\"\">");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<a name=\"");
    String _labelName = this.eclipseNamingExtensions.labelName(aS);
    _builder.append(_labelName, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _headtag = this.headtag(aS);
    _builder.append(_headtag, "");
    _builder.append(">");
    TextOrMarkup _title_1 = aS.getTitle();
    CharSequence _genPlainText_1 = this.plainText.genPlainText(_title_1);
    _builder.append(_genPlainText_1, "");
    _builder.append("</");
    String _headtag_1 = this.headtag(aS);
    _builder.append(_headtag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = aS.getContents();
      for(TextOrMarkup content : _contents) {
        StringConcatenation _generatePar = this.generatePar(content);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _subSection = this.utils.subSection(aS);
      for(AbstractSection ss : _subSection) {
        CharSequence _generate = this.generate(ss);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public String headtag(final AbstractSection section) {
    String _switchResult = null;
    final AbstractSection section_1 = section;
    boolean matched = false;
    if (!matched) {
      if (section_1 instanceof Chapter) {
        final Chapter section_2 = (Chapter) section_1;
        matched=true;
        _switchResult = "h1";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section) {
        final Section section_3 = (Section) section_1;
        matched=true;
        _switchResult = "h2";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section2) {
        final Section2 section_4 = (Section2) section_1;
        matched=true;
        _switchResult = "h3";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section3) {
        final Section3 section_5 = (Section3) section_1;
        matched=true;
        _switchResult = "h4";
      }
    }
    if (!matched) {
      if (section_1 instanceof Section4) {
        final Section4 section_6 = (Section4) section_1;
        matched=true;
        _switchResult = "h5";
      }
    }
    if (!matched) {
      _switchResult = "h1";
    }
    return _switchResult;
  }
  
  protected CharSequence _generate(final AbstractSection aS) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    String _labelName = this.eclipseNamingExtensions.labelName(aS);
    _builder.append(_labelName, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    String _headtag = this.headtag(aS);
    _builder.append(_headtag, "");
    _builder.append(">");
    TextOrMarkup _title = aS.getTitle();
    CharSequence _genPlainText = this.plainText.genPlainText(_title);
    _builder.append(_genPlainText, "");
    _builder.append("</");
    String _headtag_1 = this.headtag(aS);
    _builder.append(_headtag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = aS.getContents();
      for(TextOrMarkup c : _contents) {
        StringConcatenation _generatePar = this.generatePar(c);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<? extends AbstractSection> _subSection = this.utils.subSection(aS);
      for(AbstractSection ss : _subSection) {
        CharSequence _generate = this.generate(ss);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Section4 aS) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    String _labelName = this.eclipseNamingExtensions.labelName(aS);
    _builder.append(_labelName, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<h5>");
    TextOrMarkup _title = aS.getTitle();
    StringConcatenation _genNonParContent = this.genNonParContent(_title);
    _builder.append(_genNonParContent, "");
    _builder.append("</h5>");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = aS.getContents();
      for(TextOrMarkup tom : _contents) {
        StringConcatenation _generatePar = this.generatePar(tom);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generatePar(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject c : _contents) {
        CharSequence _generate = this.generate(c);
        _builder.append(_generate, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Todo todo) {
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
  
  protected CharSequence _generate(final Ref ref) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = ref.getContents();
      boolean _isEmpty = _contents.isEmpty();
      if (_isEmpty) {
        _builder.append("<a href=\"");
        Identifiable _ref = ref.getRef();
        String _fileName = this.eclipseNamingExtensions.fileName(_ref);
        _builder.append(_fileName, "");
        _builder.append("#");
        Identifiable _ref_1 = ref.getRef();
        String _name = _ref_1.getName();
        _builder.append(_name, "");
        _builder.append("\">section ");
        Identifiable _ref_2 = ref.getRef();
        String _name_1 = _ref_2.getName();
        _builder.append(_name_1, "");
        _builder.append("</a>");
        _builder.newLineIfNotEmpty();} else {
        _builder.append("<a href=\"");
        Identifiable _ref_3 = ref.getRef();
        String _fileName_1 = this.eclipseNamingExtensions.fileName(_ref_3);
        _builder.append(_fileName_1, "");
        _builder.append("#");
        Identifiable _ref_4 = ref.getRef();
        String _name_2 = _ref_4.getName();
        _builder.append(_name_2, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        {
          EList<TextOrMarkup> _contents_1 = ref.getContents();
          for(TextOrMarkup tom : _contents_1) {
            StringConcatenation _genNonParContent = this.genNonParContent(tom);
            _builder.append(_genNonParContent, "");
            _builder.append("</a>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject obj : _contents) {
        CharSequence _generate = this.generate(obj);
        _builder.append(_generate, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final UnorderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<Item> _items = ul.getItems();
      for(Item i : _items) {
        _builder.append("\t");
        CharSequence _generate = this.generate(i);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final OrderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      EList<Item> _items = ul.getItems();
      for(Item i : _items) {
        _builder.append("\t");
        CharSequence _generate = this.generate(i);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Item i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = i.getContents();
      for(TextOrMarkup tom : _contents) {
        _builder.append("\t");
        CharSequence _generate = this.generate(tom);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Anchor a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("\"></a>");
    return _builder;
  }
  
  protected CharSequence _generate(final ImageRef img) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"image\" >");
    _builder.newLine();
    {
      String _name = img.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        String _name_1 = img.getName();
        StringConcatenation _genLabel = this.genLabel(_name_1);
        _builder.append(_genLabel, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("", "");
    _builder.newLineIfNotEmpty();
    _builder.append("<img src=\"");
    String _path = img.getPath();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_path);
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
    String _caption = img.getCaption();
    String _unescapeXdocChars_3 = this.utils.unescapeXdocChars(_caption);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars_3);
    _builder.append(_escapeHTMLChars, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation genLabel(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(this, null);
      if (_operator_notEquals) {
        _builder.append("<a name=\"");
        _builder.append(name, "");
        _builder.append("\"></a>");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final TextPart tp) {
    String _text = tp.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
    return _escapeHTMLChars;
  }
  
  protected CharSequence _generate(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table>");
    _builder.newLine();
    {
      EList<TableRow> _rows = table.getRows();
      for(TableRow tr : _rows) {
        CharSequence _generate = this.generate(tr);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final TableRow tr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<TableData> _data = tr.getData();
      for(TableData td : _data) {
        CharSequence _generate = this.generate(td);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</tr>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final TableData td) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<td>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = td.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _generate = this.generate(c);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</td>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Emphasize em) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    {
      EList<TextOrMarkup> _contents = em.getContents();
      for(TextOrMarkup c : _contents) {
        CharSequence _generate = this.generate(c);
        _builder.append(_generate, "");
      }
    }
    _builder.append("</em>");
    return _builder;
  }
  
  protected CharSequence _generate(final Link link) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    String _url = link.getUrl();
    _builder.append(_url, "");
    _builder.append("\">");
    String _text = link.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
    _builder.append(_escapeHTMLChars, "");
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _generate(final CodeRef cRef) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    JvmDeclaredType _element = cRef.getElement();
    String _qualifiedName = _element.getQualifiedName();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_qualifiedName);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
    _builder.append(_escapeHTMLChars, "");
    _builder.append("</em>");
    return _builder;
  }
  
  protected CharSequence _generate(final CodeBlock cb) {
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
  
  protected StringConcatenation _generateCode(final MarkupInCode code, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generate = this.generate(code);
    _builder.append(_generate, "");
    return _builder;
  }
  
  protected StringConcatenation _generateCode(final Code code, final Void v) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, null);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  public StringConcatenation genNonParContent(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject obj : _contents) {
        CharSequence _generate = this.generate(obj);
        _builder.append(_generate, "");
      }
    }
    return _builder;
  }
  
  public void generate(final AbstractSection chapter, final IFileSystemAccess access) throws UnsupportedEncodingException {
    if ((chapter instanceof Chapter)
         && (access instanceof IFileSystemAccess)) {
      _generate((Chapter)chapter, (IFileSystemAccess)access);
    } else if ((chapter instanceof Document)
         && (access instanceof IFileSystemAccess)) {
      _generate((Document)chapter, (IFileSystemAccess)access);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public CharSequence generate(final EObject aS) {
    if ((aS instanceof Chapter)) {
      return _generate((Chapter)aS);
    } else if ((aS instanceof Section4)) {
      return _generate((Section4)aS);
    } else if ((aS instanceof AbstractSection)) {
      return _generate((AbstractSection)aS);
    } else if ((aS instanceof Anchor)) {
      return _generate((Anchor)aS);
    } else if ((aS instanceof CodeBlock)) {
      return _generate((CodeBlock)aS);
    } else if ((aS instanceof CodeRef)) {
      return _generate((CodeRef)aS);
    } else if ((aS instanceof Emphasize)) {
      return _generate((Emphasize)aS);
    } else if ((aS instanceof ImageRef)) {
      return _generate((ImageRef)aS);
    } else if ((aS instanceof Link)) {
      return _generate((Link)aS);
    } else if ((aS instanceof OrderedList)) {
      return _generate((OrderedList)aS);
    } else if ((aS instanceof Ref)) {
      return _generate((Ref)aS);
    } else if ((aS instanceof Table)) {
      return _generate((Table)aS);
    } else if ((aS instanceof Todo)) {
      return _generate((Todo)aS);
    } else if ((aS instanceof UnorderedList)) {
      return _generate((UnorderedList)aS);
    } else if ((aS instanceof Item)) {
      return _generate((Item)aS);
    } else if ((aS instanceof TableData)) {
      return _generate((TableData)aS);
    } else if ((aS instanceof TableRow)) {
      return _generate((TableRow)aS);
    } else if ((aS instanceof TextOrMarkup)) {
      return _generate((TextOrMarkup)aS);
    } else if ((aS instanceof TextPart)) {
      return _generate((TextPart)aS);
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