
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicalMalpracticeCoverageVersionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String medicalMalpracticeCoverageVersionId;
    protected String primaryIndicator;
    protected String medicalMalpracticeCoverageStatusCode;
    protected EffectivePeriodType effectivePeriod;
    protected ProductCoverageInfoType productCoverageInfo;
    protected String terminationDate;
    protected String minimumPremiumAmount;
    protected String minimumPremiumMode;
    protected LimitType limit;
    protected ClaimMadeLiabilityPolicyInformationType claimMadeLiabilityPolicyInformation;
    protected String payorCode;
    protected String annualBaseRate;
    protected String defaultAmountOfInsurance;
    protected String additionalAmountOfInsurance;
    protected String lossOfIncomeDays;
    protected String exposureUnit;
    protected String buildingRate;
    protected String forecastIndicator;
    protected String directPrimaryIndicator;
    protected String additionalSymbolCode;
    protected String coverageLimitCode;
    protected String ratingModuleCode;
    protected String retiredIndicator;
    protected CoverageConversionInformationType coverageConversionInformation;
    protected PcfType pcf;
    protected CancellationInformationType cancellationInformation;
    protected PriorActsType priorActs;
    protected String deductible;
    protected List<FundInformationType> fundInformation;
    protected CCMCoverageInformationType ccmCoverageInformation;
    protected AdditionalInformationType additionalInformation;
    protected MedicalMalpracticeCoverageVersionDetailType medicalMalpracticeCoverageVersionDetail;

    /**
     * Gets the value of the medicalMalpracticeCoverageVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalMalpracticeCoverageVersionId() {
        return medicalMalpracticeCoverageVersionId;
    }

    /**
     * Sets the value of the medicalMalpracticeCoverageVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalMalpracticeCoverageVersionId(String value) {
        this.medicalMalpracticeCoverageVersionId = value;
    }

    /**
     * Gets the value of the primaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * Sets the value of the primaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIndicator(String value) {
        this.primaryIndicator = value;
    }

    /**
     * Gets the value of the medicalMalpracticeCoverageStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalMalpracticeCoverageStatusCode() {
        return medicalMalpracticeCoverageStatusCode;
    }

    /**
     * Sets the value of the medicalMalpracticeCoverageStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalMalpracticeCoverageStatusCode(String value) {
        this.medicalMalpracticeCoverageStatusCode = value;
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
     * Gets the value of the productCoverageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCoverageInfoType }
     *     
     */
    public ProductCoverageInfoType getProductCoverageInfo() {
        return productCoverageInfo;
    }

    /**
     * Sets the value of the productCoverageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCoverageInfoType }
     *     
     */
    public void setProductCoverageInfo(ProductCoverageInfoType value) {
        this.productCoverageInfo = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationDate(String value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the minimumPremiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumPremiumAmount() {
        return minimumPremiumAmount;
    }

    /**
     * Sets the value of the minimumPremiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumPremiumAmount(String value) {
        this.minimumPremiumAmount = value;
    }

    /**
     * Gets the value of the minimumPremiumMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumPremiumMode() {
        return minimumPremiumMode;
    }

    /**
     * Sets the value of the minimumPremiumMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumPremiumMode(String value) {
        this.minimumPremiumMode = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType }
     *     
     */
    public LimitType getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType }
     *     
     */
    public void setLimit(LimitType value) {
        this.limit = value;
    }

    /**
     * Gets the value of the claimMadeLiabilityPolicyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimMadeLiabilityPolicyInformationType }
     *     
     */
    public ClaimMadeLiabilityPolicyInformationType getClaimMadeLiabilityPolicyInformation() {
        return claimMadeLiabilityPolicyInformation;
    }

    /**
     * Sets the value of the claimMadeLiabilityPolicyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimMadeLiabilityPolicyInformationType }
     *     
     */
    public void setClaimMadeLiabilityPolicyInformation(ClaimMadeLiabilityPolicyInformationType value) {
        this.claimMadeLiabilityPolicyInformation = value;
    }

    /**
     * Gets the value of the payorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorCode() {
        return payorCode;
    }

    /**
     * Sets the value of the payorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorCode(String value) {
        this.payorCode = value;
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
     * Gets the value of the defaultAmountOfInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAmountOfInsurance() {
        return defaultAmountOfInsurance;
    }

    /**
     * Sets the value of the defaultAmountOfInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAmountOfInsurance(String value) {
        this.defaultAmountOfInsurance = value;
    }

    /**
     * Gets the value of the additionalAmountOfInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAmountOfInsurance() {
        return additionalAmountOfInsurance;
    }

    /**
     * Sets the value of the additionalAmountOfInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAmountOfInsurance(String value) {
        this.additionalAmountOfInsurance = value;
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
     * Gets the value of the exposureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExposureUnit() {
        return exposureUnit;
    }

    /**
     * Sets the value of the exposureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExposureUnit(String value) {
        this.exposureUnit = value;
    }

    /**
     * Gets the value of the buildingRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingRate() {
        return buildingRate;
    }

    /**
     * Sets the value of the buildingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingRate(String value) {
        this.buildingRate = value;
    }

    /**
     * Gets the value of the forecastIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastIndicator() {
        return forecastIndicator;
    }

    /**
     * Sets the value of the forecastIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastIndicator(String value) {
        this.forecastIndicator = value;
    }

    /**
     * Gets the value of the directPrimaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectPrimaryIndicator() {
        return directPrimaryIndicator;
    }

    /**
     * Sets the value of the directPrimaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectPrimaryIndicator(String value) {
        this.directPrimaryIndicator = value;
    }

    /**
     * Gets the value of the additionalSymbolCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalSymbolCode() {
        return additionalSymbolCode;
    }

    /**
     * Sets the value of the additionalSymbolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalSymbolCode(String value) {
        this.additionalSymbolCode = value;
    }

    /**
     * Gets the value of the coverageLimitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageLimitCode() {
        return coverageLimitCode;
    }

    /**
     * Sets the value of the coverageLimitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageLimitCode(String value) {
        this.coverageLimitCode = value;
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
     * Gets the value of the retiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetiredIndicator() {
        return retiredIndicator;
    }

    /**
     * Sets the value of the retiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetiredIndicator(String value) {
        this.retiredIndicator = value;
    }

    /**
     * Gets the value of the coverageConversionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageConversionInformationType }
     *     
     */
    public CoverageConversionInformationType getCoverageConversionInformation() {
        return coverageConversionInformation;
    }

    /**
     * Sets the value of the coverageConversionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageConversionInformationType }
     *     
     */
    public void setCoverageConversionInformation(CoverageConversionInformationType value) {
        this.coverageConversionInformation = value;
    }

    /**
     * Gets the value of the pcf property.
     * 
     * @return
     *     possible object is
     *     {@link PcfType }
     *     
     */
    public PcfType getPcf() {
        return pcf;
    }

    /**
     * Sets the value of the pcf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PcfType }
     *     
     */
    public void setPcf(PcfType value) {
        this.pcf = value;
    }

    /**
     * Gets the value of the cancellationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationInformationType }
     *     
     */
    public CancellationInformationType getCancellationInformation() {
        return cancellationInformation;
    }

    /**
     * Sets the value of the cancellationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationInformationType }
     *     
     */
    public void setCancellationInformation(CancellationInformationType value) {
        this.cancellationInformation = value;
    }

    /**
     * Gets the value of the priorActs property.
     * 
     * @return
     *     possible object is
     *     {@link PriorActsType }
     *     
     */
    public PriorActsType getPriorActs() {
        return priorActs;
    }

    /**
     * Sets the value of the priorActs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorActsType }
     *     
     */
    public void setPriorActs(PriorActsType value) {
        this.priorActs = value;
    }

    /**
     * Gets the value of the deductible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductible() {
        return deductible;
    }

    /**
     * Sets the value of the deductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductible(String value) {
        this.deductible = value;
    }

    /**
     * Gets the value of the fundInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundInformationType }
     * 
     * 
     */
    public List<FundInformationType> getFundInformation() {
        if (fundInformation == null) {
            fundInformation = new ArrayList<FundInformationType>();
        }
        return this.fundInformation;
    }

    /**
     * getFundInformationValue - return the value for a fund information for a state.
     * @param key - state
     * @return value for a fund information data for a state
     */
    public FundInformationType getFundInformationValue(String key) {
        for (FundInformationType data : fundInformation) {
            if (data.getState().equalsIgnoreCase(key))
                return data;
        }
        return null;
    }

    /**
     * Gets the value of the ccmCoverageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CCMCoverageInformationType }
     *     
     */
    public CCMCoverageInformationType getCCMCoverageInformation() {
        return ccmCoverageInformation;
    }

    /**
     * Sets the value of the ccmCoverageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCMCoverageInformationType }
     *     
     */
    public void setCCMCoverageInformation(CCMCoverageInformationType value) {
        this.ccmCoverageInformation = value;
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
     * Gets the value of the medicalMalpracticeCoverageVersionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalMalpracticeCoverageVersionDetailType }
     *     
     */
    public MedicalMalpracticeCoverageVersionDetailType getMedicalMalpracticeCoverageVersionDetail() {
        return medicalMalpracticeCoverageVersionDetail;
    }

    /**
     * Sets the value of the medicalMalpracticeCoverageVersionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalMalpracticeCoverageVersionDetailType }
     *     
     */
    public void setMedicalMalpracticeCoverageVersionDetail(MedicalMalpracticeCoverageVersionDetailType value) {
        this.medicalMalpracticeCoverageVersionDetail = value;
    }

}
