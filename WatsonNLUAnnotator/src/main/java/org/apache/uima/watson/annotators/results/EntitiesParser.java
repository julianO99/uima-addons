package org.apache.uima.watson.annotators.results;

import java.util.List;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Entity;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.DisambiguationResult;
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

			DisambiguationResult disamb = res.getDisambiguation();
			entity.setDbpediaResource(disamb.getDbpediaResource());

			List<String> src_subtypes = disamb.getSubtype();
			StringArray subtypes = new StringArray(cas, src_subtypes.size());
			for (int i = 0; i < src_subtypes.size(); i++)
				subtypes.set(i, src_subtypes.get(i));
			subtypes.addToIndexes();
			entity.setSubtype(subtypes);
			entity.setName(disamb.getName());

			if (res.getEmotion() != null)
				entity.setEmotion(createEmotion(cas, res.getEmotion()));

			alignAnnotationToText(entity, cas);
			entity.addToIndexes();
		}
	}
}
