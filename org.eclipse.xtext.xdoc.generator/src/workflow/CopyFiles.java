package workflow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class CopyFiles implements IWorkflowComponent {

	private String source;
	private String destination;
	private boolean verbose;

	private Logger log = Logger.getLogger(this.getClass());
	private List<File> srcFiles;

	public void preInvoke() {
		if (source != null && destination != null) {
			if (source.contains("*")) {
				this.srcFiles = glob(source);
			} else if (source.endsWith(File.separator)) {
				this.srcFiles = expand(new File(source));
			} else {
				this.srcFiles = new LinkedList<File>();
				srcFiles.add(new File(source));
			}
		} else {
			log.error("source or destination not set");
		}
	}

	private List<File> glob(String source) {
		List<File> ret = new LinkedList<File>();
		String baseString = source.substring(0, source.indexOf('*'));
		File dir = new File(baseString);
		if (dir.isDirectory() && dir.canRead()) {
			for (File file : Arrays.asList(dir.listFiles())) {
				if (file.isDirectory()) {
					ret.addAll(expand(file));
				} else {
					ret.add(file);
				}
			}
		}
		return ret;
	}

	private List<File> expand(File dir) {
		List<File> ret = new LinkedList<File>();
		for (File file : Arrays.asList(dir.listFiles())) {
			if (file.isDirectory()) {
				ret.addAll(expand(file));
			} else {
				ret.add(file);
			}
		}
		return ret;
	}

	public void invoke(IWorkflowContext ctx) {
		for (File file : srcFiles) {
			String destFilename = null;
			if (source.contains("*")) {
				destFilename = destination
						+ file.getPath().substring(
								file.getPath()
										.indexOf(
												source.substring(0,
														source.indexOf('*'))));
			} else {
				destFilename = destination
						+ file.getPath().substring(
								file.getPath().indexOf(source)
										+ source.length());
			}
			File destDir = new File(destFilename.substring(0,
					destFilename.lastIndexOf(File.separatorChar)));
			destDir.mkdirs();
			File destFile = new File(destFilename);
			if (destFile.exists()) {
				destFile.delete();
			}
			if (verbose) {
				log.info("from " + file.getPath() + " to " + destFilename);
			}
			FileChannel srcChannel = null;
			FileChannel destChannel = null;
			try {
				srcChannel = new FileInputStream(file).getChannel();
				destChannel = new FileOutputStream(destFile).getChannel();
				destChannel.transferFrom(srcChannel, 0, srcChannel.size());
			} catch (Exception e) {
				log.error("unable to copy file " + file, e);
			}
			try {
				srcChannel.close();
				destChannel.close();
			} catch (IOException e) {
				log.error("unable to close channel", e);
			}
		}
		log.info("Copied " + srcFiles.size() + " files from " + source + " to "
				+ destination);
	}

	public void postInvoke() {

	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public boolean isVerbose() {
		return verbose;
	}

}
