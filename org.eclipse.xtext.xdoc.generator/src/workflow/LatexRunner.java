package workflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xdoc.xdoc.Document;

public class LatexRunner implements IWorkflowComponent {

	private String outputDir;
	private int numberOfPasses = 3;
	private Logger log = LogManager.getLogger(this.getClass());
	private String pdfLatexCommandParams = "--interaction scrollmode";
	private String pdfLatextOutputDirectory = "--output-directory ";
	private String pdfLatex = "pdflatex";
	private String inputSlot;
	

	public String getInputSlot() {
		return inputSlot;
	}

	public void setInputSlot(String inputSlot) {
		this.inputSlot = inputSlot;
	}

	public void setPdfLatex(String pdfLatex) {
		this.pdfLatex = pdfLatex;
	}
	
	public void setPdfLatexCommandParams(String pdfLatexCommandParams) {
		this.pdfLatexCommandParams = pdfLatexCommandParams;
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
	
	public void preInvoke() {
		try {
			Process p = Runtime.getRuntime().exec(pdfLatex + " -version");
			synchronized (p) {
				p.wait();
			}
			if (p.exitValue() != 0) {
				log.error("failed to execute '" + pdfLatex + "'. Is it in your PATH?");
			}
		} catch (Exception e) {
			throw new WrappedException("pdflatex could not be run, is it in your PATH?", e);
		}
	}

	@SuppressWarnings("unchecked")
	public void invoke(IWorkflowContext ctx) {
		for (Document doc : (List<Document>) ctx.get(inputSlot)) {
			String inputFile = doc.getName();
			String[] cmdArgs = { pdfLatex, pdfLatexCommandParams,
					pdfLatextOutputDirectory + outputDir,
					outputDir + "/" + inputFile+".tex" };
			try {
				for (int i = 0; i < numberOfPasses; i++) {
					log.info("pdflatex pass " + (i + 1));
					Process p = Runtime.getRuntime().exec(cmdArgs);
					BufferedReader is = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
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
	}

	public void postInvoke() {
	}

}
