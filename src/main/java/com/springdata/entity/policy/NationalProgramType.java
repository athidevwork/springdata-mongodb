
package com.springdata.entity.policy;

import java.io.Serializable;

public class NationalProgramType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String nationalProgramNumberId;
    protected String programCode;
    protected String primaryIndicator;
    protected EffectivePeriodType effectivePeriod;
    protected String renewalIndicator;
    protected ReferredInsuredType referredInsured;
    protected VersionDetailType versionDetail;
    protected String key;

    /**
     * Gets the value of the nationalProgramNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalProgramNumberId() {
        return nationalProgramNumberId;
    }

    /**
     * Sets the value of the nationalProgramNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalProgramNumberId(String value) {
        this.nationalProgramNumberId = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the primaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * Sets the value of the primaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIndicator(String value) {
        this.primaryIndicator = value;
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
     * Gets the value of the referredInsured property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredInsuredType }
     *     
     */
    public ReferredInsuredType getReferredInsured() {
        return referredInsured;
    }

    /**
     * Sets the value of the referredInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredInsuredType }
     *     
     */
    public void setReferredInsured(ReferredInsuredType value) {
        this.referredInsured = value;
    }

    /**
     * Gets the value of the versionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link VersionDetailType }
     *     
     */
    public VersionDetailType getVersionDetail() {
        return versionDetail;
    }

    /**
     * Sets the value of the versionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionDetailType }
     *     
     */
    public void setVersionDetail(VersionDetailType value) {
        this.versionDetail = value;
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
