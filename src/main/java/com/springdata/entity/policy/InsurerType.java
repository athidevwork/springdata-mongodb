
package com.springdata.entity.policy;

import java.io.Serializable;

public class InsurerType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredPartyType referredParty;
    protected String underWriterName;
    protected EffectivePeriodType effectivePeriod;
    protected String insurerNumberId;
    protected String renewalIndicator;
    protected String regionalTeamCode;
    protected String closingTransLogId;
    protected String personReference;
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
     * Gets the value of the underWriterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderWriterName() {
        return underWriterName;
    }

    /**
     * Sets the value of the underWriterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderWriterName(String value) {
        this.underWriterName = value;
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
     * Gets the value of the insurerNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurerNumberId() {
        return insurerNumberId;
    }

    /**
     * Sets the value of the insurerNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurerNumberId(String value) {
        this.insurerNumberId = value;
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
     * Gets the value of the regionalTeamCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalTeamCode() {
        return regionalTeamCode;
    }

    /**
     * Sets the value of the regionalTeamCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionalTeamCode(String value) {
        this.regionalTeamCode = value;
    }

    /**
     * Gets the value of the closingTransLogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingTransLogId() {
        return closingTransLogId;
    }

    /**
     * Sets the value of the closingTransLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingTransLogId(String value) {
        this.closingTransLogId = value;
    }

    /**
     * Gets the value of the personReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonReference() {
        return personReference;
    }

    /**
     * Sets the value of the personReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonReference(String value) {
        this.personReference = value;
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
