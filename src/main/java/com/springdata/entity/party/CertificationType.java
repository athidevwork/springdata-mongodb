
package com.springdata.entity.party;

import java.io.Serializable;

public class CertificationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String certificationNumberId;
    protected String certificationCode;
    protected String certifiedIndicator;
    protected EffectivePeriodType certificationPeriod;
    protected String certificationBoard;
    protected String specialty;
    protected CodeWithDesc controllingStateOrProvinceCode;
    protected String entityBoardId;
    protected CodeWithDesc boardStatus;
    protected String boardExamDate;
    protected CodeWithDesc rateSpecialty;
    protected String registrationNo;
    protected String sourceRecordId;
    protected String sourceTable;
    protected String entityId;
    protected String territory;
    protected String applicationNo;
    protected String noOfHours;
    protected String key;

    /**
     * Gets the value of the certificationNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationNumberId() {
        return certificationNumberId;
    }

    /**
     * Sets the value of the certificationNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationNumberId(String value) {
        this.certificationNumberId = value;
    }

    /**
     * Gets the value of the certificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationCode() {
        return certificationCode;
    }

    /**
     * Sets the value of the certificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationCode(String value) {
        this.certificationCode = value;
    }

    /**
     * Gets the value of the certifiedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifiedIndicator() {
        return certifiedIndicator;
    }

    /**
     * Sets the value of the certifiedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifiedIndicator(String value) {
        this.certifiedIndicator = value;
    }

    /**
     * Gets the value of the certificationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getCertificationPeriod() {
        return certificationPeriod;
    }

    /**
     * Sets the value of the certificationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setCertificationPeriod(EffectivePeriodType value) {
        this.certificationPeriod = value;
    }

    /**
     * Gets the value of the certificationBoard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationBoard() {
        return certificationBoard;
    }

    /**
     * Sets the value of the certificationBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationBoard(String value) {
        this.certificationBoard = value;
    }

    /**
     * Gets the value of the specialty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Sets the value of the specialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialty(String value) {
        this.specialty = value;
    }

    /**
     * Gets the value of the controllingStateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getControllingStateOrProvinceCode() {
        return controllingStateOrProvinceCode;
    }

    /**
     * Sets the value of the controllingStateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setControllingStateOrProvinceCode(CodeWithDesc value) {
        this.controllingStateOrProvinceCode = value;
    }

    /**
     * Gets the value of the entityBoardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityBoardId() {
        return entityBoardId;
    }

    /**
     * Sets the value of the entityBoardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityBoardId(String value) {
        this.entityBoardId = value;
    }

    /**
     * Gets the value of the boardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getBoardStatus() {
        return boardStatus;
    }

    /**
     * Sets the value of the boardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setBoardStatus(CodeWithDesc value) {
        this.boardStatus = value;
    }

    /**
     * Gets the value of the boardExamDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardExamDate() {
        return boardExamDate;
    }

    /**
     * Sets the value of the boardExamDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardExamDate(String value) {
        this.boardExamDate = value;
    }

    /**
     * Gets the value of the rateSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getRateSpecialty() {
        return rateSpecialty;
    }

    /**
     * Sets the value of the rateSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setRateSpecialty(CodeWithDesc value) {
        this.rateSpecialty = value;
    }

    /**
     * Gets the value of the registrationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNo() {
        return registrationNo;
    }

    /**
     * Sets the value of the registrationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNo(String value) {
        this.registrationNo = value;
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
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritory(String value) {
        this.territory = value;
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
     * Gets the value of the noOfHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfHours() {
        return noOfHours;
    }

    /**
     * Sets the value of the noOfHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfHours(String value) {
        this.noOfHours = value;
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
