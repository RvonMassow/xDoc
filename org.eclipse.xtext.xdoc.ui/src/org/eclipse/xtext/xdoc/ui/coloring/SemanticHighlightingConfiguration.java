/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.xdoc.ui.coloring;

import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.CHAPTER;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.CODE_BLOCK;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.EMPHASIZE;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.SECTION;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.SECTION2;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.SECTION3;
import static org.eclipse.xtext.xdoc.xdoc.XdocPackage.Literals.SECTION4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * @author Sven Efftinge - Initial contribution and API
 *
 */
public class SemanticHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static final String CODE_KEYWORD = "Keywords in Code Blocks";
	public static final String CODE_COMMENT = "Comments in Code Blocks";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		addDefault(acceptor,CHAPTER.getName(),getHeaderTextStyle(16));
		addDefault(acceptor,SECTION.getName(),getHeaderTextStyle(14));
		addDefault(acceptor,SECTION2.getName(),getHeaderTextStyle(12));
		addDefault(acceptor,SECTION3.getName(),getHeaderTextStyle(11));
		addDefault(acceptor,SECTION4.getName(),getHeaderTextStyle(10));
		addDefault(acceptor,EMPHASIZE.getName(),emphasizedTextStyle());
		addDefault(acceptor,CODE_BLOCK.getName(),codeBlockTextStyle());
		addDefault(acceptor,CODE_COMMENT,codeCommentStyle());
		addDefault(acceptor,CODE_KEYWORD, keywordTextStyle());
	}

	protected void addDefault(IHighlightingConfigurationAcceptor acceptor,
			String name, TextStyle defaultTextStyle) {
		acceptor.acceptDefaultHighlighting(name, name, defaultTextStyle);
	}

	public TextStyle getHeaderTextStyle(int height) {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		FontData fd = new FontData();
		fd.setHeight(height);
		fd.setStyle(SWT.BOLD);
		textStyle.setFontData(fd);
		return textStyle;
	}

	@Override
	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
	
	public TextStyle codeBlockTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(0xDE, 0xE5, 0xEF));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
	
	public TextStyle emphasizedTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle codeCommentStyle() {
		TextStyle textStyle = super.commentTextStyle().copy();
		return textStyle;
	}

	public TextStyle codeKeywordStyle() {
		TextStyle textStyle = super.keywordTextStyle().copy();
		return textStyle;
	}
}
