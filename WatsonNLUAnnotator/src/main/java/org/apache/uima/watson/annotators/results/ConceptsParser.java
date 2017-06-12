package org.apache.uima.watson.annotators.results;

import org.apache.uima.jcas.JCas;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Concept;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ConceptsResult;

public class ConceptsParser extends AbstractResultParser {
	public void parseResults(AnalysisResults results, JCas cas) throws WatsonException {
		if (results.getConcepts() == null)
			throw new NoResultException();
		for (ConceptsResult res : results.getConcepts()) {
			Concept concept = new Concept(cas);
			concept.setText(res.getText());
			concept.setDbpediaResource(res.getDbpediaResource());
			concept.setRelevance(res.getRelevance());
			alignAnnotationToText(concept, cas);
			concept.addToIndexes();
		}
	}
}
