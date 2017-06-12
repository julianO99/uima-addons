package org.apache.uima.watson.annotators.results;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Emotion;
import org.apache.uima.watson.ts.WatsonAnnotation;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EmotionScores;

public abstract class AbstractResultParser {
	public abstract void parseResults(AnalysisResults results, JCas cas) throws WatsonException;
	
	public static void alignAnnotationToText(WatsonAnnotation annot, JCas cas) {
		alignAnnotationToText(annot, cas, 0, cas.getDocumentText().length());
	}
	
	public static void alignAnnotationToText(WatsonAnnotation annot, JCas cas, int start, int end) {
		int idx = cas.getDocumentText().indexOf(annot.getText(), start);
		if (idx >= 0) {
			annot.setBegin(idx);
			annot.setEnd(idx + annot.getText().length());
		} else {
			annot.setBegin(start);
			annot.setEnd(end);
		}
	}
	
	public static Emotion createEmotion(JCas cas, EmotionScores src_emo) {
		Emotion target_emo = new Emotion(cas);
		target_emo.setAnger(src_emo.getAnger());
		target_emo.setDisgust(src_emo.getDisgust());
		target_emo.setFear(src_emo.getFear());
		target_emo.setJoy(src_emo.getJoy());
		target_emo.setSadness(src_emo.getSadness());
		target_emo.addToIndexes();
		return target_emo;
	}
}
