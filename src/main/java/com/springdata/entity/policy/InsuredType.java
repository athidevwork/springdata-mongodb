
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class InsuredType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String InsuredNumberId;
    protected ReferredPartyType ReferredParty;
    protected String CurrentTermAmount;
    protected String CurrentFundAmount;
    protected String MarkInsAsDdl;
    protected List<InsuredVersionType> InsuredVersion;
    protected String Key;
    protected String PersonReference;
    protected String OrganizationReference;
    protected String PropertyReference;
	public String getInsuredNumberId() {
		return InsuredNumberId;
	}
	public void setInsuredNumberId(String insuredNumberId) {
		InsuredNumberId = insuredNumberId;
	}
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public String getCurrentTermAmount() {
		return CurrentTermAmount;
	}
	public void setCurrentTermAmount(String currentTermAmount) {
		CurrentTermAmount = currentTermAmount;
	}
	public String getCurrentFundAmount() {
		return CurrentFundAmount;
	}
	public void setCurrentFundAmount(String currentFundAmount) {
		CurrentFundAmount = currentFundAmount;
	}
	public String getMarkInsAsDdl() {
		return MarkInsAsDdl;
	}
	public void setMarkInsAsDdl(String markInsAsDdl) {
		MarkInsAsDdl = markInsAsDdl;
	}
	public List<InsuredVersionType> getInsuredVersion() {
		return InsuredVersion;
	}
	public void setInsuredVersion(List<InsuredVersionType> insuredVersion) {
		InsuredVersion = insuredVersion;
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
	public String getPropertyReference() {
		return PropertyReference;
	}
	public void setPropertyReference(String propertyReference) {
		PropertyReference = propertyReference;
	}
	@Override
	public String toString() {
		return "\n\t\t\t[InsuredNumberId=" + InsuredNumberId + ", ReferredParty=" + ReferredParty
				+ ", CurrentTermAmount=" + CurrentTermAmount + ", CurrentFundAmount=" + CurrentFundAmount
				+ ", MarkInsAsDdl=" + MarkInsAsDdl + ", InsuredVersion=" + InsuredVersion + ", Key=" + Key
				+ ", PersonReference=" + PersonReference + ", OrganizationReference=" + OrganizationReference
				+ ", PropertyReference=" + PropertyReference + "]";
	}
}
