package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.SentimentParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SentimentOptions;

@TypeCapability(outputs={
		"org.apache.uima.watson.ts.Sentiment"
})
public class WatsonSentimentAnnotator extends AbstractWatsonAnnotator {
	public static final String PARAM_DOCUMENT = "document";
	public static final String PARAM_TARGETS = "targets";

	@ConfigurationParameter(name=PARAM_DOCUMENT, mandatory=false, defaultValue="true")
	protected Boolean document = true;
	
	@ConfigurationParameter(name=PARAM_TARGETS, mandatory=false)
	protected String[] targets = new String[0];
	
	protected Features initFeatures() {
		SentimentOptions.Builder builder = new SentimentOptions.Builder();
		if (document != null)
			builder = builder.document(document);
		if (targets != null)
			builder = builder.targets(Arrays.asList(targets));
		return new Features.Builder().sentiment(builder.build()).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		result.add(new SentimentParser());
		return result;
	}
}
