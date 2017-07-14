
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class ProducerType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ProducerNumberId;
    protected String ProducerAgentName;
    protected EffectivePeriodType EffectivePeriod;
    protected ReferredPartyType ReferredParty;
    protected List<LicenseType> License;
    protected List<CommissionType> Commission;
    protected String ProducerChangeTypeCode;
    protected String ProducerAuthorizationCode;
    protected String ProducerAgentTypeCode;
    protected String SpecialCondition;
    protected String AgentNote;
    protected String OverrideB;
    protected String PersonReference;
    protected String OrganizationReference;
	public String getProducerNumberId() {
		return ProducerNumberId;
	}
	public void setProducerNumberId(String producerNumberId) {
		ProducerNumberId = producerNumberId;
	}
	public String getProducerAgentName() {
		return ProducerAgentName;
	}
	public void setProducerAgentName(String producerAgentName) {
		ProducerAgentName = producerAgentName;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public List<LicenseType> getLicense() {
		return License;
	}
	public void setLicense(List<LicenseType> license) {
		License = license;
	}
	public List<CommissionType> getCommission() {
		return Commission;
	}
	public void setCommission(List<CommissionType> commission) {
		Commission = commission;
	}
	public String getProducerChangeTypeCode() {
		return ProducerChangeTypeCode;
	}
	public void setProducerChangeTypeCode(String producerChangeTypeCode) {
		ProducerChangeTypeCode = producerChangeTypeCode;
	}
	public String getProducerAuthorizationCode() {
		return ProducerAuthorizationCode;
	}
	public void setProducerAuthorizationCode(String producerAuthorizationCode) {
		ProducerAuthorizationCode = producerAuthorizationCode;
	}
	public String getProducerAgentTypeCode() {
		return ProducerAgentTypeCode;
	}
	public void setProducerAgentTypeCode(String producerAgentTypeCode) {
		ProducerAgentTypeCode = producerAgentTypeCode;
	}
	public String getSpecialCondition() {
		return SpecialCondition;
	}
	public void setSpecialCondition(String specialCondition) {
		SpecialCondition = specialCondition;
	}
	public String getAgentNote() {
		return AgentNote;
	}
	public void setAgentNote(String agentNote) {
		AgentNote = agentNote;
	}
	public String getOverrideB() {
		return OverrideB;
	}
	public void setOverrideB(String overrideB) {
		OverrideB = overrideB;
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
		return "[ProducerNumberId=" + ProducerNumberId + ", ProducerAgentName=" + ProducerAgentName
				+ ", EffectivePeriod=" + EffectivePeriod + ", ReferredParty=" + ReferredParty + ", License=" + License
				+ ", Commission=" + Commission + ", ProducerChangeTypeCode=" + ProducerChangeTypeCode
				+ ", ProducerAuthorizationCode=" + ProducerAuthorizationCode + ", ProducerAgentTypeCode="
				+ ProducerAgentTypeCode + ", SpecialCondition=" + SpecialCondition + ", AgentNote=" + AgentNote
				+ ", OverrideB=" + OverrideB + ", PersonReference=" + PersonReference + ", OrganizationReference="
				+ OrganizationReference + "]";
	}
}
