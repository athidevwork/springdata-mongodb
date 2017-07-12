
package com.springdata.entity.policy;

import java.io.Serializable;

public class FullTimeEquivalencyInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String fullTimeEquivalency;
    protected String fullTimeHours;
    protected String partTimeHours;
    protected String perDiemHours;

    /**
     * Gets the value of the fullTimeEquivalency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullTimeEquivalency() {
        return fullTimeEquivalency;
    }

    /**
     * Sets the value of the fullTimeEquivalency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullTimeEquivalency(String value) {
        this.fullTimeEquivalency = value;
    }

    /**
     * Gets the value of the fullTimeHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullTimeHours() {
        return fullTimeHours;
    }

    /**
     * Sets the value of the fullTimeHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullTimeHours(String value) {
        this.fullTimeHours = value;
    }

    /**
     * Gets the value of the partTimeHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartTimeHours() {
        return partTimeHours;
    }

    /**
     * Sets the value of the partTimeHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartTimeHours(String value) {
        this.partTimeHours = value;
    }

    /**
     * Gets the value of the perDiemHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerDiemHours() {
        return perDiemHours;
    }

    /**
     * Sets the value of the perDiemHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerDiemHours(String value) {
        this.perDiemHours = value;
    }

}
