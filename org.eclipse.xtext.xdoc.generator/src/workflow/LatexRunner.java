package workflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class LatexRunner implements IWorkflowComponent {

	private String outputDir;
	private String inputFile;
	private int numberOfPasses = 3;
	private Logger log = LogManager.getLogger(this.getClass());
	private String pdfLatexCommand = "pdflatex --interaction scrollmode --output-directory ";
	
	public void setPdfLatexCommand(String pdfLatexCommand) {
		this.pdfLatexCommand = pdfLatexCommand;
	}

	public void setNumberOfPasses(int numberOfPasses) {
		this.numberOfPasses = numberOfPasses;
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

	public void preInvoke() {
		try {
			Process p = Runtime.getRuntime().exec("pdflatex -version");
			synchronized (p) {
				p.wait();
			}
			if (p.exitValue() != 0) {
				log.error("failed to execute pdflatex, is it in your PATH?");
			}
		} catch (Exception e) {
			throw new WrappedException("pdflatex could not be run, is it in your PATH?", e);
		}
	}

	public void invoke(IWorkflowContext ctx) {
		try {
			for (int i = 0; i < numberOfPasses; i++) {
				log.info("pdflatex pass "+(i+1));
				Process p = Runtime.getRuntime().exec(
						pdfLatexCommand 
								+ outputDir + " " + inputFile);
				BufferedReader is = new BufferedReader(new InputStreamReader(
						p.getInputStream()));
				String s = is.readLine();
				while (s != null) {
					if (s.toLowerCase().indexOf("error") != -1) {
						log.error(s);
					} else {
						// only log during the last run
						if (i + 1 == numberOfPasses)
							log.info(s);
					}
					s = is.readLine();
				}
			}
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
	}

	public void postInvoke() {
	}

}
