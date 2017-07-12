
package com.springdata.entity.policy;

import java.io.Serializable;

public class ReferredMedicalMalpracticeCoverageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String value;
    protected String medicalMalpracticeCoverageReference;

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
     * Gets the value of the medicalMalpracticeCoverageReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalMalpracticeCoverageReference() {
        return medicalMalpracticeCoverageReference;
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
        this.medicalMalpracticeCoverageReference = value;
    }

}
