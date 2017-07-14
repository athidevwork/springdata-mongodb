
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicalMalpracticeCoverageVersionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String MedicalMalpracticeCoverageVersionId;
    protected String PrimaryIndicator;
    protected String MedicalMalpracticeCoverageStatusCode;
    protected EffectivePeriodType EffectivePeriod;
    protected ProductCoverageInfoType ProductCoverageInfo;
    protected String TerminationDate;
    protected String MinimumPremiumAmount;
    protected String MinimumPremiumMode;
    protected LimitType Limit;
    protected ClaimMadeLiabilityPolicyInformationType ClaimMadeLiabilityPolicyInformation;
    protected String PayorCode;
    protected String AnnualBaseRate;
    protected String DefaultAmountOfInsurance;
    protected String AdditionalAmountOfInsurance;
    protected String LossOfIncomeDays;
    protected String ExposureUnit;
    protected String BuildingRate;
    protected String ForecastIndicator;
    protected String DirectPrimaryIndicator;
    protected String AdditionalSymbolCode;
    protected String CoverageLimitCode;
    protected String RatingModuleCode;
    protected String RetiredIndicator;
    protected CoverageConversionInformationType CoverageConversionInformation;
    protected PcfType Pcf;
    protected CancellationInformationType CancellationInformation;
    protected PriorActsType PriorActs;
    protected String Deductible;
    protected List<FundInformationType> FundInformation;
    protected CCMCoverageInformationType CcmCoverageInformation;
    protected AdditionalInformationType AdditionalInformation;
    protected MedicalMalpracticeCoverageVersionDetailType MedicalMalpracticeCoverageVersionDetail;
	public String getMedicalMalpracticeCoverageVersionId() {
		return MedicalMalpracticeCoverageVersionId;
	}
	public void setMedicalMalpracticeCoverageVersionId(String medicalMalpracticeCoverageVersionId) {
		MedicalMalpracticeCoverageVersionId = medicalMalpracticeCoverageVersionId;
	}
	public String getPrimaryIndicator() {
		return PrimaryIndicator;
	}
	public void setPrimaryIndicator(String primaryIndicator) {
		PrimaryIndicator = primaryIndicator;
	}
	public String getMedicalMalpracticeCoverageStatusCode() {
		return MedicalMalpracticeCoverageStatusCode;
	}
	public void setMedicalMalpracticeCoverageStatusCode(String medicalMalpracticeCoverageStatusCode) {
		MedicalMalpracticeCoverageStatusCode = medicalMalpracticeCoverageStatusCode;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public ProductCoverageInfoType getProductCoverageInfo() {
		return ProductCoverageInfo;
	}
	public void setProductCoverageInfo(ProductCoverageInfoType productCoverageInfo) {
		ProductCoverageInfo = productCoverageInfo;
	}
	public String getTerminationDate() {
		return TerminationDate;
	}
	public void setTerminationDate(String terminationDate) {
		TerminationDate = terminationDate;
	}
	public String getMinimumPremiumAmount() {
		return MinimumPremiumAmount;
	}
	public void setMinimumPremiumAmount(String minimumPremiumAmount) {
		MinimumPremiumAmount = minimumPremiumAmount;
	}
	public String getMinimumPremiumMode() {
		return MinimumPremiumMode;
	}
	public void setMinimumPremiumMode(String minimumPremiumMode) {
		MinimumPremiumMode = minimumPremiumMode;
	}
	public LimitType getLimit() {
		return Limit;
	}
	public void setLimit(LimitType limit) {
		Limit = limit;
	}
	public ClaimMadeLiabilityPolicyInformationType getClaimMadeLiabilityPolicyInformation() {
		return ClaimMadeLiabilityPolicyInformation;
	}
	public void setClaimMadeLiabilityPolicyInformation(
			ClaimMadeLiabilityPolicyInformationType claimMadeLiabilityPolicyInformation) {
		ClaimMadeLiabilityPolicyInformation = claimMadeLiabilityPolicyInformation;
	}
	public String getPayorCode() {
		return PayorCode;
	}
	public void setPayorCode(String payorCode) {
		PayorCode = payorCode;
	}
	public String getAnnualBaseRate() {
		return AnnualBaseRate;
	}
	public void setAnnualBaseRate(String annualBaseRate) {
		AnnualBaseRate = annualBaseRate;
	}
	public String getDefaultAmountOfInsurance() {
		return DefaultAmountOfInsurance;
	}
	public void setDefaultAmountOfInsurance(String defaultAmountOfInsurance) {
		DefaultAmountOfInsurance = defaultAmountOfInsurance;
	}
	public String getAdditionalAmountOfInsurance() {
		return AdditionalAmountOfInsurance;
	}
	public void setAdditionalAmountOfInsurance(String additionalAmountOfInsurance) {
		AdditionalAmountOfInsurance = additionalAmountOfInsurance;
	}
	public String getLossOfIncomeDays() {
		return LossOfIncomeDays;
	}
	public void setLossOfIncomeDays(String lossOfIncomeDays) {
		LossOfIncomeDays = lossOfIncomeDays;
	}
	public String getExposureUnit() {
		return ExposureUnit;
	}
	public void setExposureUnit(String exposureUnit) {
		ExposureUnit = exposureUnit;
	}
	public String getBuildingRate() {
		return BuildingRate;
	}
	public void setBuildingRate(String buildingRate) {
		BuildingRate = buildingRate;
	}
	public String getForecastIndicator() {
		return ForecastIndicator;
	}
	public void setForecastIndicator(String forecastIndicator) {
		ForecastIndicator = forecastIndicator;
	}
	public String getDirectPrimaryIndicator() {
		return DirectPrimaryIndicator;
	}
	public void setDirectPrimaryIndicator(String directPrimaryIndicator) {
		DirectPrimaryIndicator = directPrimaryIndicator;
	}
	public String getAdditionalSymbolCode() {
		return AdditionalSymbolCode;
	}
	public void setAdditionalSymbolCode(String additionalSymbolCode) {
		AdditionalSymbolCode = additionalSymbolCode;
	}
	public String getCoverageLimitCode() {
		return CoverageLimitCode;
	}
	public void setCoverageLimitCode(String coverageLimitCode) {
		CoverageLimitCode = coverageLimitCode;
	}
	public String getRatingModuleCode() {
		return RatingModuleCode;
	}
	public void setRatingModuleCode(String ratingModuleCode) {
		RatingModuleCode = ratingModuleCode;
	}
	public String getRetiredIndicator() {
		return RetiredIndicator;
	}
	public void setRetiredIndicator(String retiredIndicator) {
		RetiredIndicator = retiredIndicator;
	}
	public CoverageConversionInformationType getCoverageConversionInformation() {
		return CoverageConversionInformation;
	}
	public void setCoverageConversionInformation(CoverageConversionInformationType coverageConversionInformation) {
		CoverageConversionInformation = coverageConversionInformation;
	}
	public PcfType getPcf() {
		return Pcf;
	}
	public void setPcf(PcfType pcf) {
		Pcf = pcf;
	}
	public CancellationInformationType getCancellationInformation() {
		return CancellationInformation;
	}
	public void setCancellationInformation(CancellationInformationType cancellationInformation) {
		CancellationInformation = cancellationInformation;
	}
	public PriorActsType getPriorActs() {
		return PriorActs;
	}
	public void setPriorActs(PriorActsType priorActs) {
		PriorActs = priorActs;
	}
	public String getDeductible() {
		return Deductible;
	}
	public void setDeductible(String deductible) {
		Deductible = deductible;
	}
	public List<FundInformationType> getFundInformation() {
		return FundInformation;
	}
	public void setFundInformation(List<FundInformationType> fundInformation) {
		FundInformation = fundInformation;
	}
	public CCMCoverageInformationType getCcmCoverageInformation() {
		return CcmCoverageInformation;
	}
	public void setCcmCoverageInformation(CCMCoverageInformationType ccmCoverageInformation) {
		CcmCoverageInformation = ccmCoverageInformation;
	}
	public AdditionalInformationType getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(AdditionalInformationType additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	public MedicalMalpracticeCoverageVersionDetailType getMedicalMalpracticeCoverageVersionDetail() {
		return MedicalMalpracticeCoverageVersionDetail;
	}
	public void setMedicalMalpracticeCoverageVersionDetail(
			MedicalMalpracticeCoverageVersionDetailType medicalMalpracticeCoverageVersionDetail) {
		MedicalMalpracticeCoverageVersionDetail = medicalMalpracticeCoverageVersionDetail;
	}
	@Override
	public String toString() {
		return "\n\t\t\t\t[MedicalMalpracticeCoverageVersionId="
				+ MedicalMalpracticeCoverageVersionId + ", PrimaryIndicator=" + PrimaryIndicator
				+ ", MedicalMalpracticeCoverageStatusCode=" + MedicalMalpracticeCoverageStatusCode
				+ ", EffectivePeriod=" + EffectivePeriod + ", ProductCoverageInfo=" + ProductCoverageInfo
				+ ", TerminationDate=" + TerminationDate + ", MinimumPremiumAmount=" + MinimumPremiumAmount
				+ ", MinimumPremiumMode=" + MinimumPremiumMode + ", Limit=" + Limit
				+ ", ClaimMadeLiabilityPolicyInformation=" + ClaimMadeLiabilityPolicyInformation + ", PayorCode="
				+ PayorCode + ", AnnualBaseRate=" + AnnualBaseRate + ", DefaultAmountOfInsurance="
				+ DefaultAmountOfInsurance + ", AdditionalAmountOfInsurance=" + AdditionalAmountOfInsurance
				+ ", LossOfIncomeDays=" + LossOfIncomeDays + ", ExposureUnit=" + ExposureUnit + ", BuildingRate="
				+ BuildingRate + ", ForecastIndicator=" + ForecastIndicator + ", DirectPrimaryIndicator="
				+ DirectPrimaryIndicator + ", AdditionalSymbolCode=" + AdditionalSymbolCode + ", CoverageLimitCode="
				+ CoverageLimitCode + ", RatingModuleCode=" + RatingModuleCode + ", RetiredIndicator="
				+ RetiredIndicator + ", CoverageConversionInformation=" + CoverageConversionInformation + ", Pcf=" + Pcf
				+ ", CancellationInformation=" + CancellationInformation + ", PriorActs=" + PriorActs + ", Deductible="
				+ Deductible + ", FundInformation=" + FundInformation + ", CcmCoverageInformation="
				+ CcmCoverageInformation + ", AdditionalInformation=" + AdditionalInformation
				+ ", MedicalMalpracticeCoverageVersionDetail=" + MedicalMalpracticeCoverageVersionDetail + "]";
	}
}
