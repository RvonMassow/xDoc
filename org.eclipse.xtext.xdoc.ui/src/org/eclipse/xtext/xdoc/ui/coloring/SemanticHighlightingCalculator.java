/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.xdoc.ui.coloring;

import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.ABSTRACT_SECTION__TITLE;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.CHAPTER;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.CODE_BLOCK;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.CODE_BLOCK__CONTENTS;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.CODE__CONTENTS;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.EMPHASIZE;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.EMPHASIZE__CONTENTS;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.SECTION;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.SECTION2;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.SECTION3;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.SECTION4;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xdoc.generator.util.StringUtils;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.Section;
import org.eclipse.xtext.xdoc.xdoc.Section2;
import org.eclipse.xtext.xdoc.xdoc.Section3;
import org.eclipse.xtext.xdoc.xdoc.Section4;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	public void provideHighlightingFor(final XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getContents().isEmpty())
			return;
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject eObject = (EObject) iterator.next();
			highlightingFor.invoke(eObject,acceptor);
		}
	}
	
	private PolymorphicDispatcher<Void> highlightingFor = PolymorphicDispatcher.createForSingleTarget("highlight", 2, 2, this);
	
	protected void highlight(Object obj, IHighlightedPositionAcceptor acceptor) {}
	protected void highlight(Chapter obj, IHighlightedPositionAcceptor acceptor) {
		highlightFeature(obj, acceptor, ABSTRACT_SECTION__TITLE, CHAPTER.getName());
	}
	protected void highlight(Section obj, IHighlightedPositionAcceptor acceptor) {
		highlightFeature(obj, acceptor, ABSTRACT_SECTION__TITLE, SECTION.getName());
	}
	protected void highlight(Section2 obj, IHighlightedPositionAcceptor acceptor) {
		highlightFeature(obj, acceptor, ABSTRACT_SECTION__TITLE, SECTION2.getName());
	}
	protected void highlight(Section3 obj, IHighlightedPositionAcceptor acceptor) {
		highlightFeature(obj, acceptor, ABSTRACT_SECTION__TITLE, SECTION3.getName());
	}
	protected void highlight(Section4 obj, IHighlightedPositionAcceptor acceptor) {
		highlightFeature(obj, acceptor, ABSTRACT_SECTION__TITLE, SECTION4.getName());
	}
	protected void highlight(Emphasize obj, IHighlightedPositionAcceptor acceptor) {
		highlightFeature(obj, acceptor, EMPHASIZE__CONTENTS, EMPHASIZE.getName());
	}
	protected void highlight(CodeBlock obj, IHighlightedPositionAcceptor acceptor) {
		highlightFeature(obj, acceptor, CODE_BLOCK__CONTENTS, CODE_BLOCK.getName());
	}

	protected void highlight(Code obj, IHighlightedPositionAcceptor acceptor) {
		// highlightFeature(obj, acceptor, CODE_BLOCK__CONTENTS, CODE_BLOCK.getName());
		List<INode> nodes = NodeModelUtils.findNodesForFeature(obj, CODE__CONTENTS);
		LangDef lang = ((CodeBlock) obj.eContainer()).getLanguage();
		if(!nodes.isEmpty()) {
			int offset = 0;
			String[] result;
			String code = obj.getContents();
			Pattern keywordPattern = getPattern(lang);
			do{
				result = highlightSpecial(code, acceptor, nodes.get(0), offset);
				if(lang != null)
				addKeywordHighLighting(result[0], keywordPattern, nodes.get(0).getOffset() + offset, acceptor);
				offset += result[0].length() + (result.length > 1 ? result[1].length() : 0);
				
				if(result.length == 3) {
					code = result[2];
				}
			} while (result.length == 3);
		}
	}
	
	private void addKeywordHighLighting(String string, Pattern keywordPattern, int offset, IHighlightedPositionAcceptor acceptor) {
		Matcher m = keywordPattern.matcher(string);
		while(m.find()) {
			int start = m.start();
			int length = m.end() - start;
			acceptor.addPosition(offset + start, length, SemanticHighlightingConfiguration.CODE_KEYWORD);
		}
	}

	private Pattern getPattern(LangDef lang) {
		StringBuffer regex = new StringBuffer().append("(?<![\\w])(");
		for(int i = 0; i < lang.getKeywords().size() - 1; i++){
			regex.append(lang.getKeywords().get(i)).append("|");
		}
		if(lang.getKeywords().size() > 0){
			regex.append(lang.getKeywords().get(lang.getKeywords().size() - 1));
		}
		regex.append(")(?!\\w)");
		return Pattern.compile(regex.toString());
	}

	protected void highlightFeature(EObject obj,
			IHighlightedPositionAcceptor acceptor, EReference feature, String id) {
		List<INode> list = NodeModelUtils.findNodesForFeature(obj, feature);
		if (list.isEmpty())
			return;
		INode node = list.get(0);
		acceptor.addPosition(node.getOffset(), node.getLength(), id);
	}
	
	protected String[] highlightSpecial(String code, IHighlightedPositionAcceptor acceptor, INode node, int offset) {
		int slC = -1, mlCStart = -1, doubleQuoteStart = -1, singleQuoteStart = -1;
		Matcher matcher;
		if(StringUtils.mlCommentEnd != null) {
			matcher = StringUtils.patterns.get(StringUtils.mlCommentStart).matcher(code);
			if(matcher.find(0))
				mlCStart = matcher.start();
		}
		matcher = StringUtils.patterns.get(StringUtils.slComment).matcher(code);
		if(matcher.find(0))
			slC = matcher.start();
		matcher = StringUtils.patterns.get(StringUtils.doubleQuote).matcher(code);
		if(matcher.find(0))
			doubleQuoteStart = matcher.start();
		matcher = StringUtils.patterns.get(StringUtils.singleQuote).matcher(code);
		if(matcher.find(0))
			singleQuoteStart = matcher.start();
		int min = Integer.MAX_VALUE;
		if(StringUtils.slComment != "" && slC >= 0 && slC < min){
			min = slC;
		}
		if(StringUtils.mlCommentStart != "" && mlCStart >= 0 && mlCStart < min){
			min = mlCStart;
		}
		if(doubleQuoteStart >= 0 && doubleQuoteStart < min){
			min = doubleQuoteStart;
		}
		if(singleQuoteStart >= 0 && singleQuoteStart < min){
			min = singleQuoteStart;
		}
		String[] res;
		if(min < Integer.MAX_VALUE){
			if(min == slC){
				res = StringUtils.breakApart(code, slC, StringUtils.slComment.length(), "\n");
				acceptor.addPosition(node.getOffset() + offset + res[0].length(), res[1].length(), SemanticHighlightingConfiguration.CODE_COMMENT);
				return res;
			}
			else if(min == mlCStart){
				res = StringUtils.breakApart(code, min, StringUtils.mlCommentStart.length(), StringUtils.mlCommentEnd);
				acceptor.addPosition(node.getOffset() + offset + res[0].length(), res[1].length(), SemanticHighlightingConfiguration.CODE_COMMENT);
				return res;
			} else if(min == doubleQuoteStart) {
				res = StringUtils.breakApart(code, min, StringUtils.doubleQuote.length(), StringUtils.doubleQuote);
				acceptor.addPosition(node.getOffset() + offset + res[0].length(), res[1].length(), SemanticHighlightingConfiguration.STRING_ID);
				return res;
			} else if(min == singleQuoteStart) {
				res = StringUtils.breakApart(code, min, StringUtils.singleQuote.length(), StringUtils.singleQuote);
				acceptor.addPosition(node.getOffset() + offset + res[0].length(), res[1].length(), SemanticHighlightingConfiguration.STRING_ID);
				return res;
			}
		}
		return new String[] {code};
	}
}