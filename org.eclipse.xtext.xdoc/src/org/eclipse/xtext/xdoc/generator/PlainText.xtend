package org.eclipse.xtext.xdoc.generator

import org.eclipse.xtext.xdoc.xdoc.*
import org.eclipse.xtext.xtend2.lib.StringConcatenation

class PlainText {

	dispatch genPlainText(TextOrMarkup tom) {
		tom.contents.fold('''''', [e1, e2 | '''«e2»«e1.genPlainText»'''])
	}

	dispatch genPlainText(TextPart tp){
		tp.text
	}

	dispatch genPlainText(Emphasize em){
		em.contents.fold('''''', [e1, e2 | '''«e2»«e1.genPlainText»'''])
	}

	dispatch genPlainText(Link l) {
		val text = '''«l.text»'''
		if(text.toString != text)
			text
		else 
			'''"«l.url»"'''
	}
}