package org.eclipse.xtext.xdoc.generator;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class XdocOutputConfigurationProvider extends
		OutputConfigurationProvider {

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		// defaults
		String outputDirectory = "./contents";
		String defaultWebsiteOutput = "./website";

		String description = "The output directory for the generated Eclipse Help files.";
		OutputConfiguration eclipseHelpOutput = createConfiguration(
				Outlets.ECLIPSE_HELP, description, outputDirectory);

		OutputConfiguration websiteOutput = createConfiguration(
				Outlets.WEB_SITE,
				"The output directory for the generated web site.",
				defaultWebsiteOutput);
		return newHashSet(eclipseHelpOutput, websiteOutput);
	}

	public OutputConfiguration createConfiguration(
			String outputConfigurationID, String description,
			String outputDirectory) {
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
