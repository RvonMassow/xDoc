package org.eclipse.xtext.xdoc.generator.config;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class GeneratorConfig {
  
  public boolean release() {
    return false;
  }
  
  public ArrayList<Object> links() {
    ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList();
    return _newArrayList;
  }
}