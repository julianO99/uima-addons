
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
public class Keyword_Type extends WatsonAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Keyword.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.Keyword");
 
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
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.Keyword");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.Keyword");
    ll_cas.ll_setStringValue(addr, casFeatCode_Text, v);}
    
  
 
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
      jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Keyword");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Relevance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelevance(int addr, double v) {
        if (featOkTst && casFeat_Relevance == null)
      jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Keyword");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Relevance, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Emotion;
  /** @generated */
  final int     casFeatCode_Emotion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEmotion(int addr) {
        if (featOkTst && casFeat_Emotion == null)
      jcas.throwFeatMissing("Emotion", "org.apache.uima.watson.ts.Keyword");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Emotion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEmotion(int addr, int v) {
        if (featOkTst && casFeat_Emotion == null)
      jcas.throwFeatMissing("Emotion", "org.apache.uima.watson.ts.Keyword");
    ll_cas.ll_setRefValue(addr, casFeatCode_Emotion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Sentiment;
  /** @generated */
  final int     casFeatCode_Sentiment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSentiment(int addr) {
        if (featOkTst && casFeat_Sentiment == null)
      jcas.throwFeatMissing("Sentiment", "org.apache.uima.watson.ts.Keyword");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Sentiment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentiment(int addr, double v) {
        if (featOkTst && casFeat_Sentiment == null)
      jcas.throwFeatMissing("Sentiment", "org.apache.uima.watson.ts.Keyword");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Sentiment, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Keyword_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "uima.cas.String", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

 
    casFeat_Relevance = jcas.getRequiredFeatureDE(casType, "Relevance", "uima.cas.Double", featOkTst);
    casFeatCode_Relevance  = (null == casFeat_Relevance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Relevance).getCode();

 
    casFeat_Emotion = jcas.getRequiredFeatureDE(casType, "Emotion", "org.apache.uima.watson.ts.Emotion", featOkTst);
    casFeatCode_Emotion  = (null == casFeat_Emotion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Emotion).getCode();

 
    casFeat_Sentiment = jcas.getRequiredFeatureDE(casType, "Sentiment", "uima.cas.Double", featOkTst);
    casFeatCode_Sentiment  = (null == casFeat_Sentiment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentiment).getCode();

  }
}



    