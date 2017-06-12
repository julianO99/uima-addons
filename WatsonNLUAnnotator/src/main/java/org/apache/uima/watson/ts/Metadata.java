

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
public class Metadata extends WatsonFS {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Metadata.class);
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
  protected Metadata() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Metadata(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Metadata(JCas jcas) {
    super(jcas);
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
  //* Feature: Authors

  /** getter for Authors - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getAuthors() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_Authors == null)
      jcasType.jcas.throwFeatMissing("Authors", "org.apache.uima.watson.ts.Metadata");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_Authors)));}
    
  /** setter for Authors - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthors(StringArray v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_Authors == null)
      jcasType.jcas.throwFeatMissing("Authors", "org.apache.uima.watson.ts.Metadata");
    jcasType.ll_cas.ll_setRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_Authors, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Authors - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getAuthors(int i) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_Authors == null)
      jcasType.jcas.throwFeatMissing("Authors", "org.apache.uima.watson.ts.Metadata");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_Authors), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_Authors), i);}

  /** indexed setter for Authors - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAuthors(int i, String v) { 
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_Authors == null)
      jcasType.jcas.throwFeatMissing("Authors", "org.apache.uima.watson.ts.Metadata");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_Authors), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Metadata_Type)jcasType).casFeatCode_Authors), i, v);}
   
    
  //*--------------*
  //* Feature: PublicationDate

  /** getter for PublicationDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPublicationDate() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_PublicationDate == null)
      jcasType.jcas.throwFeatMissing("PublicationDate", "org.apache.uima.watson.ts.Metadata");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_PublicationDate);}
    
  /** setter for PublicationDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPublicationDate(String v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_PublicationDate == null)
      jcasType.jcas.throwFeatMissing("PublicationDate", "org.apache.uima.watson.ts.Metadata");
    jcasType.ll_cas.ll_setStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_PublicationDate, v);}    
   
    
  //*--------------*
  //* Feature: Title

  /** getter for Title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_Title == null)
      jcasType.jcas.throwFeatMissing("Title", "org.apache.uima.watson.ts.Metadata");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_Title);}
    
  /** setter for Title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_Title == null)
      jcasType.jcas.throwFeatMissing("Title", "org.apache.uima.watson.ts.Metadata");
    jcasType.ll_cas.ll_setStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_Title, v);}    
  }

    