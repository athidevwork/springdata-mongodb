
package com.springdata.entity.policy;

import java.io.Serializable;

public class OverviewFormType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String formEndorsementNumberId;
    protected String osFormNumberId;
    protected String termBaseNumberId;
    protected String formNumber;
    protected String formId;
    protected String formDesc;
    protected String formType;
    protected EffectivePeriodType effectivePeriod;
    protected String riskId;
    protected String riskName;
    protected String riskType;
    protected String triggeredForm;
    protected String renewalStatus;
    protected String sourceTableName;

    /**
     * Gets the value of the formEndorsementNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormEndorsementNumberId() {
        return formEndorsementNumberId;
    }

    /**
     * Sets the value of the formEndorsementNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormEndorsementNumberId(String value) {
        this.formEndorsementNumberId = value;
    }

    /**
     * Gets the value of the osFormNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSFormNumberId() {
        return osFormNumberId;
    }

    /**
     * Sets the value of the osFormNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSFormNumberId(String value) {
        this.osFormNumberId = value;
    }

    /**
     * Gets the value of the termBaseNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermBaseNumberId() {
        return termBaseNumberId;
    }

    /**
     * Sets the value of the termBaseNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermBaseNumberId(String value) {
        this.termBaseNumberId = value;
    }

    /**
     * Gets the value of the formNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormNumber() {
        return formNumber;
    }

    /**
     * Sets the value of the formNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormNumber(String value) {
        this.formNumber = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
    }

    /**
     * Gets the value of the formDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormDesc() {
        return formDesc;
    }

    /**
     * Sets the value of the formDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormDesc(String value) {
        this.formDesc = value;
    }

    /**
     * Gets the value of the formType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormType() {
        return formType;
    }

    /**
     * Sets the value of the formType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormType(String value) {
        this.formType = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setEffectivePeriod(EffectivePeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the riskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskId() {
        return riskId;
    }

    /**
     * Sets the value of the riskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskId(String value) {
        this.riskId = value;
    }

    /**
     * Gets the value of the riskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskName() {
        return riskName;
    }

    /**
     * Sets the value of the riskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskName(String value) {
        this.riskName = value;
    }

    /**
     * Gets the value of the riskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskType() {
        return riskType;
    }

    /**
     * Sets the value of the riskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskType(String value) {
        this.riskType = value;
    }

    /**
     * Gets the value of the triggeredForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggeredForm() {
        return triggeredForm;
    }

    /**
     * Sets the value of the triggeredForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggeredForm(String value) {
        this.triggeredForm = value;
    }

    /**
     * Gets the value of the renewalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalStatus() {
        return renewalStatus;
    }

    /**
     * Sets the value of the renewalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalStatus(String value) {
        this.renewalStatus = value;
    }

    /**
     * Gets the value of the sourceTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * Sets the value of the sourceTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTableName(String value) {
        this.sourceTableName = value;
    }

}
