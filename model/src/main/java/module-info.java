import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.github.capability.GithubEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.github {
	
	exports org.nasdanika.models.github;
	exports org.nasdanika.models.github.impl;
	exports org.nasdanika.models.github.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.nxcore;
	
	provides CapabilityFactory with 
		GithubEPackageResourceSetCapabilityFactory;
	
}