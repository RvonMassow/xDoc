package org.eclipse.xtext.xdoc.generator.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xdoc.xdoc.GlossaryEntry;

@SuppressWarnings("all")
public class GlossaryExtensions {
  
  public GlossaryEntry getEntry(final Iterable<GlossaryEntry> glossary, final String aliasOrName) {
    GlossaryEntry _xblockexpression = null;
    {
      final Function1<GlossaryEntry,Boolean> _function = new Function1<GlossaryEntry,Boolean>() {
          public Boolean apply(GlossaryEntry s) {
            String _name = s.getName();
            final String typeConverted_aliasOrName = (String)aliasOrName;
            boolean _operator_equals = ObjectExtensions.operator_equals(_name, typeConverted_aliasOrName);
            return ((Boolean)_operator_equals);
          }
        };
      GlossaryEntry _findFirst = IterableExtensions.<GlossaryEntry>findFirst(glossary, _function);
      GlossaryEntry matchedEntry = _findFirst;
      GlossaryEntry _xifexpression = null;
      final GlossaryEntry typeConverted_matchedEntry = (GlossaryEntry)matchedEntry;
      boolean _operator_equals_1 = ObjectExtensions.operator_equals(typeConverted_matchedEntry, null);
      if (_operator_equals_1) {
        final Function1<GlossaryEntry,Boolean> _function_1 = new Function1<GlossaryEntry,Boolean>() {
            public Boolean apply(GlossaryEntry s_1) {
              EList<String> _alias = s_1.getAlias();
              final String typeConverted_aliasOrName_1 = (String)aliasOrName;
              boolean _contains = _alias.contains(typeConverted_aliasOrName_1);
              return ((Boolean)_contains);
            }
          };
        GlossaryEntry _findFirst_1 = IterableExtensions.<GlossaryEntry>findFirst(glossary, _function_1);
        _xifexpression = _findFirst_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}