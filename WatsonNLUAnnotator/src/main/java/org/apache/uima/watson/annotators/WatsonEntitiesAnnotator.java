package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.EntitiesParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

@TypeCapability(outputs={ "org.apache.uima.watson.ts.Entity" })
public class WatsonEntitiesAnnotator extends AbstractWatsonAnnotator {
	protected Features initFeatures() {
		EntitiesOptions opts = new EntitiesOptions.Builder().sentiment(true).limit(1).build();
		return new Features.Builder().entities(opts).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		result.add(new EntitiesParser());
		return result;
	}
}
