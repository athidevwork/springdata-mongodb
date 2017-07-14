
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class EndorsementListType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String VariableTextNumberId;
    protected ReferredInsuredType ReferredInsured;
    protected String VersionModeCode;
    protected EffectivePeriodType EffectivePeriod;
    protected String GroupType;
    protected String Category;
    protected String RetroDate;
    protected String TerminationDate;
    protected String RenewalIndicator;
    protected List<EndorsementDetailType> EndorsementDetail;
	public String getVariableTextNumberId() {
		return VariableTextNumberId;
	}
	public void setVariableTextNumberId(String variableTextNumberId) {
		VariableTextNumberId = variableTextNumberId;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public String getVersionModeCode() {
		return VersionModeCode;
	}
	public void setVersionModeCode(String versionModeCode) {
		VersionModeCode = versionModeCode;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getGroupType() {
		return GroupType;
	}
	public void setGroupType(String groupType) {
		GroupType = groupType;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getRetroDate() {
		return RetroDate;
	}
	public void setRetroDate(String retroDate) {
		RetroDate = retroDate;
	}
	public String getTerminationDate() {
		return TerminationDate;
	}
	public void setTerminationDate(String terminationDate) {
		TerminationDate = terminationDate;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public List<EndorsementDetailType> getEndorsementDetail() {
		return EndorsementDetail;
	}
	public void setEndorsementDetail(List<EndorsementDetailType> endorsementDetail) {
		EndorsementDetail = endorsementDetail;
	}
	@Override
	public String toString() {
		return "[VariableTextNumberId=" + VariableTextNumberId + ", ReferredInsured="
				+ ReferredInsured + ", VersionModeCode=" + VersionModeCode + ", EffectivePeriod=" + EffectivePeriod
				+ ", GroupType=" + GroupType + ", Category=" + Category + ", RetroDate=" + RetroDate
				+ ", TerminationDate=" + TerminationDate + ", RenewalIndicator=" + RenewalIndicator
				+ ", EndorsementDetail=" + EndorsementDetail + "]";
	}
}
