package org.eclipse.xtext.xdoc.ui.editor.spelling;

import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.reconciler.IReconcilingStrategyFactory;
import org.eclipse.xtext.ui.editor.reconciler.XtextSpellingReconcileStrategy;

import com.google.inject.Binder;
import com.google.inject.Module;

public class XdocSpellingStrategyFactory extends IReconcilingStrategyFactory.Default{

	@Override
	protected Module createReconcileStrategyModule(final ISourceViewer sourceViewer) {
		return new Module() {

			public void configure(Binder binder) {
				binder.bind(ISourceViewer.class).toInstance(sourceViewer);
				binder.bind(XtextSpellingReconcileStrategy.class).to(XdocSpellingReconcileStrategy.class);
			}
		};
	}
}
