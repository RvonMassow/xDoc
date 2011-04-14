package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.io.UnsupportedEncodingException;
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
import org.eclipse.xtext.xdoc.generator.XdocGenerator;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.GlossaryExtensions;
import org.eclipse.xtext.xdoc.generator.util.StringUtils;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.images.ImageProxy;
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
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XdocGenerator implements IGenerator {
  @Inject private Utils utils;
  @Inject private GlossaryExtensions glossaryExtensions;
  @Inject private EclipseNamingExtensions eclipseNamingExtensions;
  @Inject private TocGenerator tocGenerator;
  @Inject private PlainText plainText;
  
  public void doGenerate(final Resource res, final IFileSystemAccess access) throws RuntimeException {
    try {
      EList<EObject> _contents = res.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      AbstractSection _mainSection = ((org.eclipse.xtext.xdoc.xdoc.XdocFile) _head)==null?(AbstractSection)null:((org.eclipse.xtext.xdoc.xdoc.XdocFile) _head).getMainSection();
      this.generate(_mainSection, access);
    } catch (UnsupportedEncodingException e) { 
      RuntimeException _runtimeException = new RuntimeException(e);
      throw _runtimeException;
    }
  }
  
  public void _generate(final Document document, final IFileSystemAccess access) throws UnsupportedEncodingException {
    {
      StringConcatenation _generateToc = this.tocGenerator.generateToc(document);
      access.generateFile("toc.xml", _generateToc);
      EList<Chapter> _chapters = document.getChapters();
      for (Chapter c : _chapters) {
        final Chapter typeConverted_c = (Chapter)c;
        this.generate(typeConverted_c, access);
      }
    }
  }
  
  public void _generate(final Chapter chapter, final IFileSystemAccess access) {
    final Chapter typeConverted_chapter = (Chapter)chapter;
    String _fileName = this.eclipseNamingExtensions.fileName(typeConverted_chapter);
    final Chapter typeConverted_chapter_1 = (Chapter)chapter;
    CharSequence _generate = this.generate(typeConverted_chapter_1);
    access.generateFile(_fileName, _generate);
  }
  
  public CharSequence _generate(final Chapter aS) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<title>");
    final Chapter typeConverted_aS = (Chapter)aS;
    TextOrMarkup _title = typeConverted_aS.getTitle();
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
    _builder.append("<");
    final Chapter typeConverted_aS_1 = (Chapter)aS;
    String _headtag = this.headtag(typeConverted_aS_1);
    _builder.append(_headtag, "");
    _builder.append(">");
    final Chapter typeConverted_aS_2 = (Chapter)aS;
    TextOrMarkup _title_1 = typeConverted_aS_2.getTitle();
    CharSequence _genPlainText_1 = this.plainText.genPlainText(_title_1);
    _builder.append(_genPlainText_1, "");
    _builder.append("</");
    final Chapter typeConverted_aS_3 = (Chapter)aS;
    String _headtag_1 = this.headtag(typeConverted_aS_3);
    _builder.append(_headtag_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      final Chapter typeConverted_aS_4 = (Chapter)aS;
      EList<TextOrMarkup> _contents = typeConverted_aS_4.getContents();
      for(TextOrMarkup content : _contents) {
        StringConcatenation _generatePar = this.generatePar(content);
        _builder.append(_generatePar, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Chapter typeConverted_aS_5 = (Chapter)aS;
      Iterable<? extends AbstractSection> _subSection = this.utils.subSection(typeConverted_aS_5);
      for(AbstractSection ss : _subSection) {
        final AbstractSection typeConverted_ss = (AbstractSection)ss;
        CharSequence _generate = this.generate(typeConverted_ss);
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
        _switchResult = "h2";
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
  
  public CharSequence _generate(final AbstractSection aS) {
    StringConcatenation _builder = new StringConcatenation();
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
      Iterable<? extends AbstractSection> _subSection = this.utils.subSection(aS);
      for(AbstractSection ss : _subSection) {
        final AbstractSection typeConverted_ss = (AbstractSection)ss;
        CharSequence _generate = this.generate(typeConverted_ss);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence _generate(final Section4 aS) {
    StringConcatenation _builder = new StringConcatenation();
    final Section4 typeConverted_aS = (Section4)aS;
    TextOrMarkup _title = typeConverted_aS.getTitle();
    StringConcatenation _genNonParContent = this.genNonParContent(_title);
    _builder.append(_genNonParContent, "");
    _builder.newLineIfNotEmpty();
    {
      final Section4 typeConverted_aS_1 = (Section4)aS;
      EList<TextOrMarkup> _contents = typeConverted_aS_1.getContents();
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
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence _generate(final Ref ref) {
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
  
  public CharSequence _generate(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject obj : _contents) {
        CharSequence _generate = this.generate(obj);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence _generate(final UnorderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<Item> _items = ul.getItems();
      for(Item i : _items) {
        _builder.append("\t");
        final Item typeConverted_i = (Item)i;
        CharSequence _generate = this.generate(typeConverted_i);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence _generate(final OrderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      EList<Item> _items = ul.getItems();
      for(Item i : _items) {
        _builder.append("\t");
        final Item typeConverted_i = (Item)i;
        CharSequence _generate = this.generate(typeConverted_i);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence _generate(final Item i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = i.getContents();
      for(TextOrMarkup tom : _contents) {
        _builder.append("\t");
        final TextOrMarkup typeConverted_tom = (TextOrMarkup)tom;
        CharSequence _generate = this.generate(typeConverted_tom);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence _generate(final Anchor a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a name=\"");
    final Anchor typeConverted_a = (Anchor)a;
    String _name = typeConverted_a.getName();
    _builder.append(_name, "");
    _builder.append("\"></a>");
    return _builder;
  }
  
  public CharSequence _generate(final ImageRef img) {
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
    ImageProxy _image = img.getImage();
    String _name_2 = _image.getName();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_name_2);
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
        boolean _operator_equals = ObjectExtensions.operator_equals(((Object)_length), ((Object)0));
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
      final XdocGenerator typeConverted_this = (XdocGenerator)this;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(typeConverted_this, null);
      if (_operator_notEquals) {
        _builder.append("<a name=\"");
        _builder.append(name, "");
        _builder.append("\"></a>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence _generate(final TextPart tp) {
    String _text = tp.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
    return _escapeHTMLChars;
  }
  
  public CharSequence _generate(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TableRow> _rows = table.getRows();
      for(TableRow tr : _rows) {
        final TableRow typeConverted_tr = (TableRow)tr;
        CharSequence _generate = this.generate(typeConverted_tr);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence _generate(final TableRow tr) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TableData> _data = tr.getData();
      for(TableData td : _data) {
        final TableData typeConverted_td = (TableData)td;
        CharSequence _generate = this.generate(typeConverted_td);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence _generate(final TableData td) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = td.getContents();
      for(TextOrMarkup c : _contents) {
        final TextOrMarkup typeConverted_c = (TextOrMarkup)c;
        CharSequence _generate = this.generate(typeConverted_c);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence _generate(final Emphasize em) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    {
      EList<TextOrMarkup> _contents = em.getContents();
      for(TextOrMarkup c : _contents) {
        final TextOrMarkup typeConverted_c = (TextOrMarkup)c;
        CharSequence _generate = this.generate(typeConverted_c);
        _builder.append(_generate, "");
      }
    }
    _builder.append("</em>");
    return _builder;
  }
  
  public CharSequence _generate(final Link link) {
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
  
  public CharSequence _generate(final CodeRef cRef) {
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
  
  public CharSequence _generate(final CodeBlock cb) {
    StringConcatenation _xifexpression = null;
    boolean _isInlineCode = this.utils.isInlineCode(cb);
    if (_isInlineCode) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<span class=\"inlinecode\">");
      EList<EObject> _contents = cb.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      LangDef _language = cb.getLanguage();
      StringConcatenation _generateCode = this.generateCode(((org.eclipse.xtext.xdoc.xdoc.Code) _head), _language);
      _builder.append(_generateCode, "");
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
  
  public StringConcatenation _generateCode(final Code code, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, lang);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  public StringConcatenation _generateCode(final MarkupInCode code, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    final MarkupInCode typeConverted_code = (MarkupInCode)code;
    CharSequence _generate = this.generate(typeConverted_code);
    _builder.append(_generate, "");
    return _builder;
  }
  
  public StringConcatenation _generateCode(final Code code, final Void v) {
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
        _builder.newLineIfNotEmpty();
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