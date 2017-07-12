
package com.springdata.entity.policy;

import java.io.Serializable;

public class CreditSurchargeDeductibleVersionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String creditSurchargeDeductibleVersionId;
    protected EffectivePeriodType effectivePeriod;
    protected ProductComponentInfoType productCoverageComponentInfo;
    protected String numericValue;
    protected String incidentDeductibleNumericValue;
    protected String aggregateDeductibleNumericValue;
    protected String cycleDate;
    protected String prorateIndicator;
    protected String renewalIndicator;
    protected String classificationCode;
    protected String additionalNotes;
    protected AdditionalInformationType additionalInformation;
    protected CreditSurchargeDeductibleVersionDetailType creditSurchargeDeductibleVersionDetail;

    /**
     * Gets the value of the creditSurchargeDeductibleVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditSurchargeDeductibleVersionId() {
        return creditSurchargeDeductibleVersionId;
    }

    /**
     * Sets the value of the creditSurchargeDeductibleVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditSurchargeDeductibleVersionId(String value) {
        this.creditSurchargeDeductibleVersionId = value;
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
     * Gets the value of the productCoverageComponentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductComponentInfoType }
     *     
     */
    public ProductComponentInfoType getProductCoverageComponentInfo() {
        return productCoverageComponentInfo;
    }

    /**
     * Sets the value of the productCoverageComponentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductComponentInfoType }
     *     
     */
    public void setProductCoverageComponentInfo(ProductComponentInfoType value) {
        this.productCoverageComponentInfo = value;
    }

    /**
     * Gets the value of the numericValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericValue() {
        return numericValue;
    }

    /**
     * Sets the value of the numericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericValue(String value) {
        this.numericValue = value;
    }

    /**
     * Gets the value of the incidentDeductibleNumericValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentDeductibleNumericValue() {
        return incidentDeductibleNumericValue;
    }

    /**
     * Sets the value of the incidentDeductibleNumericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentDeductibleNumericValue(String value) {
        this.incidentDeductibleNumericValue = value;
    }

    /**
     * Gets the value of the aggregateDeductibleNumericValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregateDeductibleNumericValue() {
        return aggregateDeductibleNumericValue;
    }

    /**
     * Sets the value of the aggregateDeductibleNumericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregateDeductibleNumericValue(String value) {
        this.aggregateDeductibleNumericValue = value;
    }

    /**
     * Gets the value of the cycleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleDate() {
        return cycleDate;
    }

    /**
     * Sets the value of the cycleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleDate(String value) {
        this.cycleDate = value;
    }

    /**
     * Gets the value of the prorateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProrateIndicator() {
        return prorateIndicator;
    }

    /**
     * Sets the value of the prorateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProrateIndicator(String value) {
        this.prorateIndicator = value;
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

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationCode(String value) {
        this.classificationCode = value;
    }

    /**
     * Gets the value of the additionalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNotes() {
        return additionalNotes;
    }

    /**
     * Sets the value of the additionalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNotes(String value) {
        this.additionalNotes = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformationType }
     *     
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformationType }
     *     
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the creditSurchargeDeductibleVersionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSurchargeDeductibleVersionDetailType }
     *     
     */
    public CreditSurchargeDeductibleVersionDetailType getCreditSurchargeDeductibleVersionDetail() {
        return creditSurchargeDeductibleVersionDetail;
    }

    /**
     * Sets the value of the creditSurchargeDeductibleVersionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSurchargeDeductibleVersionDetailType }
     *     
     */
    public void setCreditSurchargeDeductibleVersionDetail(CreditSurchargeDeductibleVersionDetailType value) {
        this.creditSurchargeDeductibleVersionDetail = value;
    }

}
