package org.eclipse.xtext.xdoc.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xdoc.xdoc.Code;
import org.eclipse.xtext.xdoc.xdoc.CodeBlock;
import org.eclipse.xtext.xdoc.xdoc.Table;
import org.eclipse.xtext.xdoc.xdoc.TableRow;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

public class XdocJavaValidator extends AbstractXdocJavaValidator {

	@Check
	public void checkLineLengthOfCodeSection(Code c) {
		int MAX_CHARS_PER_LINE = 74;
		String[] lines = c.getContents().split("\n");
		for (String string : lines) {
			if (string.replaceAll("\t", "    ").length() >= MAX_CHARS_PER_LINE) {
				warning("Longest Line exceeds "+MAX_CHARS_PER_LINE+". Line will be wrapped in PDF output",
						XdocPackage.CODE__CONTENTS);
			}
		}
	}
	
	@Check
	public void checkConsistentNumberOfColumns(Table t) {
		int columns = -1;
		EList<TableRow> rows = t.getRows();
		for (TableRow tableRow : rows) {
			if (columns==-1)
				columns = tableRow.getData().size();
			if (tableRow.getData().size()!=columns) {
				error("Each row must have the same number of entries (expected "+columns+" but was "+tableRow.getData().size()+")",
						tableRow,
						XdocPackage.TABLE_ROW__DATA);
			}
		}
	}
	
	@Check
	public void checkCodeLanguage(CodeBlock cb){
		if(cb.getLanguage() == null) {
			warning("You should specify a language for syntax highlighting", cb, XdocPackage.CODE_BLOCK__LANGUAGE);
		}
	}

}
