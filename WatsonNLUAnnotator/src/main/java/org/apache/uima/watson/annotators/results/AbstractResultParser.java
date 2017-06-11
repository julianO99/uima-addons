package org.apache.uima.watson.annotators.results;

import org.apache.uima.jcas.JCas;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.WatsonAnnotation;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;

public abstract class AbstractResultParser {
	public abstract void parseResults(AnalysisResults results, JCas cas) throws WatsonException;
	
	public static void alignAnnotationToText(WatsonAnnotation annot, JCas cas) {
		int idx = cas.getDocumentText().indexOf(annot.getText());
		if (idx >= 0) {
			annot.setBegin(idx);
			annot.setEnd(idx + annot.getText().length());
		} else {
			annot.setBegin(0);
			annot.setEnd(0);
		}
	}
}
