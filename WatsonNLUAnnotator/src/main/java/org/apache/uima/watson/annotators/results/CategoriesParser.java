package org.apache.uima.watson.annotators.results;

import org.apache.uima.jcas.JCas;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Category;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.CategoriesResult;

public class CategoriesParser extends AbstractResultParser {
	public void parseResults(AnalysisResults results, JCas cas) throws WatsonException {
		if (results.getCategories() == null)
			throw new NoResultException();
		for (CategoriesResult res : results.getCategories()) {
			Category cat = new Category(cas);
			cat.setLabel(res.getLabel());
			cat.setScore(res.getScore());
			cat.addToIndexes();
		}
	}
}
