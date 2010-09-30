package org.eclipse.xtext.xdoc.xdoc.impl;

import org.eclipse.xtext.xdoc.XdocUtil;

public class DocumentImplCustom extends DocumentImpl {

	@Override
	public String getName() {
		return this.name == null ? XdocUtil.toString(this.getTitle())
				: this.name;
	}
}
