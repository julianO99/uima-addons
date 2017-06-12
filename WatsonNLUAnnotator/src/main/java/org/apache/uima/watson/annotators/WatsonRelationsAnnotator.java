package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.RelationsParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.RelationsOptions;

@TypeCapability(outputs={
		"org.apache.uima.watson.ts.Relation",
		"org.apache.uima.watson.ts.Argument",
		"org.apache.uima.watson.ts.SimpleEntity"
})
public class WatsonRelationsAnnotator extends AbstractWatsonAnnotator {
	public static final String PARAM_MODEL = "model";

	@ConfigurationParameter(name=PARAM_MODEL, mandatory=false)
	protected String model = null;
	
	protected Features initFeatures() {
		RelationsOptions.Builder builder = new RelationsOptions.Builder();
		if (model != null)
			builder = builder.model(model);
		return new Features.Builder().relations(builder.build()).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		result.add(new RelationsParser());
		return result;
	}
}
