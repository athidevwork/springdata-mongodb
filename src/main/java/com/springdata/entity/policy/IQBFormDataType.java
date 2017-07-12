
package com.springdata.entity.policy;

import java.io.Serializable;

public class IQBFormDataType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String iqbFormDataId;
    protected String termBaseRecordId;
    protected String formType;
    protected String expirationDate;
    protected String agentName;
    protected AddressInfoType addressInfo;
    protected String additionalApplications;
    protected String listOfApplications;
    protected String coverSheet;
    protected String predefinedNotes;
    protected String coverageProvisions;
    protected UnderlyingLimitType underlyingLimit;
    protected String draftSchedules;

    /**
     * Gets the value of the iqbFormDataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIQBFormDataId() {
        return iqbFormDataId;
    }

    /**
     * Sets the value of the iqbFormDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIQBFormDataId(String value) {
        this.iqbFormDataId = value;
    }

    /**
     * Gets the value of the termBaseRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermBaseRecordId() {
        return termBaseRecordId;
    }

    /**
     * Sets the value of the termBaseRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermBaseRecordId(String value) {
        this.termBaseRecordId = value;
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
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the additionalApplications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalApplications() {
        return additionalApplications;
    }

    /**
     * Sets the value of the additionalApplications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalApplications(String value) {
        this.additionalApplications = value;
    }

    /**
     * Gets the value of the listOfApplications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListOfApplications() {
        return listOfApplications;
    }

    /**
     * Sets the value of the listOfApplications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListOfApplications(String value) {
        this.listOfApplications = value;
    }

    /**
     * Gets the value of the coverSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverSheet() {
        return coverSheet;
    }

    /**
     * Sets the value of the coverSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverSheet(String value) {
        this.coverSheet = value;
    }

    /**
     * Gets the value of the predefinedNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedNotes() {
        return predefinedNotes;
    }

    /**
     * Sets the value of the predefinedNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedNotes(String value) {
        this.predefinedNotes = value;
    }

    /**
     * Gets the value of the coverageProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageProvisions() {
        return coverageProvisions;
    }

    /**
     * Sets the value of the coverageProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageProvisions(String value) {
        this.coverageProvisions = value;
    }

    /**
     * Gets the value of the underlyingLimit property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingLimitType }
     *     
     */
    public UnderlyingLimitType getUnderlyingLimit() {
        return underlyingLimit;
    }

    /**
     * Sets the value of the underlyingLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingLimitType }
     *     
     */
    public void setUnderlyingLimit(UnderlyingLimitType value) {
        this.underlyingLimit = value;
    }

    /**
     * Gets the value of the draftSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftSchedules() {
        return draftSchedules;
    }

    /**
     * Sets the value of the draftSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftSchedules(String value) {
        this.draftSchedules = value;
    }

}
