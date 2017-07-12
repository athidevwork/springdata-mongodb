
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicalMalpracticeCoverageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String coverageNumberId;
    protected String parentCoverageNumberId;
    protected String currentTermAmount;
    protected String currentGrossTermAmount;
    protected String currentFundAmount;
    protected String currentGrossFundAmount;
    protected MedicalMalpracticeCoverageCodeType medicalMalpracticeCoverageCode;
    protected ReferredInsuredType referredInsured;
    protected List<MedicalMalpracticeCoverageVersionType> medicalMalpracticeCoverageVersion;
    protected String key;

    /**
     * Gets the value of the coverageNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageNumberId() {
        return coverageNumberId;
    }

    /**
     * Sets the value of the coverageNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageNumberId(String value) {
        this.coverageNumberId = value;
    }

    /**
     * Gets the value of the parentCoverageNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCoverageNumberId() {
        return parentCoverageNumberId;
    }

    /**
     * Sets the value of the parentCoverageNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCoverageNumberId(String value) {
        this.parentCoverageNumberId = value;
    }

    /**
     * Gets the value of the currentTermAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTermAmount() {
        return currentTermAmount;
    }

    /**
     * Sets the value of the currentTermAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTermAmount(String value) {
        this.currentTermAmount = value;
    }

    /**
     * Gets the value of the currentGrossTermAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentGrossTermAmount() {
        return currentGrossTermAmount;
    }

    /**
     * Sets the value of the currentGrossTermAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentGrossTermAmount(String value) {
        this.currentGrossTermAmount = value;
    }

    /**
     * Gets the value of the currentFundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFundAmount() {
        return currentFundAmount;
    }

    /**
     * Sets the value of the currentFundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFundAmount(String value) {
        this.currentFundAmount = value;
    }

    /**
     * Gets the value of the currentGrossFundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentGrossFundAmount() {
        return currentGrossFundAmount;
    }

    /**
     * Sets the value of the currentGrossFundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentGrossFundAmount(String value) {
        this.currentGrossFundAmount = value;
    }

    /**
     * Gets the value of the medicalMalpracticeCoverageCode property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalMalpracticeCoverageCodeType }
     *     
     */
    public MedicalMalpracticeCoverageCodeType getMedicalMalpracticeCoverageCode() {
        return medicalMalpracticeCoverageCode;
    }

    /**
     * Sets the value of the medicalMalpracticeCoverageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalMalpracticeCoverageCodeType }
     *     
     */
    public void setMedicalMalpracticeCoverageCode(MedicalMalpracticeCoverageCodeType value) {
        this.medicalMalpracticeCoverageCode = value;
    }

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
     * Gets the value of the medicalMalpracticeCoverageVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicalMalpracticeCoverageVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicalMalpracticeCoverageVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalMalpracticeCoverageVersionType }
     * 
     * 
     */
    public List<MedicalMalpracticeCoverageVersionType> getMedicalMalpracticeCoverageVersion() {
        if (medicalMalpracticeCoverageVersion == null) {
            medicalMalpracticeCoverageVersion = new ArrayList<MedicalMalpracticeCoverageVersionType>();
        }
        return this.medicalMalpracticeCoverageVersion;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
