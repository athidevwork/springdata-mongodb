
package com.springdata.entity.policy;

import java.io.Serializable;

public class ManuscriptType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String manuscriptNumberId;
    protected ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage;
    protected String formType;
    protected String formCode;
    protected EffectivePeriodType effectivePeriod;
    protected String renewalIndicator;
    protected VersionDetailType versionDetail;
    protected String addlText;
    protected String premiumForm;
    protected String detailIndicator;
    protected String key;

    /**
     * Gets the value of the manuscriptNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManuscriptNumberId() {
        return manuscriptNumberId;
    }

    /**
     * Sets the value of the manuscriptNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManuscriptNumberId(String value) {
        this.manuscriptNumberId = value;
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
     * Gets the value of the formCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormCode() {
        return formCode;
    }

    /**
     * Sets the value of the formCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormCode(String value) {
        this.formCode = value;
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
     * Gets the value of the addlText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlText() {
        return addlText;
    }

    /**
     * Sets the value of the addlText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddlText(String value) {
        this.addlText = value;
    }

    /**
     * Gets the value of the premiumForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumForm() {
        return premiumForm;
    }

    /**
     * Sets the value of the premiumForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumForm(String value) {
        this.premiumForm = value;
    }

    /**
     * Gets the value of the detailIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailIndicator() {
        return detailIndicator;
    }

    /**
     * Sets the value of the detailIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailIndicator(String value) {
        this.detailIndicator = value;
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
