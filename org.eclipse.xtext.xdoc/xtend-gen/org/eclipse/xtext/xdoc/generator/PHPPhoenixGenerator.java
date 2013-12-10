package org.eclipse.xtext.xdoc.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.File;
import java.util.Arrays;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xdoc.generator.Outlets;
import org.eclipse.xtext.xdoc.generator.PlainText;
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;

@SuppressWarnings("all")
public class PHPPhoenixGenerator {
  @Inject
  @Extension
  private EclipseNamingExtensions ene;
  
  @Inject
  @Extension
  private PlainText pt;
  
  protected void _generatePHP(final AbstractSection as, final IFileSystemAccess fsa) {
    Resource _eResource = as.eResource();
    URI _uRI = _eResource.getURI();
    URI _trimFileExtension = _uRI.trimFileExtension();
    String _lastSegment = _trimFileExtension.lastSegment();
    String _plus = (_lastSegment + ".php");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php require_once($_SERVER[\'DOCUMENT_ROOT\'] . \"/eclipse.org-common/system/app.class.php\");\trequire_once($_SERVER[\'DOCUMENT_ROOT\'] . \"/eclipse.org-common/system/nav.class.php\"); \trequire_once($_SERVER[\'DOCUMENT_ROOT\'] . \"/eclipse.org-common/system/menu.class.php\"); \t$App \t= new App();\t$Nav\t= new Nav();\t$Menu \t= new Menu();\t\tinclude($App->getProjectCommon());    # All on the same line to unclutter the user\'s desktop\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("include(\"include.php\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$pageTitle \t\t= \"");
    TextOrMarkup _title = as.getTitle();
    CharSequence _genPlainText = this.pt.genPlainText(_title);
    _builder.append(_genPlainText, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$html = file_get_contents(\'");
    String _resourceURL = this.ene.getResourceURL(as);
    _builder.append(_resourceURL, "\t");
    _builder.append("\');");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$Nav->setLinkList(array());");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _genScriptsAndStyles = this.genScriptsAndStyles(as);
    _builder.append(_genScriptsAndStyles, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("# Generate the web page");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$App->generatePage(\"Nova\", $Menu, NULL, $pageAuthor, $pageKeywords, $pageTitle, $html);");
    _builder.newLine();
    _builder.append("?>");
    _builder.newLine();
    fsa.generateFile(_plus, Outlets.WEB_SITE, _builder);
  }
  
  protected void _generatePHP(final Document doc, final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?php require_once($_SERVER[\'DOCUMENT_ROOT\'] . \"/eclipse.org-common/system/app.class.php\");\trequire_once($_SERVER[\'DOCUMENT_ROOT\'] . \"/eclipse.org-common/system/nav.class.php\"); \trequire_once($_SERVER[\'DOCUMENT_ROOT\'] . \"/eclipse.org-common/system/menu.class.php\"); \t$App \t= new App();\t$Nav\t= new Nav();\t$Menu \t= new Menu();\t\tinclude($App->getProjectCommon());    # All on the same line to unclutter the user\'s desktop\'");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("include(\"include.php\");");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _genScriptsAndStyles = this.genScriptsAndStyles(doc);
    _builder.append(_genScriptsAndStyles, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("$pageTitle \t\t= \"");
    TextOrMarkup _title = doc.getTitle();
    CharSequence _genPlainText = this.pt.genPlainText(_title);
    _builder.append(_genPlainText, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$html .=  file_get_contents(\'_index.html\');");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# Generate the web page");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$App->generatePage(\"Nova\", $Menu, NULL, $pageAuthor, $pageKeywords, $pageTitle, $html);");
    _builder.newLine();
    _builder.append("?>");
    _builder.newLine();
    fsa.generateFile("index.php", Outlets.WEB_SITE, _builder);
    File _file = new File(((Outlets.WEB_SITE_PATH_NAME + "/") + "include.php"));
    boolean _exists = _file.exists();
    boolean _not = (!_exists);
    if (_not) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<?php");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("# Set the theme for your project\'s web pages.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("# See the Committer Tools \"How Do I\" for list of themes");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("# https://dev.eclipse.org/committers/");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("# Optional: defaults to system theme ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("$theme = \"Nova\";");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("# Define your project-wide Nav bars here.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("# Format is Link text, link URL (can be http://www.someothersite.com/), target (_self, _blank), level (1, 2 or 3)");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("# these are optional");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("# $Nav->setLinkList(array());");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      {
        TextOrMarkup _authors = doc.getAuthors();
        boolean _notEquals = (!Objects.equal(_authors, null));
        if (_notEquals) {
          _builder_1.append("$pageAuthor\t\t= \"");
          TextOrMarkup _authors_1 = doc.getAuthors();
          CharSequence _genPlainText_1 = this.pt.genPlainText(_authors_1);
          _builder_1.append(_genPlainText_1, "\t");
          _builder_1.append("\";");
        }
      }
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      {
        TextOrMarkup _title_1 = doc.getTitle();
        boolean _notEquals_1 = (!Objects.equal(_title_1, null));
        if (_notEquals_1) {
          _builder_1.append("$pageTitle \t\t= \"");
          TextOrMarkup _title_2 = doc.getTitle();
          CharSequence _genPlainText_2 = this.pt.genPlainText(_title_2);
          _builder_1.append(_genPlainText_2, "\t");
          _builder_1.append("\";");
        }
      }
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("$App->AddExtraHtmlHeader(\'<link rel=\"stylesheet\" type=\"text/css\" href=\"code.css\"/>\' . \"\\n\\t\");");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("$App->AddExtraHtmlHeader(\'<link rel=\"stylesheet\" type=\"text/css\" href=\"book.css\"/>\' . \"\\n\\t\");");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("$App->AddExtraHtmlHeader(\'<link rel=\"stylesheet\" type=\"text/css\" href=\"novaAddon.css\"/>\' . \"\\n\\t\");");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("$App->Promotion = TRUE;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("?>");
      _builder_1.newLine();
      fsa.generateFile("include.php", Outlets.WEB_SITE, _builder_1);
    }
  }
  
  public CharSequence genScriptsAndStyles(final AbstractSection as) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("$App->AddExtraHtmlHeader(\'");
    _builder.newLine();
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("function init() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var docName = \"");
    String _fullURL = this.ene.getFullURL(as);
    _builder.append(_fullURL, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("initTocMenu(docName);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("highlightCurrentSection(docName);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function initTocMenu(ActiveSubTocElementId){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var menu = document.getElementById(\"leftnav\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var chapters = menu.children;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("addHideSubsectionFunction(chapters);");
    _builder.newLine();
    {
      if ((as instanceof Section)) {
        _builder.append("\t");
        _builder.append("var subToc = document.getElementById(ActiveSubTocElementId).parentNode;");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("var subToc = document.getElementById(\\\'subToc_\\\' + ActiveSubTocElementId);");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("if(subToc) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("subToc.style.display = \"block\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("subToc.previousElementSibling.children[0].style.display = \"none\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("subToc.previousElementSibling.children[1].style.display = \"inline\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function switchImages(chap) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function addHideSubsectionFunction(items){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (var i = 0; i < items.length; i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (items[i].firstElementChild != null && items[i].className == \"separator\"){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(items[i].firstElementChild.firstElementChild != null){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("items[i].firstElementChild.firstElementChild.onclick = function(){this.nextElementSibling.style.display=\"inline\";this.style.display = \"none\"; toc_toggle_subsections(this.parentNode.parentNode);};");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("items[i].firstElementChild.firstElementChild.nextElementSibling.onclick = function(){this.previousElementSibling.style.display=\"inline\";this.style.display = \"none\"; toc_toggle_subsections(this.parentNode.parentNode);};");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("items[i].firstElementChild.style.cursor = \"pointer\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function toc_toggle_subsections(chap){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if ( chap.children[1].style.display != \"none\" ) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("chap.children[1].style.display = \"none\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("chap.children[1].style.display = \"block\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function highlightCurrentSection(sec) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("document.getElementById(sec).style.backgroundColor= \"#D0D0D0\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if ( window.addEventListener ) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("window.addEventListener( \"load\", init, false );");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("else if ( window.attachEvent ) { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("window.attachEvent( \"onload\", init );");
    _builder.newLine();
    _builder.append("} else ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if ( window.onLoad ) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("window.onload = init;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</script>\');");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public void generatePHP(final AbstractSection doc, final IFileSystemAccess fsa) {
    if (doc instanceof Document) {
      _generatePHP((Document)doc, fsa);
      return;
    } else if (doc != null) {
      _generatePHP(doc, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(doc, fsa).toString());
    }
  }
}
