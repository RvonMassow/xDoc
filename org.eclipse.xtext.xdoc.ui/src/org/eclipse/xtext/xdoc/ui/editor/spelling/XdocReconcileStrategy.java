package org.eclipse.xtext.xdoc.ui.editor.spelling;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.ui.texteditor.spelling.SpellingReconcileStrategy;
import org.eclipse.xtext.ui.editor.reconciler.XtextDocumentReconcileStrategy;

public class XdocReconcileStrategy extends XtextDocumentReconcileStrategy implements IReconcilingStrategyExtension {


	private SpellingReconcileStrategy spellingStrategy;

	public XdocReconcileStrategy() {
	}

	@Override
	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		super.reconcile(dirtyRegion, subRegion);
		if(spellingStrategy != null){
			spellingStrategy.reconcile(dirtyRegion, subRegion);
		}
	}

	@Override
	public void reconcile(IRegion subRegion) {
		super.reconcile(subRegion);
		if(spellingStrategy != null){
			spellingStrategy.reconcile(null, subRegion);
		}
	}

	@Override
	public void setDocument(IDocument document) {
		super.setDocument(document);
		spellingStrategy.setDocument(document);
		initialReconcile();
	}

	public void setProgressMonitor(IProgressMonitor monitor) {
		spellingStrategy.setProgressMonitor(monitor);
	}

	public void initialReconcile() {
		if(spellingStrategy != null){
			spellingStrategy.initialReconcile();
		}
	}

	public void addSpellSupport(SpellingReconcileStrategy spellingStrategy){
		if(this.spellingStrategy == null) {
			this.spellingStrategy = spellingStrategy;
		}
	}
}
