
package com.springdata.entity.policy;

import java.io.Serializable;

public class ReferredInsuredType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String value;
    protected String insuredReference;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the insuredReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredReference() {
        return insuredReference;
    }

    /**
     * Sets the value of the insuredReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredReference(String value) {
        this.insuredReference = value;
    }

}
