
package com.springdata.entity.policy;

import java.io.Serializable;

public class PrintNameType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FullName;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return FullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.FullName = value;
    }

	@Override
	public String toString() {
		return "[FullName=" + FullName + "]";
	}

}
