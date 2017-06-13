package org.apache.uima.watson.annotators.results;

import java.util.List;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.watson.annotators.WatsonException;
import org.apache.uima.watson.ts.Metadata;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Author;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.MetadataResult;

public class MetadataParser extends AbstractResultParser {
	public void parseResults(AnalysisResults results, JCas cas) throws WatsonException {
		if (results.getMetadata() != null) {
			MetadataResult res = results.getMetadata();
			Metadata meta = new Metadata(cas);

			List<Author> src_authors = res.getAuthors();
			StringArray authors = new StringArray(cas, src_authors.size());
			for (int i = 0; i < src_authors.size(); i++)
				authors.set(i, src_authors.get(i).getName());
			authors.addToIndexes();
			meta.setAuthors(authors);

			meta.setPublicationDate(res.getPublicationDate());
			meta.setTitle(res.getTitle());
			meta.addToIndexes();
		}
	}
}
