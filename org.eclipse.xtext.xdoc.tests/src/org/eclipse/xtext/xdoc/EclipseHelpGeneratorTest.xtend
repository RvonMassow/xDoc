package org.eclipse.xtext.xdoc

import java.io.File
import javax.inject.Inject
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xdoc.generator.EclipseHelpGenerator
import org.eclipse.xtext.xdoc.generator.StatefulEclipseHelpGenerator
import org.eclipse.xtext.xdoc.util.ParseHelperExtensions
import org.eclipse.xtext.xdoc.xdoc.Document
import org.eclipse.xtext.xdoc.xdoc.XdocFile
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.xdoc.util.GeneratorTestConstants.*
import static org.eclipse.xtext.xdoc.util.ParserTestConstants.*

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(XdocUiInjectorProvider))
class EclipseHelpGeneratorTest {

	@Inject extension ParseHelperExtensions<XdocFile>
	@Inject extension EclipseHelpGenerator
	@Inject StatefulEclipseHelpGenerator stateFullGen
	@Inject JavaIoFileSystemAccess fsa

	@Test
	def void testRef() {
		fsa.outputPath = TARGET_DIR
		"aRefTest.xdoc".getDoc.eResource.doGenerate(fsa)
		"aRefTest.html".targetFile.exists.assertTrue
	}

	@Ignore
	def void testGenCode() throws Exception {
		val file = getDoc("codeTest.xdoc");
		val doc = file.getMainSection() as Document
		stateFullGen.generate(doc);
	}

	def getDoc(String fileName) {
		(TEST_FILE_DIR + fileName).docFromFile
	}

	def getTargetFile(String fileName) {
		new File((TARGET_DIR) + fileName)
	}
}