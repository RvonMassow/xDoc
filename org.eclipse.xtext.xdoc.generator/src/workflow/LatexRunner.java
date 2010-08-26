package workflow;

import java.io.IOException;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class LatexRunner extends AbstractWorkflowComponent {

	private String outputDir;
	private String inputFile;

	@Override
	protected void invokeInternal(WorkflowContext arg0, ProgressMonitor arg1,
			Issues arg2) {
		try {
			// arg1.beginTask("Invoking LaTeX builder on generated TeX file.",
			// 0);
			Runtime.getRuntime().exec(
					"pdflatex --output-directory " + outputDir + " "
							+ inputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void checkConfiguration(Issues arg0) {

	}

	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}

	public String getOutputDir() {
		return outputDir;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getInputFile() {
		return inputFile;
	}

}
