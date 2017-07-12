
package com.springdata.entity.policy;

import java.io.Serializable;

public class TailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CoverageNumberIdType coverageNumberId;
    protected CodeWithDesc coverageRelationNumberId;
    protected String status;
    protected EffectivePeriodType effectivePeriod;
    protected ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage;
    protected String offerStartDate;
    protected String offerEndDate;
    protected String offerPurgeDate;
    protected String tailDuration;
    protected String suppressTailOffer;
    protected String suppressTailEndorse;
    protected AdditionalInformationType additionalInformation;
    protected String productCoverageCode;
    protected String toRate;
    protected String ratingModuleCode;
    protected String annualBaseRate;
    protected String productCovRelTypeCode;
    protected String pcfAmountIndicator;
    protected String limit;
    protected String grossPremium;
    protected String netPremium;
    protected String lossOfIncomeDays;
    protected String retroActiveDate;
    protected String coverageId;
    protected String tailCovBaseRecordId;
    protected String officialRecordId;
    protected RiskInfoType riskInfo;
    protected String tailProcess;
    protected TailVersionDetailType tailVersionDetail;
    protected CreditSurchargeDeductibleType creditSurchargeDeductible;

    /**
     * Gets the value of the coverageNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageNumberIdType }
     *     
     */
    public CoverageNumberIdType getCoverageNumberId() {
        return coverageNumberId;
    }

    /**
     * Sets the value of the coverageNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageNumberIdType }
     *     
     */
    public void setCoverageNumberId(CoverageNumberIdType value) {
        this.coverageNumberId = value;
    }

    /**
     * Gets the value of the coverageRelationNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getCoverageRelationNumberId() {
        return coverageRelationNumberId;
    }

    /**
     * Sets the value of the coverageRelationNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setCoverageRelationNumberId(CodeWithDesc value) {
        this.coverageRelationNumberId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the referredMedicalMalpracticeCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredMedicalMalpracticeCoverageType }
     *     
     */
    public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
        return referredMedicalMalpracticeCoverage;
    }

    /**
     * Sets the value of the referredMedicalMalpracticeCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredMedicalMalpracticeCoverageType }
     *     
     */
    public void setReferredMedicalMalpracticeCoverage(ReferredMedicalMalpracticeCoverageType value) {
        this.referredMedicalMalpracticeCoverage = value;
    }

    /**
     * Gets the value of the offerStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferStartDate() {
        return offerStartDate;
    }

    /**
     * Sets the value of the offerStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferStartDate(String value) {
        this.offerStartDate = value;
    }

    /**
     * Gets the value of the offerEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferEndDate() {
        return offerEndDate;
    }

    /**
     * Sets the value of the offerEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferEndDate(String value) {
        this.offerEndDate = value;
    }

    /**
     * Gets the value of the offerPurgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferPurgeDate() {
        return offerPurgeDate;
    }

    /**
     * Sets the value of the offerPurgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferPurgeDate(String value) {
        this.offerPurgeDate = value;
    }

    /**
     * Gets the value of the tailDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailDuration() {
        return tailDuration;
    }

    /**
     * Sets the value of the tailDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailDuration(String value) {
        this.tailDuration = value;
    }

    /**
     * Gets the value of the suppressTailOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressTailOffer() {
        return suppressTailOffer;
    }

    /**
     * Sets the value of the suppressTailOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressTailOffer(String value) {
        this.suppressTailOffer = value;
    }

    /**
     * Gets the value of the suppressTailEndorse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressTailEndorse() {
        return suppressTailEndorse;
    }

    /**
     * Sets the value of the suppressTailEndorse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressTailEndorse(String value) {
        this.suppressTailEndorse = value;
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
     * Gets the value of the productCoverageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCoverageCode() {
        return productCoverageCode;
    }

    /**
     * Sets the value of the productCoverageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCoverageCode(String value) {
        this.productCoverageCode = value;
    }

    /**
     * Gets the value of the toRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRate() {
        return toRate;
    }

    /**
     * Sets the value of the toRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRate(String value) {
        this.toRate = value;
    }

    /**
     * Gets the value of the ratingModuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingModuleCode() {
        return ratingModuleCode;
    }

    /**
     * Sets the value of the ratingModuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingModuleCode(String value) {
        this.ratingModuleCode = value;
    }

    /**
     * Gets the value of the annualBaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualBaseRate() {
        return annualBaseRate;
    }

    /**
     * Sets the value of the annualBaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualBaseRate(String value) {
        this.annualBaseRate = value;
    }

    /**
     * Gets the value of the productCovRelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCovRelTypeCode() {
        return productCovRelTypeCode;
    }

    /**
     * Sets the value of the productCovRelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCovRelTypeCode(String value) {
        this.productCovRelTypeCode = value;
    }

    /**
     * Gets the value of the pcfAmountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCFAmountIndicator() {
        return pcfAmountIndicator;
    }

    /**
     * Sets the value of the pcfAmountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCFAmountIndicator(String value) {
        this.pcfAmountIndicator = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * Gets the value of the grossPremium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossPremium() {
        return grossPremium;
    }

    /**
     * Sets the value of the grossPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossPremium(String value) {
        this.grossPremium = value;
    }

    /**
     * Gets the value of the netPremium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPremium() {
        return netPremium;
    }

    /**
     * Sets the value of the netPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPremium(String value) {
        this.netPremium = value;
    }

    /**
     * Gets the value of the lossOfIncomeDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossOfIncomeDays() {
        return lossOfIncomeDays;
    }

    /**
     * Sets the value of the lossOfIncomeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossOfIncomeDays(String value) {
        this.lossOfIncomeDays = value;
    }

    /**
     * Gets the value of the retroActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetroActiveDate() {
        return retroActiveDate;
    }

    /**
     * Sets the value of the retroActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetroActiveDate(String value) {
        this.retroActiveDate = value;
    }

    /**
     * Gets the value of the coverageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageId() {
        return coverageId;
    }

    /**
     * Sets the value of the coverageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageId(String value) {
        this.coverageId = value;
    }

    /**
     * Gets the value of the tailCovBaseRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailCovBaseRecordId() {
        return tailCovBaseRecordId;
    }

    /**
     * Sets the value of the tailCovBaseRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailCovBaseRecordId(String value) {
        this.tailCovBaseRecordId = value;
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
     * Gets the value of the riskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInfoType }
     *     
     */
    public RiskInfoType getRiskInfo() {
        return riskInfo;
    }

    /**
     * Sets the value of the riskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInfoType }
     *     
     */
    public void setRiskInfo(RiskInfoType value) {
        this.riskInfo = value;
    }

    /**
     * Gets the value of the tailProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailProcess() {
        return tailProcess;
    }

    /**
     * Sets the value of the tailProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailProcess(String value) {
        this.tailProcess = value;
    }

    /**
     * Gets the value of the tailVersionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TailVersionDetailType }
     *     
     */
    public TailVersionDetailType getTailVersionDetail() {
        return tailVersionDetail;
    }

    /**
     * Sets the value of the tailVersionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TailVersionDetailType }
     *     
     */
    public void setTailVersionDetail(TailVersionDetailType value) {
        this.tailVersionDetail = value;
    }

    /**
     * Gets the value of the creditSurchargeDeductible property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSurchargeDeductibleType }
     *     
     */
    public CreditSurchargeDeductibleType getCreditSurchargeDeductible() {
        return creditSurchargeDeductible;
    }

    /**
     * Sets the value of the creditSurchargeDeductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSurchargeDeductibleType }
     *     
     */
    public void setCreditSurchargeDeductible(CreditSurchargeDeductibleType value) {
        this.creditSurchargeDeductible = value;
    }

}
