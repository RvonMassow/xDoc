package org.eclipse.xtext.xdoc.ui.editor.model;

import org.eclipse.xtext.ui.editor.model.PartitionTokenScanner;
import static org.eclipse.xtext.xdoc.ui.editor.model.XdocTerminalsTokenTypeToPartitionMapper.TEXT_PARTITION;

public class XdocPartitionTokenScanner extends PartitionTokenScanner {
	@Override
	protected boolean shouldMergePartitions(String contentType) {
		return super.shouldMergePartitions(contentType)
				|| TEXT_PARTITION.equals(contentType);
	}
}
