/*******************************************************************************
* Copyright (c) 2008 - 2010 itemis AG (http://www.itemis.eu) and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.eclipse.xtext.xdoc.xdoc.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xdoc.xdoc.Chapter;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;

public class PartRefImplCustom extends PartRefImpl {

	@Override
	public String getName() {
		return null;
	}

	@Override
	public EList<Chapter> getChapters() {
		return getPart().getChapters();
	}

	@Override
	public TextOrMarkup getTitle() {
		return getPart().getTitle();
	}
}
