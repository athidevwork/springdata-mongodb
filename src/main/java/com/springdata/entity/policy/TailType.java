
package com.springdata.entity.policy;

import java.io.Serializable;

public class TailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CoverageNumberIdType CoverageNumberId;
    protected CodeWithDesc CoverageRelationNumberId;
    protected String Status;
    protected EffectivePeriodType EffectivePeriod;
    protected ReferredMedicalMalpracticeCoverageType ReferredMedicalMalpracticeCoverage;
    protected String OfferStartDate;
    protected String OfferEndDate;
    protected String OfferPurgeDate;
    protected String TailDuration;
    protected String SuppressTailOffer;
    protected String SuppressTailEndorse;
    protected AdditionalInformationType AdditionalInformation;
    protected String ProductCoverageCode;
    protected String ToRate;
    protected String RatingModuleCode;
    protected String AnnualBaseRate;
    protected String ProductCovRelTypeCode;
    protected String PcfAmountIndicator;
    protected String Limit;
    protected String GrossPremium;
    protected String NetPremium;
    protected String LossOfIncomeDays;
    protected String RetroActiveDate;
    protected String CoverageId;
    protected String TailCovBaseRecordId;
    protected String OfficialRecordId;
    protected RiskInfoType RiskInfo;
    protected String TailProcess;
    protected TailVersionDetailType TailVersionDetail;
    protected CreditSurchargeDeductibleType CreditSurchargeDeductible;
	public CoverageNumberIdType getCoverageNumberId() {
		return CoverageNumberId;
	}
	public void setCoverageNumberId(CoverageNumberIdType coverageNumberId) {
		CoverageNumberId = coverageNumberId;
	}
	public CodeWithDesc getCoverageRelationNumberId() {
		return CoverageRelationNumberId;
	}
	public void setCoverageRelationNumberId(CodeWithDesc coverageRelationNumberId) {
		CoverageRelationNumberId = coverageRelationNumberId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
		return ReferredMedicalMalpracticeCoverage;
	}
	public void setReferredMedicalMalpracticeCoverage(
			ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage) {
		ReferredMedicalMalpracticeCoverage = referredMedicalMalpracticeCoverage;
	}
	public String getOfferStartDate() {
		return OfferStartDate;
	}
	public void setOfferStartDate(String offerStartDate) {
		OfferStartDate = offerStartDate;
	}
	public String getOfferEndDate() {
		return OfferEndDate;
	}
	public void setOfferEndDate(String offerEndDate) {
		OfferEndDate = offerEndDate;
	}
	public String getOfferPurgeDate() {
		return OfferPurgeDate;
	}
	public void setOfferPurgeDate(String offerPurgeDate) {
		OfferPurgeDate = offerPurgeDate;
	}
	public String getTailDuration() {
		return TailDuration;
	}
	public void setTailDuration(String tailDuration) {
		TailDuration = tailDuration;
	}
	public String getSuppressTailOffer() {
		return SuppressTailOffer;
	}
	public void setSuppressTailOffer(String suppressTailOffer) {
		SuppressTailOffer = suppressTailOffer;
	}
	public String getSuppressTailEndorse() {
		return SuppressTailEndorse;
	}
	public void setSuppressTailEndorse(String suppressTailEndorse) {
		SuppressTailEndorse = suppressTailEndorse;
	}
	public AdditionalInformationType getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(AdditionalInformationType additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	public String getProductCoverageCode() {
		return ProductCoverageCode;
	}
	public void setProductCoverageCode(String productCoverageCode) {
		ProductCoverageCode = productCoverageCode;
	}
	public String getToRate() {
		return ToRate;
	}
	public void setToRate(String toRate) {
		ToRate = toRate;
	}
	public String getRatingModuleCode() {
		return RatingModuleCode;
	}
	public void setRatingModuleCode(String ratingModuleCode) {
		RatingModuleCode = ratingModuleCode;
	}
	public String getAnnualBaseRate() {
		return AnnualBaseRate;
	}
	public void setAnnualBaseRate(String annualBaseRate) {
		AnnualBaseRate = annualBaseRate;
	}
	public String getProductCovRelTypeCode() {
		return ProductCovRelTypeCode;
	}
	public void setProductCovRelTypeCode(String productCovRelTypeCode) {
		ProductCovRelTypeCode = productCovRelTypeCode;
	}
	public String getPcfAmountIndicator() {
		return PcfAmountIndicator;
	}
	public void setPcfAmountIndicator(String pcfAmountIndicator) {
		PcfAmountIndicator = pcfAmountIndicator;
	}
	public String getLimit() {
		return Limit;
	}
	public void setLimit(String limit) {
		Limit = limit;
	}
	public String getGrossPremium() {
		return GrossPremium;
	}
	public void setGrossPremium(String grossPremium) {
		GrossPremium = grossPremium;
	}
	public String getNetPremium() {
		return NetPremium;
	}
	public void setNetPremium(String netPremium) {
		NetPremium = netPremium;
	}
	public String getLossOfIncomeDays() {
		return LossOfIncomeDays;
	}
	public void setLossOfIncomeDays(String lossOfIncomeDays) {
		LossOfIncomeDays = lossOfIncomeDays;
	}
	public String getRetroActiveDate() {
		return RetroActiveDate;
	}
	public void setRetroActiveDate(String retroActiveDate) {
		RetroActiveDate = retroActiveDate;
	}
	public String getCoverageId() {
		return CoverageId;
	}
	public void setCoverageId(String coverageId) {
		CoverageId = coverageId;
	}
	public String getTailCovBaseRecordId() {
		return TailCovBaseRecordId;
	}
	public void setTailCovBaseRecordId(String tailCovBaseRecordId) {
		TailCovBaseRecordId = tailCovBaseRecordId;
	}
	public String getOfficialRecordId() {
		return OfficialRecordId;
	}
	public void setOfficialRecordId(String officialRecordId) {
		OfficialRecordId = officialRecordId;
	}
	public RiskInfoType getRiskInfo() {
		return RiskInfo;
	}
	public void setRiskInfo(RiskInfoType riskInfo) {
		RiskInfo = riskInfo;
	}
	public String getTailProcess() {
		return TailProcess;
	}
	public void setTailProcess(String tailProcess) {
		TailProcess = tailProcess;
	}
	public TailVersionDetailType getTailVersionDetail() {
		return TailVersionDetail;
	}
	public void setTailVersionDetail(TailVersionDetailType tailVersionDetail) {
		TailVersionDetail = tailVersionDetail;
	}
	public CreditSurchargeDeductibleType getCreditSurchargeDeductible() {
		return CreditSurchargeDeductible;
	}
	public void setCreditSurchargeDeductible(CreditSurchargeDeductibleType creditSurchargeDeductible) {
		CreditSurchargeDeductible = creditSurchargeDeductible;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[CoverageNumberId=" + CoverageNumberId + ", CoverageRelationNumberId="
				+ CoverageRelationNumberId + ", Status=" + Status + ", EffectivePeriod=" + EffectivePeriod
				+ ", ReferredMedicalMalpracticeCoverage=" + ReferredMedicalMalpracticeCoverage + ", OfferStartDate="
				+ OfferStartDate + ", OfferEndDate=" + OfferEndDate + ", OfferPurgeDate=" + OfferPurgeDate
				+ ", TailDuration=" + TailDuration + ", SuppressTailOffer=" + SuppressTailOffer
				+ ", SuppressTailEndorse=" + SuppressTailEndorse + ", AdditionalInformation=" + AdditionalInformation
				+ ", ProductCoverageCode=" + ProductCoverageCode + ", ToRate=" + ToRate + ", RatingModuleCode="
				+ RatingModuleCode + ", AnnualBaseRate=" + AnnualBaseRate + ", ProductCovRelTypeCode="
				+ ProductCovRelTypeCode + ", PcfAmountIndicator=" + PcfAmountIndicator + ", Limit=" + Limit
				+ ", GrossPremium=" + GrossPremium + ", NetPremium=" + NetPremium + ", LossOfIncomeDays="
				+ LossOfIncomeDays + ", RetroActiveDate=" + RetroActiveDate + ", CoverageId=" + CoverageId
				+ ", TailCovBaseRecordId=" + TailCovBaseRecordId + ", OfficialRecordId=" + OfficialRecordId
				+ ", RiskInfo=" + RiskInfo + ", TailProcess=" + TailProcess + ", TailVersionDetail=" + TailVersionDetail
				+ ", CreditSurchargeDeductible=" + CreditSurchargeDeductible + "]";
	}
}
