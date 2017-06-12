
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
public class Emotion_Type extends WatsonFS_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Emotion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.Emotion");
 
  /** @generated */
  final Feature casFeat_Anger;
  /** @generated */
  final int     casFeatCode_Anger;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getAnger(int addr) {
        if (featOkTst && casFeat_Anger == null)
      jcas.throwFeatMissing("Anger", "org.apache.uima.watson.ts.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Anger);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnger(int addr, double v) {
        if (featOkTst && casFeat_Anger == null)
      jcas.throwFeatMissing("Anger", "org.apache.uima.watson.ts.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Anger, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Disgust;
  /** @generated */
  final int     casFeatCode_Disgust;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getDisgust(int addr) {
        if (featOkTst && casFeat_Disgust == null)
      jcas.throwFeatMissing("Disgust", "org.apache.uima.watson.ts.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Disgust);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDisgust(int addr, double v) {
        if (featOkTst && casFeat_Disgust == null)
      jcas.throwFeatMissing("Disgust", "org.apache.uima.watson.ts.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Disgust, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Fear;
  /** @generated */
  final int     casFeatCode_Fear;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getFear(int addr) {
        if (featOkTst && casFeat_Fear == null)
      jcas.throwFeatMissing("Fear", "org.apache.uima.watson.ts.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Fear);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFear(int addr, double v) {
        if (featOkTst && casFeat_Fear == null)
      jcas.throwFeatMissing("Fear", "org.apache.uima.watson.ts.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Fear, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Joy;
  /** @generated */
  final int     casFeatCode_Joy;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getJoy(int addr) {
        if (featOkTst && casFeat_Joy == null)
      jcas.throwFeatMissing("Joy", "org.apache.uima.watson.ts.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Joy);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setJoy(int addr, double v) {
        if (featOkTst && casFeat_Joy == null)
      jcas.throwFeatMissing("Joy", "org.apache.uima.watson.ts.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Joy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Sadness;
  /** @generated */
  final int     casFeatCode_Sadness;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSadness(int addr) {
        if (featOkTst && casFeat_Sadness == null)
      jcas.throwFeatMissing("Sadness", "org.apache.uima.watson.ts.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Sadness);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSadness(int addr, double v) {
        if (featOkTst && casFeat_Sadness == null)
      jcas.throwFeatMissing("Sadness", "org.apache.uima.watson.ts.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Sadness, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Emotion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Anger = jcas.getRequiredFeatureDE(casType, "Anger", "uima.cas.Double", featOkTst);
    casFeatCode_Anger  = (null == casFeat_Anger) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anger).getCode();

 
    casFeat_Disgust = jcas.getRequiredFeatureDE(casType, "Disgust", "uima.cas.Double", featOkTst);
    casFeatCode_Disgust  = (null == casFeat_Disgust) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Disgust).getCode();

 
    casFeat_Fear = jcas.getRequiredFeatureDE(casType, "Fear", "uima.cas.Double", featOkTst);
    casFeatCode_Fear  = (null == casFeat_Fear) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Fear).getCode();

 
    casFeat_Joy = jcas.getRequiredFeatureDE(casType, "Joy", "uima.cas.Double", featOkTst);
    casFeatCode_Joy  = (null == casFeat_Joy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Joy).getCode();

 
    casFeat_Sadness = jcas.getRequiredFeatureDE(casType, "Sadness", "uima.cas.Double", featOkTst);
    casFeatCode_Sadness  = (null == casFeat_Sadness) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sadness).getCode();

  }
}



    