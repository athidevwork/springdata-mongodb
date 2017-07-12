
package com.springdata.entity.policy;

import java.io.Serializable;

public class FundSubmissionInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String fundSubmissionNumberId;
    protected ReferredInsuredType referredInsured;
    protected String state;
    protected EffectivePeriodType effectivePeriod;
    protected String transactionType;
    protected String transactionCode;
    protected String fundEligibleIndicator;
    protected String fundExemptIndicator;
    protected String fundStatus;
    protected String fundSubmittedDate;

    /**
     * Gets the value of the fundSubmissionNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundSubmissionNumberId() {
        return fundSubmissionNumberId;
    }

    /**
     * Sets the value of the fundSubmissionNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundSubmissionNumberId(String value) {
        this.fundSubmissionNumberId = value;
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
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the fundEligibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundEligibleIndicator() {
        return fundEligibleIndicator;
    }

    /**
     * Sets the value of the fundEligibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundEligibleIndicator(String value) {
        this.fundEligibleIndicator = value;
    }

    /**
     * Gets the value of the fundExemptIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundExemptIndicator() {
        return fundExemptIndicator;
    }

    /**
     * Sets the value of the fundExemptIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundExemptIndicator(String value) {
        this.fundExemptIndicator = value;
    }

    /**
     * Gets the value of the fundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundStatus() {
        return fundStatus;
    }

    /**
     * Sets the value of the fundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundStatus(String value) {
        this.fundStatus = value;
    }

    /**
     * Gets the value of the fundSubmittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundSubmittedDate() {
        return fundSubmittedDate;
    }

    /**
     * Sets the value of the fundSubmittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundSubmittedDate(String value) {
        this.fundSubmittedDate = value;
    }

}
