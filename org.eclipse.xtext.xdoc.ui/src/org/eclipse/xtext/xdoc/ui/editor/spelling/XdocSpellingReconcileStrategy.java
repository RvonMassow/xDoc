package org.eclipse.xtext.xdoc.ui.editor.spelling;

import static org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION;
import static org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper.SL_COMMENT_PARTITION;
import static org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper.STRING_LITERAL_PARTITION;
import static org.eclipse.xtext.xdoc.ui.editor.model.XdocTerminalsTokenTypeToPartitionMapper.TEXT_PARTITION;

import javax.inject.Inject;

import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.reconciler.XtextSpellingReconcileStrategy;

public class XdocSpellingReconcileStrategy extends
		XtextSpellingReconcileStrategy {

	@Inject
	public XdocSpellingReconcileStrategy(ISourceViewer viewer) {
		super(viewer);
	}

	protected boolean shouldProcess(ITypedRegion typedRegion) {
		if (STRING_LITERAL_PARTITION.equals(typedRegion.getType())
				|| SL_COMMENT_PARTITION.equals(typedRegion.getType())
				|| COMMENT_PARTITION.equals(typedRegion.getType())
				|| TEXT_PARTITION.equals(typedRegion.getType())) {
			return true;
		}
		return false;
	}
}
