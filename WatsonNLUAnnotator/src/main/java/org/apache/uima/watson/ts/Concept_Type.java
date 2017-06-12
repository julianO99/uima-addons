
/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * @generated */
public class Concept_Type extends WatsonAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Concept.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.Concept");
 
  /** @generated */
  final Feature casFeat_Text;
  /** @generated */
  final int     casFeatCode_Text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.Concept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.Concept");
    ll_cas.ll_setStringValue(addr, casFeatCode_Text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_DbpediaResource;
  /** @generated */
  final int     casFeatCode_DbpediaResource;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDbpediaResource(int addr) {
        if (featOkTst && casFeat_DbpediaResource == null)
      jcas.throwFeatMissing("DbpediaResource", "org.apache.uima.watson.ts.Concept");
    return ll_cas.ll_getStringValue(addr, casFeatCode_DbpediaResource);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDbpediaResource(int addr, String v) {
        if (featOkTst && casFeat_DbpediaResource == null)
      jcas.throwFeatMissing("DbpediaResource", "org.apache.uima.watson.ts.Concept");
    ll_cas.ll_setStringValue(addr, casFeatCode_DbpediaResource, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Relevance;
  /** @generated */
  final int     casFeatCode_Relevance;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRelevance(int addr) {
        if (featOkTst && casFeat_Relevance == null)
      jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Concept");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Relevance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelevance(int addr, double v) {
        if (featOkTst && casFeat_Relevance == null)
      jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Concept");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Relevance, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Concept_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "uima.cas.String", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

 
    casFeat_DbpediaResource = jcas.getRequiredFeatureDE(casType, "DbpediaResource", "uima.cas.String", featOkTst);
    casFeatCode_DbpediaResource  = (null == casFeat_DbpediaResource) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_DbpediaResource).getCode();

 
    casFeat_Relevance = jcas.getRequiredFeatureDE(casType, "Relevance", "uima.cas.Double", featOkTst);
    casFeatCode_Relevance  = (null == casFeat_Relevance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Relevance).getCode();

  }
}



    