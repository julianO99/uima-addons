
/* First created by JCasGen Mon Jun 12 14:00:10 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Mon Jun 12 14:43:19 MSK 2017
 * @generated */
public class Argument_Type extends WatsonAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Argument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.Argument");
 
  /** @generated */
  final Feature casFeat_Entities;
  /** @generated */
  final int     casFeatCode_Entities;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEntities(int addr) {
        if (featOkTst && casFeat_Entities == null)
      jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.Argument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Entities);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntities(int addr, int v) {
        if (featOkTst && casFeat_Entities == null)
      jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.Argument");
    ll_cas.ll_setRefValue(addr, casFeatCode_Entities, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEntities(int addr, int i) {
        if (featOkTst && casFeat_Entities == null)
      jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.Argument");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEntities(int addr, int i, int v) {
        if (featOkTst && casFeat_Entities == null)
      jcas.throwFeatMissing("Entities", "org.apache.uima.watson.ts.Argument");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Entities), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Argument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Entities = jcas.getRequiredFeatureDE(casType, "Entities", "uima.cas.FSArray", featOkTst);
    casFeatCode_Entities  = (null == casFeat_Entities) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Entities).getCode();

  }
}



    