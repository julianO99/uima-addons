
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
public class SemanticFrame_Type extends WatsonAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SemanticFrame.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.SemanticFrame");
 
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
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticFrame");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticFrame");
    ll_cas.ll_setStringValue(addr, casFeatCode_Text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Subject;
  /** @generated */
  final int     casFeatCode_Subject;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubject(int addr) {
        if (featOkTst && casFeat_Subject == null)
      jcas.throwFeatMissing("Subject", "org.apache.uima.watson.ts.SemanticFrame");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Subject);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubject(int addr, int v) {
        if (featOkTst && casFeat_Subject == null)
      jcas.throwFeatMissing("Subject", "org.apache.uima.watson.ts.SemanticFrame");
    ll_cas.ll_setRefValue(addr, casFeatCode_Subject, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Object;
  /** @generated */
  final int     casFeatCode_Object;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getObject(int addr) {
        if (featOkTst && casFeat_Object == null)
      jcas.throwFeatMissing("Object", "org.apache.uima.watson.ts.SemanticFrame");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Object);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setObject(int addr, int v) {
        if (featOkTst && casFeat_Object == null)
      jcas.throwFeatMissing("Object", "org.apache.uima.watson.ts.SemanticFrame");
    ll_cas.ll_setRefValue(addr, casFeatCode_Object, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Action;
  /** @generated */
  final int     casFeatCode_Action;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAction(int addr) {
        if (featOkTst && casFeat_Action == null)
      jcas.throwFeatMissing("Action", "org.apache.uima.watson.ts.SemanticFrame");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Action);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAction(int addr, int v) {
        if (featOkTst && casFeat_Action == null)
      jcas.throwFeatMissing("Action", "org.apache.uima.watson.ts.SemanticFrame");
    ll_cas.ll_setRefValue(addr, casFeatCode_Action, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SemanticFrame_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "uima.cas.String", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

 
    casFeat_Subject = jcas.getRequiredFeatureDE(casType, "Subject", "org.apache.uima.watson.ts.SemanticSubject", featOkTst);
    casFeatCode_Subject  = (null == casFeat_Subject) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Subject).getCode();

 
    casFeat_Object = jcas.getRequiredFeatureDE(casType, "Object", "org.apache.uima.watson.ts.SemanticObject", featOkTst);
    casFeatCode_Object  = (null == casFeat_Object) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Object).getCode();

 
    casFeat_Action = jcas.getRequiredFeatureDE(casType, "Action", "org.apache.uima.watson.ts.SemanticAction", featOkTst);
    casFeatCode_Action  = (null == casFeat_Action) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Action).getCode();

  }
}



    