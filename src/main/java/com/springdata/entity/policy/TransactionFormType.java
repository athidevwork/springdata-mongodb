
package com.springdata.entity.policy;

import java.io.Serializable;

public class TransactionFormType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected FormIdType formId;
    protected String endNo;
    protected String coiName;
    protected String risk;
    protected String fullPath;
    protected String copyType;

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link FormIdType }
     *     
     */
    public FormIdType getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormIdType }
     *     
     */
    public void setFormId(FormIdType value) {
        this.formId = value;
    }

    /**
     * Gets the value of the endNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndNo() {
        return endNo;
    }

    /**
     * Sets the value of the endNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndNo(String value) {
        this.endNo = value;
    }

    /**
     * Gets the value of the coiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOIName() {
        return coiName;
    }

    /**
     * Sets the value of the coiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOIName(String value) {
        this.coiName = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisk(String value) {
        this.risk = value;
    }

    /**
     * Gets the value of the fullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPath() {
        return fullPath;
    }

    /**
     * Sets the value of the fullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPath(String value) {
        this.fullPath = value;
    }

    /**
     * Gets the value of the copyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyType() {
        return copyType;
    }

    /**
     * Sets the value of the copyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyType(String value) {
        this.copyType = value;
    }

}
