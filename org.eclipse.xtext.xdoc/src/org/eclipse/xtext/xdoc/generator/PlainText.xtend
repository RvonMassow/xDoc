package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.xdoc.xdoc.CodeBlock
import org.eclipse.xtext.xdoc.xdoc.CodeRef
import org.eclipse.xtext.xdoc.xdoc.Emphasize
import org.eclipse.xtext.xdoc.xdoc.Link
import org.eclipse.xtext.xdoc.xdoc.Ref
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup
import org.eclipse.xtext.xdoc.xdoc.TextPart

class PlainText {

	def dispatch genPlainText(TextOrMarkup tom) {
		tom.contents.fold('''''', [e1, e2 | '''«e1»«e2.genPlainText»'''])
	}

	def dispatch genPlainText(TextPart tp){
		tp.text
	}

	def dispatch genPlainText(Emphasize em){
		em.contents.fold('''''', [e1, e2 | '''«e1»«e2.genPlainText»'''])
	}

	def dispatch genPlainText(Link l) {
		val text = '''«l.text»'''
		if(text.toString != text)
			text
		else 
			'''"«l.url»"'''
	}

	def dispatch genPlainText(Ref ref) {
		'''
			«IF !ref.contents.empty »
				«FOR e :ref.contents»
					«e.genPlainText»
				«ENDFOR»
			«ELSE»
				«ref.ref.name»
			«ENDIF»
		'''
	}

	def dispatch genPlainText(CodeRef cRef) {
		'''«cRef.element.qualifiedName»'''
	}

	def dispatch genPlainText(CodeBlock cb) {
		'''
		«FOR c: cb.contents»
			«c.genPlainText»
		«ENDFOR»
		'''
	}

	def dispatch genPlainText(Object o) '''
	'''

	def dispatch genPlainText(Void v) '''
	'''
}