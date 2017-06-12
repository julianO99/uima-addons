package org.apache.uima.watson.annotators.results;

import org.apache.uima.jcas.JCas;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Keyword;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.KeywordsResult;

public class KeywordsParser extends AbstractResultParser {
	public void parseResults(AnalysisResults results, JCas cas) throws WatsonException {
		if (results.getKeywords() == null)
			throw new NoResultException();
		for (KeywordsResult res : results.getKeywords()) {
			Keyword kw = new Keyword(cas);
			kw.setText(res.getText());
			kw.setRelevance(res.getRelevance());
			if (res.getEmotion() != null)
				kw.setEmotion(createEmotion(cas, res.getEmotion()));
			if (res.getSentiment() != null)
				kw.setSentiment(res.getSentiment().getScore());
			alignAnnotationToText(kw, cas);
			kw.addToIndexes();
		}
	}
}
