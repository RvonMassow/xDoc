package org.eclipse.xtext.xdoc.ui.quickfix;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.ui.texteditor.spelling.SpellingCorrectionProcessor;
import org.eclipse.xtext.ui.editor.quickfix.XtextQuickAssistProcessor;

import com.google.inject.Inject;

public class XdocQuickAssistProcessor extends XtextQuickAssistProcessor{

	@Inject
	private SpellingCorrectionProcessor spellingCorrectionProcessor;

	@Override
	public ICompletionProposal[] computeQuickAssistProposals(
			IQuickAssistInvocationContext invocationContext) {
		List<ICompletionProposal> proposals = Arrays.asList(spellingCorrectionProcessor.computeQuickAssistProposals(invocationContext));
		proposals.addAll(Arrays.asList(super.computeQuickAssistProposals(invocationContext)));
		return proposals.toArray(new ICompletionProposal[proposals.size()]);
	}
}
