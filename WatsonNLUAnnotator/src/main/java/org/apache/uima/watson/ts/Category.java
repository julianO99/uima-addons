

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class Category extends WatsonFS {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Category.class);
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
  protected Category() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Category(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Category(JCas jcas) {
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
  //* Feature: Label

  /** getter for Label - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_Label == null)
      jcasType.jcas.throwFeatMissing("Label", "org.apache.uima.watson.ts.Category");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Category_Type)jcasType).casFeatCode_Label);}
    
  /** setter for Label - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_Label == null)
      jcasType.jcas.throwFeatMissing("Label", "org.apache.uima.watson.ts.Category");
    jcasType.ll_cas.ll_setStringValue(addr, ((Category_Type)jcasType).casFeatCode_Label, v);}    
   
    
  //*--------------*
  //* Feature: Score

  /** getter for Score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "org.apache.uima.watson.ts.Category");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Category_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "org.apache.uima.watson.ts.Category");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Category_Type)jcasType).casFeatCode_Score, v);}    
  }

    