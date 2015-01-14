package org.eclipse.xtext.xdoc.tests.generator.util;

import java.net.URL;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xdoc.generator.util.GitExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.xtext.mongobeans.lib.IMongoBean;

@SuppressWarnings("all")
public class GitExtensionsTest {
  @Test
  public void testCalculateTraceFileName() {
    try {
      final String clazzName = "org/xtext/builddsl/lib/DependsOn.class";
      final URL url = new URL("jar:file:/plugins/org.xtext.builddsl.lib.jar!/org/xtext/builddsl/lib/DependsOn.class");
      GitExtensions _gitExtensions = new GitExtensions();
      final URL gitURL = _gitExtensions.calculateTraceFileName(url, clazzName, "org.xtext.builddsl.lib.DependsOn");
      Assert.assertNotNull(gitURL);
      String _string = gitURL.toString();
      Assert.assertEquals("jar:file:/plugins/org.xtext.builddsl.lib.jar!/org/xtext/builddsl/lib/.DependsOn.java._trace", _string);
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
    String _string = gitURL.toString();
    Assert.assertEquals("org/eclipse/xtext/xdoc/tests/generator/util/GitExtensionsTest.xtend", _string);
  }
  
  @Test
  public void testFindOriginalSourceFromJar() {
    GitExtensions _gitExtensions = new GitExtensions();
    String _name = IMongoBean.class.getName();
    final String gitURL = _gitExtensions.findOriginalSource(_name);
    Assert.assertNotNull(gitURL);
    Assert.assertEquals("org/xtext/mongobeans/lib/IMongoBean.xtend", gitURL);
  }
}
