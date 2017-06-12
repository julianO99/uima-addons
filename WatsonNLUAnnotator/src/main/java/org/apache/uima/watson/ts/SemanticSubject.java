

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class SemanticSubject extends WatsonAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticSubject.class);
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
  protected SemanticSubject() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemanticSubject(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticSubject(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SemanticSubject(JCas jcas, int begin, int end) {
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
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticSubject");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticSubject");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Text, v);}    
   
    
  //*--------------*
  //* Feature: Entities

  /** getter for Entities - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getEntities() {
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Entities == null)
      jcasType.jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.SemanticSubject");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Entities)));}
    
  /** setter for Entities - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEntities(FSArray v) {
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Entities == null)
      jcasType.jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.SemanticSubject");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Entities, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Entities - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public SimpleEntity getEntities(int i) {
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Entities == null)
      jcasType.jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.SemanticSubject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Entities), i);
    return (SimpleEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Entities), i)));}

  /** indexed setter for Entities - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEntities(int i, SimpleEntity v) { 
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Entities == null)
      jcasType.jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.SemanticSubject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Entities), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Entities), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: Keywords

  /** getter for Keywords - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getKeywords() {
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Keywords == null)
      jcasType.jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticSubject");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Keywords)));}
    
  /** setter for Keywords - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKeywords(StringArray v) {
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Keywords == null)
      jcasType.jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticSubject");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Keywords, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Keywords - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getKeywords(int i) {
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Keywords == null)
      jcasType.jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticSubject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Keywords), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Keywords), i);}

  /** indexed setter for Keywords - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setKeywords(int i, String v) { 
    if (SemanticSubject_Type.featOkTst && ((SemanticSubject_Type)jcasType).casFeat_Keywords == null)
      jcasType.jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticSubject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Keywords), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticSubject_Type)jcasType).casFeatCode_Keywords), i, v);}
  }

    