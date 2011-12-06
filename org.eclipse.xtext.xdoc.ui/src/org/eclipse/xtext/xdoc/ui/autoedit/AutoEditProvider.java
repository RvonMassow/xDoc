package org.eclipse.xtext.xdoc.ui.autoedit;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.jface.text.IRegion;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategy;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;

public class AutoEditProvider extends DefaultAutoEditStrategyProvider {

	protected static class LineBreakInserter extends AbstractEditStrategy {

		private Widget widget;
		private final IAutoEditStrategy defaultStrategy;

		protected LineBreakInserter(IAutoEditStrategy defaultStrategy) {
			this.defaultStrategy = defaultStrategy;
		}

		@Override
		public void verifyKey(VerifyEvent event) {
			super.verifyKey(event);
			widget = event.widget;
		}

		@Override
		protected void internalCustomizeDocumentCommand(IDocument document,
				DocumentCommand command) throws BadLocationException {
			if (command.text.equals(" ") && command.length == 0) {
				if (widget instanceof StyledText) {
					StyledText text = (StyledText) widget;
					IRegion region = document.getLineInformationOfOffset(command.offset);
					String line = document.get(region.getOffset(), region.getLength());
					String subLine = line.substring(0, command.offset - region.getOffset());
					int tabCount = count("\t", subLine);
					int spacesForTabs = text.getTabs() * tabCount;
					int visibleOffset = subLine.length() - tabCount + spacesForTabs;
					if (visibleOffset >= 100) {
						command.text = ((IDocumentExtension4)document).getDefaultLineDelimiter();
						defaultStrategy.customizeDocumentCommand(document, command);
						if (document.getLineOfOffset(region.getOffset()) - text.getTopIndex() > 10)
							text.setTopIndex(text.getTopIndex() + 1);
					}
				}
			}
			widget = null;
		}
	}

	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		super.configure(acceptor);
		configureAutoLinebreakStrategy(acceptor);
	}

	protected void configureAutoLinebreakStrategy(IEditStrategyAcceptor acceptor) {
		acceptor.accept(new LineBreakInserter(defaultIndentLineAutoEditStrategy.get()), IDocument.DEFAULT_CONTENT_TYPE);
	}

	@Override
	protected void configureMultilineComments(IEditStrategyAcceptor acceptor) {
	}
	
	@Override
	protected void configureCompoundBracesBlocks(IEditStrategyAcceptor acceptor) {
	}

	@Override
	protected void configureCurlyBracesBlock(IEditStrategyAcceptor acceptor) {
	}

	@Override
	protected void configureSquareBrackets(IEditStrategyAcceptor acceptor) {
		acceptor.accept(singleLineTerminals.newInstance("[", "]"),IDocument.DEFAULT_CONTENT_TYPE);
//		MultiLineTerminalsEditStrategy newInstance = multiLineTerminals.newInstance("[", null, "]");
//		newInstance.setDocumentUtil(new DocumentUtil(){
//			@Override
//			protected String preProcessSearchString(String string) {
//				return string.replace("\\[", "  ").replace("\\]", "  ");
//			}
//		});
//		acceptor.accept(newInstance,IDocument.DEFAULT_CONTENT_TYPE);
	}

	@Override
	protected void configureParenthesis(IEditStrategyAcceptor acceptor) {
	}

	@Override
	protected void configureStringLiteral(IEditStrategyAcceptor acceptor) {
	}

}
