
package com.springdata.entity.party;

import java.io.Serializable;

public class EducationInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String educationInformationNumberId;
    protected String educationTypeCode;
    protected String educationDegree;
    protected String graduationYear;
    protected EducationalInstitutionType educationalInstitution;
    protected String entityAttendeeId;
    protected String entityInstitutionId;
    protected String applicationNo;
    protected String sourceRecordId;
    protected String sourceTable;
    protected String dateOfBirth;
    protected EffectivePeriodType effectivePeriod;
    protected String key;

    /**
     * Gets the value of the educationInformationNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationInformationNumberId() {
        return educationInformationNumberId;
    }

    /**
     * Sets the value of the educationInformationNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationInformationNumberId(String value) {
        this.educationInformationNumberId = value;
    }

    /**
     * Gets the value of the educationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationTypeCode() {
        return educationTypeCode;
    }

    /**
     * Sets the value of the educationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationTypeCode(String value) {
        this.educationTypeCode = value;
    }

    /**
     * Gets the value of the educationDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDegree() {
        return educationDegree;
    }

    /**
     * Sets the value of the educationDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDegree(String value) {
        this.educationDegree = value;
    }

    /**
     * Gets the value of the graduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduationYear() {
        return graduationYear;
    }

    /**
     * Sets the value of the graduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduationYear(String value) {
        this.graduationYear = value;
    }

    /**
     * Gets the value of the educationalInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link EducationalInstitutionType }
     *     
     */
    public EducationalInstitutionType getEducationalInstitution() {
        return educationalInstitution;
    }

    /**
     * Sets the value of the educationalInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalInstitutionType }
     *     
     */
    public void setEducationalInstitution(EducationalInstitutionType value) {
        this.educationalInstitution = value;
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
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
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
