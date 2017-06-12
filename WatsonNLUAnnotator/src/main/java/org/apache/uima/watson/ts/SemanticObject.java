

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class SemanticObject extends WatsonAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticObject.class);
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
  protected SemanticObject() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemanticObject(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticObject(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SemanticObject(JCas jcas, int begin, int end) {
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
    if (SemanticObject_Type.featOkTst && ((SemanticObject_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticObject");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SemanticObject_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (SemanticObject_Type.featOkTst && ((SemanticObject_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SemanticObject");
    jcasType.ll_cas.ll_setStringValue(addr, ((SemanticObject_Type)jcasType).casFeatCode_Text, v);}    
   
    
  //*--------------*
  //* Feature: Keywords

  /** getter for Keywords - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getKeywords() {
    if (SemanticObject_Type.featOkTst && ((SemanticObject_Type)jcasType).casFeat_Keywords == null)
      jcasType.jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticObject");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticObject_Type)jcasType).casFeatCode_Keywords)));}
    
  /** setter for Keywords - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKeywords(StringArray v) {
    if (SemanticObject_Type.featOkTst && ((SemanticObject_Type)jcasType).casFeat_Keywords == null)
      jcasType.jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticObject");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticObject_Type)jcasType).casFeatCode_Keywords, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Keywords - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getKeywords(int i) {
    if (SemanticObject_Type.featOkTst && ((SemanticObject_Type)jcasType).casFeat_Keywords == null)
      jcasType.jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticObject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticObject_Type)jcasType).casFeatCode_Keywords), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticObject_Type)jcasType).casFeatCode_Keywords), i);}

  /** indexed setter for Keywords - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setKeywords(int i, String v) { 
    if (SemanticObject_Type.featOkTst && ((SemanticObject_Type)jcasType).casFeat_Keywords == null)
      jcasType.jcas.throwFeatMissing("Keywords", "org.apache.uima.watson.ts.SemanticObject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticObject_Type)jcasType).casFeatCode_Keywords), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticObject_Type)jcasType).casFeatCode_Keywords), i, v);}
  }

    