
package com.springdata.entity.inquiryservice;

import java.io.Serializable;

public class ExtendedStatusType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String extendedStatusCode;
    protected CustomStatusCodeType customStatusCode;
    protected String extendedStatusDescription;

    /**
     * Gets the value of the extendedStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedStatusCode() {
        return extendedStatusCode;
    }

    /**
     * Sets the value of the extendedStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedStatusCode(String value) {
        this.extendedStatusCode = value;
    }

    /**
     * Gets the value of the customStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomStatusCodeType }
     *     
     */
    public CustomStatusCodeType getCustomStatusCode() {
        return customStatusCode;
    }

    /**
     * Sets the value of the customStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomStatusCodeType }
     *     
     */
    public void setCustomStatusCode(CustomStatusCodeType value) {
        this.customStatusCode = value;
    }

    /**
     * Gets the value of the extendedStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedStatusDescription() {
        return extendedStatusDescription;
    }

    /**
     * Sets the value of the extendedStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedStatusDescription(String value) {
        this.extendedStatusDescription = value;
    }

}
