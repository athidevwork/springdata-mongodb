
package com.springdata.entity.policy;

import java.io.Serializable;

public class ReferredAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Value;
    protected String AddressReference;

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
     * Gets the value of the addressReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressReference() {
        return AddressReference;
    }

    /**
     * Sets the value of the addressReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressReference(String value) {
        this.AddressReference = value;
    }

	@Override
	public String toString() {
		return "[Value=" + Value + ", AddressReference=" + AddressReference + "]";
	}

}
