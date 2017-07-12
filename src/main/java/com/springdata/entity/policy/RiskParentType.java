
package com.springdata.entity.policy;

import java.io.Serializable;

public class RiskParentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String riskName;
    protected String typeOfInsured;
    protected String parentNumberId;
    protected ReferredPartyType referredParty;
    protected String practiceState;
    protected String county;
    protected String territory;
    protected String specialty;
    protected String clazz;
    protected String insuredType;
    protected String riskStatus;
    protected String riskSubClsUsedToRate;
    protected String ibnrStatus;
    protected String blockedListIndicator;

    /**
     * Gets the value of the riskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskName() {
        return riskName;
    }

    /**
     * Sets the value of the riskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskName(String value) {
        this.riskName = value;
    }

    /**
     * Gets the value of the typeOfInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfInsured() {
        return typeOfInsured;
    }

    /**
     * Sets the value of the typeOfInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfInsured(String value) {
        this.typeOfInsured = value;
    }

    /**
     * Gets the value of the parentNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentNumberId() {
        return parentNumberId;
    }

    /**
     * Sets the value of the parentNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentNumberId(String value) {
        this.parentNumberId = value;
    }

    /**
     * Gets the value of the referredParty property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredPartyType }
     *     
     */
    public ReferredPartyType getReferredParty() {
        return referredParty;
    }

    /**
     * Sets the value of the referredParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredPartyType }
     *     
     */
    public void setReferredParty(ReferredPartyType value) {
        this.referredParty = value;
    }

    /**
     * Gets the value of the practiceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPracticeState() {
        return practiceState;
    }

    /**
     * Sets the value of the practiceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPracticeState(String value) {
        this.practiceState = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the insuredType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredType() {
        return insuredType;
    }

    /**
     * Sets the value of the insuredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredType(String value) {
        this.insuredType = value;
    }

    /**
     * Gets the value of the riskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskStatus() {
        return riskStatus;
    }

    /**
     * Sets the value of the riskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskStatus(String value) {
        this.riskStatus = value;
    }

    /**
     * Gets the value of the riskSubClsUsedToRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskSubClsUsedToRate() {
        return riskSubClsUsedToRate;
    }

    /**
     * Sets the value of the riskSubClsUsedToRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskSubClsUsedToRate(String value) {
        this.riskSubClsUsedToRate = value;
    }

    /**
     * Gets the value of the ibnrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbnrStatus() {
        return ibnrStatus;
    }

    /**
     * Sets the value of the ibnrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbnrStatus(String value) {
        this.ibnrStatus = value;
    }

    /**
     * Gets the value of the blockedListIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedListIndicator() {
        return blockedListIndicator;
    }

    /**
     * Sets the value of the blockedListIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedListIndicator(String value) {
        this.blockedListIndicator = value;
    }

}
