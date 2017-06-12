

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class Emotion extends WatsonFS {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Emotion.class);
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
  protected Emotion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Emotion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Emotion(JCas jcas) {
    super(jcas);
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
  //* Feature: Anger

  /** getter for Anger - gets 
   * @generated
   * @return value of the feature 
   */
  public double getAnger() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Anger == null)
      jcasType.jcas.throwFeatMissing("Anger", "org.apache.uima.watson.ts.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Anger);}
    
  /** setter for Anger - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnger(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Anger == null)
      jcasType.jcas.throwFeatMissing("Anger", "org.apache.uima.watson.ts.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Anger, v);}    
   
    
  //*--------------*
  //* Feature: Disgust

  /** getter for Disgust - gets 
   * @generated
   * @return value of the feature 
   */
  public double getDisgust() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Disgust == null)
      jcasType.jcas.throwFeatMissing("Disgust", "org.apache.uima.watson.ts.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Disgust);}
    
  /** setter for Disgust - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisgust(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Disgust == null)
      jcasType.jcas.throwFeatMissing("Disgust", "org.apache.uima.watson.ts.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Disgust, v);}    
   
    
  //*--------------*
  //* Feature: Fear

  /** getter for Fear - gets 
   * @generated
   * @return value of the feature 
   */
  public double getFear() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Fear == null)
      jcasType.jcas.throwFeatMissing("Fear", "org.apache.uima.watson.ts.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Fear);}
    
  /** setter for Fear - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFear(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Fear == null)
      jcasType.jcas.throwFeatMissing("Fear", "org.apache.uima.watson.ts.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Fear, v);}    
   
    
  //*--------------*
  //* Feature: Joy

  /** getter for Joy - gets 
   * @generated
   * @return value of the feature 
   */
  public double getJoy() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Joy == null)
      jcasType.jcas.throwFeatMissing("Joy", "org.apache.uima.watson.ts.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Joy);}
    
  /** setter for Joy - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setJoy(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Joy == null)
      jcasType.jcas.throwFeatMissing("Joy", "org.apache.uima.watson.ts.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Joy, v);}    
   
    
  //*--------------*
  //* Feature: Sadness

  /** getter for Sadness - gets 
   * @generated
   * @return value of the feature 
   */
  public double getSadness() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Sadness == null)
      jcasType.jcas.throwFeatMissing("Sadness", "org.apache.uima.watson.ts.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Sadness);}
    
  /** setter for Sadness - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSadness(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Sadness == null)
      jcasType.jcas.throwFeatMissing("Sadness", "org.apache.uima.watson.ts.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_Sadness, v);}    
  }

    