
package com.springdata.entity.policy;

import java.io.Serializable;

public class EndorsementDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String variableTextDetailNumberId;
    protected String versionModeCode;
    protected EffectivePeriodType effectivePeriod;
    protected String categoryVal;
    protected String renewalIndicator;
    protected AdditionalInformationType additionalInformation;

    /**
     * Gets the value of the variableTextDetailNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableTextDetailNumberId() {
        return variableTextDetailNumberId;
    }

    /**
     * Sets the value of the variableTextDetailNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableTextDetailNumberId(String value) {
        this.variableTextDetailNumberId = value;
    }

    /**
     * Gets the value of the versionModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionModeCode() {
        return versionModeCode;
    }

    /**
     * Sets the value of the versionModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionModeCode(String value) {
        this.versionModeCode = value;
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
     * Gets the value of the categoryVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVal() {
        return categoryVal;
    }

    /**
     * Sets the value of the categoryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVal(String value) {
        this.categoryVal = value;
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
     * @return
     *     possible object is
     *     {@link AdditionalInformationType }
     *     
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformationType }
     *     
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
    }

}
