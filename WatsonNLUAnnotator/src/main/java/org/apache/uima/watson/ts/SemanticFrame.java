

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class SemanticFrame extends WatsonAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticFrame.class);
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
  protected SemanticFrame() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemanticFrame(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticFrame(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SemanticFrame(JCas jcas, int begin, int end) {
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
    if (SemanticFrame_Type.featOkTst && ((SemanticFrame_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticFrame");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticFrame_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (SemanticFrame_Type.featOkTst && ((SemanticFrame_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticFrame");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticFrame_Type)jcasType).casFeatCode_Text, v);}    
   
    
  //*--------------*
  //* Feature: Subject

  /** getter for Subject - gets 
   * @generated
   * @return value of the feature 
   */
  public SemanticSubject getSubject() {
    if (SemanticFrame_Type.featOkTst && ((SemanticFrame_Type)jcasType).casFeat_Subject == null)
      jcasType.jcas.throwFeatMissing("Subject", "org.apache.uima.watson.ts.SemanticFrame");
    return (SemanticSubject)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticFrame_Type)jcasType).casFeatCode_Subject)));}
    
  /** setter for Subject - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubject(SemanticSubject v) {
    if (SemanticFrame_Type.featOkTst && ((SemanticFrame_Type)jcasType).casFeat_Subject == null)
      jcasType.jcas.throwFeatMissing("Subject", "org.apache.uima.watson.ts.SemanticFrame");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticFrame_Type)jcasType).casFeatCode_Subject, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Object

  /** getter for Object - gets 
   * @generated
   * @return value of the feature 
   */
  public SemanticObject getObject() {
    if (SemanticFrame_Type.featOkTst && ((SemanticFrame_Type)jcasType).casFeat_Object == null)
      jcasType.jcas.throwFeatMissing("Object", "org.apache.uima.watson.ts.SemanticFrame");
    return (SemanticObject)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticFrame_Type)jcasType).casFeatCode_Object)));}
    
  /** setter for Object - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject(SemanticObject v) {
    if (SemanticFrame_Type.featOkTst && ((SemanticFrame_Type)jcasType).casFeat_Object == null)
      jcasType.jcas.throwFeatMissing("Object", "org.apache.uima.watson.ts.SemanticFrame");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticFrame_Type)jcasType).casFeatCode_Object, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Action

  /** getter for Action - gets 
   * @generated
   * @return value of the feature 
   */
  public SemanticAction getAction() {
    if (SemanticFrame_Type.featOkTst && ((SemanticFrame_Type)jcasType).casFeat_Action == null)
      jcasType.jcas.throwFeatMissing("Action", "org.apache.uima.watson.ts.SemanticFrame");
    return (SemanticAction)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticFrame_Type)jcasType).casFeatCode_Action)));}
    
  /** setter for Action - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAction(SemanticAction v) {
    if (SemanticFrame_Type.featOkTst && ((SemanticFrame_Type)jcasType).casFeat_Action == null)
      jcasType.jcas.throwFeatMissing("Action", "org.apache.uima.watson.ts.SemanticFrame");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticFrame_Type)jcasType).casFeatCode_Action, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    