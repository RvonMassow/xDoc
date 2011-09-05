package org.eclipse.xtext.xdoc.generator;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

import static com.google.common.collect.Sets.*;

public class XdocOutputConfigurationProvider extends
		OutputConfigurationProvider {

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		String outputConfigurationID = IFileSystemAccess.DEFAULT_OUTPUT;
		String description = "The output directory for the generated Eclipse Help files.";
		String outputDirectory = "./contents";
		OutputConfiguration eclipseHelpOutput = createConfiguration(outputConfigurationID, description, outputDirectory);
		OutputConfiguration websiteOutput = createConfiguration(
				Outlets.WEB_SITE,
				"The output directory for the generated web site.",
				Outlets.WEB_SITE_PATH_NAME);
		return newHashSet(eclipseHelpOutput, websiteOutput);
	}

	public OutputConfiguration createConfiguration(String outputConfigurationID,
			String description, String outputDirectory) {
		OutputConfiguration oc = new OutputConfiguration(outputConfigurationID);
		oc.setDescription(description);
		oc.setOutputDirectory(outputDirectory);
		oc.setOverrideExistingResources(true);
		oc.setCreateOutputDirectory(true);
		oc.setCleanUpDerivedResources(true);
		oc.setSetDerivedProperty(true);
		return oc;
	}
	
}
