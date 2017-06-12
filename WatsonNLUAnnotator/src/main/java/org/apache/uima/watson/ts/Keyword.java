

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class Keyword extends WatsonAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Keyword.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Keyword() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Keyword(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Keyword(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Keyword(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Text

  /** getter for Text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (Keyword_Type.featOkTst && ((Keyword_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.Keyword");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Keyword_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (Keyword_Type.featOkTst && ((Keyword_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.Keyword");
    jcasType.ll_cas.ll_setStringValue(addr, ((Keyword_Type)jcasType).casFeatCode_Text, v);}    
   
    
  //*--------------*
  //* Feature: Relevance

  /** getter for Relevance - gets 
   * @generated
   * @return value of the feature 
   */
  public double getRelevance() {
    if (Keyword_Type.featOkTst && ((Keyword_Type)jcasType).casFeat_Relevance == null)
      jcasType.jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Keyword");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Keyword_Type)jcasType).casFeatCode_Relevance);}
    
  /** setter for Relevance - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelevance(double v) {
    if (Keyword_Type.featOkTst && ((Keyword_Type)jcasType).casFeat_Relevance == null)
      jcasType.jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Keyword");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Keyword_Type)jcasType).casFeatCode_Relevance, v);}    
   
    
  //*--------------*
  //* Feature: Emotion

  /** getter for Emotion - gets 
   * @generated
   * @return value of the feature 
   */
  public Emotion getEmotion() {
    if (Keyword_Type.featOkTst && ((Keyword_Type)jcasType).casFeat_Emotion == null)
      jcasType.jcas.throwFeatMissing("Emotion", "org.apache.uima.watson.ts.Keyword");
    return (Emotion)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Keyword_Type)jcasType).casFeatCode_Emotion)));}
    
  /** setter for Emotion - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmotion(Emotion v) {
    if (Keyword_Type.featOkTst && ((Keyword_Type)jcasType).casFeat_Emotion == null)
      jcasType.jcas.throwFeatMissing("Emotion", "org.apache.uima.watson.ts.Keyword");
    jcasType.ll_cas.ll_setRefValue(addr, ((Keyword_Type)jcasType).casFeatCode_Emotion, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Sentiment

  /** getter for Sentiment - gets 
   * @generated
   * @return value of the feature 
   */
  public double getSentiment() {
    if (Keyword_Type.featOkTst && ((Keyword_Type)jcasType).casFeat_Sentiment == null)
      jcasType.jcas.throwFeatMissing("Sentiment", "org.apache.uima.watson.ts.Keyword");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Keyword_Type)jcasType).casFeatCode_Sentiment);}
    
  /** setter for Sentiment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentiment(double v) {
    if (Keyword_Type.featOkTst && ((Keyword_Type)jcasType).casFeat_Sentiment == null)
      jcasType.jcas.throwFeatMissing("Sentiment", "org.apache.uima.watson.ts.Keyword");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Keyword_Type)jcasType).casFeatCode_Sentiment, v);}    
  }

    