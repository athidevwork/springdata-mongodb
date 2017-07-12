
package com.springdata.entity.policy;

import java.io.Serializable;

public class SeparateLimitType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredInsuredType referredInsured;
    protected ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage;
    protected String erosionReserve;
    protected String erosionPaid;

    /**
     * Gets the value of the referredInsured property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredInsuredType }
     *     
     */
    public ReferredInsuredType getReferredInsured() {
        return referredInsured;
    }

    /**
     * Sets the value of the referredInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredInsuredType }
     *     
     */
    public void setReferredInsured(ReferredInsuredType value) {
        this.referredInsured = value;
    }

    /**
     * Gets the value of the referredMedicalMalpracticeCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredMedicalMalpracticeCoverageType }
     *     
     */
    public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
        return referredMedicalMalpracticeCoverage;
    }

    /**
     * Sets the value of the referredMedicalMalpracticeCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredMedicalMalpracticeCoverageType }
     *     
     */
    public void setReferredMedicalMalpracticeCoverage(ReferredMedicalMalpracticeCoverageType value) {
        this.referredMedicalMalpracticeCoverage = value;
    }

    /**
     * Gets the value of the erosionReserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErosionReserve() {
        return erosionReserve;
    }

    /**
     * Sets the value of the erosionReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErosionReserve(String value) {
        this.erosionReserve = value;
    }

    /**
     * Gets the value of the erosionPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErosionPaid() {
        return erosionPaid;
    }

    /**
     * Sets the value of the erosionPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErosionPaid(String value) {
        this.erosionPaid = value;
    }

}
