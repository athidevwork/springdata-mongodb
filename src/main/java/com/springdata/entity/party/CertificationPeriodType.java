
package com.springdata.entity.party;

import java.io.Serializable;

public class CertificationPeriodType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String StartDate;
    protected String EndDate;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return StartDate;
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
        this.StartDate = value;
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
		return "[StartDate=" + StartDate + ", EndDate=" + EndDate + "]";
	}

}
