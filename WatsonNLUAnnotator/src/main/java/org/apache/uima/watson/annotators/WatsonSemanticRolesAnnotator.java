package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.SemanticRolesParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesOptions;

@TypeCapability(outputs={
		"org.apache.uima.watson.ts.SemanticFrame",
		"org.apache.uima.watson.ts.SemanticSubject",
		"org.apache.uima.watson.ts.SemanticAction",
		"org.apache.uima.watson.ts.SemanticObject"
})
public class WatsonSemanticRolesAnnotator extends AbstractWatsonAnnotator {
	public static final String PARAM_LIMIT = "limit";
	public static final String PARAM_KEYWORDS = "keywords";
	public static final String PARAM_ENTITIES = "entities";

	@ConfigurationParameter(name=PARAM_LIMIT, mandatory=false)
	protected Integer limit = null;
	
	@ConfigurationParameter(name=PARAM_KEYWORDS, mandatory=false, defaultValue = "true")
	protected Boolean keywords = true;
	
	@ConfigurationParameter(name=PARAM_ENTITIES, mandatory=false, defaultValue = "true")
	protected Boolean entities = true;
	
	protected Features initFeatures() {
		SemanticRolesOptions.Builder builder = new SemanticRolesOptions.Builder();
		if (limit != null)
			builder = builder.limit(limit);
		if (keywords != null)
			builder = builder.keywords(keywords);
		if (entities != null)
			builder = builder.entities(entities);
		return new Features.Builder().semanticRoles(builder.build()).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		result.add(new SemanticRolesParser());
		return result;
	}
}
