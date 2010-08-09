package org.eclipse.xtext.xdoc;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xdoc.xDoc.Chapter;
import org.eclipse.xtext.xdoc.xDoc.Document;
import org.eclipse.xtext.xdoc.xDoc.Section;

public class XDocFacade {

	private Document doc;

	public XDocFacade(Document doc) {
		this.doc = doc;
	}

	/**
	 * Get the chapter with the given index
	 * 
	 * @param i
	 *            the index of the chapter to return
	 * @return the chapter or null if no such chapter exists
	 */
	public Chapter getChapter(int i) {
		Chapter chapter = null;
		try {
			chapter = doc.getChapters().get(i);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return chapter;
	}

	/**
	 * Get the section with the given index from the chapter with the other
	 * index
	 * 
	 * @param i
	 *            the index of the chapter to lookup the section from
	 * @param j
	 *            the index of the section within the chapter
	 * @return the section or null if no such chapter or section exists
	 */
	public Section getSection(int i, int j) {
		Chapter chapter = null;
		Section sec = null;
		try {
			chapter = getChapter(i);
			if(chapter != null){
				List<EObject> contents = chapter.getContents();
				int secNum = 0;
				for (EObject eObject : contents) {
					if(eObject instanceof Section){
						if(secNum++ == j){
							return (Section) eObject;
						}
					}
				}
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return sec;
	}

}
