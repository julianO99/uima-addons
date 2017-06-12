

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class SemanticAction extends WatsonAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticAction.class);
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
  protected SemanticAction() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemanticAction(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticAction(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SemanticAction(JCas jcas, int begin, int end) {
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
    if (SemanticAction_Type.featOkTst && ((SemanticAction_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticAction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticAction_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (SemanticAction_Type.featOkTst && ((SemanticAction_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticAction");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticAction_Type)jcasType).casFeatCode_Text, v);}    
   
    
  //*--------------*
  //* Feature: Normalized

  /** getter for Normalized - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNormalized() {
    if (SemanticAction_Type.featOkTst && ((SemanticAction_Type)jcasType).casFeat_Normalized == null)
      jcasType.jcas.throwFeatMissing("Normalized", "org.apache.uima.watson.ts.SemanticAction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticAction_Type)jcasType).casFeatCode_Normalized);}
    
  /** setter for Normalized - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNormalized(String v) {
    if (SemanticAction_Type.featOkTst && ((SemanticAction_Type)jcasType).casFeat_Normalized == null)
      jcasType.jcas.throwFeatMissing("Normalized", "org.apache.uima.watson.ts.SemanticAction");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticAction_Type)jcasType).casFeatCode_Normalized, v);}    
   
    
  //*--------------*
  //* Feature: VerbText

  /** getter for VerbText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVerbText() {
    if (SemanticAction_Type.featOkTst && ((SemanticAction_Type)jcasType).casFeat_VerbText == null)
      jcasType.jcas.throwFeatMissing("VerbText", "org.apache.uima.watson.ts.SemanticAction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticAction_Type)jcasType).casFeatCode_VerbText);}
    
  /** setter for VerbText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVerbText(String v) {
    if (SemanticAction_Type.featOkTst && ((SemanticAction_Type)jcasType).casFeat_VerbText == null)
      jcasType.jcas.throwFeatMissing("VerbText", "org.apache.uima.watson.ts.SemanticAction");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticAction_Type)jcasType).casFeatCode_VerbText, v);}    
   
    
  //*--------------*
  //* Feature: Tense

  /** getter for Tense - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTense() {
    if (SemanticAction_Type.featOkTst && ((SemanticAction_Type)jcasType).casFeat_Tense == null)
      jcasType.jcas.throwFeatMissing("Tense", "org.apache.uima.watson.ts.SemanticAction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticAction_Type)jcasType).casFeatCode_Tense);}
    
  /** setter for Tense - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTense(String v) {
    if (SemanticAction_Type.featOkTst && ((SemanticAction_Type)jcasType).casFeat_Tense == null)
      jcasType.jcas.throwFeatMissing("Tense", "org.apache.uima.watson.ts.SemanticAction");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticAction_Type)jcasType).casFeatCode_Tense, v);}    
  }

    