
package com.springdata.entity.policy;

import java.io.Serializable;

public class ReferredInsuredType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Value;
    protected String InsuredReference;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return Value;
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
        this.Value = value;
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
        return InsuredReference;
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
        this.InsuredReference = value;
    }

	@Override
	public String toString() {
		return "[Value=" + Value + ", InsuredReference=" + InsuredReference + "]";
	}

}
