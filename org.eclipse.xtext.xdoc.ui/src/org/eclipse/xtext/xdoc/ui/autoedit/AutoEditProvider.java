package org.eclipse.xtext.xdoc.ui.autoedit;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;

public class AutoEditProvider extends DefaultAutoEditStrategyProvider {
	
	protected void configureMultilineComments(IEditStrategyAcceptor acceptor) {
	}

	protected void configureCurlyBracesBlock(IEditStrategyAcceptor acceptor) {
	}

	protected void configureSquareBrackets(IEditStrategyAcceptor acceptor) {
		acceptor.accept(singleLineTerminals.get().configure("[", "]"),IDocument.DEFAULT_CONTENT_TYPE);
		acceptor.accept(multiLineTerminals.get().configure("[", null, "]"),IDocument.DEFAULT_CONTENT_TYPE);
	}

	protected void configureParenthesis(IEditStrategyAcceptor acceptor) {
	}
	
	protected void configureStringLiteral(IEditStrategyAcceptor acceptor) {
	}

}
