package templates.util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xdoc.xdoc.ImageRef;

public class CopyUtil {

	private static Logger logger = Logger.getLogger(CopyUtil.class);

	public String copy(String basePath, ImageRef source, String targetDirName) {
		try {
			ByteBuffer buffer = ByteBuffer.allocate(16*1024);
			Resource res = source.eResource();
			URI uri = source.eResource().getURI();
			URI inPath = URI.createURI(uri.trimSegments(1).toString() + "/" + source.getPath());
			URI outPath = URI.createURI(uri.toString().replaceFirst(basePath, targetDirName)+ "/" + source.getPath().replaceAll("\\.\\.",""));
			ReadableByteChannel inChannel = Channels.newChannel(res.getResourceSet().getURIConverter().createInputStream(inPath));
			WritableByteChannel outChannel = Channels.newChannel(res.getResourceSet().getURIConverter().createOutputStream(outPath));
			while (inChannel.read(buffer) != -1) {
				buffer.flip();
				outChannel.write(buffer);
				buffer.compact();
			}
			buffer.flip();
			while (buffer.hasRemaining()) {
				outChannel.write(buffer);
			}
			outChannel.close();
			return outPath.toFileString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
			return null;
		}
	}
}
