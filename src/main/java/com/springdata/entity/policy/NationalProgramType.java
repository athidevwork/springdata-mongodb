
package com.springdata.entity.policy;

import java.io.Serializable;

public class NationalProgramType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String NationalProgramNumberId;
    protected String ProgramCode;
    protected String PrimaryIndicator;
    protected EffectivePeriodType EffectivePeriod;
    protected String RenewalIndicator;
    protected ReferredInsuredType ReferredInsured;
    protected VersionDetailType VersionDetail;
    protected String Key;
	public String getNationalProgramNumberId() {
		return NationalProgramNumberId;
	}
	public void setNationalProgramNumberId(String nationalProgramNumberId) {
		NationalProgramNumberId = nationalProgramNumberId;
	}
	public String getProgramCode() {
		return ProgramCode;
	}
	public void setProgramCode(String programCode) {
		ProgramCode = programCode;
	}
	public String getPrimaryIndicator() {
		return PrimaryIndicator;
	}
	public void setPrimaryIndicator(String primaryIndicator) {
		PrimaryIndicator = primaryIndicator;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[NationalProgramNumberId=" + NationalProgramNumberId + ", ProgramCode="
				+ ProgramCode + ", PrimaryIndicator=" + PrimaryIndicator + ", EffectivePeriod=" + EffectivePeriod
				+ ", RenewalIndicator=" + RenewalIndicator + ", ReferredInsured=" + ReferredInsured + ", VersionDetail="
				+ VersionDetail + ", Key=" + Key + "]";
	}
}
