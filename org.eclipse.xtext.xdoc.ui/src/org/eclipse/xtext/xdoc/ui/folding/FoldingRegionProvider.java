package org.eclipse.xtext.xdoc.ui.folding;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.xdoc.xdoc.AbstractSection;

public class FoldingRegionProvider extends DefaultFoldingRegionProvider {
	@Override
	protected boolean isHandled(EObject eObject) {
		return eObject instanceof AbstractSection;
	}
}
