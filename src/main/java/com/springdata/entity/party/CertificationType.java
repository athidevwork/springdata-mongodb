
package com.springdata.entity.party;

import java.io.Serializable;

public class CertificationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CertificationNumberId;
    protected String CertificationCode;
    protected String CertifiedIndicator;
    protected EffectivePeriodType CertificationPeriod;
    protected String CertificationBoard;
    protected String Specialty;
    protected CodeWithDesc ControllingStateOrProvinceCode;
    protected String EntityBoardId;
    protected CodeWithDesc BoardStatus;
    protected String BoardExamDate;
    protected CodeWithDesc RateSpecialty;
    protected String RegistrationNo;
    protected String SourceRecordId;
    protected String SourceTable;
    protected String EntityId;
    protected String Territory;
    protected String ApplicationNo;
    protected String NoOfHours;
    protected String Key;

    /**
     * Gets the value of the certificationNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationNumberId() {
        return CertificationNumberId;
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
        this.CertificationNumberId = value;
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
        return CertificationCode;
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
        this.CertificationCode = value;
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
        return CertifiedIndicator;
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
        this.CertifiedIndicator = value;
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
        return CertificationPeriod;
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
        this.CertificationPeriod = value;
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
        return CertificationBoard;
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
        this.CertificationBoard = value;
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
        return Specialty;
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
        this.Specialty = value;
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
        return ControllingStateOrProvinceCode;
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
        this.ControllingStateOrProvinceCode = value;
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
        return EntityBoardId;
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
        this.EntityBoardId = value;
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
        return BoardStatus;
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
        this.BoardStatus = value;
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
        return BoardExamDate;
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
        this.BoardExamDate = value;
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
        return RateSpecialty;
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
        this.RateSpecialty = value;
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
        return RegistrationNo;
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
        this.RegistrationNo = value;
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
        return SourceRecordId;
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
        this.SourceRecordId = value;
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
        return SourceTable;
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
        this.SourceTable = value;
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
        return EntityId;
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
        this.EntityId = value;
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
        return Territory;
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
        this.Territory = value;
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
        return ApplicationNo;
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
        this.ApplicationNo = value;
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
        return NoOfHours;
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
        this.NoOfHours = value;
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
        return Key;
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
        this.Key = value;
    }

	@Override
	public String toString() {
		return "[CertificationNumberId=" + CertificationNumberId + ", CertificationCode="
				+ CertificationCode + ", CertifiedIndicator=" + CertifiedIndicator + ", CertificationPeriod="
				+ CertificationPeriod + ", CertificationBoard=" + CertificationBoard + ", Specialty=" + Specialty
				+ ", ControllingStateOrProvinceCode=" + ControllingStateOrProvinceCode + ", EntityBoardId="
				+ EntityBoardId + ", BoardStatus=" + BoardStatus + ", BoardExamDate=" + BoardExamDate
				+ ", RateSpecialty=" + RateSpecialty + ", RegistrationNo=" + RegistrationNo + ", SourceRecordId="
				+ SourceRecordId + ", SourceTable=" + SourceTable + ", EntityId=" + EntityId + ", Territory="
				+ Territory + ", ApplicationNo=" + ApplicationNo + ", NoOfHours=" + NoOfHours + ", Key=" + Key + "]";
	}

}
