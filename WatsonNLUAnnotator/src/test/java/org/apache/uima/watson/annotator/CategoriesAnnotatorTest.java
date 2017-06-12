/**
 * 	Licensed to the Apache Software Foundation (ASF) under one
 * 	or more contributor license agreements.  See the NOTICE file
 * 	distributed with this work for additional information
 * 	regarding copyright ownership.  The ASF licenses this file
 * 	to you under the Apache License, Version 2.0 (the
 * 	"License"); you may not use this file except in compliance
 * 	with the License.  You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing,
 * 	software distributed under the License is distributed on an
 * 	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * 	KIND, either express or implied.  See the License for the
 * 	specific language governing permissions and limitations
 * 	under the License.
 */
package org.apache.uima.watson.annotator;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.uima.jcas.JCas;
import org.apache.uima.util.FileUtils;
import org.apache.uima.watson.ts.Category;
import org.apache.uima.watson.utils.TestUtils;
import org.junit.Ignore;

import junit.framework.TestCase;

public class CategoriesAnnotatorTest extends TestCase {
	// private static final String DOC = "Eight US soldiers die in attacks in
	// south Afghanistan, making October the deadliest month for the US in the
	// war there";

	private static final String DOCPATH = "src/test/resources/rankedTestText.txt";

	private static final String XML_PATH = "src/main/resources/org/apache/uima/watson/annotators/WatsonCategoriesAnnotator.xml";

	private static final String YOUR_USERNAME_HERE = "username";
	private static final String YOUR_PASSWORD_HERE = "password";

	@SuppressWarnings("unchecked")
	@Ignore
	public void testAnnotatorIntegration() throws Exception {
		Map<String, Object> parameterSettings = new HashMap<String, Object>();
		parameterSettings.put("username", YOUR_USERNAME_HERE);
		parameterSettings.put("password", YOUR_PASSWORD_HERE);
		String documentText = FileUtils.file2String(new File(DOCPATH));
		JCas resultingCAS = TestUtils.executeAE(TestUtils.getAE(XML_PATH, parameterSettings), documentText);
		List<Category> categories = (List<Category>) TestUtils.getAllFSofType(Category.type, resultingCAS);
		for (Category cat : categories) {
			System.out.println(cat.toString());
		}
		assertTrue(categories != null);
		assertTrue(categories.size() == 3);
	}
}
