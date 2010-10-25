package org.eclipse.xtext.xdoc.ui.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.SubMonitor;

public class ProjectUtils {
	private String name;
	private URI location;
	private Logger logger = Logger.getLogger(this.getClass());

	public ProjectUtils() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public URI getLocation() {
		return location;
	}

	public void setLocation(URI location) {
		this.location = location;
	}
	
	public void createFile(IProject project, SubMonitor monitor, String string, String fileName) {
		IFile file = project.getFile(fileName);
		if(!file.exists()){
			ByteArrayInputStream stream;
			try {
				stream = new ByteArrayInputStream(string.getBytes(file.getCharset(true)));
				file.create(stream,
						false, monitor.newChild(1));
				stream.close();
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			} finally{
				monitor.done();
			}
		}
	}

	public void createFile(IProject project, SubMonitor monitor, InputStream stream, String fileName) {
		IFile file = project.getFile(fileName);
		if(!file.exists()){
			try {
				file.create(stream,
						false, monitor.newChild(1));
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			} finally{
				monitor.done();
			}
		}
	}

}