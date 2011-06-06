package org.eclipse.xtext.xdoc.generator;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.generator.config.GeneratorConfig;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XdocLatexGenerator implements IGenerator {
  
  @Inject
  private Set<String> links;
  
  @Inject
  private GeneratorConfig config;
  
  public void doGenerate(final Resource res, final IFileSystemAccess fsa) {
    {
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(res);
      Iterable<Document> _filter = IterableExtensions.<Document>filter(_allContentsIterable, org.eclipse.xtext.xdoc.xdoc.Document.class);
      Document _head = IterableExtensions.<Document>head(_filter);
      final Document doc = _head;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(doc, null);
      if (_operator_notEquals) {
        {
          this.links.clear();
          URI _uRI = res.getURI();
          String _lastSegment = _uRI.lastSegment();
          StringConcatenation _generate = this.generate(doc);
          fsa.generateFile(_lastSegment, _generate);
        }
      }
    }
  }
  
  protected StringConcatenation _generate(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _preamble = this.preamble();
    _builder.append(_preamble, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _configureTodo = this.configureTodo();
    _builder.append(_configureTodo, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\usepackage{hyperref}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\newlength{\\itemindentlen}");
    _builder.newLine();
    StringConcatenation _authorAndTitle = this.authorAndTitle(doc);
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
      for(Chapter chapter : _chapters) {
        StringConcatenation _generate = this.generate(chapter);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    StringConcatenation _genListOfLinks = this.genListOfLinks();
    _builder.append(_genListOfLinks, "");
    _builder.append(" FOR this-\u00BB");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation genListOfLinks() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\chapter{List of Links}");
    _builder.newLine();
    {
      for(String link : this.links) {
        _builder.append("\\url{");
        _builder.append(link, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation preamble() {
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
    _builder.append("%% force more space between subsections!");
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
    _builder.append("\\makeatother");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\lstset{tabsize=4, basicstyle=\\sffamily\\small, commentstyle=\\textsl, keywordstyle=\\bfseries, columns=[r]fullflexible, escapechar={\u00B0}}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation configureTodo() {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _release = this.config.release();
      if (_release) {
        _builder.append("\\renewcommand{\\todo}[1]{}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final LangDef lang) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\lstdefinelanguage{");
    String _name = lang.getName();
    _builder.append(_name, "");
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("{morekeywords={");
    EList<String> _keywords = lang.getKeywords();
    String _join = IterableExtensions.join(_keywords, ",");
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
    _builder.append("morecomment=[s]{/*}{* /},");
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
  
  public StringConcatenation authorAndTitle(final Document doc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\author{");
    {
      TextOrMarkup _authors = doc.getAuthors();
      EList<EObject> _contents = _authors.getContents();
      for(EObject o : _contents) {
        StringConcatenation _generate = this.generate(o);
        _builder.append(_generate, "");
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\\title{");
    {
      TextOrMarkup _title = doc.getTitle();
      EList<EObject> _contents_1 = _title.getContents();
      for(EObject o_1 : _contents_1) {
        StringConcatenation _generate_1 = this.generate(o_1);
        _builder.append(_generate_1, "");
      }
    }
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generate(final EObject doc) {
    if ((doc instanceof Document)) {
      return _generate((Document)doc);
    } else if ((doc instanceof LangDef)) {
      return _generate((LangDef)doc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(doc).toString());
    }
  }
}