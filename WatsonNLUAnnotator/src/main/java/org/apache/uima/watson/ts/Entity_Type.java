
/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Named entity
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * @generated */
public class Entity_Type extends WatsonAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Entity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.Entity");
 
  /** @generated */
  final Feature casFeat_EntityType;
  /** @generated */
  final int     casFeatCode_EntityType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEntityType(int addr) {
        if (featOkTst && casFeat_EntityType == null)
      jcas.throwFeatMissing("EntityType", "org.apache.uima.watson.ts.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_EntityType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntityType(int addr, String v) {
        if (featOkTst && casFeat_EntityType == null)
      jcas.throwFeatMissing("EntityType", "org.apache.uima.watson.ts.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_EntityType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Relevance;
  /** @generated */
  final int     casFeatCode_Relevance;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRelevance(int addr) {
        if (featOkTst && casFeat_Relevance == null)
      jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Entity");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Relevance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelevance(int addr, double v) {
        if (featOkTst && casFeat_Relevance == null)
      jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Entity");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Relevance, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Count;
  /** @generated */
  final int     casFeatCode_Count;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCount(int addr) {
        if (featOkTst && casFeat_Count == null)
      jcas.throwFeatMissing("Count", "org.apache.uima.watson.ts.Entity");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Count);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCount(int addr, int v) {
        if (featOkTst && casFeat_Count == null)
      jcas.throwFeatMissing("Count", "org.apache.uima.watson.ts.Entity");
    ll_cas.ll_setIntValue(addr, casFeatCode_Count, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Emotion;
  /** @generated */
  final int     casFeatCode_Emotion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEmotion(int addr) {
        if (featOkTst && casFeat_Emotion == null)
      jcas.throwFeatMissing("Emotion", "org.apache.uima.watson.ts.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Emotion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEmotion(int addr, int v) {
        if (featOkTst && casFeat_Emotion == null)
      jcas.throwFeatMissing("Emotion", "org.apache.uima.watson.ts.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_Emotion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_DbpediaResource;
  /** @generated */
  final int     casFeatCode_DbpediaResource;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDbpediaResource(int addr) {
        if (featOkTst && casFeat_DbpediaResource == null)
      jcas.throwFeatMissing("DbpediaResource", "org.apache.uima.watson.ts.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_DbpediaResource);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDbpediaResource(int addr, String v) {
        if (featOkTst && casFeat_DbpediaResource == null)
      jcas.throwFeatMissing("DbpediaResource", "org.apache.uima.watson.ts.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_DbpediaResource, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Subtype;
  /** @generated */
  final int     casFeatCode_Subtype;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubtype(int addr) {
        if (featOkTst && casFeat_Subtype == null)
      jcas.throwFeatMissing("Subtype", "org.apache.uima.watson.ts.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Subtype);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubtype(int addr, int v) {
        if (featOkTst && casFeat_Subtype == null)
      jcas.throwFeatMissing("Subtype", "org.apache.uima.watson.ts.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_Subtype, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getSubtype(int addr, int i) {
        if (featOkTst && casFeat_Subtype == null)
      jcas.throwFeatMissing("Subtype", "org.apache.uima.watson.ts.Entity");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Subtype), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Subtype), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Subtype), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setSubtype(int addr, int i, String v) {
        if (featOkTst && casFeat_Subtype == null)
      jcas.throwFeatMissing("Subtype", "org.apache.uima.watson.ts.Entity");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Subtype), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Subtype), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Subtype), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_Name;
  /** @generated */
  final int     casFeatCode_Name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_Name == null)
      jcas.throwFeatMissing("Name", "org.apache.uima.watson.ts.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_Name == null)
      jcas.throwFeatMissing("Name", "org.apache.uima.watson.ts.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_Name, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Entity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_EntityType = jcas.getRequiredFeatureDE(casType, "EntityType", "uima.cas.String", featOkTst);
    casFeatCode_EntityType  = (null == casFeat_EntityType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_EntityType).getCode();

 
    casFeat_Relevance = jcas.getRequiredFeatureDE(casType, "Relevance", "uima.cas.Double", featOkTst);
    casFeatCode_Relevance  = (null == casFeat_Relevance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Relevance).getCode();

 
    casFeat_Count = jcas.getRequiredFeatureDE(casType, "Count", "uima.cas.Integer", featOkTst);
    casFeatCode_Count  = (null == casFeat_Count) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Count).getCode();

 
    casFeat_Emotion = jcas.getRequiredFeatureDE(casType, "Emotion", "org.apache.uima.watson.ts.Emotion", featOkTst);
    casFeatCode_Emotion  = (null == casFeat_Emotion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Emotion).getCode();

 
    casFeat_DbpediaResource = jcas.getRequiredFeatureDE(casType, "DbpediaResource", "uima.cas.String", featOkTst);
    casFeatCode_DbpediaResource  = (null == casFeat_DbpediaResource) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_DbpediaResource).getCode();

 
    casFeat_Subtype = jcas.getRequiredFeatureDE(casType, "Subtype", "uima.cas.StringArray", featOkTst);
    casFeatCode_Subtype  = (null == casFeat_Subtype) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Subtype).getCode();

 
    casFeat_Name = jcas.getRequiredFeatureDE(casType, "Name", "uima.cas.String", featOkTst);
    casFeatCode_Name  = (null == casFeat_Name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Name).getCode();

  }
}



    