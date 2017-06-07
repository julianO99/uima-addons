
/* First created by JCasGen Wed Jun 07 14:04:49 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Named entity
 * Updated by JCasGen Wed Jun 07 14:53:17 MSK 2017
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
  public float getRelevance(int addr) {
        if (featOkTst && casFeat_Relevance == null)
      jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Entity");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Relevance);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelevance(int addr, float v) {
        if (featOkTst && casFeat_Relevance == null)
      jcas.throwFeatMissing("Relevance", "org.apache.uima.watson.ts.Entity");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Relevance, v);}
    
  
 
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

 
    casFeat_Relevance = jcas.getRequiredFeatureDE(casType, "Relevance", "uima.cas.Float", featOkTst);
    casFeatCode_Relevance  = (null == casFeat_Relevance) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Relevance).getCode();

 
    casFeat_Count = jcas.getRequiredFeatureDE(casType, "Count", "uima.cas.Integer", featOkTst);
    casFeatCode_Count  = (null == casFeat_Count) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Count).getCode();

  }
}



    