
package com.springdata.entity.policy;

import java.io.Serializable;

public class UnderwriterType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredPartyType referredParty;
    protected EffectivePeriodType effectivePeriod;
    protected String underwriterNumberId;
    protected String renewalB;

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
     * Gets the value of the underwriterNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderwriterNumberId() {
        return underwriterNumberId;
    }

    /**
     * Sets the value of the underwriterNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderwriterNumberId(String value) {
        this.underwriterNumberId = value;
    }

    /**
     * Gets the value of the renewalB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalB() {
        return renewalB;
    }

    /**
     * Sets the value of the renewalB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalB(String value) {
        this.renewalB = value;
    }

}
