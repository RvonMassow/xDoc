/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package workflow;

import org.apache.log4j.Logger;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.help.IToc;
import org.eclipse.help.internal.toc.TocContribution;
import org.eclipse.help.internal.toc.TocFile;
import org.eclipse.help.internal.toc.TocFileParser;

/**
 * @author dhuebner - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class TocFileValidator implements IWorkflowComponent {
	private String tocFile;
	private static final Logger LOG = Logger.getLogger(TocFileValidator.class);

	@Override
	public void preInvoke() {

	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		TocFileParser parser = new TocFileParser();
		TocFile toc = new TocFile(null, tocFile, true, null, null, null);
		try {
			TocContribution parsed = parser.parse(toc);
			IToc iToc = parsed.getToc();
			LOG.info("Successfully parsed " + iToc.getLabel() + " from " + tocFile);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void postInvoke() {

	}

	public String getTocFile() {
		return tocFile;
	}

	public void setTocFile(String tocFile) {
		this.tocFile = tocFile;
	}

}
