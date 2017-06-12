package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.ConceptsParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ConceptsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

@TypeCapability(outputs={ "org.apache.uima.watson.ts.Concept" })
public class WatsonConceptsAnnotator extends AbstractWatsonAnnotator {

	public static final String PARAM_LIMIT = "limit";
	
	@ConfigurationParameter(name=PARAM_LIMIT, mandatory=false)
	protected Integer limit = null; 
	
	protected Features initFeatures() {
		ConceptsOptions.Builder builder = new ConceptsOptions.Builder();
		if (limit != null)
			builder = builder.limit(limit);
		ConceptsOptions opts = builder.build();
		return new Features.Builder().concepts(opts).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		result.add(new ConceptsParser());
		return result;
	}
}
