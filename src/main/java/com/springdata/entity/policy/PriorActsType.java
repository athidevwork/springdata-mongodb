
package com.springdata.entity.policy;

import java.io.Serializable;

public class PriorActsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String priorActsIndicator;
    protected String priorActsType;
    protected String priorActsRetroactiveDate;

    /**
     * Gets the value of the priorActsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorActsIndicator() {
        return priorActsIndicator;
    }

    /**
     * Sets the value of the priorActsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorActsIndicator(String value) {
        this.priorActsIndicator = value;
    }

    /**
     * Gets the value of the priorActsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorActsType() {
        return priorActsType;
    }

    /**
     * Sets the value of the priorActsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorActsType(String value) {
        this.priorActsType = value;
    }

    /**
     * Gets the value of the priorActsRetroactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorActsRetroactiveDate() {
        return priorActsRetroactiveDate;
    }

    /**
     * Sets the value of the priorActsRetroactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorActsRetroactiveDate(String value) {
        this.priorActsRetroactiveDate = value;
    }

}
