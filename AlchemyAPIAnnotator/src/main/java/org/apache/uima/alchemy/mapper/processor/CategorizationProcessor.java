/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.uima.alchemy.mapper.processor;

import org.apache.uima.alchemy.digester.domain.CategorizationResults;
import org.apache.uima.alchemy.digester.domain.Results;
import org.apache.uima.alchemy.mapper.exception.MappingException;
import org.apache.uima.alchemy.ts.categorization.Category;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;

public class CategorizationProcessor implements AlchemyOutputProcessor {

  public void process(JCas cas, Results results) throws Exception {
    try {
      FeatureStructure fs = new Category(cas);
      Type type = fs.getType();
      fs.setFeatureValueFromString(type.getFeatureByBaseName("score"),
              ((CategorizationResults) results).getScore());
      fs.setFeatureValueFromString(type.getFeatureByBaseName("text"),
              ((CategorizationResults) results).getCategory());
      cas.addFsToIndexes(fs);
    } catch (Exception e) {
      e.printStackTrace();
      throw new MappingException(e);
    }

  }

}
