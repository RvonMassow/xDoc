package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.GlossaryEntry

class GlossaryExtensions {
	
	def getEntry(Iterable<GlossaryEntry> glossary, String aliasOrName) {
		var matchedEntry = glossary.findFirst([s | s.name == aliasOrName]) // || s.alias.contains(aliasOrName))])
		if(matchedEntry == null) {
			glossary.findFirst([s | s.alias.contains(aliasOrName)])
		}
	}


}