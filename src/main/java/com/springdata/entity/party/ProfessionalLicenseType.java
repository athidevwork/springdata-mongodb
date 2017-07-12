
package com.springdata.entity.party;

import java.io.Serializable;

public class ProfessionalLicenseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String licenseNumberId;
    protected String licenseNumber;
    protected EffectivePeriodType licensePeriod;
    protected CodeWithDesc stateOrProvinceCode;
    protected SuspensionReinstatementInformationType suspensionReinstatementInformation;
    protected String entityId;
    protected String licenseTypeCode;
    protected String validLicense;
    protected String verificationDate;
    protected String sourceRecordId;
    protected String sourceTable;
    protected String applicationNo;
    protected String key;

    /**
     * Gets the value of the licenseNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumberId() {
        return licenseNumberId;
    }

    /**
     * Sets the value of the licenseNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumberId(String value) {
        this.licenseNumberId = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the licensePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getLicensePeriod() {
        return licensePeriod;
    }

    /**
     * Sets the value of the licensePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setLicensePeriod(EffectivePeriodType value) {
        this.licensePeriod = value;
    }

    /**
     * Gets the value of the stateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * Sets the value of the stateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setStateOrProvinceCode(CodeWithDesc value) {
        this.stateOrProvinceCode = value;
    }

    /**
     * Gets the value of the suspensionReinstatementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SuspensionReinstatementInformationType }
     *     
     */
    public SuspensionReinstatementInformationType getSuspensionReinstatementInformation() {
        return suspensionReinstatementInformation;
    }

    /**
     * Sets the value of the suspensionReinstatementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspensionReinstatementInformationType }
     *     
     */
    public void setSuspensionReinstatementInformation(SuspensionReinstatementInformationType value) {
        this.suspensionReinstatementInformation = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the licenseTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseTypeCode() {
        return licenseTypeCode;
    }

    /**
     * Sets the value of the licenseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseTypeCode(String value) {
        this.licenseTypeCode = value;
    }

    /**
     * Gets the value of the validLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidLicense() {
        return validLicense;
    }

    /**
     * Sets the value of the validLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidLicense(String value) {
        this.validLicense = value;
    }

    /**
     * Gets the value of the verificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationDate() {
        return verificationDate;
    }

    /**
     * Sets the value of the verificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationDate(String value) {
        this.verificationDate = value;
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
     * Gets the value of the sourceTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTable() {
        return sourceTable;
    }

    /**
     * Sets the value of the sourceTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTable(String value) {
        this.sourceTable = value;
    }

    /**
     * Gets the value of the applicationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNo() {
        return applicationNo;
    }

    /**
     * Sets the value of the applicationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNo(String value) {
        this.applicationNo = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
