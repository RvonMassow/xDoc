package workflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class LatexRunner extends AbstractWorkflowComponent {

	private String outputDir;
	private String inputFile;
	private Logger log = LogManager.getLogger(this.getClass());

	@Override
	public String getId() {
		return this.getClass().getName();
	}

	@Override
	protected void invokeInternal(WorkflowContext arg0, ProgressMonitor arg1,
			Issues arg2) {
		try {
			// arg1.beginTask("Invoking LaTeX builder on generated TeX file.",
			// 0);
			Process p = Runtime.getRuntime().exec(
					"pdflatex --output-directory " + outputDir + " "
							+ inputFile);
			BufferedReader is = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			String s = is.readLine();
			while (s != null) {
				log.info(s);
				s = is.readLine();
			}
			p = Runtime.getRuntime().exec(
					"pdflatex --output-directory " + outputDir + " "
							+ inputFile);
			is = new BufferedReader(new InputStreamReader(p.getInputStream()));
			s = is.readLine();
			while (s != null) {
				log.info(s);
				s = is.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	public void checkConfiguration(Issues issues) {
		try {
			Process p = Runtime.getRuntime().exec("pdflatex -version");
			synchronized (p) {
				p.wait();
			}
			if (p.exitValue() != 0) {
				log.error("failed to execute pdflatex, is it in your PATH?");
			}
		} catch (IOException e) {
			issues.addError(this,
					"pdflatex could not be run, is it in your PATH?",
					"pdflatex");
		} catch (InterruptedException e) {
		}
	}

}
