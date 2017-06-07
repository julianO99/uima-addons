

/* First created by JCasGen Wed Jun 07 14:04:49 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Named entity
 * Updated by JCasGen Wed Jun 07 14:53:17 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class Entity extends WatsonAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Entity.class);
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
  protected Entity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Entity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Entity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Entity(JCas jcas, int begin, int end) {
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
  //* Feature: EntityType

  /** getter for EntityType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEntityType() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_EntityType == null)
      jcasType.jcas.throwFeatMissing("EntityType", "org.apache.uima.watson.ts.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_EntityType);}
    
  /** setter for EntityType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEntityType(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_EntityType == null)
      jcasType.jcas.throwFeatMissing("EntityType", "org.apache.uima.watson.ts.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_EntityType, v);}    
   
    
  //*--------------*
  //* Feature: Relevance

  /** getter for Relevance - gets 
   * @generated
   * @return value of the feature 
   */
  public float getRelevance() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Relevance == null)
      jcasType.jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Entity");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Entity_Type)jcasType).casFeatCode_Relevance);}
    
  /** setter for Relevance - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelevance(float v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Relevance == null)
      jcasType.jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Entity");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Entity_Type)jcasType).casFeatCode_Relevance, v);}    
   
    
  //*--------------*
  //* Feature: Count

  /** getter for Count - gets 
   * @generated
   * @return value of the feature 
   */
  public int getCount() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Count == null)
      jcasType.jcas.throwFeatMissing("Count", "org.apache.uima.watson.ts.Entity");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Entity_Type)jcasType).casFeatCode_Count);}
    
  /** setter for Count - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCount(int v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Count == null)
      jcasType.jcas.throwFeatMissing("Count", "org.apache.uima.watson.ts.Entity");
    jcasType.ll_cas.ll_setIntValue(addr, ((Entity_Type)jcasType).casFeatCode_Count, v);}    
  }

    