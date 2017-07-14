
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class InsuredVersionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String InsuredVersionNumberId;
    protected String PrimaryIndicator;
    protected EffectivePeriodType EffectivePeriod;
    protected PracticeStateOrProvinceCodeType PracticeStateOrProvinceCode;
    protected PracticeCountyCodeType PracticeCountyCode;
    protected String InsuredStatusCode;
    protected InsuredTypeCodeType InsuredTypeCode;
    protected InsuredClassCodeType InsuredClassCode;
    protected String InsuredSubClassCode;
    protected String InsuredAlternateSpecialtyCode;
    protected String InsuredClaimsDeductibleNumberId;
    protected String TeachingIndicator;
    protected String InsuredProcedureCode;
    protected String InsuredMatureIndicator;
    protected String InsuredMoonlightingIndicator;
    protected String InsuredMoonlightingStatus;
    protected String ClaimsMadeYear;
    protected String IbnrIndicator;
    protected String IbnrStatus;
    protected String ScorecardEligibilityIndicator;
    protected String InsuredCityCode;
    protected String AdditionalNotes;
    protected String ClaimsTrigger;
    protected String TransactionTypeCode;
    protected String InsuredSocietyNumberId;
    protected String InsuredSlotNumber;
    protected String InsuredGroupStartDate;
    protected String InsuredProcessCode;
    protected String InsuredTerritoryCode;
    protected String IbnrPlaceholderIndicator;
    protected String InsuredIsInCisIndicator;
    protected String InsuredPcfParticipateIndicator;
    protected String InsuredBlockedListIndicator;
    protected String RateAsFteIndicator;
    protected String DisciplinaryListStatus;
    protected String InsuredXsPolicyIndicator;
    protected String InsuredXsPolicyNumber;
    protected String InsuredCount;
    protected String InsuredName;
    protected CancellationDetailType CancellationDetail;
    protected AttorneyInformationType AttorneyInformation;
    protected FullTimeEquivalencyInformationType FullTimeEquivalencyInformation;
    protected List<FundInformationType> FundInformation;
    protected MalpracticeLiabilityExposureInformationType MalpracticeLiabilityExposureInformation;
    protected BuildingInformationType BuildingInformation;
    protected VehiclesOperatedInformationType VehiclesOperatedInformation;
    protected AdditionalInformationType AdditionalInformation;
    protected InsuredVersionDetailType InsuredVersionDetail;
    
	public String getInsuredVersionNumberId() {
		return InsuredVersionNumberId;
	}
	public void setInsuredVersionNumberId(String insuredVersionNumberId) {
		InsuredVersionNumberId = insuredVersionNumberId;
	}
	public String getPrimaryIndicator() {
		return PrimaryIndicator;
	}
	public void setPrimaryIndicator(String primaryIndicator) {
		PrimaryIndicator = primaryIndicator;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public PracticeStateOrProvinceCodeType getPracticeStateOrProvinceCode() {
		return PracticeStateOrProvinceCode;
	}
	public void setPracticeStateOrProvinceCode(PracticeStateOrProvinceCodeType practiceStateOrProvinceCode) {
		PracticeStateOrProvinceCode = practiceStateOrProvinceCode;
	}
	public PracticeCountyCodeType getPracticeCountyCode() {
		return PracticeCountyCode;
	}
	public void setPracticeCountyCode(PracticeCountyCodeType practiceCountyCode) {
		PracticeCountyCode = practiceCountyCode;
	}
	public String getInsuredStatusCode() {
		return InsuredStatusCode;
	}
	public void setInsuredStatusCode(String insuredStatusCode) {
		InsuredStatusCode = insuredStatusCode;
	}
	public InsuredTypeCodeType getInsuredTypeCode() {
		return InsuredTypeCode;
	}
	public void setInsuredTypeCode(InsuredTypeCodeType insuredTypeCode) {
		InsuredTypeCode = insuredTypeCode;
	}
	public InsuredClassCodeType getInsuredClassCode() {
		return InsuredClassCode;
	}
	public void setInsuredClassCode(InsuredClassCodeType insuredClassCode) {
		InsuredClassCode = insuredClassCode;
	}
	public String getInsuredSubClassCode() {
		return InsuredSubClassCode;
	}
	public void setInsuredSubClassCode(String insuredSubClassCode) {
		InsuredSubClassCode = insuredSubClassCode;
	}
	public String getInsuredAlternateSpecialtyCode() {
		return InsuredAlternateSpecialtyCode;
	}
	public void setInsuredAlternateSpecialtyCode(String insuredAlternateSpecialtyCode) {
		InsuredAlternateSpecialtyCode = insuredAlternateSpecialtyCode;
	}
	public String getInsuredClaimsDeductibleNumberId() {
		return InsuredClaimsDeductibleNumberId;
	}
	public void setInsuredClaimsDeductibleNumberId(String insuredClaimsDeductibleNumberId) {
		InsuredClaimsDeductibleNumberId = insuredClaimsDeductibleNumberId;
	}
	public String getTeachingIndicator() {
		return TeachingIndicator;
	}
	public void setTeachingIndicator(String teachingIndicator) {
		TeachingIndicator = teachingIndicator;
	}
	public String getInsuredProcedureCode() {
		return InsuredProcedureCode;
	}
	public void setInsuredProcedureCode(String insuredProcedureCode) {
		InsuredProcedureCode = insuredProcedureCode;
	}
	public String getInsuredMatureIndicator() {
		return InsuredMatureIndicator;
	}
	public void setInsuredMatureIndicator(String insuredMatureIndicator) {
		InsuredMatureIndicator = insuredMatureIndicator;
	}
	public String getInsuredMoonlightingIndicator() {
		return InsuredMoonlightingIndicator;
	}
	public void setInsuredMoonlightingIndicator(String insuredMoonlightingIndicator) {
		InsuredMoonlightingIndicator = insuredMoonlightingIndicator;
	}
	public String getInsuredMoonlightingStatus() {
		return InsuredMoonlightingStatus;
	}
	public void setInsuredMoonlightingStatus(String insuredMoonlightingStatus) {
		InsuredMoonlightingStatus = insuredMoonlightingStatus;
	}
	public String getClaimsMadeYear() {
		return ClaimsMadeYear;
	}
	public void setClaimsMadeYear(String claimsMadeYear) {
		ClaimsMadeYear = claimsMadeYear;
	}
	public String getIbnrIndicator() {
		return IbnrIndicator;
	}
	public void setIbnrIndicator(String ibnrIndicator) {
		IbnrIndicator = ibnrIndicator;
	}
	public String getIbnrStatus() {
		return IbnrStatus;
	}
	public void setIbnrStatus(String ibnrStatus) {
		IbnrStatus = ibnrStatus;
	}
	public String getScorecardEligibilityIndicator() {
		return ScorecardEligibilityIndicator;
	}
	public void setScorecardEligibilityIndicator(String scorecardEligibilityIndicator) {
		ScorecardEligibilityIndicator = scorecardEligibilityIndicator;
	}
	public String getInsuredCityCode() {
		return InsuredCityCode;
	}
	public void setInsuredCityCode(String insuredCityCode) {
		InsuredCityCode = insuredCityCode;
	}
	public String getAdditionalNotes() {
		return AdditionalNotes;
	}
	public void setAdditionalNotes(String additionalNotes) {
		AdditionalNotes = additionalNotes;
	}
	public String getClaimsTrigger() {
		return ClaimsTrigger;
	}
	public void setClaimsTrigger(String claimsTrigger) {
		ClaimsTrigger = claimsTrigger;
	}
	public String getTransactionTypeCode() {
		return TransactionTypeCode;
	}
	public void setTransactionTypeCode(String transactionTypeCode) {
		TransactionTypeCode = transactionTypeCode;
	}
	public String getInsuredSocietyNumberId() {
		return InsuredSocietyNumberId;
	}
	public void setInsuredSocietyNumberId(String insuredSocietyNumberId) {
		InsuredSocietyNumberId = insuredSocietyNumberId;
	}
	public String getInsuredSlotNumber() {
		return InsuredSlotNumber;
	}
	public void setInsuredSlotNumber(String insuredSlotNumber) {
		InsuredSlotNumber = insuredSlotNumber;
	}
	public String getInsuredGroupStartDate() {
		return InsuredGroupStartDate;
	}
	public void setInsuredGroupStartDate(String insuredGroupStartDate) {
		InsuredGroupStartDate = insuredGroupStartDate;
	}
	public String getInsuredProcessCode() {
		return InsuredProcessCode;
	}
	public void setInsuredProcessCode(String insuredProcessCode) {
		InsuredProcessCode = insuredProcessCode;
	}
	public String getInsuredTerritoryCode() {
		return InsuredTerritoryCode;
	}
	public void setInsuredTerritoryCode(String insuredTerritoryCode) {
		InsuredTerritoryCode = insuredTerritoryCode;
	}
	public String getIbnrPlaceholderIndicator() {
		return IbnrPlaceholderIndicator;
	}
	public void setIbnrPlaceholderIndicator(String ibnrPlaceholderIndicator) {
		IbnrPlaceholderIndicator = ibnrPlaceholderIndicator;
	}
	public String getInsuredIsInCisIndicator() {
		return InsuredIsInCisIndicator;
	}
	public void setInsuredIsInCisIndicator(String insuredIsInCisIndicator) {
		InsuredIsInCisIndicator = insuredIsInCisIndicator;
	}
	public String getInsuredPcfParticipateIndicator() {
		return InsuredPcfParticipateIndicator;
	}
	public void setInsuredPcfParticipateIndicator(String insuredPcfParticipateIndicator) {
		InsuredPcfParticipateIndicator = insuredPcfParticipateIndicator;
	}
	public String getInsuredBlockedListIndicator() {
		return InsuredBlockedListIndicator;
	}
	public void setInsuredBlockedListIndicator(String insuredBlockedListIndicator) {
		InsuredBlockedListIndicator = insuredBlockedListIndicator;
	}
	public String getRateAsFteIndicator() {
		return RateAsFteIndicator;
	}
	public void setRateAsFteIndicator(String rateAsFteIndicator) {
		RateAsFteIndicator = rateAsFteIndicator;
	}
	public String getDisciplinaryListStatus() {
		return DisciplinaryListStatus;
	}
	public void setDisciplinaryListStatus(String disciplinaryListStatus) {
		DisciplinaryListStatus = disciplinaryListStatus;
	}
	public String getInsuredXsPolicyIndicator() {
		return InsuredXsPolicyIndicator;
	}
	public void setInsuredXsPolicyIndicator(String insuredXsPolicyIndicator) {
		InsuredXsPolicyIndicator = insuredXsPolicyIndicator;
	}
	public String getInsuredXsPolicyNumber() {
		return InsuredXsPolicyNumber;
	}
	public void setInsuredXsPolicyNumber(String insuredXsPolicyNumber) {
		InsuredXsPolicyNumber = insuredXsPolicyNumber;
	}
	public String getInsuredCount() {
		return InsuredCount;
	}
	public void setInsuredCount(String insuredCount) {
		InsuredCount = insuredCount;
	}
	public String getInsuredName() {
		return InsuredName;
	}
	public void setInsuredName(String insuredName) {
		InsuredName = insuredName;
	}
	public CancellationDetailType getCancellationDetail() {
		return CancellationDetail;
	}
	public void setCancellationDetail(CancellationDetailType cancellationDetail) {
		CancellationDetail = cancellationDetail;
	}
	public AttorneyInformationType getAttorneyInformation() {
		return AttorneyInformation;
	}
	public void setAttorneyInformation(AttorneyInformationType attorneyInformation) {
		AttorneyInformation = attorneyInformation;
	}
	public FullTimeEquivalencyInformationType getFullTimeEquivalencyInformation() {
		return FullTimeEquivalencyInformation;
	}
	public void setFullTimeEquivalencyInformation(FullTimeEquivalencyInformationType fullTimeEquivalencyInformation) {
		FullTimeEquivalencyInformation = fullTimeEquivalencyInformation;
	}
	public List<FundInformationType> getFundInformation() {
		return FundInformation;
	}
	public void setFundInformation(List<FundInformationType> fundInformation) {
		FundInformation = fundInformation;
	}
	public MalpracticeLiabilityExposureInformationType getMalpracticeLiabilityExposureInformation() {
		return MalpracticeLiabilityExposureInformation;
	}
	public void setMalpracticeLiabilityExposureInformation(
			MalpracticeLiabilityExposureInformationType malpracticeLiabilityExposureInformation) {
		MalpracticeLiabilityExposureInformation = malpracticeLiabilityExposureInformation;
	}
	public BuildingInformationType getBuildingInformation() {
		return BuildingInformation;
	}
	public void setBuildingInformation(BuildingInformationType buildingInformation) {
		BuildingInformation = buildingInformation;
	}
	public VehiclesOperatedInformationType getVehiclesOperatedInformation() {
		return VehiclesOperatedInformation;
	}
	public void setVehiclesOperatedInformation(VehiclesOperatedInformationType vehiclesOperatedInformation) {
		VehiclesOperatedInformation = vehiclesOperatedInformation;
	}
	public AdditionalInformationType getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(AdditionalInformationType additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	public InsuredVersionDetailType getInsuredVersionDetail() {
		return InsuredVersionDetail;
	}
	public void setInsuredVersionDetail(InsuredVersionDetailType insuredVersionDetail) {
		InsuredVersionDetail = insuredVersionDetail;
	}
	@Override
	public String toString() {
		return "\n\t\t\t\t[InsuredVersionNumberId=" + InsuredVersionNumberId + ", PrimaryIndicator="
				+ PrimaryIndicator + ", EffectivePeriod=" + EffectivePeriod + ", PracticeStateOrProvinceCode="
				+ PracticeStateOrProvinceCode + ", PracticeCountyCode=" + PracticeCountyCode + ", InsuredStatusCode="
				+ InsuredStatusCode + ", InsuredTypeCode=" + InsuredTypeCode + ", InsuredClassCode=" + InsuredClassCode
				+ ", InsuredSubClassCode=" + InsuredSubClassCode + ", InsuredAlternateSpecialtyCode="
				+ InsuredAlternateSpecialtyCode + ", InsuredClaimsDeductibleNumberId=" + InsuredClaimsDeductibleNumberId
				+ ", TeachingIndicator=" + TeachingIndicator + ", InsuredProcedureCode=" + InsuredProcedureCode
				+ ", InsuredMatureIndicator=" + InsuredMatureIndicator + ", InsuredMoonlightingIndicator="
				+ InsuredMoonlightingIndicator + ", InsuredMoonlightingStatus=" + InsuredMoonlightingStatus
				+ ", ClaimsMadeYear=" + ClaimsMadeYear + ", IbnrIndicator=" + IbnrIndicator + ", IbnrStatus="
				+ IbnrStatus + ", ScorecardEligibilityIndicator=" + ScorecardEligibilityIndicator + ", InsuredCityCode="
				+ InsuredCityCode + ", AdditionalNotes=" + AdditionalNotes + ", ClaimsTrigger=" + ClaimsTrigger
				+ ", TransactionTypeCode=" + TransactionTypeCode + ", InsuredSocietyNumberId=" + InsuredSocietyNumberId
				+ ", InsuredSlotNumber=" + InsuredSlotNumber + ", InsuredGroupStartDate=" + InsuredGroupStartDate
				+ ", InsuredProcessCode=" + InsuredProcessCode + ", InsuredTerritoryCode=" + InsuredTerritoryCode
				+ ", IbnrPlaceholderIndicator=" + IbnrPlaceholderIndicator + ", InsuredIsInCisIndicator="
				+ InsuredIsInCisIndicator + ", InsuredPcfParticipateIndicator=" + InsuredPcfParticipateIndicator
				+ ", InsuredBlockedListIndicator=" + InsuredBlockedListIndicator + ", RateAsFteIndicator="
				+ RateAsFteIndicator + ", DisciplinaryListStatus=" + DisciplinaryListStatus
				+ ", InsuredXsPolicyIndicator=" + InsuredXsPolicyIndicator + ", InsuredXsPolicyNumber="
				+ InsuredXsPolicyNumber + ", InsuredCount=" + InsuredCount + ", InsuredName=" + InsuredName
				+ ", CancellationDetail=" + CancellationDetail + ", AttorneyInformation=" + AttorneyInformation
				+ ", FullTimeEquivalencyInformation=" + FullTimeEquivalencyInformation + ", FundInformation="
				+ FundInformation + ", MalpracticeLiabilityExposureInformation="
				+ MalpracticeLiabilityExposureInformation + ", BuildingInformation=" + BuildingInformation
				+ ", VehiclesOperatedInformation=" + VehiclesOperatedInformation + ", AdditionalInformation="
				+ AdditionalInformation + ", InsuredVersionDetail=" + InsuredVersionDetail + "]";
	}
}
