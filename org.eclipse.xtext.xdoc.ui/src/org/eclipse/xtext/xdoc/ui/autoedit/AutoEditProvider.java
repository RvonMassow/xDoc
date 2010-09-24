package org.eclipse.xtext.xdoc.ui.autoedit;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;
import org.eclipse.xtext.ui.editor.autoedit.MultiLineTerminalsEditStrategy;
import org.eclipse.xtext.ui.editor.model.DocumentUtil;

public class AutoEditProvider extends DefaultAutoEditStrategyProvider {
	
	protected void configureMultilineComments(IEditStrategyAcceptor acceptor) {
	}

	protected void configureCurlyBracesBlock(IEditStrategyAcceptor acceptor) {
	}

	protected void configureSquareBrackets(IEditStrategyAcceptor acceptor) {
		acceptor.accept(singleLineTerminals.newInstance("[", "]"),IDocument.DEFAULT_CONTENT_TYPE);
		MultiLineTerminalsEditStrategy newInstance = multiLineTerminals.newInstance("[", null, "]");
		newInstance.setDocumentUtil(new DocumentUtil(){
			@Override
			protected String preProcessSearchString(String string) {
				return string.replace("\\[", "  ").replace("\\]", "  ");
			}
		});
		acceptor.accept(newInstance,IDocument.DEFAULT_CONTENT_TYPE);
	}

	protected void configureParenthesis(IEditStrategyAcceptor acceptor) {
	}
	
	protected void configureStringLiteral(IEditStrategyAcceptor acceptor) {
	}

}
