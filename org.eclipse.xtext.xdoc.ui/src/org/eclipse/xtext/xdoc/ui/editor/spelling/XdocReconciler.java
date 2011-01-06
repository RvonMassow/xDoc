package org.eclipse.xtext.xdoc.ui.editor.spelling;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.spelling.SpellingReconcileStrategy;
import org.eclipse.xtext.ui.editor.reconciler.XtextReconciler;

import com.google.inject.Inject;

public class XdocReconciler extends XtextReconciler {

	private boolean installed;

	@Inject
	public XdocReconciler(XdocReconcileStrategy strat){
		super(strat);
	}

	@Override
	public void install(ITextViewer textViewer) {
		if(!this.installed){
			super.install(textViewer);
			if (textViewer instanceof ISourceViewer) {
				ISourceViewer viewer = (ISourceViewer) textViewer;
				((XdocReconcileStrategy) this.getReconcilingStrategy(""))
						.addSpellSupport(new SpellingReconcileStrategy(viewer,
								EditorsUI.getSpellingService()));
			}
			installed = true;
		}
	}

}
