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
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * @author Sven Efftinge - Initial contribution and API
 *
 */
public class SemanticHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		addDefault(acceptor,CHAPTER.getName(),defaultTextStyle());
		addDefault(acceptor,SECTION.getName(),defaultTextStyle());
		addDefault(acceptor,SECTION2.getName(),defaultTextStyle());
		addDefault(acceptor,SECTION3.getName(),defaultTextStyle());
		addDefault(acceptor,SECTION4.getName(),defaultTextStyle());
		addDefault(acceptor,EMPHASIZE.getName(),emphasizedTextStyle());
		addDefault(acceptor,CODE_BLOCK.getName(),codeBlockTextStyle());
	}

	protected void addDefault(IHighlightingConfigurationAcceptor acceptor,
			String name, TextStyle defaultTextStyle) {
		acceptor.acceptDefaultHighlighting(name, name, defaultTextStyle);
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
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
//		textStyle.setFontData(new FontData("Monaco"));
		return textStyle;
	}
	
	public TextStyle emphasizedTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
