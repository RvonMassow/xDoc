package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.TocGenerator;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.generator.util.GlossaryExtensions;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.Item;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.OrderedList;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;
import org.eclipse.xtext.xdoc.xdoc.UnorderedList;
import org.eclipse.xtext.xdoc.xdoc.XdocFile;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XdocGenerator implements IGenerator {
  @Inject private Utils utils;
  @Inject private GlossaryExtensions glossaryExtensions;
  @Inject private EclipseNamingExtensions eclipseNamingExtensions;
  @Inject private TocGenerator tocGenerator;
  @Inject private PlainText plainText;
  
  public void doGenerate(final Resource res, final IFileSystemAccess access) {
    {
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      final Object file = _get;
      EList<EObject> _contents_1 = res.getContents();
      EObject _get_1 = _contents_1.get(0);
      final EObject file_1 = _get_1;
      boolean matched = false;
      if (!matched) {
        if (file_1 instanceof XdocFile) {
          final XdocFile file_2 = (XdocFile) file_1;
          matched=true;
          AbstractSection _mainSection = file_2.getMainSection();
          if ((_mainSection instanceof org.eclipse.xtext.xdoc.xdoc.Document)) {
            AbstractSection _mainSection_1 = file_2.getMainSection();
            this.generate(_mainSection_1, access);
          }
        }
      }
      if (!matched) {/*null*/;
      }
    }
  }
  
  public void _generate(final Document document, final IFileSystemAccess access) {
    {
      StringConcatenation _generateToc = tocGenerator.generateToc(document);
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
    String _fileName = eclipseNamingExtensions.fileName(typeConverted_chapter);
    final Chapter typeConverted_chapter_1 = (Chapter)chapter;
    CharSequence _generate = this.generate(typeConverted_chapter_1);
    access.generateFile(_fileName, _generate);
  }
  
  public CharSequence _generate(final Chapter aS) {
    StringConcatenation _xblockexpression = null;
    {
      final String headtag = "h1";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("<title>");
      final Chapter typeConverted_aS = (Chapter)aS;
      TextOrMarkup _title = typeConverted_aS.getTitle();
      CharSequence _genPlainText = plainText.genPlainText(_title);
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
      _builder.append(headtag, "");
      _builder.append(">");
      final Chapter typeConverted_aS_1 = (Chapter)aS;
      TextOrMarkup _title_1 = typeConverted_aS_1.getTitle();
      CharSequence _genPlainText_1 = plainText.genPlainText(_title_1);
      _builder.append(_genPlainText_1, "");
      _builder.append("</");
      _builder.append(headtag, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      {
        final Chapter typeConverted_aS_2 = (Chapter)aS;
        Object _subSection = utils.subSection(typeConverted_aS_2);
        for(AbstractSection ss : ((java.lang.Iterable<org.eclipse.xtext.xdoc.xdoc.AbstractSection>) _subSection)) {
          _builder.newLineIfNotEmpty();
          final AbstractSection typeConverted_ss = (AbstractSection)ss;
          CharSequence _generate = this.generate(typeConverted_ss);
          _builder.append(_generate, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence _generate(final AbstractSection aS) {
    StringConcatenation _xblockexpression = null;
    {
      String _switchResult = null;
      final AbstractSection aS_1 = aS;
      boolean matched = false;
      if (!matched) {
        if (aS_1 instanceof Section) {
          final Section aS_2 = (Section) aS_1;
          matched=true;
          _switchResult = "h2";
        }
      }
      if (!matched) {
        if (aS_1 instanceof Section2) {
          final Section2 aS_3 = (Section2) aS_1;
          matched=true;
          _switchResult = "h3";
        }
      }
      if (!matched) {
        if (aS_1 instanceof Section3) {
          final Section3 aS_4 = (Section3) aS_1;
          matched=true;
          _switchResult = "h4";
        }
      }
      if (!matched) {
        if (aS_1 instanceof Section4) {
          final Section4 aS_5 = (Section4) aS_1;
          matched=true;
          _switchResult = "h5";
        }
      }
      if (!matched) {
        _switchResult = "h1";
      }
      final String headtag = _switchResult;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<");
      _builder.append(headtag, "");
      _builder.append(">");
      TextOrMarkup _title = aS.getTitle();
      CharSequence _genPlainText = plainText.genPlainText(_title);
      _builder.append(_genPlainText, "");
      _builder.append("</");
      _builder.append(headtag, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      {
        EList<TextOrMarkup> _contents = aS.getContents();
        for(TextOrMarkup c : _contents) {
          _builder.newLineIfNotEmpty();
          final TextOrMarkup typeConverted_c = (TextOrMarkup)c;
          CharSequence _generate = this.generate(typeConverted_c);
          _builder.append(_generate, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLineIfNotEmpty();
      {
        Object _subSection = utils.subSection(aS);
        for(AbstractSection ss : ((java.lang.Iterable<org.eclipse.xtext.xdoc.xdoc.AbstractSection>) _subSection)) {
          _builder.newLineIfNotEmpty();
          final AbstractSection typeConverted_ss = (AbstractSection)ss;
          CharSequence _generate_1 = this.generate(typeConverted_ss);
          _builder.append(_generate_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
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
        _builder.newLineIfNotEmpty();
        final TextOrMarkup typeConverted_tom = (TextOrMarkup)tom;
        CharSequence _generate = this.generate(typeConverted_tom);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence _generate(final Ref ref) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = ref.getContents();
      boolean _isEmpty = _contents.isEmpty();
      if (_isEmpty) {
        _builder.newLineIfNotEmpty();
        _builder.append("<a href=\"");
        Identifiable _ref = ref.getRef();
        String _fileName = eclipseNamingExtensions.fileName(_ref);
        _builder.append(_fileName, "");
        _builder.append(".html#");
        Identifiable _ref_1 = ref.getRef();
        String _name = _ref_1.getName();
        _builder.append(_name, "");
        _builder.append("\">section ");
        Identifiable _ref_2 = ref.getRef();
        String _name_1 = _ref_2.getName();
        _builder.append(_name_1, "");
        _builder.append("</a>");
        _builder.newLineIfNotEmpty();} else {
        _builder.newLineIfNotEmpty();
        _builder.append("<a href=\"");
        Identifiable _ref_3 = ref.getRef();
        String _fileName_1 = eclipseNamingExtensions.fileName(_ref_3);
        _builder.append(_fileName_1, "");
        _builder.append(".html#");
        Identifiable _ref_4 = ref.getRef();
        String _name_2 = _ref_4.getName();
        _builder.append(_name_2, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        {
          EList<TextOrMarkup> _contents_1 = ref.getContents();
          for(TextOrMarkup tom : _contents_1) {
            _builder.newLineIfNotEmpty();
            StringConcatenation _genNonParContent = this.genNonParContent(tom);
            _builder.append(_genNonParContent, "");
            _builder.append("</a>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence _generate(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject obj : _contents) {
        _builder.newLineIfNotEmpty();
        _builder.append("<p>");
        _builder.newLine();
        CharSequence _generate = this.generate(obj);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence _generate(final UnorderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<Item> _items = ul.getItems();
      for(Item i : _items) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("  \t");
        final Item typeConverted_i = (Item)i;
        CharSequence _generate = this.generate(typeConverted_i);
        _builder.append(_generate, "	  	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence _generate(final OrderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol>");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<Item> _items = ul.getItems();
      for(Item i : _items) {
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        final Item typeConverted_i = (Item)i;
        CharSequence _generate = this.generate(typeConverted_i);
        _builder.append(_generate, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</ol>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence _generate(final TextPart tp) {
    String _text = tp.getText();
    return _text;
  }
  
  public CharSequence _generate(final CodeBlock cb) {
    StringConcatenation _xifexpression = null;
    Boolean _isInlineCode = utils.isInlineCode(cb);
    if (_isInlineCode) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<span class=\"inlinecode\">");
      EList<EObject> _contents = cb.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      LangDef _language = cb.getLanguage();
      StringConcatenation _generate = this.generate(((org.eclipse.xtext.xdoc.xdoc.Code) _head), _language);
      _builder.append(_generate, "");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public StringConcatenation generate(final Code code, final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public StringConcatenation genNonParContent(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(EObject obj : _contents) {
        _builder.newLineIfNotEmpty();
        CharSequence _generate = this.generate(obj);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void generate(final AbstractSection chapter, final IFileSystemAccess access) {
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
    } else if ((aS instanceof CodeBlock)) {
      return _generate((CodeBlock)aS);
    } else if ((aS instanceof OrderedList)) {
      return _generate((OrderedList)aS);
    } else if ((aS instanceof Ref)) {
      return _generate((Ref)aS);
    } else if ((aS instanceof UnorderedList)) {
      return _generate((UnorderedList)aS);
    } else if ((aS instanceof TextOrMarkup)) {
      return _generate((TextOrMarkup)aS);
    } else if ((aS instanceof TextPart)) {
      return _generate((TextPart)aS);
    } else {
      throw new IllegalArgumentException();
    }
  }
}