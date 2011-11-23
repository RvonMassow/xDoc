package org.eclipse.xtext.xdoc.generator

import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xdoc.generator.util.EclipseNamingExtensions
import org.eclipse.xtext.xdoc.xdoc.AbstractSection
import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.Section
import java.io.File

class PHPPhoenixGenerator {

	@Inject extension EclipseNamingExtensions ene
	@Inject extension PlainText pt

	def dispatch void generatePHP(AbstractSection ^as, IFileSystemAccess fsa){
		fsa.generateFile(^as.eResource.URI.trimFileExtension.lastSegment + ".php", Outlets::WEB_SITE,
		'''
			<?php require_once($_SERVER['DOCUMENT_ROOT'] . "/eclipse.org-common/system/app.class.php");	require_once($_SERVER['DOCUMENT_ROOT'] . "/eclipse.org-common/system/nav.class.php"); 	require_once($_SERVER['DOCUMENT_ROOT'] . "/eclipse.org-common/system/menu.class.php"); 	$App 	= new App();	$Nav	= new Nav();	$Menu 	= new Menu();		include($App->getProjectCommon());    # All on the same line to unclutter the user's desktop'
				include("include.php");
				$pageTitle 		= "«^as.title.genPlainText»";
				
				$html = file_get_contents('«^as.resourceURL»');
			
				$Nav->setLinkList(array());
				«genScriptsAndStyles(^as)»
				# Generate the web page
				$App->generatePage("Nova", $Menu, NULL, $pageAuthor, $pageKeywords, $pageTitle, $html);
			?>
		'''
		)
	}

	def dispatch void generatePHP(Document doc, IFileSystemAccess fsa){
		fsa.generateFile("index.php", Outlets::WEB_SITE,
		'''
			<?php require_once($_SERVER['DOCUMENT_ROOT'] . "/eclipse.org-common/system/app.class.php");	require_once($_SERVER['DOCUMENT_ROOT'] . "/eclipse.org-common/system/nav.class.php"); 	require_once($_SERVER['DOCUMENT_ROOT'] . "/eclipse.org-common/system/menu.class.php"); 	$App 	= new App();	$Nav	= new Nav();	$Menu 	= new Menu();		include($App->getProjectCommon());    # All on the same line to unclutter the user's desktop'
				include("include.php");
				«doc.genScriptsAndStyles»
				$pageTitle 		= "«doc.title.genPlainText»";
				
				$html .=  file_get_contents('_index.html');
			
				# Generate the web page
				$App->generatePage("Nova", $Menu, NULL, $pageAuthor, $pageKeywords, $pageTitle, $html);
			?>
		'''
		)
		if(!new File(Outlets::WEB_SITE_PATH_NAME + "/" + "include.php").exists) {
			fsa.generateFile("include.php", Outlets::WEB_SITE,
			'''
			<?php


				# Set the theme for your project's web pages.
				# See the Committer Tools "How Do I" for list of themes
				# https://dev.eclipse.org/committers/
				# Optional: defaults to system theme 
				$theme = "Nova";
				
				# Define your project-wide Nav bars here.
				# Format is Link text, link URL (can be http://www.someothersite.com/), target (_self, _blank), level (1, 2 or 3)
				# these are optional
				# $Nav->setLinkList(array());

«««				$pageKeywords	= "xtext, dsl, modeling, domain specific language, textual";
				«IF doc.authors != null»$pageAuthor		= "«doc.authors.genPlainText»";«ENDIF»
				«IF doc.title != null»$pageTitle 		= "«doc.title.genPlainText»";«ENDIF»

«««				$Menu->setMenuItemList(array());
«««				$Menu->addMenuItem("Home", "/Xtext", "_self");
«««				$Menu->addMenuItem("Download", "/Xtext/download", "_self");
«««				$Menu->addMenuItem("Documentation", "/Xtext/documentation", "_self");
«««				$Menu->addMenuItem("Support", "/Xtext/support", "_self");
«««				$Menu->addMenuItem("Community", "/Xtext/community", "_self");
«««				$Menu->addMenuItem("Developers", "/Xtext/developers", "_self");
«««
«««				$App->AddExtraHtmlHeader('<link rel="stylesheet" type="text/css" href="/Xtext/style.css"/>' . "\n\t");
«««				$App->AddExtraHtmlHeader('<link rel="stylesheet" type="text/css" href="/Xtext/style2.css"/>' . "\n\t");
				$App->AddExtraHtmlHeader('<link rel="stylesheet" type="text/css" href="code.css"/>' . "\n\t");
				$App->AddExtraHtmlHeader('<link rel="stylesheet" type="text/css" href="book.css"/>' . "\n\t");
				$App->AddExtraHtmlHeader('<link rel="stylesheet" type="text/css" href="novaAddon.css"/>' . "\n\t");

				$App->Promotion = TRUE;
				?>
			'''
			)
		}
	}

	// todo: docname of chapter!
	def CharSequence genScriptsAndStyles(AbstractSection ^as) '''

		$App->AddExtraHtmlHeader('
		<script type="text/javascript">
		function init() {
			var docName = "«^as.fullURL»";
		    initTocMenu(docName);
			highlightCurrentSection(docName);
		}

		function initTocMenu(ActiveSubTocElementId){
			var menu = document.getElementById("leftnav");

			var chapters = menu.children;
			addHideSubsectionFunction(chapters);
			«IF ^as instanceof Section»
			var subToc = document.getElementById(ActiveSubTocElementId).parentNode;
			«ELSE»
			var subToc = document.getElementById(\'subToc_\' + ActiveSubTocElementId);
			«ENDIF»
			if(subToc) {
				subToc.style.display = "block";
				subToc.previousElementSibling.children[0].style.display = "none"
				subToc.previousElementSibling.children[1].style.display = "inline"
			}
		}
		
		function switchImages(chap) {
			
		}

		function addHideSubsectionFunction(items){
			for (var i = 0; i < items.length; i++) {
				if (items[i].firstElementChild != null && items[i].className == "separator"){
					if(items[i].firstElementChild.firstElementChild != null){
						items[i].firstElementChild.firstElementChild.onclick = function(){this.nextElementSibling.style.display="inline";this.style.display = "none"; toc_toggle_subsections(this.parentNode.parentNode);};
						items[i].firstElementChild.firstElementChild.nextElementSibling.onclick = function(){this.previousElementSibling.style.display="inline";this.style.display = "none"; toc_toggle_subsections(this.parentNode.parentNode);};
					}
		 			items[i].firstElementChild.style.cursor = "pointer";
				}
			}
		}

		function toc_toggle_subsections(chap){
			if ( chap.children[1].style.display != "none" ) {
				chap.children[1].style.display = "none"
			} else {
				chap.children[1].style.display = "block"
			}
		}

		function highlightCurrentSection(sec) {
			document.getElementById(sec).style.backgroundColor= "#D0D0D0"
		}

		if ( window.addEventListener ) { 
			window.addEventListener( "load", init, false );
		}
		else if ( window.attachEvent ) { 
			window.attachEvent( "onload", init );
		} else 
			if ( window.onLoad ) {
				window.onload = init;
		}
		</script>');
		
	'''
}