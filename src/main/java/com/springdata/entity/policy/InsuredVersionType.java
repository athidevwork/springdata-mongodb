
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InsuredVersionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String insuredVersionNumberId;
    protected String primaryIndicator;
    protected EffectivePeriodType effectivePeriod;
    protected PracticeStateOrProvinceCodeType practiceStateOrProvinceCode;
    protected PracticeCountyCodeType practiceCountyCode;
    protected String insuredStatusCode;
    protected InsuredTypeCodeType insuredTypeCode;
    protected InsuredClassCodeType insuredClassCode;
    protected String insuredSubClassCode;
    protected String insuredAlternateSpecialtyCode;
    protected String insuredClaimsDeductibleNumberId;
    protected String teachingIndicator;
    protected String insuredProcedureCode;
    protected String insuredMatureIndicator;
    protected String insuredMoonlightingIndicator;
    protected String insuredMoonlightingStatus;
    protected String claimsMadeYear;
    protected String ibnrIndicator;
    protected String ibnrStatus;
    protected String scorecardEligibilityIndicator;
    protected String insuredCityCode;
    protected String additionalNotes;
    protected String claimsTrigger;
    protected String transactionTypeCode;
    protected String insuredSocietyNumberId;
    protected String insuredSlotNumber;
    protected String insuredGroupStartDate;
    protected String insuredProcessCode;
    protected String insuredTerritoryCode;
    protected String ibnrPlaceholderIndicator;
    protected String insuredIsInCisIndicator;
    protected String insuredPcfParticipateIndicator;
    protected String insuredBlockedListIndicator;
    protected String rateAsFteIndicator;
    protected String disciplinaryListStatus;
    protected String insuredXsPolicyIndicator;
    protected String insuredXsPolicyNumber;
    protected String insuredCount;
    protected String insuredName;
    protected CancellationDetailType cancellationDetail;
    protected AttorneyInformationType attorneyInformation;
    protected FullTimeEquivalencyInformationType fullTimeEquivalencyInformation;
    protected List<FundInformationType> fundInformation;
    protected MalpracticeLiabilityExposureInformationType malpracticeLiabilityExposureInformation;
    protected BuildingInformationType buildingInformation;
    protected VehiclesOperatedInformationType vehiclesOperatedInformation;
    protected AdditionalInformationType additionalInformation;
    protected InsuredVersionDetailType insuredVersionDetail;

    /**
     * Gets the value of the insuredVersionNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredVersionNumberId() {
        return insuredVersionNumberId;
    }

    /**
     * Sets the value of the insuredVersionNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredVersionNumberId(String value) {
        this.insuredVersionNumberId = value;
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
     * Gets the value of the practiceStateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link PracticeStateOrProvinceCodeType }
     *     
     */
    public PracticeStateOrProvinceCodeType getPracticeStateOrProvinceCode() {
        return practiceStateOrProvinceCode;
    }

    /**
     * Sets the value of the practiceStateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PracticeStateOrProvinceCodeType }
     *     
     */
    public void setPracticeStateOrProvinceCode(PracticeStateOrProvinceCodeType value) {
        this.practiceStateOrProvinceCode = value;
    }

    /**
     * Gets the value of the practiceCountyCode property.
     * 
     * @return
     *     possible object is
     *     {@link PracticeCountyCodeType }
     *     
     */
    public PracticeCountyCodeType getPracticeCountyCode() {
        return practiceCountyCode;
    }

    /**
     * Sets the value of the practiceCountyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PracticeCountyCodeType }
     *     
     */
    public void setPracticeCountyCode(PracticeCountyCodeType value) {
        this.practiceCountyCode = value;
    }

    /**
     * Gets the value of the insuredStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredStatusCode() {
        return insuredStatusCode;
    }

    /**
     * Sets the value of the insuredStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredStatusCode(String value) {
        this.insuredStatusCode = value;
    }

    /**
     * Gets the value of the insuredTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link InsuredTypeCodeType }
     *     
     */
    public InsuredTypeCodeType getInsuredTypeCode() {
        return insuredTypeCode;
    }

    /**
     * Sets the value of the insuredTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuredTypeCodeType }
     *     
     */
    public void setInsuredTypeCode(InsuredTypeCodeType value) {
        this.insuredTypeCode = value;
    }

    /**
     * Gets the value of the insuredClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link InsuredClassCodeType }
     *     
     */
    public InsuredClassCodeType getInsuredClassCode() {
        return insuredClassCode;
    }

    /**
     * Sets the value of the insuredClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuredClassCodeType }
     *     
     */
    public void setInsuredClassCode(InsuredClassCodeType value) {
        this.insuredClassCode = value;
    }

    /**
     * Gets the value of the insuredSubClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredSubClassCode() {
        return insuredSubClassCode;
    }

    /**
     * Sets the value of the insuredSubClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredSubClassCode(String value) {
        this.insuredSubClassCode = value;
    }

    /**
     * Gets the value of the insuredAlternateSpecialtyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredAlternateSpecialtyCode() {
        return insuredAlternateSpecialtyCode;
    }

    /**
     * Sets the value of the insuredAlternateSpecialtyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredAlternateSpecialtyCode(String value) {
        this.insuredAlternateSpecialtyCode = value;
    }

    /**
     * Gets the value of the insuredClaimsDeductibleNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredClaimsDeductibleNumberId() {
        return insuredClaimsDeductibleNumberId;
    }

    /**
     * Sets the value of the insuredClaimsDeductibleNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredClaimsDeductibleNumberId(String value) {
        this.insuredClaimsDeductibleNumberId = value;
    }

    /**
     * Gets the value of the teachingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeachingIndicator() {
        return teachingIndicator;
    }

    /**
     * Sets the value of the teachingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeachingIndicator(String value) {
        this.teachingIndicator = value;
    }

    /**
     * Gets the value of the insuredProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredProcedureCode() {
        return insuredProcedureCode;
    }

    /**
     * Sets the value of the insuredProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredProcedureCode(String value) {
        this.insuredProcedureCode = value;
    }

    /**
     * Gets the value of the insuredMatureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredMatureIndicator() {
        return insuredMatureIndicator;
    }

    /**
     * Sets the value of the insuredMatureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredMatureIndicator(String value) {
        this.insuredMatureIndicator = value;
    }

    /**
     * Gets the value of the insuredMoonlightingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredMoonlightingIndicator() {
        return insuredMoonlightingIndicator;
    }

    /**
     * Sets the value of the insuredMoonlightingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredMoonlightingIndicator(String value) {
        this.insuredMoonlightingIndicator = value;
    }

    /**
     * Gets the value of the insuredMoonlightingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredMoonlightingStatus() {
        return insuredMoonlightingStatus;
    }

    /**
     * Sets the value of the insuredMoonlightingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredMoonlightingStatus(String value) {
        this.insuredMoonlightingStatus = value;
    }

    /**
     * Gets the value of the claimsMadeYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimsMadeYear() {
        return claimsMadeYear;
    }

    /**
     * Sets the value of the claimsMadeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimsMadeYear(String value) {
        this.claimsMadeYear = value;
    }

    /**
     * Gets the value of the ibnrIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbnrIndicator() {
        return ibnrIndicator;
    }

    /**
     * Sets the value of the ibnrIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbnrIndicator(String value) {
        this.ibnrIndicator = value;
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
     * Gets the value of the scorecardEligibilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardEligibilityIndicator() {
        return scorecardEligibilityIndicator;
    }

    /**
     * Sets the value of the scorecardEligibilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardEligibilityIndicator(String value) {
        this.scorecardEligibilityIndicator = value;
    }

    /**
     * Gets the value of the insuredCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredCityCode() {
        return insuredCityCode;
    }

    /**
     * Sets the value of the insuredCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredCityCode(String value) {
        this.insuredCityCode = value;
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
     * Gets the value of the claimsTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimsTrigger() {
        return claimsTrigger;
    }

    /**
     * Sets the value of the claimsTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimsTrigger(String value) {
        this.claimsTrigger = value;
    }

    /**
     * Gets the value of the transactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Sets the value of the transactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeCode(String value) {
        this.transactionTypeCode = value;
    }

    /**
     * Gets the value of the insuredSocietyNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredSocietyNumberId() {
        return insuredSocietyNumberId;
    }

    /**
     * Sets the value of the insuredSocietyNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredSocietyNumberId(String value) {
        this.insuredSocietyNumberId = value;
    }

    /**
     * Gets the value of the insuredSlotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredSlotNumber() {
        return insuredSlotNumber;
    }

    /**
     * Sets the value of the insuredSlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredSlotNumber(String value) {
        this.insuredSlotNumber = value;
    }

    /**
     * Gets the value of the insuredGroupStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredGroupStartDate() {
        return insuredGroupStartDate;
    }

    /**
     * Sets the value of the insuredGroupStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredGroupStartDate(String value) {
        this.insuredGroupStartDate = value;
    }

    /**
     * Gets the value of the insuredProcessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredProcessCode() {
        return insuredProcessCode;
    }

    /**
     * Sets the value of the insuredProcessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredProcessCode(String value) {
        this.insuredProcessCode = value;
    }

    /**
     * Gets the value of the insuredTerritoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredTerritoryCode() {
        return insuredTerritoryCode;
    }

    /**
     * Sets the value of the insuredTerritoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredTerritoryCode(String value) {
        this.insuredTerritoryCode = value;
    }

    /**
     * Gets the value of the ibnrPlaceholderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbnrPlaceholderIndicator() {
        return ibnrPlaceholderIndicator;
    }

    /**
     * Sets the value of the ibnrPlaceholderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbnrPlaceholderIndicator(String value) {
        this.ibnrPlaceholderIndicator = value;
    }

    /**
     * Gets the value of the insuredIsInCisIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredIsInCisIndicator() {
        return insuredIsInCisIndicator;
    }

    /**
     * Sets the value of the insuredIsInCisIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredIsInCisIndicator(String value) {
        this.insuredIsInCisIndicator = value;
    }

    /**
     * Gets the value of the insuredPcfParticipateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredPcfParticipateIndicator() {
        return insuredPcfParticipateIndicator;
    }

    /**
     * Sets the value of the insuredPcfParticipateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredPcfParticipateIndicator(String value) {
        this.insuredPcfParticipateIndicator = value;
    }

    /**
     * Gets the value of the insuredBlockedListIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredBlockedListIndicator() {
        return insuredBlockedListIndicator;
    }

    /**
     * Sets the value of the insuredBlockedListIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredBlockedListIndicator(String value) {
        this.insuredBlockedListIndicator = value;
    }

    /**
     * Gets the value of the rateAsFteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateAsFteIndicator() {
        return rateAsFteIndicator;
    }

    /**
     * Sets the value of the rateAsFteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateAsFteIndicator(String value) {
        this.rateAsFteIndicator = value;
    }

    /**
     * Gets the value of the disciplinaryListStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplinaryListStatus() {
        return disciplinaryListStatus;
    }

    /**
     * Sets the value of the disciplinaryListStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplinaryListStatus(String value) {
        this.disciplinaryListStatus = value;
    }

    /**
     * Gets the value of the insuredXsPolicyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredXsPolicyIndicator() {
        return insuredXsPolicyIndicator;
    }

    /**
     * Sets the value of the insuredXsPolicyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredXsPolicyIndicator(String value) {
        this.insuredXsPolicyIndicator = value;
    }

    /**
     * Gets the value of the insuredXsPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredXsPolicyNumber() {
        return insuredXsPolicyNumber;
    }

    /**
     * Sets the value of the insuredXsPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredXsPolicyNumber(String value) {
        this.insuredXsPolicyNumber = value;
    }

    /**
     * Gets the value of the insuredCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredCount() {
        return insuredCount;
    }

    /**
     * Sets the value of the insuredCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredCount(String value) {
        this.insuredCount = value;
    }

    /**
     * Gets the value of the insuredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredName() {
        return insuredName;
    }

    /**
     * Sets the value of the insuredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredName(String value) {
        this.insuredName = value;
    }

    /**
     * Gets the value of the cancellationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationDetailType }
     *     
     */
    public CancellationDetailType getCancellationDetail() {
        return cancellationDetail;
    }

    /**
     * Sets the value of the cancellationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationDetailType }
     *     
     */
    public void setCancellationDetail(CancellationDetailType value) {
        this.cancellationDetail = value;
    }

    /**
     * Gets the value of the attorneyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AttorneyInformationType }
     *     
     */
    public AttorneyInformationType getAttorneyInformation() {
        return attorneyInformation;
    }

    /**
     * Sets the value of the attorneyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttorneyInformationType }
     *     
     */
    public void setAttorneyInformation(AttorneyInformationType value) {
        this.attorneyInformation = value;
    }

    /**
     * Gets the value of the fullTimeEquivalencyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FullTimeEquivalencyInformationType }
     *     
     */
    public FullTimeEquivalencyInformationType getFullTimeEquivalencyInformation() {
        return fullTimeEquivalencyInformation;
    }

    /**
     * Sets the value of the fullTimeEquivalencyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullTimeEquivalencyInformationType }
     *     
     */
    public void setFullTimeEquivalencyInformation(FullTimeEquivalencyInformationType value) {
        this.fullTimeEquivalencyInformation = value;
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
        if (key.isEmpty())
            return null;
        for (FundInformationType data : fundInformation) {
            if (data.getState().equalsIgnoreCase(key))
                return data;
        }
        return null;
    }

    /**
     * Gets the value of the malpracticeLiabilityExposureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MalpracticeLiabilityExposureInformationType }
     *     
     */
    public MalpracticeLiabilityExposureInformationType getMalpracticeLiabilityExposureInformation() {
        return malpracticeLiabilityExposureInformation;
    }

    /**
     * Sets the value of the malpracticeLiabilityExposureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MalpracticeLiabilityExposureInformationType }
     *     
     */
    public void setMalpracticeLiabilityExposureInformation(MalpracticeLiabilityExposureInformationType value) {
        this.malpracticeLiabilityExposureInformation = value;
    }

    /**
     * Gets the value of the buildingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingInformationType }
     *     
     */
    public BuildingInformationType getBuildingInformation() {
        return buildingInformation;
    }

    /**
     * Sets the value of the buildingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingInformationType }
     *     
     */
    public void setBuildingInformation(BuildingInformationType value) {
        this.buildingInformation = value;
    }

    /**
     * Gets the value of the vehiclesOperatedInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclesOperatedInformationType }
     *     
     */
    public VehiclesOperatedInformationType getVehiclesOperatedInformation() {
        return vehiclesOperatedInformation;
    }

    /**
     * Sets the value of the vehiclesOperatedInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclesOperatedInformationType }
     *     
     */
    public void setVehiclesOperatedInformation(VehiclesOperatedInformationType value) {
        this.vehiclesOperatedInformation = value;
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
     * Gets the value of the insuredVersionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InsuredVersionDetailType }
     *     
     */
    public InsuredVersionDetailType getInsuredVersionDetail() {
        return insuredVersionDetail;
    }

    /**
     * Sets the value of the insuredVersionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuredVersionDetailType }
     *     
     */
    public void setInsuredVersionDetail(InsuredVersionDetailType value) {
        this.insuredVersionDetail = value;
    }

}
