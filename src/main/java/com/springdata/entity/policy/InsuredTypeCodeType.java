
package com.springdata.entity.policy;

import java.io.Serializable;

public class InsuredTypeCodeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Value;
    protected String Description;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.Description = value;
    }

	@Override
	public String toString() {
		return "[Value=" + Value + ", Description=" + Description + "]";
	}

}
