

/* First created by JCasGen Wed Jun 07 14:04:49 MSK 2017 */
package org.apache.uima.watson.ts;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base class for all other Watson annotations
 * Updated by JCasGen Sun Jun 11 14:23:25 MSK 2017
 * XML source: /home/windj/projects/uima-addons/WatsonNLUAnnotator/src/main/resources/desc/type/Watson.xml
 * @generated */
public class WatsonAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WatsonAnnotation.class);
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
  protected WatsonAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public WatsonAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WatsonAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WatsonAnnotation(JCas jcas, int begin, int end) {
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
    if (WatsonAnnotation_Type.featOkTst && ((WatsonAnnotation_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.WatsonAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((WatsonAnnotation_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (WatsonAnnotation_Type.featOkTst && ((WatsonAnnotation_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.uima.watson.ts.WatsonAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((WatsonAnnotation_Type)jcasType).casFeatCode_Text, v);}    
  }

    