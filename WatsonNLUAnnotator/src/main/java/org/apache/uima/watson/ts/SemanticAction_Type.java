
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
public class SemanticAction_Type extends WatsonAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SemanticAction.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.SemanticAction");
 
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
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticAction");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticAction");
    ll_cas.ll_setStringValue(addr, casFeatCode_Text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Normalized;
  /** @generated */
  final int     casFeatCode_Normalized;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNormalized(int addr) {
        if (featOkTst && casFeat_Normalized == null)
      jcas.throwFeatMissing("Normalized", "org.apache.uima.watson.ts.SemanticAction");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Normalized);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNormalized(int addr, String v) {
        if (featOkTst && casFeat_Normalized == null)
      jcas.throwFeatMissing("Normalized", "org.apache.uima.watson.ts.SemanticAction");
    ll_cas.ll_setStringValue(addr, casFeatCode_Normalized, v);}
    
  
 
  /** @generated */
  final Feature casFeat_VerbText;
  /** @generated */
  final int     casFeatCode_VerbText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVerbText(int addr) {
        if (featOkTst && casFeat_VerbText == null)
      jcas.throwFeatMissing("VerbText", "org.apache.uima.watson.ts.SemanticAction");
    return ll_cas.ll_getStringValue(addr, casFeatCode_VerbText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVerbText(int addr, String v) {
        if (featOkTst && casFeat_VerbText == null)
      jcas.throwFeatMissing("VerbText", "org.apache.uima.watson.ts.SemanticAction");
    ll_cas.ll_setStringValue(addr, casFeatCode_VerbText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Tense;
  /** @generated */
  final int     casFeatCode_Tense;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTense(int addr) {
        if (featOkTst && casFeat_Tense == null)
      jcas.throwFeatMissing("Tense", "org.apache.uima.watson.ts.SemanticAction");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Tense);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTense(int addr, String v) {
        if (featOkTst && casFeat_Tense == null)
      jcas.throwFeatMissing("Tense", "org.apache.uima.watson.ts.SemanticAction");
    ll_cas.ll_setStringValue(addr, casFeatCode_Tense, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SemanticAction_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "uima.cas.String", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

 
    casFeat_Normalized = jcas.getRequiredFeatureDE(casType, "Normalized", "uima.cas.String", featOkTst);
    casFeatCode_Normalized  = (null == casFeat_Normalized) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Normalized).getCode();

 
    casFeat_VerbText = jcas.getRequiredFeatureDE(casType, "VerbText", "uima.cas.String", featOkTst);
    casFeatCode_VerbText  = (null == casFeat_VerbText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_VerbText).getCode();

 
    casFeat_Tense = jcas.getRequiredFeatureDE(casType, "Tense", "uima.cas.String", featOkTst);
    casFeatCode_Tense  = (null == casFeat_Tense) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Tense).getCode();

  }
}



    