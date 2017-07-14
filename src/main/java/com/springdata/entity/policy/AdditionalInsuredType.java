
package com.springdata.entity.policy;

import java.io.Serializable;

public class AdditionalInsuredType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String AdditionalInsuredNumberId;
    protected String EntityRoleNumberId;
    protected ReferredPartyType ReferredParty;
    protected EffectivePeriodType EffectivePeriod;
    protected ReferredInsuredType ReferredInsured;
    protected String Name;
    protected String Type;
    protected String RetroDate;
    protected String RenewalIndicator;
    protected String OperationDescription;
    protected String SquareFootage;
    protected String CglIndicator;
    protected String PlIndicator;
    protected String ShowExcessIndicator;
    protected String LimitApplyRule;
    protected String ShowSIRIndicator;
    protected String PrintDate;
    protected String BlockedEntityIndicator;
    protected String Key;
    protected String PersonReference;
    protected String OrganizationReference;
    
	public String getAdditionalInsuredNumberId() {
		return AdditionalInsuredNumberId;
	}
	public void setAdditionalInsuredNumberId(String additionalInsuredNumberId) {
		AdditionalInsuredNumberId = additionalInsuredNumberId;
	}
	public String getEntityRoleNumberId() {
		return EntityRoleNumberId;
	}
	public void setEntityRoleNumberId(String entityRoleNumberId) {
		EntityRoleNumberId = entityRoleNumberId;
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
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getRetroDate() {
		return RetroDate;
	}
	public void setRetroDate(String retroDate) {
		RetroDate = retroDate;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public String getOperationDescription() {
		return OperationDescription;
	}
	public void setOperationDescription(String operationDescription) {
		OperationDescription = operationDescription;
	}
	public String getSquareFootage() {
		return SquareFootage;
	}
	public void setSquareFootage(String squareFootage) {
		SquareFootage = squareFootage;
	}
	public String getCglIndicator() {
		return CglIndicator;
	}
	public void setCglIndicator(String cglIndicator) {
		CglIndicator = cglIndicator;
	}
	public String getPlIndicator() {
		return PlIndicator;
	}
	public void setPlIndicator(String plIndicator) {
		PlIndicator = plIndicator;
	}
	public String getShowExcessIndicator() {
		return ShowExcessIndicator;
	}
	public void setShowExcessIndicator(String showExcessIndicator) {
		ShowExcessIndicator = showExcessIndicator;
	}
	public String getLimitApplyRule() {
		return LimitApplyRule;
	}
	public void setLimitApplyRule(String limitApplyRule) {
		LimitApplyRule = limitApplyRule;
	}
	public String getShowSIRIndicator() {
		return ShowSIRIndicator;
	}
	public void setShowSIRIndicator(String showSIRIndicator) {
		ShowSIRIndicator = showSIRIndicator;
	}
	public String getPrintDate() {
		return PrintDate;
	}
	public void setPrintDate(String printDate) {
		PrintDate = printDate;
	}
	public String getBlockedEntityIndicator() {
		return BlockedEntityIndicator;
	}
	public void setBlockedEntityIndicator(String blockedEntityIndicator) {
		BlockedEntityIndicator = blockedEntityIndicator;
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
		return "\n\t\t\t\t\t[AdditionalInsuredNumberId=" + AdditionalInsuredNumberId + ", EntityRoleNumberId="
				+ EntityRoleNumberId + ", ReferredParty=" + ReferredParty + ", EffectivePeriod=" + EffectivePeriod
				+ ", ReferredInsured=" + ReferredInsured + ", Name=" + Name + ", Type=" + Type + ", RetroDate="
				+ RetroDate + ", RenewalIndicator=" + RenewalIndicator + ", OperationDescription="
				+ OperationDescription + ", SquareFootage=" + SquareFootage + ", CglIndicator=" + CglIndicator
				+ ", PlIndicator=" + PlIndicator + ", ShowExcessIndicator=" + ShowExcessIndicator + ", LimitApplyRule="
				+ LimitApplyRule + ", ShowSIRIndicator=" + ShowSIRIndicator + ", PrintDate=" + PrintDate
				+ ", BlockedEntityIndicator=" + BlockedEntityIndicator + ", Key=" + Key + ", PersonReference="
				+ PersonReference + ", OrganizationReference=" + OrganizationReference + "]";
	}
}
