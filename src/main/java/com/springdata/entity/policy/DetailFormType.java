
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DetailFormType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String formDataDesc;
    protected String riskBaseRecordId;
    protected String riskType;
    protected EffectivePeriodType policyRiskEffectivePeriod;
    protected String status;
    protected EffectivePeriodType origRiskEffectivePeriod;
    protected String formEndorsementId;
    protected String endVarTextId;
    protected String endVtId;
    protected String policyId;
    protected String sourceRecordId;
    protected String sourceTableName;
    protected String recordModeCode;
    protected String officialRecordId;
    protected EffectivePeriodType effectivePeriod;
    protected String renewalIndicator;
    protected List<AdditionalInformationType> additionalInformation;

    /**
     * Gets the value of the formDataDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormDataDesc() {
        return formDataDesc;
    }

    /**
     * Sets the value of the formDataDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormDataDesc(String value) {
        this.formDataDesc = value;
    }

    /**
     * Gets the value of the riskBaseRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskBaseRecordId() {
        return riskBaseRecordId;
    }

    /**
     * Sets the value of the riskBaseRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskBaseRecordId(String value) {
        this.riskBaseRecordId = value;
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
     * Gets the value of the policyRiskEffectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getPolicyRiskEffectivePeriod() {
        return policyRiskEffectivePeriod;
    }

    /**
     * Sets the value of the policyRiskEffectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setPolicyRiskEffectivePeriod(EffectivePeriodType value) {
        this.policyRiskEffectivePeriod = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the origRiskEffectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getOrigRiskEffectivePeriod() {
        return origRiskEffectivePeriod;
    }

    /**
     * Sets the value of the origRiskEffectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setOrigRiskEffectivePeriod(EffectivePeriodType value) {
        this.origRiskEffectivePeriod = value;
    }

    /**
     * Gets the value of the formEndorsementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormEndorsementId() {
        return formEndorsementId;
    }

    /**
     * Sets the value of the formEndorsementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormEndorsementId(String value) {
        this.formEndorsementId = value;
    }

    /**
     * Gets the value of the endVarTextId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndVarTextId() {
        return endVarTextId;
    }

    /**
     * Sets the value of the endVarTextId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndVarTextId(String value) {
        this.endVarTextId = value;
    }

    /**
     * Gets the value of the endVtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndVtId() {
        return endVtId;
    }

    /**
     * Sets the value of the endVtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndVtId(String value) {
        this.endVtId = value;
    }

    /**
     * Gets the value of the policyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the sourceRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRecordId() {
        return sourceRecordId;
    }

    /**
     * Sets the value of the sourceRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRecordId(String value) {
        this.sourceRecordId = value;
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

    /**
     * Gets the value of the recordModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordModeCode() {
        return recordModeCode;
    }

    /**
     * Sets the value of the recordModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordModeCode(String value) {
        this.recordModeCode = value;
    }

    /**
     * Gets the value of the officialRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialRecordId() {
        return officialRecordId;
    }

    /**
     * Sets the value of the officialRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialRecordId(String value) {
        this.officialRecordId = value;
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
     * Gets the value of the renewalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalIndicator() {
        return renewalIndicator;
    }

    /**
     * Sets the value of the renewalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalIndicator(String value) {
        this.renewalIndicator = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationType }
     * 
     * 
     */
    public List<AdditionalInformationType> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInformationType>();
        }
        return this.additionalInformation;
    }

}
