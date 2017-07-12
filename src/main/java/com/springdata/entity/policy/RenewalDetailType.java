
package com.springdata.entity.policy;

import java.io.Serializable;

public class RenewalDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String renewalIndicator;
    protected String nonRenewalReason;

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
     * Gets the value of the nonRenewalReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRenewalReason() {
        return nonRenewalReason;
    }

    /**
     * Sets the value of the nonRenewalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRenewalReason(String value) {
        this.nonRenewalReason = value;
    }

}
