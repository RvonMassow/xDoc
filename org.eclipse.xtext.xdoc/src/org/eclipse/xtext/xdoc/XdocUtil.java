package org.eclipse.xtext.xdoc;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xdoc.xdoc.Emphasize;
import org.eclipse.xtext.xdoc.xdoc.MarkUp;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.TextPart;

public class XdocUtil {
	
	public static class ToString {
		private PolymorphicDispatcher<Void> toString = PolymorphicDispatcher.createForSingleTarget("_toString",2,2, this);
		
		protected void _toString(StringBuilder sb, TextOrMarkup tom) {
			toString.invoke(sb,tom.getContents());
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
}
