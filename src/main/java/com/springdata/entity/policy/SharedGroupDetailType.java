
package com.springdata.entity.policy;

import java.io.Serializable;

public class SharedGroupDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String SharedGroupDetailId;
    protected ReferredInsuredType ReferredInsured;
    protected ReferredMedicalMalpracticeCoverageType ReferredMedicalMalpracticeCoverage;
    protected String OwnerIndicator;
    protected EffectivePeriodType EffectivePeriod;
    protected String RenewalIndicator;
    protected String ShareLimitIndicator;
    protected String RiskPrimaryIndicator;
    protected String CovgSeqNumber;
    protected VersionDetailType VersionDetail;
	public String getSharedGroupDetailId() {
		return SharedGroupDetailId;
	}
	public void setSharedGroupDetailId(String sharedGroupDetailId) {
		SharedGroupDetailId = sharedGroupDetailId;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
		return ReferredMedicalMalpracticeCoverage;
	}
	public void setReferredMedicalMalpracticeCoverage(
			ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage) {
		ReferredMedicalMalpracticeCoverage = referredMedicalMalpracticeCoverage;
	}
	public String getOwnerIndicator() {
		return OwnerIndicator;
	}
	public void setOwnerIndicator(String ownerIndicator) {
		OwnerIndicator = ownerIndicator;
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
	public String getShareLimitIndicator() {
		return ShareLimitIndicator;
	}
	public void setShareLimitIndicator(String shareLimitIndicator) {
		ShareLimitIndicator = shareLimitIndicator;
	}
	public String getRiskPrimaryIndicator() {
		return RiskPrimaryIndicator;
	}
	public void setRiskPrimaryIndicator(String riskPrimaryIndicator) {
		RiskPrimaryIndicator = riskPrimaryIndicator;
	}
	public String getCovgSeqNumber() {
		return CovgSeqNumber;
	}
	public void setCovgSeqNumber(String covgSeqNumber) {
		CovgSeqNumber = covgSeqNumber;
	}
	public VersionDetailType getVersionDetail() {
		return VersionDetail;
	}
	public void setVersionDetail(VersionDetailType versionDetail) {
		VersionDetail = versionDetail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[SharedGroupDetailId=" + SharedGroupDetailId + ", ReferredInsured="
				+ ReferredInsured + ", ReferredMedicalMalpracticeCoverage=" + ReferredMedicalMalpracticeCoverage
				+ ", OwnerIndicator=" + OwnerIndicator + ", EffectivePeriod=" + EffectivePeriod + ", RenewalIndicator="
				+ RenewalIndicator + ", ShareLimitIndicator=" + ShareLimitIndicator + ", RiskPrimaryIndicator="
				+ RiskPrimaryIndicator + ", CovgSeqNumber=" + CovgSeqNumber + ", VersionDetail=" + VersionDetail + "]";
	}
}
