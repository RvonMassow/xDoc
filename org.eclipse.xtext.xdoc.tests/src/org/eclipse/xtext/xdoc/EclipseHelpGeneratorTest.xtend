package org.eclipse.xtext.xdoc

import java.io.File
import javax.inject.Inject
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xdoc.generator.EclipseHelpGenerator
import org.eclipse.xtext.xdoc.generator.StatefulEclipseHelpGenerator
import org.eclipse.xtext.xdoc.util.ParseHelperExtensions
import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.XdocFile
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.xdoc.util.GeneratorTestConstants.*
import static org.eclipse.xtext.xdoc.util.ParserTestConstants.*

import static extension junit.framework.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XdocInjectorProvider))
class EclipseHelpGeneratorTest {

	@Inject extension ParseHelperExtensions<XdocFile>
	@Inject extension EclipseHelpGenerator
	@Inject extension StatefulEclipseHelpGenerator
	@Inject EclipseResourceFileSystemAccess2 fsa

	@Test
	def void testRef() {
		"aRefTest.xdoc".getDoc.eResource.doGenerate(fsa)
		"aRefTest.html".targetFile.exists.assertTrue
	}

	def testGenCode() throws Exception {
		val file = getDoc(TEST_FILE_DIR + "codeTest.xdoc");
		val doc = file.getMainSection() as Document
		generate(doc);
		"foo" -> 3
//		validate(EXPECTATION_DIR + "code.html", RESULT_DIR + "mytestmodel.xdoc-0.html");
	}

	def getDoc(String fileName) {
		(TEST_FILE_DIR + fileName).docFromFile
	}

	def getTargetFile(String fileName) {
		new File((TARGET_DIR) + fileName)
	}
}