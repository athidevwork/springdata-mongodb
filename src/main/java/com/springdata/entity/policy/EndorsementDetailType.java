
package com.springdata.entity.policy;

import java.io.Serializable;

public class EndorsementDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String VariableTextDetailNumberId;
    protected String VersionModeCode;
    protected EffectivePeriodType EffectivePeriod;
    protected String CategoryVal;
    protected String RenewalIndicator;
    protected AdditionalInformationType AdditionalInformation;
	public String getVariableTextDetailNumberId() {
		return VariableTextDetailNumberId;
	}
	public void setVariableTextDetailNumberId(String variableTextDetailNumberId) {
		VariableTextDetailNumberId = variableTextDetailNumberId;
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
	public String getCategoryVal() {
		return CategoryVal;
	}
	public void setCategoryVal(String categoryVal) {
		CategoryVal = categoryVal;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public AdditionalInformationType getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(AdditionalInformationType additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	@Override
	public String toString() {
		return "[VariableTextDetailNumberId=" + VariableTextDetailNumberId + ", VersionModeCode="
				+ VersionModeCode + ", EffectivePeriod=" + EffectivePeriod + ", CategoryVal=" + CategoryVal
				+ ", RenewalIndicator=" + RenewalIndicator + ", AdditionalInformation=" + AdditionalInformation + "]";
	}
}
