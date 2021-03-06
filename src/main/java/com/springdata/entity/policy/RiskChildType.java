
package com.springdata.entity.policy;

import java.io.Serializable;

public class RiskChildType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredInsuredType ReferredInsured;

    /**
     * Gets the value of the referredInsured property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredInsuredType }
     *     
     */
    public ReferredInsuredType getReferredInsured() {
        return ReferredInsured;
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
        this.ReferredInsured = value;
    }

	@Override
	public String toString() {
		return "[ReferredInsured=" + ReferredInsured + "]";
	}

}
