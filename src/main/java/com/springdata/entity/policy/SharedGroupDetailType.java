
package com.springdata.entity.policy;

import java.io.Serializable;

public class SharedGroupDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String sharedGroupDetailId;
    protected ReferredInsuredType referredInsured;
    protected ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage;
    protected String ownerIndicator;
    protected EffectivePeriodType effectivePeriod;
    protected String renewalIndicator;
    protected String shareLimitIndicator;
    protected String riskPrimaryIndicator;
    protected String covgSeqNumber;
    protected VersionDetailType versionDetail;

    /**
     * Gets the value of the sharedGroupDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedGroupDetailId() {
        return sharedGroupDetailId;
    }

    /**
     * Sets the value of the sharedGroupDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedGroupDetailId(String value) {
        this.sharedGroupDetailId = value;
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
     * Gets the value of the referredMedicalMalpracticeCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredMedicalMalpracticeCoverageType }
     *     
     */
    public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
        return referredMedicalMalpracticeCoverage;
    }

    /**
     * Sets the value of the referredMedicalMalpracticeCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredMedicalMalpracticeCoverageType }
     *     
     */
    public void setReferredMedicalMalpracticeCoverage(ReferredMedicalMalpracticeCoverageType value) {
        this.referredMedicalMalpracticeCoverage = value;
    }

    /**
     * Gets the value of the ownerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerIndicator() {
        return ownerIndicator;
    }

    /**
     * Sets the value of the ownerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerIndicator(String value) {
        this.ownerIndicator = value;
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
     * Gets the value of the shareLimitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareLimitIndicator() {
        return shareLimitIndicator;
    }

    /**
     * Sets the value of the shareLimitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareLimitIndicator(String value) {
        this.shareLimitIndicator = value;
    }

    /**
     * Gets the value of the riskPrimaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskPrimaryIndicator() {
        return riskPrimaryIndicator;
    }

    /**
     * Sets the value of the riskPrimaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskPrimaryIndicator(String value) {
        this.riskPrimaryIndicator = value;
    }

    /**
     * Gets the value of the covgSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCovgSeqNumber() {
        return covgSeqNumber;
    }

    /**
     * Sets the value of the covgSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCovgSeqNumber(String value) {
        this.covgSeqNumber = value;
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

}
