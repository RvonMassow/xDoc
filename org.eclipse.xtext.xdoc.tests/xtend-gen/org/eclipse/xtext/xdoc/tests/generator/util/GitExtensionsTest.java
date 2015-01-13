package org.eclipse.xtext.xdoc.tests.generator.util;

import java.net.URL;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xdoc.generator.util.GitExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class GitExtensionsTest {
  @Test
  public void testCalculateTraceFileName() {
    try {
      final String clazzName = "org/xtext/builddsl/lib/DependsOn.class";
      final URL url = new URL("jar:file:/plugins/org.xtext.builddsl.lib.jar!/org/xtext/builddsl/lib/DependsOn.class");
      GitExtensions _gitExtensions = new GitExtensions();
      final String gitURL = _gitExtensions.calculateTraceFileName(url, clazzName, "org.xtext.builddsl.lib.DependsOn");
      Assert.assertNotNull(gitURL);
      Assert.assertEquals("file:/plugins/org.xtext.builddsl.lib.jar!/org/xtext/builddsl/lib/.DependsOn.java._trace", gitURL);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFindOriginalSource() {
    GitExtensions _gitExtensions = new GitExtensions();
    String _name = GitExtensionsTest.class.getName();
    final String gitURL = _gitExtensions.findOriginalSource(_name);
    Assert.assertNotNull(gitURL);
    Assert.assertEquals("org/eclipse/xtext/xdoc/tests/generator/util/GitExtensionsTest.xtend", gitURL);
  }
}
