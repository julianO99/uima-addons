package org.apache.uima.watson.annotators;

import java.util.List;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.watson.annotators.results.AbstractResultParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

public abstract class AbstractWatsonAnnotator extends JCasAnnotator_ImplBase {
	public static final String PARAM_USERNAME = "username";
	public static final String PARAM_PASSWORD = "password";

	@ConfigurationParameter(name = PARAM_USERNAME)
	protected String username = null;

	@ConfigurationParameter(name = PARAM_PASSWORD)
	protected String password = null;

	protected NaturalLanguageUnderstanding service = null;
	private Features features = null;
	private List<AbstractResultParser> resultParsers;

	@Override
	public void initialize(UimaContext ctx) throws ResourceInitializationException {
		super.initialize(ctx);

		service = new NaturalLanguageUnderstanding(NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27, username,
				password);
		features = initFeatures();
		resultParsers = initResultParsers();
	}

	@Override
	public void process(JCas cas) throws AnalysisEngineProcessException {
		AnalyzeOptions parameters = new AnalyzeOptions.Builder().html(cas.getDocumentText()).features(features).build();

		try {
			AnalysisResults results = service.analyze(parameters).execute();

			try {
				for (AbstractResultParser parser : resultParsers) {
					parser.parseResults(results, cas);
				}
			} catch (WatsonException ex) {
				throw new AnalysisEngineProcessException(ex);
			}
		} catch (Exception ex) {
			handleException(cas, ex);
		}
	}

	protected abstract Features initFeatures();

	protected abstract List<AbstractResultParser> initResultParsers();

	protected void handleException(JCas cas, Exception ex) throws AnalysisEngineProcessException {
		throw new AnalysisEngineProcessException(ex);
	}
}
