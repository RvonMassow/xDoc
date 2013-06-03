package workflow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
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
	private String pdfLatexInteractionMode = "--interaction scrollmode";
	private String pdfLatex = "pdflatex";
	private String inputSlot;
	private boolean cleanAfterRun;


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
		this.pdfLatexInteractionMode = pdfLatexCommandParams;
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
			final String inputFile = doc.getName();
			String[] cmdArgs = { pdfLatex, pdfLatexInteractionMode,
					inputFile+".tex" };
			try {
				for (int i = 0; i < numberOfPasses; i++) {
					log.info("pdflatex pass " + (i + 1));
					Process p = Runtime.getRuntime().exec(cmdArgs, null, new File(outputDir));
					BufferedReader is = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
					String s = is.readLine();
					while (s != null) {
						System.out.println(s);
						s = is.readLine();
					}
				}
				if(cleanAfterRun){
					clean(true);
				}
			} catch (IOException e) {
				log.error(e.getMessage(), e);
			}
		}
	}

	private void clean(final boolean allExceptPDF) {
		File oDir = new File(outputDir);
		if (oDir.isDirectory() && oDir.canRead()) {
			File[] files = oDir.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return (!name.endsWith(".pdf") || !allExceptPDF) && !name.endsWith("html");
				}
			});
			for (File file : files) {
				if (file.canWrite() && !file.isDirectory()) {
					file.delete();
				}
			}
		}
	}

	public void postInvoke() {
	}

	public void setCleanAfterRun(boolean cleanAfterRun) {
		this.cleanAfterRun = cleanAfterRun;
	}

	public boolean getCleanAfterRun() {
		return cleanAfterRun;
	}

}
