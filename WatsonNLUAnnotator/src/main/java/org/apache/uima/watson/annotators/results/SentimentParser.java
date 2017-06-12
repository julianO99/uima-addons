package org.apache.uima.watson.annotators.results;

import org.apache.uima.jcas.JCas;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Sentiment;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SentimentResult;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.TargetedSentimentResults;

public class SentimentParser extends AbstractResultParser {
	public void parseResults(AnalysisResults results, JCas cas) throws WatsonException {
		if (results.getSentiment() == null)
			throw new NoResultException();
		SentimentResult res = results.getSentiment();

		if (res.getDocument() != null) {
			Sentiment doc_sent = new Sentiment(cas);
			doc_sent.setText(cas.getDocumentText());
			alignAnnotationToText(doc_sent, cas);
			doc_sent.setScore(res.getDocument().getScore());
			doc_sent.addToIndexes();
		}
		
		if (res.getTargets() != null) {
			for (TargetedSentimentResults src_sent : res.getTargets()) {
				Sentiment sent = new Sentiment(cas);
				sent.setText(src_sent.getText());
				alignAnnotationToText(sent, cas);
				sent.setScore(src_sent.getScore());
				sent.addToIndexes();
			}
		}
	}
}
