package org.apache.uima.watson.annotators.results;

import org.apache.uima.jcas.JCas;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Entity;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesResult;

public class EntitiesParser extends AbstractResultParser {
	public void parseResults(AnalysisResults results, JCas cas) throws WatsonException {
		if (results.getEntities() == null)
			throw new NoResultException();
		for (EntitiesResult res : results.getEntities()) {
			Entity entity = new Entity(cas);
			entity.setText(res.getText());
			entity.setEntityType(res.getType());
			entity.setRelevance(res.getRelevance());
			entity.setCount(res.getCount());
			alignAnnotationToText(entity, cas);
			entity.addToIndexes();
		}
	}
}
