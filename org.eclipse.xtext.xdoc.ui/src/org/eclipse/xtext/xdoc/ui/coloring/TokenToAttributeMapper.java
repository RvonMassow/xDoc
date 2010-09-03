package org.eclipse.xtext.xdoc.ui.coloring;

import java.util.Set;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

import com.google.common.collect.Sets;

public class TokenToAttributeMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	private Set<String> keywords = Sets.newHashSet();
	
	{
		keywords.add("'['");
		keywords.add("']'");
		keywords.add("':'");
	}
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (keywords.contains(tokenName))
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		return super.calculateId(tokenName, tokenType);
	}
}
