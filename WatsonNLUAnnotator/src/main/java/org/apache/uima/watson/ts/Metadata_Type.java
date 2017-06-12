
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
public class Metadata_Type extends WatsonFS_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Metadata.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.watson.ts.Metadata");
 
  /** @generated */
  final Feature casFeat_Authors;
  /** @generated */
  final int     casFeatCode_Authors;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAuthors(int addr) {
        if (featOkTst && casFeat_Authors == null)
      jcas.throwFeatMissing("Authors", "org.apache.uima.watson.ts.Metadata");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Authors);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthors(int addr, int v) {
        if (featOkTst && casFeat_Authors == null)
      jcas.throwFeatMissing("Authors", "org.apache.uima.watson.ts.Metadata");
    ll_cas.ll_setRefValue(addr, casFeatCode_Authors, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getAuthors(int addr, int i) {
        if (featOkTst && casFeat_Authors == null)
      jcas.throwFeatMissing("Authors", "org.apache.uima.watson.ts.Metadata");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Authors), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Authors), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Authors), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAuthors(int addr, int i, String v) {
        if (featOkTst && casFeat_Authors == null)
      jcas.throwFeatMissing("Authors", "org.apache.uima.watson.ts.Metadata");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Authors), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Authors), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Authors), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_PublicationDate;
  /** @generated */
  final int     casFeatCode_PublicationDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPublicationDate(int addr) {
        if (featOkTst && casFeat_PublicationDate == null)
      jcas.throwFeatMissing("PublicationDate", "org.apache.uima.watson.ts.Metadata");
    return ll_cas.ll_getStringValue(addr, casFeatCode_PublicationDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPublicationDate(int addr, String v) {
        if (featOkTst && casFeat_PublicationDate == null)
      jcas.throwFeatMissing("PublicationDate", "org.apache.uima.watson.ts.Metadata");
    ll_cas.ll_setStringValue(addr, casFeatCode_PublicationDate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Title;
  /** @generated */
  final int     casFeatCode_Title;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_Title == null)
      jcas.throwFeatMissing("Title", "org.apache.uima.watson.ts.Metadata");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_Title == null)
      jcas.throwFeatMissing("Title", "org.apache.uima.watson.ts.Metadata");
    ll_cas.ll_setStringValue(addr, casFeatCode_Title, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Metadata_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Authors = jcas.getRequiredFeatureDE(casType, "Authors", "uima.cas.StringArray", featOkTst);
    casFeatCode_Authors  = (null == casFeat_Authors) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Authors).getCode();

 
    casFeat_PublicationDate = jcas.getRequiredFeatureDE(casType, "PublicationDate", "uima.cas.String", featOkTst);
    casFeatCode_PublicationDate  = (null == casFeat_PublicationDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PublicationDate).getCode();

 
    casFeat_Title = jcas.getRequiredFeatureDE(casType, "Title", "uima.cas.String", featOkTst);
    casFeatCode_Title  = (null == casFeat_Title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Title).getCode();

  }
}



    