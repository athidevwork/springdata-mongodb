
package com.springdata.entity.policy;

import java.io.Serializable;

public class IssueCompanyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredPartyType referredParty;
    protected ControllingStateOrProvinceCodeType controllingStateOrProvinceCode;
    protected String referralCode;
    protected ProcessLocationCodeType processLocationCode;
    protected String organizationReference;

    /**
     * Gets the value of the referredParty property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredPartyType }
     *     
     */
    public ReferredPartyType getReferredParty() {
        return referredParty;
    }

    /**
     * Sets the value of the referredParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredPartyType }
     *     
     */
    public void setReferredParty(ReferredPartyType value) {
        this.referredParty = value;
    }

    /**
     * Gets the value of the controllingStateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ControllingStateOrProvinceCodeType }
     *     
     */
    public ControllingStateOrProvinceCodeType getControllingStateOrProvinceCode() {
        return controllingStateOrProvinceCode;
    }

    /**
     * Sets the value of the controllingStateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllingStateOrProvinceCodeType }
     *     
     */
    public void setControllingStateOrProvinceCode(ControllingStateOrProvinceCodeType value) {
        this.controllingStateOrProvinceCode = value;
    }

    /**
     * Gets the value of the referralCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralCode() {
        return referralCode;
    }

    /**
     * Sets the value of the referralCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralCode(String value) {
        this.referralCode = value;
    }

    /**
     * Gets the value of the processLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessLocationCodeType }
     *     
     */
    public ProcessLocationCodeType getProcessLocationCode() {
        return processLocationCode;
    }

    /**
     * Sets the value of the processLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessLocationCodeType }
     *     
     */
    public void setProcessLocationCode(ProcessLocationCodeType value) {
        this.processLocationCode = value;
    }

    /**
     * Gets the value of the organizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationReference(String value) {
        this.organizationReference = value;
    }

}
