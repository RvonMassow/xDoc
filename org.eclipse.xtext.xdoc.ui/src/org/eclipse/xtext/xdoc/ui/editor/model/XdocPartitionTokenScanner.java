package org.eclipse.xtext.xdoc.ui.editor.model;

import static org.eclipse.xtext.xdoc.ui.editor.model.XdocTerminalsTokenTypeToPartitionMapper.TEXT_PARTITION;

import org.eclipse.xtext.ui.editor.model.PartitionTokenScanner;

public class XdocPartitionTokenScanner extends PartitionTokenScanner {
	@Override
	protected boolean shouldMergePartitions(String contentType) {
		return super.shouldMergePartitions(contentType)
				|| TEXT_PARTITION.equals(contentType);
	}
}
