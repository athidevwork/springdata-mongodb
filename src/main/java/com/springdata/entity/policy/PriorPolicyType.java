
package com.springdata.entity.policy;

import java.io.Serializable;

public class PriorPolicyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PolicyId;
    protected String EndDate;

    /**
     * Gets the value of the policyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return PolicyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.PolicyId = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return EndDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.EndDate = value;
    }

	@Override
	public String toString() {
		return "[PolicyId=" + PolicyId + ", EndDate=" + EndDate + "]";
	}

}
