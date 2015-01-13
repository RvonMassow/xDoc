package org.eclipse.xtext.xdoc.ui.editor.spelling;

import static org.eclipse.xtext.xdoc.ui.editor.model.XdocTerminalsTokenTypeToPartitionMapper.TEXT_PARTITION;

import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.reconciler.XtextSpellingReconcileStrategy;

public class XdocSpellingReconcileStrategy extends
		XtextSpellingReconcileStrategy {

	public static class factory extends XtextSpellingReconcileStrategy.Factory {
		@Override
		public XtextSpellingReconcileStrategy create(ISourceViewer sourceViewer) {
			return new XdocSpellingReconcileStrategy(sourceViewer);
		}
	}
	
	protected XdocSpellingReconcileStrategy(ISourceViewer viewer) {
		super(viewer);
	}

	@Override
	protected boolean shouldProcess(ITypedRegion typedRegion) {
		if (super.shouldProcess(typedRegion)
				|| TEXT_PARTITION.equals(typedRegion.getType())) {
			return true;
		}
		return false;
	}
}
