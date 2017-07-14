
package com.springdata.entity.policy;

import java.io.Serializable;

public class FTERiskNamesInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FteRiskNamesInformationNumberId;
    protected ReferredPartyType ReferredParty;
    protected EffectivePeriodType EffectivePeriod;
    protected String SlotId;
    protected String FteRiskName;
    protected String CurrStatusCode;
    protected String RenewalIndicator;
    protected String Degree;
    protected String FteStatus;
    protected String TerminationDate;
    protected String ActualHours;
    protected String EmploymentStatus;
    protected ReferredInsuredType ReferredInsured;
    protected VersionDetailType VersionDetail;
    protected String Key;
    protected String PersonReference;
    protected String OrganizationReference;
	public String getFteRiskNamesInformationNumberId() {
		return FteRiskNamesInformationNumberId;
	}
	public void setFteRiskNamesInformationNumberId(String fteRiskNamesInformationNumberId) {
		FteRiskNamesInformationNumberId = fteRiskNamesInformationNumberId;
	}
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getSlotId() {
		return SlotId;
	}
	public void setSlotId(String slotId) {
		SlotId = slotId;
	}
	public String getFteRiskName() {
		return FteRiskName;
	}
	public void setFteRiskName(String fteRiskName) {
		FteRiskName = fteRiskName;
	}
	public String getCurrStatusCode() {
		return CurrStatusCode;
	}
	public void setCurrStatusCode(String currStatusCode) {
		CurrStatusCode = currStatusCode;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getFteStatus() {
		return FteStatus;
	}
	public void setFteStatus(String fteStatus) {
		FteStatus = fteStatus;
	}
	public String getTerminationDate() {
		return TerminationDate;
	}
	public void setTerminationDate(String terminationDate) {
		TerminationDate = terminationDate;
	}
	public String getActualHours() {
		return ActualHours;
	}
	public void setActualHours(String actualHours) {
		ActualHours = actualHours;
	}
	public String getEmploymentStatus() {
		return EmploymentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		EmploymentStatus = employmentStatus;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public VersionDetailType getVersionDetail() {
		return VersionDetail;
	}
	public void setVersionDetail(VersionDetailType versionDetail) {
		VersionDetail = versionDetail;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public String getPersonReference() {
		return PersonReference;
	}
	public void setPersonReference(String personReference) {
		PersonReference = personReference;
	}
	public String getOrganizationReference() {
		return OrganizationReference;
	}
	public void setOrganizationReference(String organizationReference) {
		OrganizationReference = organizationReference;
	}
	@Override
	public String toString() {
		return "[FteRiskNamesInformationNumberId=" + FteRiskNamesInformationNumberId
				+ ", ReferredParty=" + ReferredParty + ", EffectivePeriod=" + EffectivePeriod + ", SlotId=" + SlotId
				+ ", FteRiskName=" + FteRiskName + ", CurrStatusCode=" + CurrStatusCode + ", RenewalIndicator="
				+ RenewalIndicator + ", Degree=" + Degree + ", FteStatus=" + FteStatus + ", TerminationDate="
				+ TerminationDate + ", ActualHours=" + ActualHours + ", EmploymentStatus=" + EmploymentStatus
				+ ", ReferredInsured=" + ReferredInsured + ", VersionDetail=" + VersionDetail + ", Key=" + Key
				+ ", PersonReference=" + PersonReference + ", OrganizationReference=" + OrganizationReference + "]";
	}
}
