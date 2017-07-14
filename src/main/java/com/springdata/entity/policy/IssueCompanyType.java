
package com.springdata.entity.policy;

import java.io.Serializable;

public class IssueCompanyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredPartyType ReferredParty;
    protected ControllingStateOrProvinceCodeType ControllingStateOrProvinceCode;
    protected String ReferralCode;
    protected ProcessLocationCodeType ProcessLocationCode;
    protected String OrganizationReference;
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public ControllingStateOrProvinceCodeType getControllingStateOrProvinceCode() {
		return ControllingStateOrProvinceCode;
	}
	public void setControllingStateOrProvinceCode(ControllingStateOrProvinceCodeType controllingStateOrProvinceCode) {
		ControllingStateOrProvinceCode = controllingStateOrProvinceCode;
	}
	public String getReferralCode() {
		return ReferralCode;
	}
	public void setReferralCode(String referralCode) {
		ReferralCode = referralCode;
	}
	public ProcessLocationCodeType getProcessLocationCode() {
		return ProcessLocationCode;
	}
	public void setProcessLocationCode(ProcessLocationCodeType processLocationCode) {
		ProcessLocationCode = processLocationCode;
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
		return "[ReferredParty=" + ReferredParty + ", ControllingStateOrProvinceCode="
				+ ControllingStateOrProvinceCode + ", ReferralCode=" + ReferralCode + ", ProcessLocationCode="
				+ ProcessLocationCode + ", OrganizationReference=" + OrganizationReference + "]";
	}
}
