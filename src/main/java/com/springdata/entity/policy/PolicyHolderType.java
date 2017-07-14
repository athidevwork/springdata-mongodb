
package com.springdata.entity.policy;

import java.io.Serializable;

public class PolicyHolderType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredPartyType ReferredParty;
    protected String PersonReference;
    protected String OrganizationReference;
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
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
		return "[ReferredParty=" + ReferredParty + ", PersonReference=" + PersonReference
				+ ", OrganizationReference=" + OrganizationReference + "]";
	}
}
