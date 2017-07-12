
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FormDataType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String formEndorsementNumberId;
    protected String endVarTextNumberId;
    protected EffectivePeriodType effectivePeriod;
    protected EffectivePeriodType policyRiskEffectivePeriod;
    protected EffectivePeriodType origRiskEffectivePeriod;
    protected String policyNumberId;
    protected String sourceRecordId;
    protected String sourceTableName;
    protected String recordModeCode;
    protected String riskName;
    protected String riskBaseNumberId;
    protected String riskType;
    protected String status;
    protected String officialNumberId;
    protected String renewalIndicator;
    protected List<AdditionalInformationType> additionalInformation;

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
     * Gets the value of the endVarTextNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndVarTextNumberId() {
        return endVarTextNumberId;
    }

    /**
     * Sets the value of the endVarTextNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndVarTextNumberId(String value) {
        this.endVarTextNumberId = value;
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
     * Gets the value of the policyNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumberId() {
        return policyNumberId;
    }

    /**
     * Sets the value of the policyNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumberId(String value) {
        this.policyNumberId = value;
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
     * Gets the value of the riskBaseNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskBaseNumberId() {
        return riskBaseNumberId;
    }

    /**
     * Sets the value of the riskBaseNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskBaseNumberId(String value) {
        this.riskBaseNumberId = value;
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
     * Gets the value of the officialNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialNumberId() {
        return officialNumberId;
    }

    /**
     * Sets the value of the officialNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialNumberId(String value) {
        this.officialNumberId = value;
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
