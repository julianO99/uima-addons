package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.CategoriesParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.CategoriesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

@TypeCapability(outputs={ "org.apache.uima.watson.ts.Category" })
public class WatsonCategoriesAnnotator extends AbstractWatsonAnnotator {
	protected Features initFeatures() {
		CategoriesOptions opts = new CategoriesOptions();
		return new Features.Builder().categories(opts).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		result.add(new CategoriesParser());
		return result;
	}
}
