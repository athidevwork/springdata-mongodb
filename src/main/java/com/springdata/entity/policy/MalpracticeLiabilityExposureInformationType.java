
package com.springdata.entity.policy;

import java.io.Serializable;

public class MalpracticeLiabilityExposureInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String exposureUnit;
    protected String exposureBasisCode;
    protected String doctorCount;
    protected String squareFootage;
    protected String vapCount;
    protected String bedCount;
    protected String extendedBedCount;
    protected String skillBedCount;
    protected String censusCount;
    protected String outpatientVisitCount;
    protected String deliveryCount;
    protected String impatientSurgeryCount;
    protected String outpatientSurgeryCount;
    protected String emergencyRoomVisitCount;

    /**
     * Gets the value of the exposureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExposureUnit() {
        return exposureUnit;
    }

    /**
     * Sets the value of the exposureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposureUnit(String value) {
        this.exposureUnit = value;
    }

    /**
     * Gets the value of the exposureBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExposureBasisCode() {
        return exposureBasisCode;
    }

    /**
     * Sets the value of the exposureBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposureBasisCode(String value) {
        this.exposureBasisCode = value;
    }

    /**
     * Gets the value of the doctorCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorCount() {
        return doctorCount;
    }

    /**
     * Sets the value of the doctorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorCount(String value) {
        this.doctorCount = value;
    }

    /**
     * Gets the value of the squareFootage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquareFootage() {
        return squareFootage;
    }

    /**
     * Sets the value of the squareFootage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquareFootage(String value) {
        this.squareFootage = value;
    }

    /**
     * Gets the value of the vapCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVapCount() {
        return vapCount;
    }

    /**
     * Sets the value of the vapCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVapCount(String value) {
        this.vapCount = value;
    }

    /**
     * Gets the value of the bedCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedCount() {
        return bedCount;
    }

    /**
     * Sets the value of the bedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedCount(String value) {
        this.bedCount = value;
    }

    /**
     * Gets the value of the extendedBedCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedBedCount() {
        return extendedBedCount;
    }

    /**
     * Sets the value of the extendedBedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedBedCount(String value) {
        this.extendedBedCount = value;
    }

    /**
     * Gets the value of the skillBedCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillBedCount() {
        return skillBedCount;
    }

    /**
     * Sets the value of the skillBedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillBedCount(String value) {
        this.skillBedCount = value;
    }

    /**
     * Gets the value of the censusCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCensusCount() {
        return censusCount;
    }

    /**
     * Sets the value of the censusCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCensusCount(String value) {
        this.censusCount = value;
    }

    /**
     * Gets the value of the outpatientVisitCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutpatientVisitCount() {
        return outpatientVisitCount;
    }

    /**
     * Sets the value of the outpatientVisitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutpatientVisitCount(String value) {
        this.outpatientVisitCount = value;
    }

    /**
     * Gets the value of the deliveryCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCount() {
        return deliveryCount;
    }

    /**
     * Sets the value of the deliveryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCount(String value) {
        this.deliveryCount = value;
    }

    /**
     * Gets the value of the impatientSurgeryCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpatientSurgeryCount() {
        return impatientSurgeryCount;
    }

    /**
     * Sets the value of the impatientSurgeryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpatientSurgeryCount(String value) {
        this.impatientSurgeryCount = value;
    }

    /**
     * Gets the value of the outpatientSurgeryCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutpatientSurgeryCount() {
        return outpatientSurgeryCount;
    }

    /**
     * Sets the value of the outpatientSurgeryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutpatientSurgeryCount(String value) {
        this.outpatientSurgeryCount = value;
    }

    /**
     * Gets the value of the emergencyRoomVisitCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyRoomVisitCount() {
        return emergencyRoomVisitCount;
    }

    /**
     * Sets the value of the emergencyRoomVisitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyRoomVisitCount(String value) {
        this.emergencyRoomVisitCount = value;
    }

}
