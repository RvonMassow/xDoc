package org.eclipse.xtext.xdoc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.*
import org.eclipse.xtext.xbase.*
import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.xtext.common.types.*
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.lib.IterableExtensions
import com.google.inject.Inject
import org.eclipse.xtext.xdoc.generator.util.Utils
import static extension org.eclipse.xtext.xdoc.generator.util.StringUtils.*

class HtmlGenerator implements IGenerator {
	
	@Inject extension Utils utils
	 
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(element: resource.allContentsIterable) {
			if(element instanceof Document) {
				val doc = element as Document				
				fsa.generateFile(doc.eResource.URI.lastSegment+".hmtl", doc.generate)
			}
		}
	}
	def doGenerate(EObject obj, IFileSystemAccess fsa) {
		if (obj instanceof Document){
			val doc = obj as Document; 
			fsa.generateFile(doc.eResource.URI.lastSegment+".html", doc.generate)
		}
		''''''
	}
	
	def dispatch generate(Document doc) {
		'''
		<html>
			<head>
			<title>«doc.title.generate»</title>
			</head>
			<body>
				<h1>«doc.title.generate»</h1>
				«doc.chapters.map([e|e.generate]).join»
			</body>
		</html>
		'''
	}
	def dispatch generate(Chapter chap){
		'''
		<h2>«chap.title.generate»</h2>
		«chap.name.genLabel»
		«FOR c : chap.contents»
		<p>
			«c.generate»
		</p>
		«ENDFOR»
		«chap.subSections.map([e|e.generate]).join»
		'''
	}
	def dispatch generate(Section sec){
		'''
		<h3>«sec.title.generate»</h3>
		«sec.name.genLabel»
		«FOR c : sec.contents»
		<p>
			«c.generate»
		</p>
		«ENDFOR»
		«sec.subSections.map([e|e.generate]).join»
		'''
	}
	
	def dispatch generate(Section2 sec){
		'''
		<h4>«sec.title.generate»</h4>
		«sec.name.genLabel»
		«FOR c : sec.contents»
		<p>
			«c.generate»
		</p>
		«ENDFOR»
		«sec.subSections.map([e|e.generate]).join»
		'''
	}
	def dispatch generate(Section3 sec){
		'''
		<h5>«sec.title.generate»</h5>
		«sec.name.genLabel»
		«FOR c : sec.contents»
		<p>
			«c.generate»
		</p>
		«ENDFOR»
		«sec.subSections.map([e|e.generate]).join»
		'''
	}
	def dispatch generate(Section4 sec){
		'''
		«FOR c : sec.contents»
		<p>
			<b>«sec.title.generate»<b> < br />
			«sec.name.genLabel»
			«c.generate»
		</p>
		«ENDFOR»
		'''
	}
	def dispatch generate(TextOrMarkup tom){
		'''
		«FOR c : tom.contents»
		«c.genText»
		«ENDFOR»
		'''
	}
	
	def genLabel(String s){
		'''
		«IF s != null »
		<a name="«s»""></a>
		«ENDIF»
		'''
	}
	def dispatch genText(Object o){
		''''''
	}
	def dispatch genText(Table tab){
		'''
		<table>
		«FOR row : tab.rows»
			<tr>
				«row.genText»
			</tr>
		«ENDFOR»
		</table>
		'''
	}
	
	def dispatch genText(TableRow row){
		'''
		«FOR td : row.data»
			<td>
				«td.genText»
			</td>
		«ENDFOR»
		'''
	}
	
	def dispatch genText(TableData tData){
		tData.contents.map([e|e.generate]).join
	}
	
	def dispatch genText(TextPart tp){
		'''
		«tp.text.unescapeXdocChars.escapeHTMLChars»
		'''
	}
	
	def dispatch genText(OrderedList ol){
		'''
		<ol>
			«FOR item:ol.items»
				«item.genText»
			«ENDFOR»
		</ol>'''
	}
	def dispatch genText(UnorderedList ol){
		'''
		<ul>
			«FOR item:ol.items»
				«item.genText»
			«ENDFOR»
		</ul>'''
	}
	
	def dispatch genText(Item item){
		'''
		<li>
		«FOR c:item.contents»
			«c.generate»
		«ENDFOR»
		</li>'''
	}
	def dispatch genText(Emphasize em){
		'''
		<em>
		«FOR c:em.contents»
			«c.generate»
		«ENDFOR»
		</em>'''
	}
	def dispatch genText(Ref a){
		'''
		<a href="#«a.ref.name»">
		«IF a.contents.isEmpty()»
			«a.ref»
		«ELSE»
			«FOR c:a.contents»
				«c.generate»
			«ENDFOR»
		«ENDIF»
		</a>
		'''
	}
	def dispatch genText(Anchor a){
		'''<a href="#«a.name»"></a>'''
	}
	def dispatch genText(Link link){
		'''<a href="«link.url»">«link.text.unescapeXdocChars.escapeHTMLChars»</a>'''
	}
	def dispatch genText(ImageRef img){
		//
		'''
		<div class="image" >
			«IF img.name != null»
			«img.name.genLabel»
			«ENDIF»
			<img src="«img.path.unescapeXdocChars»" class="«img.clazz.unescapeXdocChars»" style="«img.style.unescapeXdocChars»" />
			«img.caption.unescapeXdocChars.escapeHTMLChars»
		</div>'''
	}
	def dispatch genText(CodeBlock code){
		'''
		«IF code.isInlineCode»
		<span class="inlinecode">«FOR c:code.contents»«code.contents.genCode(code.language)»«ENDFOR»</span>
		«ELSE»
		<div class="literallayout">
			<div class="incode">
			<p class="code">
			«FOR c:code.removeIndent.contents»
				«c.genCode(code.language)»
			«ENDFOR»
			</p>
			</div>
		</div>
		«ENDIF»
		'''
	}
	def dispatch genText(CodeRef cref){
		'''<em>«cref.element.qualifiedName.unescapeXdocChars.escapeHTMLChars»</em>'''
	}
	def dispatch genText(MarkupInCode mic){''''''}
	
	
	def dispatch genCode(Object o, LangDef lang){}
	def dispatch genCode(Code code, LangDef lang){
		'''«code.contents.unescapeXdocChars.formatCode(lang)»'''
	}
	def dispatch genCode(MarkupInCode mic, LangDef lang){}
	
	
	
}