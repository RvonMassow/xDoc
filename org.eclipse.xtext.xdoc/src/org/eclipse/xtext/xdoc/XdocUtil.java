package org.eclipse.xtext.xdoc;

import java.util.Collection;
import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xdoc.xdoc.Anchor;
import org.eclipse.xtext.xdoc.xdoc.ChapterRef;
import org.eclipse.xtext.xdoc.xdoc.Document;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;
import org.eclipse.xtext.xdoc.xdoc.LangDef;
import org.eclipse.xtext.xdoc.xdoc.MarkUp;
import org.eclipse.xtext.xdoc.xdoc.Ref;
import org.eclipse.xtext.xdoc.xdoc.Section2Ref;
import org.eclipse.xtext.xdoc.xdoc.SectionRef;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;

public class XdocUtil {

	public static class ToString {
		private PolymorphicDispatcher<Void> toString = PolymorphicDispatcher.createForSingleTarget("_toString",2,2, this);

		protected void _toString(StringBuilder sb, TextOrMarkup tom) {
			toString.invoke(sb,tom.getContents());
		}

		protected void _toString(StringBuilder sb, LangDef ld){
			sb.append(ld.getName());
			for(String keyword: ld.getKeywords()) {
				sb.append(keyword);
			}
		}

		protected void _toString(StringBuilder sb, Collection<? extends EObject> col) {
			for (Object contents : col) {
				toString.invoke(sb,contents);
			}
		}

		protected void _toString(StringBuilder sb, TextPart part) {
			sb.append(part.getText());
		}

		protected void _toString(StringBuilder sb, Emphasize emph) {
			toString.invoke(sb,emph.getContents());
		}

		protected void _toString(StringBuilder sb, MarkUp markup) {
			toString.invoke(sb,markup.eContents());
		}

		protected void _toString(StringBuilder sb, Document doc) {
			if(doc.getName() != null){
				sb.append(doc.getName());
			}
			toString.invoke(sb, doc.getTitle());
			toString.invoke(sb, doc.getSubtitle());
			toString.invoke(sb, doc.getAuthors());
			toString.invoke(sb, doc.getLangDefs());
			toString.invoke(sb, doc.getContents());
			toString.invoke(sb, doc.getChapters());
		}

		protected void _toString(StringBuilder sb, EList<?> list) {
			for (Object obj : list) {
				toString.invoke(sb, obj);
			}
		}

		protected void _toString(StringBuilder sb, Object obj) {
			// do nothing
		}

		public String toString(Object obj) {
			StringBuilder stringBuilder = new StringBuilder();
			toString.invoke(stringBuilder,obj);
			return stringBuilder.toString();
		}
	}
	private static ToString TO_STRING = new ToString();

	public static String toString(Object markup) {
		return TO_STRING.toString(markup);
	}

	public static class Hash {

		PolymorphicDispatcher<Integer> hash = PolymorphicDispatcher.createForSingleTarget("_hash", 1, 1, this);

		private static Logger log = Logger.getLogger(Hash.class);

		private static Hashtable<Object, Integer> cache = new Hashtable<Object, Integer>();

		protected synchronized int hash(Object obj) {
			try {
				int ret = hash.invoke(obj);
				cache.clear();
				return ret;
			} catch(Exception e) {
				log.info("Unable to hash "+obj.toString(), e);
			}
			return 0;
		}

		protected Integer _hash(Anchor a) {
			return a.getName().hashCode();
		}

		protected Integer _hash(MarkUp m) {
			return m.getClass().getName().hashCode() ^ hash.invoke(m.eContents());
		}

		protected Integer _hash(Ref ref) {
			EList<TextOrMarkup> contents = ref.getContents();
			return hash.invoke(contents);
		}

		protected Integer _hash(EList<?> list) {
			int ret = 0;
			for (Object object : list) {
				ret ^= hash.invoke(object);
			}
			return ret;
		}

		protected Integer _hash(Section2Ref ref) {
			return hash.invoke(ref.getSection2());
		}

		protected Integer _hash(SectionRef ref) {
			return hash.invoke(ref.getSection());
		}

		protected Integer _hash(ChapterRef ref) {
			return hash.invoke(ref.getChapter());
		}

		protected Integer _hash(Identifiable i) {
			String name = i.getName();
			return (name != null? name.hashCode(): 0)  ^ hash.invoke(i.eContents());
		}

		protected Integer _hash(TextPart tp) {
			return hash.invoke(tp.getText());
		}

		protected Integer _hash(EObject obj) {
			return hash.invoke(obj.eContents());
		}

		protected Integer _hash(String arg) {
			return arg != null ? arg.hashCode() : 0;
		}

		protected Integer _hash(Object arg) {
			// return 0 so other hashes don't get destroyed
			return 0;
		}

	}

	public static int hash(Object tree) {
		return tree.hashCode();//HASH.hash(tree);
	}
}
