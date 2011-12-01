package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xdoc.generator.IConfigurableGenerator;
import org.eclipse.xtext.xdoc.generator.config.Config;
import org.eclipse.xtext.xdoc.generator.util.LatexUtils;
import org.eclipse.xtext.xdoc.generator.util.StringUtils;
import org.eclipse.xtext.xdoc.generator.util.Utils;
import org.eclipse.xtext.xdoc.generator.util.XFloat;
import org.eclipse.xtext.xdoc.generator.util.numeric.XFloatExtensions;
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
import org.eclipse.xtext.xdoc.xdoc.PartRef;
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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

@SuppressWarnings("all")
public class LatexGenerator implements IConfigurableGenerator {
  @Inject
  private Utils utils;
  
  @Inject
  private HashMap<String,Object> config;
  
  @Inject
  private HashSet<String> links;
  
  public Map<String,Object> getConfiguration() {
    return this.config;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    for (final EObject element : _iterable) {
      if ((element instanceof Document)) {
        {
          final Document doc = ((Document) element);
          String _name = doc.getName();
          String _fileName = this.fileName(_name);
          CharSequence _generate = this.generate(doc);
          fsa.generateFile(_fileName, _generate);
        }
      }
    }
  }
  
  public void doGenerate(final EObject obj, final IFileSystemAccess fsa) {
      final Document doc = ((Document) obj);
      String _name = doc.getName();
      String _fileName = this.fileName(_name);
      CharSequence _generate = this.generate(doc);
      fsa.generateFile(_fileName, _generate);
  }
  
  public String fileName(final String name) {
    String _operator_plus = StringExtensions.operator_plus(name, ".tex");
    return _operator_plus;
  }
  
  protected CharSequence _generate(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _preamble = this.preamble();
    _builder.append(_preamble, "");
    _builder.newLineIfNotEmpty();
    {
      EList<LangDef> _langDefs = doc.getLangDefs();
      for(final LangDef lang : _langDefs) {
        CharSequence _generate = this.generate(lang);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _configureTodo = this.configureTodo();
    _builder.append(_configureTodo, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\usepackage{hyperref}");
    _builder.newLine();
    _builder.newLine();
    CharSequence _authorAndTitle = this.authorAndTitle(doc);
    _builder.append(_authorAndTitle, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.append("\\maketitle");
    _builder.newLine();
    _builder.append("\\tableofcontents");
    _builder.newLine();
    {
      EList<Chapter> _chapters = doc.getChapters();
      for(final Chapter chapter : _chapters) {
        _builder.newLine();
        CharSequence _generate_1 = this.generate(chapter);
        _builder.append(_generate_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Part> _parts = doc.getParts();
      for(final Part part : _parts) {
        _builder.newLine();
        CharSequence _generate_2 = this.generate(part);
        _builder.append(_generate_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _genListOfLinks = this.genListOfLinks();
    _builder.append(_genListOfLinks, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Object _get = this.config.get(Config.release);
      boolean _operator_not = BooleanExtensions.operator_not(((Boolean) _get));
      if (_operator_not) {
        _builder.append("\\listoftodos");
        _builder.newLine();
      }
    }
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genListOfLinks() {
    CharSequence _xifexpression = null;
    boolean _isEmpty = this.links.isEmpty();
    boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
    if (_operator_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\chapter{List of External Links}");
      _builder.newLine();
      {
        for(final String link : this.links) {
          _builder.append("\\noindent\\url{");
          _builder.append(link, "");
          _builder.append("}");
          _builder.newLineIfNotEmpty();
        }
      }
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence preamble() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass[a4paper]{scrreprt}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage[T1]{fontenc}");
    _builder.newLine();
    _builder.append("\\usepackage{ae,aecompl,aeguill} ");
    _builder.newLine();
    _builder.append("\\usepackage[latin1]{inputenc}");
    _builder.newLine();
    _builder.append("\\usepackage{listings}");
    _builder.newLine();
    _builder.append("\\usepackage[american]{babel}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage{todonotes}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\makeatletter");
    _builder.newLine();
    _builder.append("\\renewcommand\\subsection{\\medskip\\@startsection{subsection}{2}{\\z@}%");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{-.25ex\\@plus -.1ex \\@minus -.2ex}%");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{1.5ex \\@plus .2ex \\@minus -.4ex}%");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{\\ifnum \\scr@compatibility>\\@nameuse{scr@v@2.96}\\relax");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\\setlength{\\parfillskip}{\\z@ plus 1fil}\\fi");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\\raggedsection\\normalfont\\sectfont\\nobreak\\size@subsection");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}%");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\\renewcommand\\paragraph{\\@startsection{paragraph}{4}{\\z@}%");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{-3.25ex\\@plus -1ex \\@minus -.2ex}%");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{1.5ex \\@plus .2ex}%");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{\\sffamily\\normalsize\\bfseries}}");
    _builder.newLine();
    _builder.append("\\makeatother");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\definecolor{listingsbg}{HTML}{E7E7E7}");
    _builder.newLine();
    _builder.append("\\definecolor{kwcolor}{HTML}{7F0055}");
    _builder.newLine();
    _builder.append("\\definecolor{strcolor}{HTML}{2A00FF}");
    _builder.newLine();
    _builder.append("\\definecolor{cocolor}{HTML}{3F7F5F}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\lstset{tabsize=4, basicstyle=\\sffamily\\small, keywordstyle=\\bfseries\\color{kwcolor}, commentstyle=\\color{cocolor},");
    _builder.newLine();
    _builder.append("stringstyle=\\color{strcolor}, columns=[r]fullflexible, escapechar={\u00DF}, frame=single, %framexleftmargin=-5pt, framexrightmargin=-5pt, ");
    _builder.newLine();
    _builder.append("xleftmargin=5pt, xrightmargin=5pt, rulecolor=\\color{lightgray}, showstringspaces=false, backgroundcolor=\\color{listingsbg!70}}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newlength{\\XdocItemIndent}");
    _builder.newLine();
    _builder.append("\\newlength{\\XdocTEffectiveWidth}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence configureTodo() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Object _get = this.config.get(Config.release);
      if ((((Boolean) _get)).booleanValue()) {
        _builder.append("\\renewcommand{\\todo}[1]{}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\lstdefinelanguage{");
    String _name = lang.getName();
    _builder.append(_name, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("{morekeywords={");
    EList<String> _keywords = lang.getKeywords();
    String _join = IterableExtensions.join(_keywords, ", ");
    _builder.append(_join, "  ");
    _builder.append("},");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("sensitive=true,");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("morecomment=[l]{//},");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("morecomment=[s]{/*}{*/},");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("morestring=[b]\",");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("morestring=[b]\',");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence authorAndTitle(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_and = false;
      TextOrMarkup _authors = doc.getAuthors();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_authors, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        TextOrMarkup _authors_1 = doc.getAuthors();
        EList<EObject> _contents = _authors_1.getContents();
        boolean _isEmpty = _contents.isEmpty();
        boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_not);
      }
      if (_operator_and) {
        _builder.append("\\author{");
        {
          TextOrMarkup _authors_2 = doc.getAuthors();
          EList<EObject> _contents_1 = _authors_2.getContents();
          for(final EObject o : _contents_1) {
            CharSequence _genText = this.genText(o);
            _builder.append(_genText, "");
          }
        }
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      TextOrMarkup _title = doc.getTitle();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_title, null);
      if (_operator_notEquals_1) {
        _builder.append("\\title{");
        {
          TextOrMarkup _title_1 = doc.getTitle();
          EList<EObject> _contents_2 = _title_1==null?(EList<EObject>)null:_title_1.getContents();
          for(final EObject o_1 : _contents_2) {
            CharSequence _genText_1 = this.genText(o_1);
            _builder.append(_genText_1, "");
          }
        }
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * genContent
   * 
   * Generates the content for the single structures.
   * 
   * FIXME: name for sectionrefs not correctly read
   */
  protected CharSequence _generate(final AbstractSection sec) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (sec instanceof Part) {
        final Part _part = (Part)sec;
        matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\\part{");
        TextOrMarkup _title = _part.getTitle();
        CharSequence _genContent = this.genContent(_title);
        _builder_1.append(_genContent, "");
        _builder_1.append("}");
        _switchResult = _builder_1;
      }
    }
    if (!matched) {
      if (sec instanceof Chapter) {
        final Chapter _chapter = (Chapter)sec;
        matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\\chapter{");
        TextOrMarkup _title = _chapter.getTitle();
        CharSequence _genContent = this.genContent(_title);
        _builder_1.append(_genContent, "");
        _builder_1.append("}");
        _switchResult = _builder_1;
      }
    }
    if (!matched) {
      if (sec instanceof Section) {
        final Section _section = (Section)sec;
        matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\\section{");
        TextOrMarkup _title = _section.getTitle();
        CharSequence _genContent = this.genContent(_title);
        _builder_1.append(_genContent, "");
        _builder_1.append("}");
        _switchResult = _builder_1;
      }
    }
    if (!matched) {
      if (sec instanceof Section2) {
        final Section2 _section2 = (Section2)sec;
        matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\\subsection{");
        TextOrMarkup _title = _section2.getTitle();
        CharSequence _genContent = this.genContent(_title);
        _builder_1.append(_genContent, "");
        _builder_1.append("}");
        _switchResult = _builder_1;
      }
    }
    if (!matched) {
      if (sec instanceof Section3) {
        final Section3 _section3 = (Section3)sec;
        matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\\subsubsection{");
        TextOrMarkup _title = _section3.getTitle();
        CharSequence _genContent = this.genContent(_title);
        _builder_1.append(_genContent, "");
        _builder_1.append("}");
        _switchResult = _builder_1;
      }
    }
    if (!matched) {
      if (sec instanceof Section4) {
        final Section4 _section4 = (Section4)sec;
        matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\\paragraph{");
        TextOrMarkup _title = _section4.getTitle();
        CharSequence _genContent = this.genContent(_title);
        _builder_1.append(_genContent, "");
        _builder_1.append("}");
        _switchResult = _builder_1;
      }
    }
    _builder.append(_switchResult, "");
    _builder.newLineIfNotEmpty();
    CharSequence _switchResult_1 = null;
    boolean matched_1 = false;
    if (!matched_1) {
      if (sec instanceof Part) {
        final Part _part = (Part)sec;
        matched_1=true;
        CharSequence _genLabel = this.genLabel(_part);
        _switchResult_1 = _genLabel;
      }
    }
    if (!matched_1) {
      if (sec instanceof Chapter) {
        final Chapter _chapter = (Chapter)sec;
        matched_1=true;
        CharSequence _genLabel = this.genLabel(_chapter);
        _switchResult_1 = _genLabel;
      }
    }
    if (!matched_1) {
      if (sec instanceof Section) {
        final Section _section = (Section)sec;
        matched_1=true;
        CharSequence _genLabel = this.genLabel(_section);
        _switchResult_1 = _genLabel;
      }
    }
    if (!matched_1) {
      TextOrMarkup _title = sec.getTitle();
      CharSequence _genLabel = this.genLabel(_title);
      _switchResult_1 = _genLabel;
    }
    _builder.append(_switchResult_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _genContent = this.genContent(sec);
    _builder.append(_genContent, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genContent(final Chapter chap) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = chap.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _genContent = this.genContent(c);
        _builder.append(_genContent, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Section> _subSections = chap.getSubSections();
      for(final Section sub : _subSections) {
        CharSequence _generate = this.generate(sub);
        _builder.append(_generate, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genContent(final Part part) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      EList<TextOrMarkup> _contents = part.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _genContent = this.genContent(c);
        _builder.append(_genContent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Chapter> _chapters = part.getChapters();
      for(final Chapter sub : _chapters) {
        CharSequence _generate = this.generate(sub);
        _builder.append(_generate, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genContent(final Section sec) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _genContent = this.genContent(c);
        _builder.append(_genContent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Section2> _subSections = sec.getSubSections();
      for(final Section2 sub : _subSections) {
        CharSequence _generate = this.generate(sub);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genContent(final Section2 sec) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genLabel = this.genLabel(sec);
    _builder.append(_genLabel, "");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _genContent = this.genContent(c);
        _builder.append(_genContent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Section3> _subSections = sec.getSubSections();
      for(final Section3 sub : _subSections) {
        CharSequence _generate = this.generate(sub);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genContent(final Section3 sec) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genLabel = this.genLabel(sec);
    _builder.append(_genLabel, "");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _genContent = this.genContent(c);
        _builder.append(_genContent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Section4> _subSections = sec.getSubSections();
      for(final Section4 sub : _subSections) {
        CharSequence _generate = this.generate(sub);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genContent(final Section4 sec) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genLabel = this.genLabel(sec);
    _builder.append(_genLabel, "");
    _builder.newLineIfNotEmpty();
    {
      EList<TextOrMarkup> _contents = sec.getContents();
      for(final TextOrMarkup c : _contents) {
        CharSequence _genContent = this.genContent(c);
        _builder.append(_genContent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genContent(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(final EObject e : _contents) {
        CharSequence _genText = this.genText(e);
        _builder.append(_genText, "");
      }
    }
    return _builder;
  }
  
  /**
   * genNonParContent
   */
  public CharSequence genNonParContent(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _contents = tom.getContents();
      for(final EObject e : _contents) {
        CharSequence _genText = this.genText(e);
        _builder.append(_genText, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * genLabel
   * Generates a label
   */
  protected CharSequence _genLabel(final Part part) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = part.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        String _name_1 = part.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final PartRef part) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Part _part = part.getPart();
      String _name = _part.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        Part _part_1 = part.getPart();
        String _name_1 = _part_1.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final ChapterRef cRef) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Chapter _chapter = cRef.getChapter();
      String _name = _chapter.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        Chapter _chapter_1 = cRef.getChapter();
        String _name_1 = _chapter_1.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final Chapter chap) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = chap.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        String _name_1 = chap.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final Section sec) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = sec.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        String _name_1 = sec.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final SectionRef sRef) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Section _section = sRef.getSection();
      String _name = _section.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        Section _section_1 = sRef.getSection();
        String _name_1 = _section_1.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final Section2 sec) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = sec.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        String _name_1 = sec.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final Section2Ref sRef) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Section2 _section2 = sRef.getSection2();
      String _name = _section2.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        Section2 _section2_1 = sRef.getSection2();
        String _name_1 = _section2_1.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final Section3 sec) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = sec.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        String _name_1 = sec.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final Section4 sec) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = sec.getName();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
      if (_operator_notEquals) {
        _builder.append("\\label{");
        String _name_1 = sec.getName();
        String _string = _name_1==null?(String)null:_name_1.toString();
        _builder.append(_string, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLabel(final TextOrMarkup tom) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  /**
   * genUrl
   */
  public CharSequence genURL(final String str) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\noindent\\url{");
    _builder.append(str, "");
    _builder.append("}");
    return _builder;
  }
  
  /**
   * genText
   */
  protected CharSequence _genText(final Table tab) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\\setlength{\\XdocTEffectiveWidth}{\\textwidth}");
    _builder.newLine();
    _builder.append("\\addtolength{\\XdocTEffectiveWidth}{-");
    EList<TableRow> _rows = tab.getRows();
    TableRow _head = IterableExtensions.<TableRow>head(_rows);
    EList<TableData> _data = _head.getData();
    int _size = _data.size();
    int _operator_multiply = IntegerExtensions.operator_multiply(_size, 2);
    _builder.append(_operator_multiply, "");
    _builder.append(".0\\tabcolsep}");
    _builder.newLineIfNotEmpty();
    _builder.append("\\noindent\\begin{tabular}{");
    EList<TableRow> _rows_1 = tab.getRows();
    TableRow _head_1 = IterableExtensions.<TableRow>head(_rows_1);
    EList<TableData> _data_1 = _head_1.getData();
    CharSequence _genColumns = this.genColumns(_data_1);
    _builder.append(_genColumns, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    EList<TableRow> _rows_2 = tab.getRows();
    final Function1<TableRow,CharSequence> _function = new Function1<TableRow,CharSequence>() {
        public CharSequence apply(final TableRow e) {
          CharSequence _genText = LatexGenerator.this.genText(e);
          return _genText;
        }
      };
    Iterable<CharSequence> _map = IterableExtensions.<TableRow, CharSequence>map(_rows_2, _function);
    String _join = IterableExtensions.join(_map, "\\\\\n");
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{tabular}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final TableRow row) {
    EList<TableData> _data = row.getData();
    final Function1<TableData,CharSequence> _function = new Function1<TableData,CharSequence>() {
        public CharSequence apply(final TableData e) {
          CharSequence _genText = LatexGenerator.this.genText(e);
          return _genText;
        }
      };
    Iterable<CharSequence> _map = IterableExtensions.<TableData, CharSequence>map(_data, _function);
    String _join = IterableExtensions.join(_map, " & ");
    return _join;
  }
  
  protected CharSequence _genText(final TableData tData) {
    EList<TextOrMarkup> _contents = tData.getContents();
    final Function1<TextOrMarkup,CharSequence> _function = new Function1<TextOrMarkup,CharSequence>() {
        public CharSequence apply(final TextOrMarkup e) {
          CharSequence _genContent = LatexGenerator.this.genContent(e);
          return _genContent;
        }
      };
    Iterable<CharSequence> _map = IterableExtensions.<TextOrMarkup, CharSequence>map(_contents, _function);
    String _join = IterableExtensions.join(_map);
    return _join;
  }
  
  protected CharSequence _genText(final TextPart part) {
    String _text = part.getText();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
    String _escapeLatexChars = this.utils.escapeLatexChars(_unescapeXdocChars);
    return _escapeLatexChars;
  }
  
  protected CharSequence _genText(final OrderedList ol) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\setlength{\\XdocItemIndent}{\\textwidth}");
    _builder.newLine();
    _builder.append("\\begin{enumerate}");
    _builder.newLine();
    _builder.append("\\addtolength{\\XdocItemIndent}{-2.5em}");
    _builder.newLine();
    EList<Item> _items = ol.getItems();
    final Function1<Item,CharSequence> _function = new Function1<Item,CharSequence>() {
        public CharSequence apply(final Item e) {
          CharSequence _genText = LatexGenerator.this.genText(e);
          return _genText;
        }
      };
    Iterable<CharSequence> _map = IterableExtensions.<Item, CharSequence>map(_items, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{enumerate}");
    _builder.newLine();
    _builder.append("\\addtolength{\\XdocItemIndent}{2.5em}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final UnorderedList ul) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\setlength{\\XdocItemIndent}{\\textwidth}");
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    _builder.append("\\addtolength{\\XdocItemIndent}{-2.5em}");
    _builder.newLine();
    EList<Item> _items = ul.getItems();
    final Function1<Item,CharSequence> _function = new Function1<Item,CharSequence>() {
        public CharSequence apply(final Item e) {
          CharSequence _genText = LatexGenerator.this.genText(e);
          return _genText;
        }
      };
    Iterable<CharSequence> _map = IterableExtensions.<Item, CharSequence>map(_items, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{itemize}");
    _builder.newLine();
    _builder.append("\\addtolength{\\XdocItemIndent}{2.5em}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final Item item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\item \\begin{minipage}[t]{\\XdocItemIndent}");
    {
      EList<TextOrMarkup> _contents = item.getContents();
      TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
      boolean _block = LatexUtils.block(_head);
      if (_block) {
        _builder.append("\\vspace*{-\\baselineskip}");
      }
    }
    _builder.newLineIfNotEmpty();
    EList<TextOrMarkup> _contents_1 = item.getContents();
    final Function1<TextOrMarkup,CharSequence> _function = new Function1<TextOrMarkup,CharSequence>() {
        public CharSequence apply(final TextOrMarkup e) {
          CharSequence _genContent = LatexGenerator.this.genContent(e);
          return _genContent;
        }
      };
    Iterable<CharSequence> _map = IterableExtensions.<TextOrMarkup, CharSequence>map(_contents_1, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{minipage}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genText(final Emphasize em) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\textit{");
    EList<TextOrMarkup> _contents = em.getContents();
    final Function1<TextOrMarkup,CharSequence> _function = new Function1<TextOrMarkup,CharSequence>() {
        public CharSequence apply(final TextOrMarkup e) {
          CharSequence _genContent = LatexGenerator.this.genContent(e);
          return _genContent;
        }
      };
    Iterable<CharSequence> _map = IterableExtensions.<TextOrMarkup, CharSequence>map(_contents, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _genText(final Ref ref) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextOrMarkup> _contents = ref.getContents();
      boolean _isEmpty = _contents.isEmpty();
      if (_isEmpty) {
        _builder.append("\\autoref{");
        Identifiable _ref = ref.getRef();
        String _name = _ref.getName();
        _builder.append(_name, "");
        _builder.append("}");
      } else {
        _builder.append("\\hyperref[");
        Identifiable _ref_1 = ref.getRef();
        String _name_1 = _ref_1.getName();
        _builder.append(_name_1, "");
        _builder.append("]{");
        EList<TextOrMarkup> _contents_1 = ref.getContents();
        final Function1<TextOrMarkup,CharSequence> _function = new Function1<TextOrMarkup,CharSequence>() {
            public CharSequence apply(final TextOrMarkup e) {
              CharSequence _genContent = LatexGenerator.this.genContent(e);
              return _genContent;
            }
          };
        Iterable<CharSequence> _map = IterableExtensions.<TextOrMarkup, CharSequence>map(_contents_1, _function);
        String _join = IterableExtensions.join(_map);
        _builder.append(_join, "");
        _builder.append("~(\u00A7\\ref*{");
        Identifiable _ref_2 = ref.getRef();
        String _name_2 = _ref_2.getName();
        _builder.append(_name_2, "");
        _builder.append("})}");
      }
    }
    return _builder;
  }
  
  protected CharSequence _genText(final Anchor anchor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\phantomsection\\label{");
    String _name = anchor.getName();
    _builder.append(_name, "");
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _genText(final Link link) {
    CharSequence _xblockexpression = null;
    {
      String _url = link.getUrl();
      this.links.add(_url);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\href{");
      String _url_1 = link.getUrl();
      _builder.append(_url_1, "");
      _builder.append("}{");
      String _text = link.getText();
      _builder.append(_text, "");
      _builder.append("}");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _genText(final CodeBlock block) {
    CodeBlock _removeIndent = StringUtils.removeIndent(block);
    CharSequence _specialGenCode = this.specialGenCode(_removeIndent);
    return _specialGenCode;
  }
  
  protected CharSequence _genText(final CodeRef codeRef) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\lstinline\u00B0");
    JvmDeclaredType _element = codeRef.getElement();
    String _qualifiedName = _element.getQualifiedName();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_qualifiedName);
    String _escapeLatexChars = this.utils.escapeLatexChars(_unescapeXdocChars);
    _builder.append(_escapeLatexChars, "");
    _builder.append("\u00B0");
    return _builder;
  }
  
  protected CharSequence _genText(final ImageRef imgRef) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{figure}[!ht]");
    _builder.newLine();
    _builder.append("\\centering");
    _builder.newLine();
    _builder.append("\\includegraphics{");
    String _copy = this.copy(imgRef);
    _builder.append(_copy, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    {
      boolean _operator_and = false;
      String _caption = imgRef.getCaption();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_caption, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        String _caption_1 = imgRef.getCaption();
        boolean _matches = _caption_1.matches("^\\s*$");
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _matches);
      }
      if (_operator_and) {
        _builder.append("\\caption{");
        String _caption_2 = imgRef.getCaption();
        _builder.append(_caption_2, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{figure}");
    _builder.newLine();
    return _builder;
  }
  
  public String copy(final ImageRef imgRef) {
    try {
      {
        Resource _eResource = imgRef.eResource();
        final Resource res = _eResource;
        int _operator_multiply = IntegerExtensions.operator_multiply(16, 1024);
        ByteBuffer _allocateDirect = ByteBuffer.allocateDirect(_operator_multiply);
        final ByteBuffer buffer = _allocateDirect;
        URI _uRI = res.getURI();
        final URI uri = _uRI;
        ResourceSet _resourceSet = res.getResourceSet();
        URIConverter _uRIConverter = _resourceSet.getURIConverter();
        final URIConverter uriConverter = _uRIConverter;
        File _file = new File("");
        String _absolutePath = _file.getAbsolutePath();
        String _operator_plus = StringExtensions.operator_plus(_absolutePath, "/");
        URI _createFileURI = URI.createFileURI(_operator_plus);
        final URI absoluteLocalPath = _createFileURI;
        String _path = imgRef.getPath();
        URI _createFileURI_1 = URI.createFileURI(_path);
        final URI relativeImageURI = _createFileURI_1;
        URI _resolve = relativeImageURI.resolve(uri);
        URI _deresolve = _resolve.deresolve(absoluteLocalPath);
        final URI inPath = _deresolve;
        List<String> _segmentsList = inPath.segmentsList();
        int _segmentCount = inPath.segmentCount();
        List<String> _subList = _segmentsList.subList(1, _segmentCount);
        final List<String> inSegments = _subList;
        String _join = IterableExtensions.join(inSegments, "/");
        final String pathInDocument = _join;
        Object _get = this.config.get(Config.outletPath);
        String _string = _get.toString();
        String _operator_plus_1 = StringExtensions.operator_plus(_string, "/");
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, pathInDocument);
        URI _createFileURI_2 = URI.createFileURI(_operator_plus_2);
        final URI outPath = _createFileURI_2;
        InputStream _createInputStream = uriConverter.createInputStream(inPath);
        ReadableByteChannel _newChannel = Channels.newChannel(_createInputStream);
        final ReadableByteChannel inChannel = _newChannel;
        ResourceSet _resourceSet_1 = res.getResourceSet();
        URIConverter _uRIConverter_1 = _resourceSet_1.getURIConverter();
        OutputStream _createOutputStream = _uRIConverter_1.createOutputStream(outPath);
        WritableByteChannel _newChannel_1 = Channels.newChannel(_createOutputStream);
        final WritableByteChannel outChannel = _newChannel_1;
        int _read = inChannel.read(buffer);
        int _operator_minus = IntegerExtensions.operator_minus(1);
        boolean _operator_notEquals = IntegerExtensions.operator_notEquals(_read, _operator_minus);
        boolean _while = _operator_notEquals;
        while (_while) {
          {
            buffer.flip();
            outChannel.write(buffer);
            buffer.compact();
          }
          int _read_1 = inChannel.read(buffer);
          int _operator_minus_1 = IntegerExtensions.operator_minus(1);
          boolean _operator_notEquals_1 = IntegerExtensions.operator_notEquals(_read_1, _operator_minus_1);
          _while = _operator_notEquals_1;
        }
        buffer.flip();
        boolean _hasRemaining = buffer.hasRemaining();
        boolean _while_1 = _hasRemaining;
        while (_while_1) {
          outChannel.write(buffer);
          boolean _hasRemaining_1 = buffer.hasRemaining();
          _while_1 = _hasRemaining_1;
        }
        outChannel.close();
        return pathInDocument;
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        RuntimeException _runtimeException = new RuntimeException(e);
        throw _runtimeException;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected CharSequence _genText(final Todo todo) {
    CharSequence _xifexpression = null;
    Object _get = this.config.get(Config.release);
    boolean _operator_not = BooleanExtensions.operator_not(((Boolean) _get));
    if (_operator_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\todo[inline]{");
      String _text = todo.getText();
      String _unescapeXdocChars = this.utils.unescapeXdocChars(_text);
      String _escapeLatexChars = this.utils.escapeLatexChars(_unescapeXdocChars);
      _builder.append(_escapeLatexChars, "");
      _builder.append("}");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _genText(final MarkupInCode mic) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _genText(final String str) {
    return str;
  }
  
  protected CharSequence _genText(final EObject o) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  /**
   * specialGenCode
   * 
   * TODO: block.language != null  should be  language != null
   */
  public CharSequence specialGenCode(final CodeBlock block) {
    CharSequence _xifexpression = null;
    boolean _inline = LatexUtils.inline(block);
    if (_inline) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\lstinline");
      LangDef _language = block.getLanguage();
      CharSequence _langSpec = _language==null?(CharSequence)null:this.langSpec(_language);
      _builder.append(_langSpec, "");
      _builder.append("\u00B0");
      EList<EObject> _contents = block.getContents();
      final Function1<EObject,CharSequence> _function = new Function1<EObject,CharSequence>() {
          public CharSequence apply(final EObject e) {
            CharSequence _genCode = LatexGenerator.this.genCode(e);
            return _genCode;
          }
        };
      Iterable<CharSequence> _map = IterableExtensions.<EObject, CharSequence>map(_contents, _function);
      String _join = IterableExtensions.join(_map);
      _builder.append(_join, "");
      _builder.append("\u00B0");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      _builder_1.append("\\begin{lstlisting}");
      LangDef _language_1 = block.getLanguage();
      CharSequence _langSpec_1 = _language_1==null?(CharSequence)null:this.langSpec(_language_1);
      _builder_1.append(_langSpec_1, "");
      _builder_1.newLineIfNotEmpty();
      EList<EObject> _contents_1 = block.getContents();
      final Function1<EObject,CharSequence> _function_1 = new Function1<EObject,CharSequence>() {
          public CharSequence apply(final EObject e) {
            CharSequence _genCode = LatexGenerator.this.genCode(e);
            return _genCode;
          }
        };
      Iterable<CharSequence> _map_1 = IterableExtensions.<EObject, CharSequence>map(_contents_1, _function_1);
      String _join_1 = IterableExtensions.join(_map_1);
      _builder_1.append(_join_1, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\\end{lstlisting}");
      _builder_1.newLine();
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence langSpec(final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(lang, null);
      if (_operator_notEquals) {
        _builder.append("[language=");
        String _name = lang.getName();
        _builder.append(_name, "");
        _builder.append("]");
      }
    }
    return _builder;
  }
  
  /**
   * genCode
   */
  protected CharSequence _genCode(final Code code) {
    String _contents = code.getContents();
    String _unescapeXdocChars = this.utils.unescapeXdocChars(_contents);
    String _prepareListingsString = this.utils.prepareListingsString(_unescapeXdocChars);
    return _prepareListingsString;
  }
  
  protected CharSequence _genCode(final MarkupInCode mic) {
    StringConcatenation _builder = new StringConcatenation();
    String _lstEscapeToTex = LatexUtils.lstEscapeToTex();
    _builder.append(_lstEscapeToTex, "");
    CharSequence _genText = this.genText(mic);
    _builder.append(_genText, "");
    String _lstEscapeToTex_1 = LatexUtils.lstEscapeToTex();
    _builder.append(_lstEscapeToTex_1, "");
    return _builder;
  }
  
  protected CharSequence _genCode(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  /**
   * genColumns
   */
  public CharSequence genColumns(final List<TableData> tabData) {
    CharSequence _xblockexpression = null;
    {
      XFloat _xFloat = new XFloat(1);
      int _size = tabData.size();
      XFloat _xFloat_1 = new XFloat(_size);
      XFloat _operator_divide = _xFloat.operator_divide(_xFloat_1);
      final XFloat colFract = _operator_divide;
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _isEmpty = tabData.isEmpty();
        boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
        if (_operator_not) {
          _builder.append("|");
          {
            for(final TableData td : tabData) {
              _builder.append("p{");
              _builder.append(colFract, "");
              _builder.append("\\XdocTEffectiveWidth}|");
            }
          }
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public String calcStyle(final ImageRef ref) {
    try {
      String _xblockexpression = null;
      {
        Resource _eResource = ref.eResource();
        URI _uRI = _eResource.getURI();
        final URI uri = _uRI;
        URI _trimSegments = uri.trimSegments(1);
        String _string = _trimSegments.toString();
        String _operator_plus = StringExtensions.operator_plus(_string, "/");
        String _path = ref.getPath();
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _path);
        URI _createURI = URI.createURI(_operator_plus_1);
        final URI inPath = _createURI;
        String _fileString = inPath.toFileString();
        File _file = new File(_fileString);
        ImageInputStream _createImageInputStream = ImageIO.createImageInputStream(_file);
        final ImageInputStream img = _createImageInputStream;
        Iterator<ImageReader> _imageReaders = ImageIO.getImageReaders(img);
        final Iterator<ImageReader> imageReaders = _imageReaders;
        ImageReader _next = imageReaders.next();
        final ImageReader ir = _next;
        ir.setInput(img);
        IIOMetadata _imageMetadata = ir.getImageMetadata(0);
        final IIOMetadata imageMetadata = _imageMetadata;
        Node _asTree = imageMetadata.getAsTree("javax_imageio_1.0");
        final Node n = _asTree;
        float _parseFloat = Float.parseFloat("2.835");
        XFloat _xFloat = new XFloat(Float.valueOf(_parseFloat));
        XFloat ppmm = _xFloat;
        Node _firstChild = n.getFirstChild();
        Node cn = _firstChild;
        boolean _operator_notEquals = ObjectExtensions.operator_notEquals(cn, null);
        boolean _while = _operator_notEquals;
        while (_while) {
          {
            String _nodeName = cn.getNodeName();
            boolean _operator_equals = ObjectExtensions.operator_equals(_nodeName, "Dimension");
            if (_operator_equals) {
              {
                Node _firstChild_1 = cn.getFirstChild();
                Node ccn = _firstChild_1;
                boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(ccn, null);
                boolean _while_1 = _operator_notEquals_1;
                while (_while_1) {
                  {
                    String _nodeName_1 = ccn.getNodeName();
                    boolean _equals = _nodeName_1.equals("HorizontalPixelSize");
                    if (_equals) {
                      NamedNodeMap _attributes = ccn.getAttributes();
                      Node _item = _attributes.item(0);
                      String _nodeValue = _item.getNodeValue();
                      float _parseFloat_1 = Float.parseFloat(_nodeValue);
                      XFloat _xFloat_1 = new XFloat(Float.valueOf(_parseFloat_1));
                      XFloat _operator_divide = XFloatExtensions.operator_divide(Integer.valueOf(1), _xFloat_1);
                      ppmm = _operator_divide;
                    }
                    Node _nextSibling = ccn.getNextSibling();
                    ccn = _nextSibling;
                  }
                  boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(ccn, null);
                  _while_1 = _operator_notEquals_2;
                }
              }
            }
            Node _nextSibling = cn.getNextSibling();
            cn = _nextSibling;
          }
          boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(cn, null);
          _while = _operator_notEquals_2;
        }
        String _xifexpression = null;
        int _width = ir.getWidth(0);
        XFloat _operator_divide = XFloatExtensions.operator_divide(Integer.valueOf(_width), ppmm);
        Boolean _operator_greaterThan = XFloatExtensions.operator_greaterThan(_operator_divide, Integer.valueOf(140));
        if ((_operator_greaterThan).booleanValue()) {
          _xifexpression = "width=\\textwidth";
        } else {
          _xifexpression = "";
        }
        _xblockexpression = (_xifexpression);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence generate(final EObject doc) {
    if (doc instanceof Document) {
      return _generate((Document)doc);
    } else if (doc instanceof AbstractSection) {
      return _generate((AbstractSection)doc);
    } else if (doc instanceof LangDef) {
      return _generate((LangDef)doc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(doc).toString());
    }
  }
  
  public CharSequence genContent(final EObject chap) {
    if (chap instanceof Chapter) {
      return _genContent((Chapter)chap);
    } else if (chap instanceof Part) {
      return _genContent((Part)chap);
    } else if (chap instanceof Section) {
      return _genContent((Section)chap);
    } else if (chap instanceof Section2) {
      return _genContent((Section2)chap);
    } else if (chap instanceof Section3) {
      return _genContent((Section3)chap);
    } else if (chap instanceof Section4) {
      return _genContent((Section4)chap);
    } else if (chap instanceof TextOrMarkup) {
      return _genContent((TextOrMarkup)chap);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(chap).toString());
    }
  }
  
  public CharSequence genLabel(final EObject cRef) {
    if (cRef instanceof ChapterRef) {
      return _genLabel((ChapterRef)cRef);
    } else if (cRef instanceof PartRef) {
      return _genLabel((PartRef)cRef);
    } else if (cRef instanceof Section2Ref) {
      return _genLabel((Section2Ref)cRef);
    } else if (cRef instanceof SectionRef) {
      return _genLabel((SectionRef)cRef);
    } else if (cRef instanceof Chapter) {
      return _genLabel((Chapter)cRef);
    } else if (cRef instanceof Part) {
      return _genLabel((Part)cRef);
    } else if (cRef instanceof Section) {
      return _genLabel((Section)cRef);
    } else if (cRef instanceof Section2) {
      return _genLabel((Section2)cRef);
    } else if (cRef instanceof Section3) {
      return _genLabel((Section3)cRef);
    } else if (cRef instanceof Section4) {
      return _genLabel((Section4)cRef);
    } else if (cRef instanceof TextOrMarkup) {
      return _genLabel((TextOrMarkup)cRef);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cRef).toString());
    }
  }
  
  public CharSequence genText(final Object anchor) {
    if (anchor instanceof Anchor) {
      return _genText((Anchor)anchor);
    } else if (anchor instanceof CodeBlock) {
      return _genText((CodeBlock)anchor);
    } else if (anchor instanceof CodeRef) {
      return _genText((CodeRef)anchor);
    } else if (anchor instanceof Emphasize) {
      return _genText((Emphasize)anchor);
    } else if (anchor instanceof ImageRef) {
      return _genText((ImageRef)anchor);
    } else if (anchor instanceof Link) {
      return _genText((Link)anchor);
    } else if (anchor instanceof OrderedList) {
      return _genText((OrderedList)anchor);
    } else if (anchor instanceof Ref) {
      return _genText((Ref)anchor);
    } else if (anchor instanceof Table) {
      return _genText((Table)anchor);
    } else if (anchor instanceof Todo) {
      return _genText((Todo)anchor);
    } else if (anchor instanceof UnorderedList) {
      return _genText((UnorderedList)anchor);
    } else if (anchor instanceof Item) {
      return _genText((Item)anchor);
    } else if (anchor instanceof MarkupInCode) {
      return _genText((MarkupInCode)anchor);
    } else if (anchor instanceof TableData) {
      return _genText((TableData)anchor);
    } else if (anchor instanceof TableRow) {
      return _genText((TableRow)anchor);
    } else if (anchor instanceof TextPart) {
      return _genText((TextPart)anchor);
    } else if (anchor instanceof String) {
      return _genText((String)anchor);
    } else if (anchor instanceof EObject) {
      return _genText((EObject)anchor);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(anchor).toString());
    }
  }
  
  public CharSequence genCode(final Object code) {
    if (code instanceof Code) {
      return _genCode((Code)code);
    } else if (code instanceof MarkupInCode) {
      return _genCode((MarkupInCode)code);
    } else {
      return _genCode(code);
    }
  }
}
