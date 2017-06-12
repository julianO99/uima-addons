

/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** Named entity
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
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
  public double getRelevance() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Relevance == null)
      jcasType.jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Entity");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Entity_Type)jcasType).casFeatCode_Relevance);}
    
  /** setter for Relevance - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelevance(double v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Relevance == null)
      jcasType.jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Entity");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Entity_Type)jcasType).casFeatCode_Relevance, v);}    
   
    
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
   
    
  //*--------------*
  //* Feature: Emotion

  /** getter for Emotion - gets 
   * @generated
   * @return value of the feature 
   */
  public Emotion getEmotion() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Emotion == null)
      jcasType.jcas.throwFeatMissing("Emotion", "org.apache.uima.watson.ts.Entity");
    return (Emotion)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Emotion)));}
    
  /** setter for Emotion - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmotion(Emotion v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Emotion == null)
      jcasType.jcas.throwFeatMissing("Emotion", "org.apache.uima.watson.ts.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Emotion, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: DbpediaResource

  /** getter for DbpediaResource - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDbpediaResource() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_DbpediaResource == null)
      jcasType.jcas.throwFeatMissing("DbpediaResource", "org.apache.uima.watson.ts.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_DbpediaResource);}
    
  /** setter for DbpediaResource - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDbpediaResource(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_DbpediaResource == null)
      jcasType.jcas.throwFeatMissing("DbpediaResource", "org.apache.uima.watson.ts.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_DbpediaResource, v);}    
   
    
  //*--------------*
  //* Feature: Subtype

  /** getter for Subtype - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getSubtype() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Subtype == null)
      jcasType.jcas.throwFeatMissing("Subtype", "org.apache.uima.watson.ts.Entity");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Subtype)));}
    
  /** setter for Subtype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubtype(StringArray v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Subtype == null)
      jcasType.jcas.throwFeatMissing("Subtype", "org.apache.uima.watson.ts.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Subtype, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Subtype - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getSubtype(int i) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Subtype == null)
      jcasType.jcas.throwFeatMissing("Subtype", "org.apache.uima.watson.ts.Entity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Subtype), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Subtype), i);}

  /** indexed setter for Subtype - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSubtype(int i, String v) { 
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Subtype == null)
      jcasType.jcas.throwFeatMissing("Subtype", "org.apache.uima.watson.ts.Entity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Subtype), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_Subtype), i, v);}
   
    
  //*--------------*
  //* Feature: Name

  /** getter for Name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.apache.uima.watson.ts.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_Name);}
    
  /** setter for Name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.apache.uima.watson.ts.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_Name, v);}    
  }

    