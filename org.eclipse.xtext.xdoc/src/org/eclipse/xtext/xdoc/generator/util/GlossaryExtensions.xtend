package org.eclipse.xtext.xdoc.generator.util

import org.eclipse.xtext.xdoc.xdoc.GlossaryEntry
import java.util.List
import java.util.ArrayList

class GlossaryExtensions {
	
	getEntry(Iterable<GlossaryEntry> glossary, String aliasOrName) {
		var matchedEntry = glossary.findFirst([s | s.name == aliasOrName]) // || s.alias.contains(aliasOrName))])
		if(matchedEntry == null) {
			glossary.findFirst([s | s.alias.contains(aliasOrName)])
		}
	}


}