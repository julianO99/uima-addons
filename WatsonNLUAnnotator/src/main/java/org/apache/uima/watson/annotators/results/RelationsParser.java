package org.apache.uima.watson.annotators.results;

import java.util.List;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Argument;
import org.apache.uima.watson.ts.Relation;
import org.apache.uima.watson.ts.SimpleEntity;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.RelationArgument;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.RelationEntity;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.RelationsResult;

public class RelationsParser extends AbstractResultParser {
	public void parseResults(AnalysisResults results, JCas cas) throws WatsonException {
		if (results.getRelations() == null)
			throw new NoResultException();
		for (RelationsResult res : results.getRelations()) {
			Relation rel = new Relation(cas);
			rel.setScore(res.getScore());
			rel.setText(res.getSentence());
			rel.setRelationType(res.getType());
			alignAnnotationToText(rel, cas);

			List<RelationArgument> src_args = res.getArguments();
			FSArray arguments = new FSArray(cas, src_args.size());
			int arg_i = 0;
			for (RelationArgument src_arg : src_args) {
				Argument arg = new Argument(cas);
				arg.setText(src_arg.getText());
				alignAnnotationToText(arg, cas, rel.getBegin(), rel.getEnd());
				
				List<RelationEntity> src_ents = src_arg.getEntities();
				FSArray entities = new FSArray(cas, src_ents.size());
				int ent_i = 0;
				for (RelationEntity src_e : src_ents) {
					SimpleEntity ent = new SimpleEntity(cas);
					ent.setText(src_e.getText());
					ent.setEntityType(src_e.getType());
					alignAnnotationToText(ent, cas, arg.getBegin(), arg.getEnd());
					ent.addToIndexes();
					entities.set(ent_i, ent);
				}
				entities.addToIndexes();
				arg.setEntities(entities);

				arg.addToIndexes();

				arguments.set(arg_i, arg);
				arg_i++;
			}
			arguments.addToIndexes();
			rel.setArguments(arguments);

			rel.addToIndexes();
		}
	}
}
