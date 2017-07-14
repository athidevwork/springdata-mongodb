
package com.springdata.entity.policy;

import java.io.Serializable;

public class InsurerType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredPartyType ReferredParty;
    protected String UnderWriterName;
    protected EffectivePeriodType EffectivePeriod;
    protected String InsurerNumberId;
    protected String RenewalIndicator;
    protected String RegionalTeamCode;
    protected String ClosingTransLogId;
    protected String PersonReference;
    protected String OrganizationReference;
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public String getUnderWriterName() {
		return UnderWriterName;
	}
	public void setUnderWriterName(String underWriterName) {
		UnderWriterName = underWriterName;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getInsurerNumberId() {
		return InsurerNumberId;
	}
	public void setInsurerNumberId(String insurerNumberId) {
		InsurerNumberId = insurerNumberId;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public String getRegionalTeamCode() {
		return RegionalTeamCode;
	}
	public void setRegionalTeamCode(String regionalTeamCode) {
		RegionalTeamCode = regionalTeamCode;
	}
	public String getClosingTransLogId() {
		return ClosingTransLogId;
	}
	public void setClosingTransLogId(String closingTransLogId) {
		ClosingTransLogId = closingTransLogId;
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
		return "[ReferredParty=" + ReferredParty + ", UnderWriterName=" + UnderWriterName
				+ ", EffectivePeriod=" + EffectivePeriod + ", InsurerNumberId=" + InsurerNumberId
				+ ", RenewalIndicator=" + RenewalIndicator + ", RegionalTeamCode=" + RegionalTeamCode
				+ ", ClosingTransLogId=" + ClosingTransLogId + ", PersonReference=" + PersonReference
				+ ", OrganizationReference=" + OrganizationReference + "]";
	}
}
