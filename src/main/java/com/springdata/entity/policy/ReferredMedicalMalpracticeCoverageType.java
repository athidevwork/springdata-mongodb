
package com.springdata.entity.policy;

import java.io.Serializable;

public class ReferredMedicalMalpracticeCoverageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Value;
    protected String MedicalMalpracticeCoverageReference;

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
     * Gets the value of the medicalMalpracticeCoverageReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalMalpracticeCoverageReference() {
        return MedicalMalpracticeCoverageReference;
    }

    /**
     * Sets the value of the medicalMalpracticeCoverageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalMalpracticeCoverageReference(String value) {
        this.MedicalMalpracticeCoverageReference = value;
    }

	@Override
	public String toString() {
		return "[Value=" + Value + ", MedicalMalpracticeCoverageReference="
				+ MedicalMalpracticeCoverageReference + "]";
	}

}
