package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.jcas.JCas;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.MetadataParser;
import org.apache.uima.watson.ts.Metadata;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.MetadataOptions;
import com.ibm.watson.developer_cloud.service.exception.BadRequestException;

@TypeCapability(outputs = { "org.apache.uima.watson.ts.Metadata" })
public class WatsonMetadataAnnotator extends AbstractWatsonAnnotator {
	protected Features initFeatures() {
		return new Features.Builder().metadata(new MetadataOptions()).build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		result.add(new MetadataParser());
		return result;
	}

	@Override
	protected void handleException(JCas cas, Exception ex) throws AnalysisEngineProcessException {
		if (ex instanceof BadRequestException) {
			Metadata meta = new Metadata(cas);
			meta.addToIndexes();
		} else {
			super.handleException(cas, ex);
		}
	}
}
