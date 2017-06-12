package org.apache.uima.watson.annotators.results;

import java.util.Collections;
import java.util.List;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.SemanticAction;
import org.apache.uima.watson.ts.SemanticFrame;
import org.apache.uima.watson.ts.SemanticObject;
import org.apache.uima.watson.ts.SemanticSubject;
import org.apache.uima.watson.ts.SimpleEntity;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesAction;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesEntity;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesKeyword;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesObject;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesResult;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesSubject;

public class SemanticRolesParser extends AbstractResultParser {
	public void parseResults(AnalysisResults results, JCas cas) throws WatsonException {
		if (results.getSemanticRoles() == null)
			throw new NoResultException();
		for (SemanticRolesResult res : results.getSemanticRoles()) {
			SemanticFrame frame = new SemanticFrame(cas);
			frame.setText(res.getSentence());
			alignAnnotationToText(frame, cas);
			
			SemanticRolesSubject src_subj = res.getSubject();
			SemanticSubject subj = new SemanticSubject(cas);
			subj.setText(src_subj.getText());
			alignAnnotationToText(subj, cas, frame.getBegin(), frame.getEnd());
			subj.setKeywords(copyKeywords(cas, src_subj.getKeywords()));
			subj.setEntities(copyEntities(cas, src_subj.getEntities(), subj.getBegin(), subj.getEnd()));
			subj.addToIndexes();
			frame.setSubject(subj);
			
			SemanticRolesAction src_act = res.getAction();
			SemanticAction act = new SemanticAction(cas);
			act.setText(src_act.getText());
			alignAnnotationToText(act, cas, frame.getBegin(), frame.getEnd());
			act.setVerbText(src_act.getVerb().getText());
			act.setTense(src_act.getVerb().getTense());
			act.setNormalized(src_act.getNormalized());
			act.addToIndexes();
			frame.setAction(act);
			
			SemanticRolesObject src_obj = res.getObject();
			if (src_obj != null) {
				SemanticObject obj = new SemanticObject(cas);
				obj.setText(src_obj.getText());
				alignAnnotationToText(obj, cas, frame.getBegin(), frame.getEnd());
				obj.setKeywords(copyKeywords(cas, src_obj.getKeywords()));
				obj.addToIndexes();
				frame.setObject(obj);
			}

			frame.addToIndexes();
		}
	}
	
	public static StringArray copyKeywords(JCas cas, List<SemanticRolesKeyword> keywords) {
		if (keywords == null)
			keywords = Collections.emptyList();

		StringArray result = new StringArray(cas, keywords.size());
		for (int i = 0; i < keywords.size(); i++) {
			result.set(i, keywords.get(i).getText());
		}
		result.addToIndexes();
		return result;
	}
	
	public static FSArray copyEntities(JCas cas, List<SemanticRolesEntity> entities, int start, int end) {
		if (entities == null)
			entities = Collections.emptyList();

		FSArray result = new FSArray(cas, entities.size());
		for (int i = 0; i < entities.size(); i++) {
			SimpleEntity ent = new SimpleEntity(cas);
			ent.setEntityType(entities.get(i).getType());
			ent.setText(entities.get(i).getText());
			alignAnnotationToText(ent, cas, start, end);
			ent.addToIndexes();
			result.set(i, ent);
		}
		result.addToIndexes();
		return result;
	}
}
