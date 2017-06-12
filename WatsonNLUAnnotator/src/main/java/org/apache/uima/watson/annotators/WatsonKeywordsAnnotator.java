package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.KeywordsParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.KeywordsOptions;

@TypeCapability(outputs={ "org.apache.uima.watson.ts.Keyword" })
public class WatsonKeywordsAnnotator extends AbstractWatsonAnnotator {
	public static final String PARAM_LIMIT = "limit";
	public static final String PARAM_SENTIMENT = "sentiment";
	public static final String PARAM_EMOTION = "emotion";
	
	@ConfigurationParameter(name=PARAM_LIMIT, mandatory=false)
	protected Integer limit = null;

	@ConfigurationParameter(name=PARAM_SENTIMENT, mandatory=false, defaultValue = "true")
	protected Boolean sentiment = true;
	
	@ConfigurationParameter(name=PARAM_EMOTION, mandatory=false, defaultValue = "true")
	protected Boolean emotion = true;
	
	protected Features initFeatures() {
		KeywordsOptions.Builder builder = new KeywordsOptions.Builder();
		if (limit != null)
			builder = builder.limit(limit);
		if (sentiment != null)
			builder = builder.sentiment(sentiment);
		if (emotion != null)
			builder = builder.emotion(emotion);
		return new Features.Builder().keywords(builder.build()).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		result.add(new KeywordsParser());
		return result;
	}
}
