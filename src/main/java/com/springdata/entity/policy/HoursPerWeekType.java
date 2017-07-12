
package com.springdata.entity.policy;

import java.io.Serializable;

public class HoursPerWeekType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String hoursPerWeekNumberId;
    protected ReferredInsuredType referredInsured;
    protected String officialRecordId;
    protected String recordModeCode;
    protected String state;
    protected EffectivePeriodType effectivePeriod;
    protected String hours;
    protected String renewalIndicator;

    /**
     * Gets the value of the hoursPerWeekNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursPerWeekNumberId() {
        return hoursPerWeekNumberId;
    }

    /**
     * Sets the value of the hoursPerWeekNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursPerWeekNumberId(String value) {
        this.hoursPerWeekNumberId = value;
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
     * Gets the value of the officialRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialRecordId() {
        return officialRecordId;
    }

    /**
     * Sets the value of the officialRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialRecordId(String value) {
        this.officialRecordId = value;
    }

    /**
     * Gets the value of the recordModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordModeCode() {
        return recordModeCode;
    }

    /**
     * Sets the value of the recordModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordModeCode(String value) {
        this.recordModeCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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
     * Gets the value of the hours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHours(String value) {
        this.hours = value;
    }

    /**
     * Gets the value of the renewalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalIndicator() {
        return renewalIndicator;
    }

    /**
     * Sets the value of the renewalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalIndicator(String value) {
        this.renewalIndicator = value;
    }

}
