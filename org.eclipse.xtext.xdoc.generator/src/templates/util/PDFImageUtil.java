package templates.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.xdoc.xdoc.ImageRef;
import org.w3c.dom.Node;

public class PDFImageUtil {

	public static String calcStyle(ImageRef ref) throws IOException {
		URI uri = ref.eResource().getURI();
		URI inPath = URI.createURI(ref.getPath()).resolve(uri);
		ImageInputStream img = ImageIO.createImageInputStream(new File(inPath.toFileString()));
		Iterator<ImageReader> imageReaders = ImageIO.getImageReaders(img);
		ImageReader ir = imageReaders.next();
		ir.setInput(img);
		IIOMetadata imageMetadata = ir.getImageMetadata(0);
		Node n = imageMetadata.getAsTree("javax_imageio_1.0");
		float ppmm = 2.835f;
		for(Node cn = n.getFirstChild(); cn != null; cn = cn.getNextSibling()) {
			if(cn.getNodeName().equals("Dimension")) {
				for(Node ccn = cn.getFirstChild(); ccn != null; ccn = ccn.getNextSibling()){
					if(ccn.getNodeName().equals("HorizontalPixelSize")){
						ppmm = 1/ Float.parseFloat(ccn.getAttributes().item(0).getNodeValue());
					}
				}
			}
		}
		int width = ir.getWidth(0);
		float effectiveWidth = width/ppmm;
		if(effectiveWidth > 140){
			return "width=\\textwidth";
		} else
			return "";
	}
}
