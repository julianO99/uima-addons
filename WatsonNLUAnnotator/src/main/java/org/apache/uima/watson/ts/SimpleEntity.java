

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class SimpleEntity extends WatsonAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SimpleEntity.class);
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
  protected SimpleEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SimpleEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SimpleEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SimpleEntity(JCas jcas, int begin, int end) {
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
    if (SimpleEntity_Type.featOkTst && ((SimpleEntity_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SimpleEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SimpleEntity_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (SimpleEntity_Type.featOkTst && ((SimpleEntity_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.SimpleEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SimpleEntity_Type)jcasType).casFeatCode_Text, v);}    
   
    
  //*--------------*
  //* Feature: EntityType

  /** getter for EntityType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEntityType() {
    if (SimpleEntity_Type.featOkTst && ((SimpleEntity_Type)jcasType).casFeat_EntityType == null)
      jcasType.jcas.throwFeatMissing("EntityType", "org.apache.uima.watson.ts.SimpleEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SimpleEntity_Type)jcasType).casFeatCode_EntityType);}
    
  /** setter for EntityType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEntityType(String v) {
    if (SimpleEntity_Type.featOkTst && ((SimpleEntity_Type)jcasType).casFeat_EntityType == null)
      jcasType.jcas.throwFeatMissing("EntityType", "org.apache.uima.watson.ts.SimpleEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SimpleEntity_Type)jcasType).casFeatCode_EntityType, v);}    
  }

    