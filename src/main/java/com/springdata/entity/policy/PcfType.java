
package com.springdata.entity.policy;

import java.io.Serializable;

public class PcfType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String practiceCountyCode;
    protected String practiceStateCode;
    protected String startDate;

    /**
     * Gets the value of the practiceCountyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPracticeCountyCode() {
        return practiceCountyCode;
    }

    /**
     * Sets the value of the practiceCountyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPracticeCountyCode(String value) {
        this.practiceCountyCode = value;
    }

    /**
     * Gets the value of the practiceStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPracticeStateCode() {
        return practiceStateCode;
    }

    /**
     * Sets the value of the practiceStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPracticeStateCode(String value) {
        this.practiceStateCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
