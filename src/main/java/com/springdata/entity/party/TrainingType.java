
package com.springdata.entity.party;

import java.io.Serializable;

public class TrainingType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String educationProfileNumberId;
    protected String hospitalName;
    protected CodeWithDesc trainingTypeCode;
    protected CodeWithDesc specialtyCode;
    protected EffectivePeriodType effectivePeriod;
    protected String applicationNo;
    protected String entityAttendeeId;
    protected String sourceRecordId;
    protected String sourceTable;
    protected String entityInstitutionId;
    protected String key;

    /**
     * Gets the value of the educationProfileNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationProfileNumberId() {
        return educationProfileNumberId;
    }

    /**
     * Sets the value of the educationProfileNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationProfileNumberId(String value) {
        this.educationProfileNumberId = value;
    }

    /**
     * Gets the value of the hospitalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * Sets the value of the hospitalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalName(String value) {
        this.hospitalName = value;
    }

    /**
     * Gets the value of the trainingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getTrainingTypeCode() {
        return trainingTypeCode;
    }

    /**
     * Sets the value of the trainingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setTrainingTypeCode(CodeWithDesc value) {
        this.trainingTypeCode = value;
    }

    /**
     * Gets the value of the specialtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getSpecialtyCode() {
        return specialtyCode;
    }

    /**
     * Sets the value of the specialtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setSpecialtyCode(CodeWithDesc value) {
        this.specialtyCode = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setEffectivePeriod(EffectivePeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the applicationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNo() {
        return applicationNo;
    }

    /**
     * Sets the value of the applicationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNo(String value) {
        this.applicationNo = value;
    }

    /**
     * Gets the value of the entityAttendeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityAttendeeId() {
        return entityAttendeeId;
    }

    /**
     * Sets the value of the entityAttendeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityAttendeeId(String value) {
        this.entityAttendeeId = value;
    }

    /**
     * Gets the value of the sourceRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRecordId() {
        return sourceRecordId;
    }

    /**
     * Sets the value of the sourceRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRecordId(String value) {
        this.sourceRecordId = value;
    }

    /**
     * Gets the value of the sourceTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTable() {
        return sourceTable;
    }

    /**
     * Sets the value of the sourceTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTable(String value) {
        this.sourceTable = value;
    }

    /**
     * Gets the value of the entityInstitutionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityInstitutionId() {
        return entityInstitutionId;
    }

    /**
     * Sets the value of the entityInstitutionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityInstitutionId(String value) {
        this.entityInstitutionId = value;
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
