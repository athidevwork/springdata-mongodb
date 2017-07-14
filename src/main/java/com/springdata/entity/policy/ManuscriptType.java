
package com.springdata.entity.policy;

import java.io.Serializable;

public class ManuscriptType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ManuscriptNumberId;
    protected ReferredMedicalMalpracticeCoverageType ReferredMedicalMalpracticeCoverage;
    protected String FormType;
    protected String FormCode;
    protected EffectivePeriodType EffectivePeriod;
    protected String RenewalIndicator;
    protected VersionDetailType VersionDetail;
    protected String AddlText;
    protected String PremiumForm;
    protected String DetailIndicator;
    protected String Key;
	public String getManuscriptNumberId() {
		return ManuscriptNumberId;
	}
	public void setManuscriptNumberId(String manuscriptNumberId) {
		ManuscriptNumberId = manuscriptNumberId;
	}
	public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
		return ReferredMedicalMalpracticeCoverage;
	}
	public void setReferredMedicalMalpracticeCoverage(
			ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage) {
		ReferredMedicalMalpracticeCoverage = referredMedicalMalpracticeCoverage;
	}
	public String getFormType() {
		return FormType;
	}
	public void setFormType(String formType) {
		FormType = formType;
	}
	public String getFormCode() {
		return FormCode;
	}
	public void setFormCode(String formCode) {
		FormCode = formCode;
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
	public VersionDetailType getVersionDetail() {
		return VersionDetail;
	}
	public void setVersionDetail(VersionDetailType versionDetail) {
		VersionDetail = versionDetail;
	}
	public String getAddlText() {
		return AddlText;
	}
	public void setAddlText(String addlText) {
		AddlText = addlText;
	}
	public String getPremiumForm() {
		return PremiumForm;
	}
	public void setPremiumForm(String premiumForm) {
		PremiumForm = premiumForm;
	}
	public String getDetailIndicator() {
		return DetailIndicator;
	}
	public void setDetailIndicator(String detailIndicator) {
		DetailIndicator = detailIndicator;
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
		return "[ManuscriptNumberId=" + ManuscriptNumberId + ", ReferredMedicalMalpracticeCoverage="
				+ ReferredMedicalMalpracticeCoverage + ", FormType=" + FormType + ", FormCode=" + FormCode
				+ ", EffectivePeriod=" + EffectivePeriod + ", RenewalIndicator=" + RenewalIndicator + ", VersionDetail="
				+ VersionDetail + ", AddlText=" + AddlText + ", PremiumForm=" + PremiumForm + ", DetailIndicator="
				+ DetailIndicator + ", Key=" + Key + "]";
	}
}
