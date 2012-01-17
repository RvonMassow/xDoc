package org.eclipse.xtext.xdoc.ui.editor.model;

import java.util.List;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;

import com.google.common.collect.Lists;

public class XdocTerminalsTokenTypeToPartitionMapper extends
		TerminalsTokenTypeToPartitionMapper {

	public static List<Integer> t = Lists.newArrayList(41, 26, 51, 38, 25, 50,
			12, 31, 17, 32, 22, 20, 16, 37, 35, 11, 19, 34, 49, 42, 24, 28, 48,
			18, 30, 39, 15, 45, 44, 47, 27, 43, 23, 36, 40, 14, 33, 21, 29, 13,
			10, 46);
	public static String TEXT_PARTITION = "__text";

	protected static final String[] SUPPORTED_PARTITIONS = new String[] {
			COMMENT_PARTITION, SL_COMMENT_PARTITION, STRING_LITERAL_PARTITION,
			TEXT_PARTITION, IDocument.DEFAULT_CONTENT_TYPE };

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_ML_COMMENT".equals(tokenName)) {
			return COMMENT_PARTITION;
		} else if ("RULE_SL_COMMENT".equals(tokenName)) {
			return SL_COMMENT_PARTITION;
		} else if ("RULE_STRING".equals(tokenName)) {
			return STRING_LITERAL_PARTITION;
		} else if ("RULE_ANY_OTHER".equals(tokenName)
				|| "RULE_ID".equals(tokenName)){
			return TEXT_PARTITION;
		}
		return IDocument.DEFAULT_CONTENT_TYPE;
	}

	public String[] getSupportedPartitionTypes() {
		return SUPPORTED_PARTITIONS;
	}
}
