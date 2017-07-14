
package com.springdata.entity.policy;

import java.io.Serializable;

public class IndicationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String IndicationInd;
    protected String Name;

    /**
     * Gets the value of the indicationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicationInd() {
        return IndicationInd;
    }

    /**
     * Sets the value of the indicationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicationInd(String value) {
        this.IndicationInd = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.Name = value;
    }

	@Override
	public String toString() {
		return "[IndicationInd=" + IndicationInd + ", Name=" + Name + "]";
	}

}
