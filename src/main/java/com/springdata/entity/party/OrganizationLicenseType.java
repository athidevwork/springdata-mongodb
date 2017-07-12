
package com.springdata.entity.party;

import java.io.Serializable;

public class OrganizationLicenseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String licenseNumberId;
    protected String licenseNumber;
    protected LicensePeriodType licensePeriod;
    protected StateOrProvinceCodeType stateOrProvinceCode;
    protected SuspensionReinstatementInformationType suspensionReinstatementInformation;
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
     *     {@link LicensePeriodType }
     *     
     */
    public LicensePeriodType getLicensePeriod() {
        return licensePeriod;
    }

    /**
     * Sets the value of the licensePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensePeriodType }
     *     
     */
    public void setLicensePeriod(LicensePeriodType value) {
        this.licensePeriod = value;
    }

    /**
     * Gets the value of the stateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateOrProvinceCodeType }
     *     
     */
    public StateOrProvinceCodeType getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * Sets the value of the stateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateOrProvinceCodeType }
     *     
     */
    public void setStateOrProvinceCode(StateOrProvinceCodeType value) {
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
