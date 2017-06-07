package org.apache.uima.watson.annotators;

import java.util.List;

import org.apache.uima.watson.annotators.results.AbstractResultParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

public class WatsonEntityAnnotator extends AbstractWatsonAnnotator {
	protected Features initFeatures() {
		EntitiesOptions opts = new EntitiesOptions.Builder().sentiment(true).limit(1).build();
		return new Features.Builder().entities(opts).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
