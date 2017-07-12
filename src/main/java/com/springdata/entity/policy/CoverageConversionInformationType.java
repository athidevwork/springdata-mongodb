
package com.springdata.entity.policy;

import java.io.Serializable;

public class CoverageConversionInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String claimsMadeDate;
    protected String claimsMadeOverrideDate;
    protected String occurenceDate;
    protected String occurenceOverrideDate;

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

    /**
     * Gets the value of the claimsMadeOverrideDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimsMadeOverrideDate() {
        return claimsMadeOverrideDate;
    }

    /**
     * Sets the value of the claimsMadeOverrideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimsMadeOverrideDate(String value) {
        this.claimsMadeOverrideDate = value;
    }

    /**
     * Gets the value of the occurenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurenceDate() {
        return occurenceDate;
    }

    /**
     * Sets the value of the occurenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurenceDate(String value) {
        this.occurenceDate = value;
    }

    /**
     * Gets the value of the occurenceOverrideDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurenceOverrideDate() {
        return occurenceOverrideDate;
    }

    /**
     * Sets the value of the occurenceOverrideDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurenceOverrideDate(String value) {
        this.occurenceOverrideDate = value;
    }

}
