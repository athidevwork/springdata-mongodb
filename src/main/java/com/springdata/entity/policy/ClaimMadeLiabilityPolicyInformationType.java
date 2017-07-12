
package com.springdata.entity.policy;

import java.io.Serializable;

public class ClaimMadeLiabilityPolicyInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String currentRetroactiveDate;
    protected String splitRetroactiveDate;
    protected String claimsMadeDate;

    /**
     * Gets the value of the currentRetroactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentRetroactiveDate() {
        return currentRetroactiveDate;
    }

    /**
     * Sets the value of the currentRetroactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentRetroactiveDate(String value) {
        this.currentRetroactiveDate = value;
    }

    /**
     * Gets the value of the splitRetroactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitRetroactiveDate() {
        return splitRetroactiveDate;
    }

    /**
     * Sets the value of the splitRetroactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitRetroactiveDate(String value) {
        this.splitRetroactiveDate = value;
    }

    /**
     * Gets the value of the claimsMadeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimsMadeDate() {
        return claimsMadeDate;
    }

    /**
     * Sets the value of the claimsMadeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimsMadeDate(String value) {
        this.claimsMadeDate = value;
    }

}
