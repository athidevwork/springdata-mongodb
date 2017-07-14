
package com.springdata.entity.policy;

import java.io.Serializable;

public class COIHolderType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CoiHolderNumberId;
    protected ReferredPartyType ReferredParty;
    protected EffectivePeriodType EffectivePeriod;
    protected String LastDateSent;
    protected String CoiHolderName;
    protected String RenewalIndicator;
    protected String AttentionOf;
    protected ReferredInsuredType ReferredInsured;
    protected String BlockedListIndicator;
    protected String Key;
    protected String PersonReference;
    protected String OrganizationReference;
    
	public String getCoiHolderNumberId() {
		return CoiHolderNumberId;
	}
	public void setCoiHolderNumberId(String coiHolderNumberId) {
		CoiHolderNumberId = coiHolderNumberId;
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
	public String getLastDateSent() {
		return LastDateSent;
	}
	public void setLastDateSent(String lastDateSent) {
		LastDateSent = lastDateSent;
	}
	public String getCoiHolderName() {
		return CoiHolderName;
	}
	public void setCoiHolderName(String coiHolderName) {
		CoiHolderName = coiHolderName;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public String getAttentionOf() {
		return AttentionOf;
	}
	public void setAttentionOf(String attentionOf) {
		AttentionOf = attentionOf;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public String getBlockedListIndicator() {
		return BlockedListIndicator;
	}
	public void setBlockedListIndicator(String blockedListIndicator) {
		BlockedListIndicator = blockedListIndicator;
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
		return "\n\t\t\t\t\t[CoiHolderNumberId=" + CoiHolderNumberId + ", ReferredParty=" + ReferredParty
				+ ", EffectivePeriod=" + EffectivePeriod + ", LastDateSent=" + LastDateSent + ", CoiHolderName="
				+ CoiHolderName + ", RenewalIndicator=" + RenewalIndicator + ", AttentionOf=" + AttentionOf
				+ ", ReferredInsured=" + ReferredInsured + ", BlockedListIndicator=" + BlockedListIndicator + ", Key="
				+ Key + ", PersonReference=" + PersonReference + ", OrganizationReference=" + OrganizationReference
				+ "]";
	}
}
