
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
public class SemanticSubject_Type extends WatsonAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SemanticSubject.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.SemanticSubject");
 
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
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticSubject");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticSubject");
    ll_cas.ll_setStringValue(addr, casFeatCode_Text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Entities;
  /** @generated */
  final int     casFeatCode_Entities;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEntities(int addr) {
        if (featOkTst && casFeat_Entities == null)
      jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.SemanticSubject");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Entities);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntities(int addr, int v) {
        if (featOkTst && casFeat_Entities == null)
      jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.SemanticSubject");
    ll_cas.ll_setRefValue(addr, casFeatCode_Entities, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEntities(int addr, int i) {
        if (featOkTst && casFeat_Entities == null)
      jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.SemanticSubject");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEntities(int addr, int i, int v) {
        if (featOkTst && casFeat_Entities == null)
      jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.SemanticSubject");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_Keywords;
  /** @generated */
  final int     casFeatCode_Keywords;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getKeywords(int addr) {
        if (featOkTst && casFeat_Keywords == null)
      jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticSubject");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Keywords);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKeywords(int addr, int v) {
        if (featOkTst && casFeat_Keywords == null)
      jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticSubject");
    ll_cas.ll_setRefValue(addr, casFeatCode_Keywords, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getKeywords(int addr, int i) {
        if (featOkTst && casFeat_Keywords == null)
      jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticSubject");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Keywords), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Keywords), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Keywords), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setKeywords(int addr, int i, String v) {
        if (featOkTst && casFeat_Keywords == null)
      jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticSubject");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Keywords), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Keywords), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Keywords), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SemanticSubject_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "uima.cas.String", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

 
    casFeat_Entities = jcas.getRequiredFeatureDE(casType, "Entities", "uima.cas.FSArray", featOkTst);
    casFeatCode_Entities  = (null == casFeat_Entities) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Entities).getCode();

 
    casFeat_Keywords = jcas.getRequiredFeatureDE(casType, "Keywords", "uima.cas.StringArray", featOkTst);
    casFeatCode_Keywords  = (null == casFeat_Keywords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Keywords).getCode();

  }
}



    