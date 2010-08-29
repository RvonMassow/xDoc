package org.eclipse.xtext.xdoc.tests;


public class XDocFacade {
// TODO Wozu brauchen wir das nochmal?
	
//	private static final Predicate<EObject> PREDICATE = new Predicate<EObject>() {
//
//		public boolean apply(EObject input) {
//			return input instanceof Section;
//		}
//	};
//
//	private static final Predicate<EObject> SECTION2 = new Predicate<EObject>() {
//
//		public boolean apply(EObject input) {
//			return input instanceof Section2;
//		}
//	};
//
//	private Document doc;
//
//	public XDocFacade(Document doc) {
//		this.doc = doc;
//	}
//
//	/**
//	 * Get the chapter with the given index.
//	 * 
//	 * @param i
//	 *            the index of the chapter to return
//	 * @return the chapter or null if no such chapter exists
//	 */
//	public Chapter getChapter(int i) {
//		Chapter chapter = null;
//		try {
//			chapter = doc.getChapters().get(i);
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		return chapter;
//	}
//
//	/**
//	 * Get the section with the given index from the chapter with the other
//	 * index.
//	 * 
//	 * @param i
//	 *            the index of the chapter to lookup the section from
//	 * @param j
//	 *            the index of the section within the chapter
//	 * @return the section or null if no such chapter or section exists
//	 */
//	public Section getSection(int i, int j) {
//		Chapter chapter = null;
//		chapter = getChapter(i);
//		if (chapter != null) {
//			List<EObject> secs = (List<EObject>) Collections2.filter(
//					chapter.getContents(), PREDICATE);
//			try {
//				return (Section) secs.get(j);
//			} catch (IndexOutOfBoundsException e) {
//				e.printStackTrace();
//			}
//		}
//		return null;
//	}
//
//	/**
//	 * Get the subsection with the given index k from the section with index j
//	 * from the chapter with the index i.
//	 * 
//	 * @param i
//	 *            the index of the chapter to lookup the section from
//	 * @param j
//	 *            the index of the section within the chapter
//	 * @param k
//	 *            the index of the subsection within the section
//	 * @return the subsection or null if no such chapter or section exists
//	 */
//	public SubSection getSubSection(int i, int j, int k) {
//		Section sec = getSection(i, j);
//		if (sec != null) {
//			List<EObject> ssecs = (List<EObject>) Collections2.filter(
//					sec.getContents(), SECTION2);
//			try {
//				return (SubSection) ssecs.get(k);
//			} catch (IndexOutOfBoundsException e) {
//				e.printStackTrace();
//			}
//		}
//		return null;
//	}

}
