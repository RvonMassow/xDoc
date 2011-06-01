package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.util.Utils;
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
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HtmlGenerator implements IGenerator {
  
  @Inject
  private Utils utils;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    for (EObject element : _allContentsIterable) {
      if ((element instanceof org.eclipse.xtext.xdoc.xdoc.Document)) {
        {
          final Document doc = ((Document) element);
          Resource _eResource = doc.eResource();
          URI _uRI = _eResource.getURI();
          String _lastSegment = _uRI.lastSegment();
          String _operator_plus = StringExtensions.operator_plus(_lastSegment, ".hmtl");
          StringConcatenation _generate = this.generate(doc);
          fsa.generateFile(_operator_plus, _generate);
        }
      }
    }
  }
  
  public StringConcatenation doGenerate(final EObject obj, final IFileSystemAccess fsa) {
    StringConcatenation _xblockexpression = null;
    {
      if ((obj instanceof org.eclipse.xtext.xdoc.xdoc.Document)) {
        {
          final Document doc = ((Document) obj);
          Resource _eResource = doc.eResource();
          URI _uRI = _eResource.getURI();
          String _lastSegment = _uRI.lastSegment();
          String _operator_plus = StringExtensions.operator_plus(_lastSegment, ".html");
          StringConcatenation _generate = this.generate(doc);
          fsa.generateFile(_operator_plus, _generate);
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected StringConcatenation _generate(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>");
    TextOrMarkup _title = doc.getTitle();
    StringConcatenation _generate = this.generate(_title);
    _builder.append(_generate, "	");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h1>");
    TextOrMarkup _title_1 = doc.getTitle();
    StringConcatenation _generate_1 = this.generate(_title_1);
    _builder.append(_generate_1, "		");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    EList<Chapter> _chapters = doc.getChapters();
    final Function1<Chapter,StringConcatenation> _function = new Function1<Chapter,StringConcatenation>() {
        public StringConcatenation apply(final Chapter e) {
          StringConcatenation _generate_2 = HtmlGenerator.this.generate(e);
          return _generate_2;
        }
      };
    List<StringConcatenation> _map = ListExtensions.<Chapter, StringConcatenation>map(_chapters, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Chapter chap) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h2>");
    TextOrMarkup _title = chap.getTitle();
    StringConcatenation _generate = this.generate(_title);
    _builder.append(_generate, "");
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    String _name = chap.getName();
    StringConcatenation _genLabel = this.genLabel(_name);
    _builder.append(_genLabel, "");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = chap.getContents();
      for(TextOrMarkup c : _contents) {
        _builder.append("<p>");
        _builder.newLine();
        _builder.append("\t");
        StringConcatenation _generate_1 = this.generate(c);
        _builder.append(_generate_1, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    EList<Section> _subSections = chap.getSubSections();
    final Function1<Section,StringConcatenation> _function = new Function1<Section,StringConcatenation>() {
        public StringConcatenation apply(final Section e) {
          StringConcatenation _generate_2 = HtmlGenerator.this.generate(e);
          return _generate_2;
        }
      };
    List<StringConcatenation> _map = ListExtensions.<Section, StringConcatenation>map(_subSections, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Section sec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h3>");
    TextOrMarkup _title = sec.getTitle();
    StringConcatenation _generate = this.generate(_title);
    _builder.append(_generate, "");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    String _name = sec.getName();
    StringConcatenation _genLabel = this.genLabel(_name);
    _builder.append(_genLabel, "");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        _builder.append("<p>");
        _builder.newLine();
        _builder.append("\t");
        StringConcatenation _generate_1 = this.generate(c);
        _builder.append(_generate_1, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    EList<Section2> _subSections = sec.getSubSections();
    final Function1<Section2,StringConcatenation> _function = new Function1<Section2,StringConcatenation>() {
        public StringConcatenation apply(final Section2 e) {
          StringConcatenation _generate_2 = HtmlGenerator.this.generate(e);
          return _generate_2;
        }
      };
    List<StringConcatenation> _map = ListExtensions.<Section2, StringConcatenation>map(_subSections, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Section2 sec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h4>");
    TextOrMarkup _title = sec.getTitle();
    StringConcatenation _generate = this.generate(_title);
    _builder.append(_generate, "");
    _builder.append("</h4>");
    _builder.newLineIfNotEmpty();
    String _name = sec.getName();
    StringConcatenation _genLabel = this.genLabel(_name);
    _builder.append(_genLabel, "");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        _builder.append("<p>");
        _builder.newLine();
        _builder.append("\t");
        StringConcatenation _generate_1 = this.generate(c);
        _builder.append(_generate_1, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    EList<Section3> _subSections = sec.getSubSections();
    final Function1<Section3,StringConcatenation> _function = new Function1<Section3,StringConcatenation>() {
        public StringConcatenation apply(final Section3 e) {
          StringConcatenation _generate_2 = HtmlGenerator.this.generate(e);
          return _generate_2;
        }
      };
    List<StringConcatenation> _map = ListExtensions.<Section3, StringConcatenation>map(_subSections, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Section3 sec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h5>");
    TextOrMarkup _title = sec.getTitle();
    StringConcatenation _generate = this.generate(_title);
    _builder.append(_generate, "");
    _builder.append("</h5>");
    _builder.newLineIfNotEmpty();
    String _name = sec.getName();
    StringConcatenation _genLabel = this.genLabel(_name);
    _builder.append(_genLabel, "");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        _builder.append("<p>");
        _builder.newLine();
        _builder.append("\t");
        StringConcatenation _generate_1 = this.generate(c);
        _builder.append(_generate_1, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    EList<Section4> _subSections = sec.getSubSections();
    final Function1<Section4,StringConcatenation> _function = new Function1<Section4,StringConcatenation>() {
        public StringConcatenation apply(final Section4 e) {
          StringConcatenation _generate_2 = HtmlGenerator.this.generate(e);
          return _generate_2;
        }
      };
    List<StringConcatenation> _map = ListExtensions.<Section4, StringConcatenation>map(_subSections, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Section4 sec) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(TextOrMarkup c : _contents) {
        _builder.append("<p>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<b>");
        TextOrMarkup _title = sec.getTitle();
        StringConcatenation _generate = this.generate(_title);
        _builder.append(_generate, "	");
        _builder.append("<b> < br />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name = sec.getName();
        StringConcatenation _genLabel = this.genLabel(_name);
        _builder.append(_genLabel, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        StringConcatenation _generate_1 = this.generate(c);
        _builder.append(_generate_1, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject c : _contents) {
        CharSequence _genText = this.genText(c);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation genLabel(final String s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(s, null);
      if (_operator_notEquals) {
        _builder.append("<a name=\"");
        _builder.append(s, "");
        _builder.append("\"\"></a>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genText(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _genText(final Table tab) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table>");
    _builder.newLine();
    {
      EList<TableRow> _rows = tab.getRows();
      for(TableRow row : _rows) {
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _genText = this.genText(row);
        _builder.append(_genText, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final TableRow row) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TableData> _data = row.getData();
      for(TableData td : _data) {
        _builder.append("<td>");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _genText = this.genText(td);
        _builder.append(_genText, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</td>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genText(final TableData tData) {
    EList<TextOrMarkup> _contents = tData.getContents();
    final Function1<TextOrMarkup,StringConcatenation> _function = new Function1<TextOrMarkup,StringConcatenation>() {
        public StringConcatenation apply(final TextOrMarkup e) {
          StringConcatenation _generate = HtmlGenerator.this.generate(e);
          return _generate;
        }
      };
    List<StringConcatenation> _map = ListExtensions.<TextOrMarkup, StringConcatenation>map(_contents, _function);
    String _join = IterableExtensions.join(_map);
    return _join;
  }
  
  protected CharSequence _genText(final TextPart tp) {
    StringConcatenation _builder = new StringConcatenation();
    String _text = tp.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
    _builder.append(_escapeHTMLChars, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genText(final OrderedList ol) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    {
      EList<Item> _items = ol.getItems();
      for(Item item : _items) {
        _builder.append("\t");
        CharSequence _genText = this.genText(item);
        _builder.append(_genText, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ol>");
    return _builder;
  }
  
  protected CharSequence _genText(final UnorderedList ol) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<Item> _items = ol.getItems();
      for(Item item : _items) {
        _builder.append("\t");
        CharSequence _genText = this.genText(item);
        _builder.append(_genText, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    return _builder;
  }
  
  protected CharSequence _genText(final Item item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = item.getContents();
      for(TextOrMarkup c : _contents) {
        StringConcatenation _generate = this.generate(c);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</li>");
    return _builder;
  }
  
  protected CharSequence _genText(final Emphasize em) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = em.getContents();
      for(TextOrMarkup c : _contents) {
        StringConcatenation _generate = this.generate(c);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</em>");
    return _builder;
  }
  
  protected CharSequence _genText(final Ref a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"#");
    Identifiable _ref = a.getRef();
    String _name = _ref.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = a.getContents();
      boolean _isEmpty = _contents.isEmpty();
      if (_isEmpty) {
        Identifiable _ref_1 = a.getRef();
        _builder.append(_ref_1, "");
        _builder.newLineIfNotEmpty();} else {
        {
          EList<TextOrMarkup> _contents_1 = a.getContents();
          for(TextOrMarkup c : _contents_1) {
            StringConcatenation _generate = this.generate(c);
            _builder.append(_generate, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("</a>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final Anchor a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"#");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("\"></a>");
    return _builder;
  }
  
  protected CharSequence _genText(final Link link) {
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
  
  protected CharSequence _genText(final ImageRef img) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"image\" >");
    _builder.newLine();
    {
      String _name = img.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\t");
        String _name_1 = img.getName();
        StringConcatenation _genLabel = this.genLabel(_name_1);
        _builder.append(_genLabel, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("<img src=\"");
    String _path = img.getPath();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_path);
    _builder.append(_unescapeXdocChars, "	");
    _builder.append("\" class=\"");
    String _clazz = img.getClazz();
    String _unescapeXdocChars_1 = this.utils.unescapeXdocChars(_clazz);
    _builder.append(_unescapeXdocChars_1, "	");
    _builder.append("\" style=\"");
    String _style = img.getStyle();
    String _unescapeXdocChars_2 = this.utils.unescapeXdocChars(_style);
    _builder.append(_unescapeXdocChars_2, "	");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _caption = img.getCaption();
    String _unescapeXdocChars_3 = this.utils.unescapeXdocChars(_caption);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars_3);
    _builder.append(_escapeHTMLChars, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    return _builder;
  }
  
  protected CharSequence _genText(final CodeBlock code) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isInlineCode = this.utils.isInlineCode(code);
      if (_isInlineCode) {
        _builder.append("<span class=\"inlinecode\">");
        {
          EList<EObject> _contents = code.getContents();
          for(EObject c : _contents) {
            EList<EObject> _contents_1 = code.getContents();
            LangDef _language = code.getLanguage();
            StringConcatenation _genCode = this.genCode(_contents_1, _language);
            _builder.append(_genCode, "");
          }
        }
        _builder.append("</span>");
        _builder.newLineIfNotEmpty();} else {
        _builder.append("<div class=\"literallayout\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<div class=\"incode\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<p class=\"code\">");
        _builder.newLine();
        {
          CodeBlock _removeIndent = this.utils.removeIndent(code);
          EList<EObject> _contents_2 = _removeIndent.getContents();
          for(EObject c_1 : _contents_2) {
            _builder.append("\t");
            LangDef _language_1 = code.getLanguage();
            StringConcatenation _genCode_1 = this.genCode(c_1, _language_1);
            _builder.append(_genCode_1, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</p>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genText(final CodeRef cref) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<em>");
    JvmDeclaredType _element = cref.getElement();
    String _qualifiedName = _element.getQualifiedName();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_qualifiedName);
    String _escapeHTMLChars = this.utils.escapeHTMLChars(_unescapeXdocChars);
    _builder.append(_escapeHTMLChars, "");
    _builder.append("</em>");
    return _builder;
  }
  
  protected CharSequence _genText(final MarkupInCode mic) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _genCode(final Object o, final LangDef lang) {
    return null;
  }
  
  protected StringConcatenation _genCode(final Code code, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _formatCode = this.utils.formatCode(_unescapeXdocChars, lang);
    _builder.append(_formatCode, "");
    return _builder;
  }
  
  protected StringConcatenation _genCode(final MarkupInCode mic, final LangDef lang) {
    return null;
  }
  
  public StringConcatenation generate(final EObject chap) {
    if ((chap instanceof Chapter)) {
      return _generate((Chapter)chap);
    } else if ((chap instanceof Document)) {
      return _generate((Document)chap);
    } else if ((chap instanceof Section)) {
      return _generate((Section)chap);
    } else if ((chap instanceof Section2)) {
      return _generate((Section2)chap);
    } else if ((chap instanceof Section3)) {
      return _generate((Section3)chap);
    } else if ((chap instanceof Section4)) {
      return _generate((Section4)chap);
    } else if ((chap instanceof TextOrMarkup)) {
      return _generate((TextOrMarkup)chap);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(chap).toString());
    }
  }
  
  public CharSequence genText(final Object a) {
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
    } else if ((a instanceof UnorderedList)) {
      return _genText((UnorderedList)a);
    } else if ((a instanceof Item)) {
      return _genText((Item)a);
    } else if ((a instanceof MarkupInCode)) {
      return _genText((MarkupInCode)a);
    } else if ((a instanceof TableData)) {
      return _genText((TableData)a);
    } else if ((a instanceof TableRow)) {
      return _genText((TableRow)a);
    } else if ((a instanceof TextPart)) {
      return _genText((TextPart)a);
    } else if ((a instanceof Object)) {
      return _genText((Object)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(a).toString());
    }
  }
  
  public StringConcatenation genCode(final Object code, final LangDef lang) {
    if ((code instanceof Code)
         && (lang instanceof LangDef)) {
      return _genCode((Code)code, (LangDef)lang);
    } else if ((code instanceof MarkupInCode)
         && (lang instanceof LangDef)) {
      return _genCode((MarkupInCode)code, (LangDef)lang);
    } else if ((code instanceof Object)
         && (lang instanceof LangDef)) {
      return _genCode((Object)code, (LangDef)lang);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(code, lang).toString());
    }
  }
}