

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class Relation extends WatsonAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Relation.class);
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
  protected Relation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Relation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Relation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Relation(JCas jcas, int begin, int end) {
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
  //* Feature: Score

  /** getter for Score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "org.apache.uima.watson.ts.Relation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Relation_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "org.apache.uima.watson.ts.Relation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Relation_Type)jcasType).casFeatCode_Score, v);}    
   
    
  //*--------------*
  //* Feature: Text

  /** getter for Text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_Text, v);}    
   
    
  //*--------------*
  //* Feature: RelationType

  /** getter for RelationType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRelationType() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_RelationType == null)
      jcasType.jcas.throwFeatMissing("RelationType", "org.apache.uima.watson.ts.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_RelationType);}
    
  /** setter for RelationType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelationType(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_RelationType == null)
      jcasType.jcas.throwFeatMissing("RelationType", "org.apache.uima.watson.ts.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_RelationType, v);}    
   
    
  //*--------------*
  //* Feature: Arguments

  /** getter for Arguments - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getArguments() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Arguments == null)
      jcasType.jcas.throwFeatMissing("Arguments", "org.apache.uima.watson.ts.Relation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Arguments)));}
    
  /** setter for Arguments - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setArguments(FSArray v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Arguments == null)
      jcasType.jcas.throwFeatMissing("Arguments", "org.apache.uima.watson.ts.Relation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Arguments, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Arguments - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Argument getArguments(int i) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Arguments == null)
      jcasType.jcas.throwFeatMissing("Arguments", "org.apache.uima.watson.ts.Relation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Arguments), i);
    return (Argument)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Arguments), i)));}

  /** indexed setter for Arguments - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setArguments(int i, Argument v) { 
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Arguments == null)
      jcasType.jcas.throwFeatMissing("Arguments", "org.apache.uima.watson.ts.Relation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Arguments), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Arguments), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    