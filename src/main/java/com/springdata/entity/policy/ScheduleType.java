
package com.springdata.entity.policy;

import java.io.Serializable;

public class ScheduleType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ScheduleNumberId;
    protected ReferredPartyType ReferredParty;
    protected String LocumTenen;
    protected String Degree;
    protected EffectivePeriodType EffectivePeriod;
    protected ReferredInsuredType ReferredInsured;
    protected String RenewalIndicator;
    protected String BlockedListIndicator;
    protected VersionDetailType VersionDetail;
    protected String Key;
    protected String PersonReference;
    protected String OrganizationReference;
	public String getScheduleNumberId() {
		return ScheduleNumberId;
	}
	public void setScheduleNumberId(String scheduleNumberId) {
		ScheduleNumberId = scheduleNumberId;
	}
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public String getLocumTenen() {
		return LocumTenen;
	}
	public void setLocumTenen(String locumTenen) {
		LocumTenen = locumTenen;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public String getBlockedListIndicator() {
		return BlockedListIndicator;
	}
	public void setBlockedListIndicator(String blockedListIndicator) {
		BlockedListIndicator = blockedListIndicator;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[ScheduleNumberId=" + ScheduleNumberId + ", ReferredParty=" + ReferredParty
				+ ", LocumTenen=" + LocumTenen + ", Degree=" + Degree + ", EffectivePeriod=" + EffectivePeriod
				+ ", ReferredInsured=" + ReferredInsured + ", RenewalIndicator=" + RenewalIndicator
				+ ", BlockedListIndicator=" + BlockedListIndicator + ", VersionDetail=" + VersionDetail + ", Key=" + Key
				+ ", PersonReference=" + PersonReference + ", OrganizationReference=" + OrganizationReference + "]";
	}
}
