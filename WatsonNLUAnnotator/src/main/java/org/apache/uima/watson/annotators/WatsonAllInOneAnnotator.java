package org.apache.uima.watson.annotators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.descriptor.TypeCapability;
import org.apache.uima.watson.annotators.results.AbstractResultParser;
import org.apache.uima.watson.annotators.results.CategoriesParser;
import org.apache.uima.watson.annotators.results.ConceptsParser;
import org.apache.uima.watson.annotators.results.EntitiesParser;
import org.apache.uima.watson.annotators.results.KeywordsParser;
import org.apache.uima.watson.annotators.results.MetadataParser;
import org.apache.uima.watson.annotators.results.RelationsParser;
import org.apache.uima.watson.annotators.results.SemanticRolesParser;
import org.apache.uima.watson.annotators.results.SentimentParser;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.CategoriesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ConceptsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EntitiesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.KeywordsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.MetadataOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.RelationsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SemanticRolesOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SentimentOptions;

@TypeCapability(outputs = { "org.apache.uima.watson.ts.Category", "org.apache.uima.watson.ts.Concept",
		"org.apache.uima.watson.ts.Entity", "org.apache.uima.watson.ts.Keyword", "org.apache.uima.watson.ts.Metadata",
		"org.apache.uima.watson.ts.Relation", "org.apache.uima.watson.ts.Argument",
		"org.apache.uima.watson.ts.SimpleEntity", "org.apache.uima.watson.ts.SemanticFrame",
		"org.apache.uima.watson.ts.SemanticSubject", "org.apache.uima.watson.ts.SemanticAction",
		"org.apache.uima.watson.ts.SemanticObject", "org.apache.uima.watson.ts.Sentiment" })
public class WatsonAllInOneAnnotator extends AbstractWatsonAnnotator {
	public static final String PARAM_GET_CATEGORIES = "get_categories";
	public static final String PARAM_GET_CONCEPTS = "get_concepts";
	public static final String PARAM_GET_ENTITIES = "get_entities";
	public static final String PARAM_GET_KEYWORDS = "get_keywords";
	public static final String PARAM_GET_METADATA = "get_metadata";
	public static final String PARAM_GET_RELATIONS = "get_relations";
	public static final String PARAM_GET_SEMANTIC_ROLES = "get_semantic_roles";
	public static final String PARAM_GET_SENTIMENT = "get_sentiment";

	public static final String PARAM_CONCEPTS_LIMIT = "concepts_limit";

	public static final String PARAM_ENTITIES_LIMIT = "entities_limit";
	public static final String PARAM_ENTITIES_MODEL = "entities_model";
	public static final String PARAM_ENTITIES_SENTIMENT = "entities_sentiment";
	public static final String PARAM_ENTITIES_EMOTION = "entities_emotion";

	public static final String PARAM_KEYWORDS_LIMIT = "keywords_limit";
	public static final String PARAM_KEYWORDS_SENTIMENT = "keywords_sentiment";
	public static final String PARAM_KEYWORDS_EMOTION = "keywords_emotion";

	public static final String PARAM_RELATIONS_MODEL = "relations_model";

	public static final String PARAM_SEMANTIC_ROLES_LIMIT = "semantic_roles_limit";
	public static final String PARAM_SEMANTIC_ROLES_KEYWORDS = "semantic_roles_keywords";
	public static final String PARAM_SEMANTIC_ROLES_ENTITIES = "semantic_roles_entities";

	public static final String PARAM_SENTIMENT_DOCUMENT = "sentiment_document";
	public static final String PARAM_SENTIMENT_TARGETS = "sentiment_targets";

	@ConfigurationParameter(name = PARAM_GET_CATEGORIES, mandatory = true, defaultValue = "true")
	protected Boolean get_categories = true;

	@ConfigurationParameter(name = PARAM_GET_CONCEPTS, mandatory = true, defaultValue = "true")
	protected Boolean get_concepts = true;

	@ConfigurationParameter(name = PARAM_GET_ENTITIES, mandatory = true, defaultValue = "true")
	protected Boolean get_entities = true;

	@ConfigurationParameter(name = PARAM_GET_KEYWORDS, mandatory = true, defaultValue = "true")
	protected Boolean get_keywords = true;

	@ConfigurationParameter(name = PARAM_GET_METADATA, mandatory = true, defaultValue = "true")
	protected Boolean get_metadata = true;

	@ConfigurationParameter(name = PARAM_GET_RELATIONS, mandatory = true, defaultValue = "true")
	protected Boolean get_relations = true;

	@ConfigurationParameter(name = PARAM_GET_SEMANTIC_ROLES, mandatory = true, defaultValue = "true")
	protected Boolean get_semantic_roles = true;

	@ConfigurationParameter(name = PARAM_GET_SENTIMENT, mandatory = true, defaultValue = "false")
	protected Boolean get_sentiment = false;

	@ConfigurationParameter(name = PARAM_CONCEPTS_LIMIT, mandatory = false)
	protected Integer concepts_limit = null;

	@ConfigurationParameter(name = PARAM_ENTITIES_LIMIT, mandatory = false)
	protected Integer entities_limit = null;

	@ConfigurationParameter(name = PARAM_ENTITIES_MODEL, mandatory = false)
	protected String entities_model = null;

	@ConfigurationParameter(name = PARAM_ENTITIES_SENTIMENT, mandatory = false, defaultValue = "true")
	protected Boolean entities_sentiment = true;

	@ConfigurationParameter(name = PARAM_ENTITIES_EMOTION, mandatory = false, defaultValue = "true")
	protected Boolean entities_emotion = true;

	@ConfigurationParameter(name = PARAM_KEYWORDS_LIMIT, mandatory = false)
	protected Integer keywords_limit = null;

	@ConfigurationParameter(name = PARAM_KEYWORDS_SENTIMENT, mandatory = false, defaultValue = "true")
	protected Boolean keywords_sentiment = true;

	@ConfigurationParameter(name = PARAM_KEYWORDS_EMOTION, mandatory = false, defaultValue = "true")
	protected Boolean keywords_emotion = true;

	@ConfigurationParameter(name = PARAM_RELATIONS_MODEL, mandatory = false)
	protected String relations_model = null;

	@ConfigurationParameter(name = PARAM_SEMANTIC_ROLES_LIMIT, mandatory = false)
	protected Integer semantic_roles_limit = null;

	@ConfigurationParameter(name = PARAM_SEMANTIC_ROLES_KEYWORDS, mandatory = false)
	protected Boolean semantic_roles_keywords = null;

	@ConfigurationParameter(name = PARAM_SEMANTIC_ROLES_ENTITIES, mandatory = false)
	protected Boolean semantic_roles_entities = null;

	@ConfigurationParameter(name = PARAM_SENTIMENT_DOCUMENT, mandatory = false, defaultValue = "true")
	protected Boolean sentiment_document = true;

	@ConfigurationParameter(name = PARAM_SENTIMENT_TARGETS, mandatory = false)
	protected String[] sentiment_targets = new String[0];

	protected Features initFeatures() {
		Features.Builder feats_builder = new Features.Builder();
		if (get_categories) {
			feats_builder = feats_builder.categories(new CategoriesOptions());
		}
		if (get_concepts) {
			ConceptsOptions conc_opts = new ConceptsOptions.Builder().limit(concepts_limit).build();
			feats_builder = feats_builder.concepts(conc_opts);
		}
		if (get_entities) {
			EntitiesOptions entities_opts = new EntitiesOptions.Builder().limit(entities_limit).model(entities_model)
					.sentiment(entities_sentiment).emotion(entities_emotion).build();
			feats_builder = feats_builder.entities(entities_opts);
		}
		if (get_keywords) {
			KeywordsOptions keywords_opts = new KeywordsOptions.Builder().limit(keywords_limit)
					.sentiment(keywords_sentiment).emotion(keywords_emotion).build();
			feats_builder = feats_builder.keywords(keywords_opts);
		}
		if (get_metadata) {
			feats_builder = feats_builder.metadata(new MetadataOptions());
		}
		if (get_relations) {
			RelationsOptions relations_opts = new RelationsOptions.Builder().model(relations_model).build();
			feats_builder = feats_builder.relations(relations_opts);
		}
		if (get_semantic_roles) {
			SemanticRolesOptions semantic_roles_opts = new SemanticRolesOptions.Builder().limit(semantic_roles_limit)
					.keywords(semantic_roles_keywords).entities(semantic_roles_entities).build();
			feats_builder = feats_builder.semanticRoles(semantic_roles_opts);
		}
		if (get_sentiment) {
			SentimentOptions sentiment_opts = new SentimentOptions.Builder().document(sentiment_document)
					.targets(Arrays.asList(sentiment_targets)).build();
			feats_builder = feats_builder.sentiment(sentiment_opts);
		}
		return feats_builder.build();
	}

	@Override
	protected List<AbstractResultParser> initResultParsers() {
		ArrayList<AbstractResultParser> result = new ArrayList<AbstractResultParser>();
		if (get_categories)
			result.add(new CategoriesParser());
		if (get_concepts)
			result.add(new ConceptsParser());
		if (get_entities)
			result.add(new EntitiesParser());
		if (get_keywords)
			result.add(new KeywordsParser());
		if (get_metadata)
			result.add(new MetadataParser());
		if (get_relations)
			result.add(new RelationsParser());
		if (get_semantic_roles)
			result.add(new SemanticRolesParser());
		if (get_sentiment)
			result.add(new SentimentParser());
		return result;
	}
}
