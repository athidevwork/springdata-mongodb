
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SelectedAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredInsuredType referredInsured;
    protected List<ReferredAddressType> referredAddress;
    protected EffectivePeriodType effectivePeriod;
    protected String accountingFromDate;
    protected String riskAddressNumberId;
    protected String addressRoleNumberId;
    protected String entityRoleNumberId;
    protected String transactionLogNumberId;
    protected String officialRecordNumberId;
    protected String practicePercentage;
    protected String ratingAddressIndicator;
    protected String riskPrimaryIndicator;
    protected String undeliverableIndicator;
    protected String currentTransactionIndicator;

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
     * Gets the value of the referredAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referredAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferredAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredAddressType }
     * 
     * 
     */
    public List<ReferredAddressType> getReferredAddress() {
        if (referredAddress == null) {
            referredAddress = new ArrayList<ReferredAddressType>();
        }
        return this.referredAddress;
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
     * Gets the value of the accountingFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingFromDate() {
        return accountingFromDate;
    }

    /**
     * Sets the value of the accountingFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingFromDate(String value) {
        this.accountingFromDate = value;
    }

    /**
     * Gets the value of the riskAddressNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAddressNumberId() {
        return riskAddressNumberId;
    }

    /**
     * Sets the value of the riskAddressNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAddressNumberId(String value) {
        this.riskAddressNumberId = value;
    }

    /**
     * Gets the value of the addressRoleNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRoleNumberId() {
        return addressRoleNumberId;
    }

    /**
     * Sets the value of the addressRoleNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRoleNumberId(String value) {
        this.addressRoleNumberId = value;
    }

    /**
     * Gets the value of the entityRoleNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityRoleNumberId() {
        return entityRoleNumberId;
    }

    /**
     * Sets the value of the entityRoleNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityRoleNumberId(String value) {
        this.entityRoleNumberId = value;
    }

    /**
     * Gets the value of the transactionLogNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLogNumberId() {
        return transactionLogNumberId;
    }

    /**
     * Sets the value of the transactionLogNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLogNumberId(String value) {
        this.transactionLogNumberId = value;
    }

    /**
     * Gets the value of the officialRecordNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialRecordNumberId() {
        return officialRecordNumberId;
    }

    /**
     * Sets the value of the officialRecordNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialRecordNumberId(String value) {
        this.officialRecordNumberId = value;
    }

    /**
     * Gets the value of the practicePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPracticePercentage() {
        return practicePercentage;
    }

    /**
     * Sets the value of the practicePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPracticePercentage(String value) {
        this.practicePercentage = value;
    }

    /**
     * Gets the value of the ratingAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingAddressIndicator() {
        return ratingAddressIndicator;
    }

    /**
     * Sets the value of the ratingAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingAddressIndicator(String value) {
        this.ratingAddressIndicator = value;
    }

    /**
     * Gets the value of the riskPrimaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskPrimaryIndicator() {
        return riskPrimaryIndicator;
    }

    /**
     * Sets the value of the riskPrimaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskPrimaryIndicator(String value) {
        this.riskPrimaryIndicator = value;
    }

    /**
     * Gets the value of the undeliverableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndeliverableIndicator() {
        return undeliverableIndicator;
    }

    /**
     * Sets the value of the undeliverableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndeliverableIndicator(String value) {
        this.undeliverableIndicator = value;
    }

    /**
     * Gets the value of the currentTransactionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTransactionIndicator() {
        return currentTransactionIndicator;
    }

    /**
     * Sets the value of the currentTransactionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTransactionIndicator(String value) {
        this.currentTransactionIndicator = value;
    }

}
