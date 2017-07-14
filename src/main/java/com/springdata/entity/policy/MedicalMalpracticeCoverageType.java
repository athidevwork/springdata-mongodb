
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class MedicalMalpracticeCoverageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CoverageNumberId;
    protected String ParentCoverageNumberId;
    protected String CurrentTermAmount;
    protected String CurrentGrossTermAmount;
    protected String CurrentFundAmount;
    protected String CurrentGrossFundAmount;
    protected MedicalMalpracticeCoverageCodeType MedicalMalpracticeCoverageCode;
    protected ReferredInsuredType ReferredInsured;
    protected List<MedicalMalpracticeCoverageVersionType> MedicalMalpracticeCoverageVersion;
    protected String Key;
    
	public String getCoverageNumberId() {
		return CoverageNumberId;
	}
	public void setCoverageNumberId(String coverageNumberId) {
		CoverageNumberId = coverageNumberId;
	}
	public String getParentCoverageNumberId() {
		return ParentCoverageNumberId;
	}
	public void setParentCoverageNumberId(String parentCoverageNumberId) {
		ParentCoverageNumberId = parentCoverageNumberId;
	}
	public String getCurrentTermAmount() {
		return CurrentTermAmount;
	}
	public void setCurrentTermAmount(String currentTermAmount) {
		CurrentTermAmount = currentTermAmount;
	}
	public String getCurrentGrossTermAmount() {
		return CurrentGrossTermAmount;
	}
	public void setCurrentGrossTermAmount(String currentGrossTermAmount) {
		CurrentGrossTermAmount = currentGrossTermAmount;
	}
	public String getCurrentFundAmount() {
		return CurrentFundAmount;
	}
	public void setCurrentFundAmount(String currentFundAmount) {
		CurrentFundAmount = currentFundAmount;
	}
	public String getCurrentGrossFundAmount() {
		return CurrentGrossFundAmount;
	}
	public void setCurrentGrossFundAmount(String currentGrossFundAmount) {
		CurrentGrossFundAmount = currentGrossFundAmount;
	}
	public MedicalMalpracticeCoverageCodeType getMedicalMalpracticeCoverageCode() {
		return MedicalMalpracticeCoverageCode;
	}
	public void setMedicalMalpracticeCoverageCode(MedicalMalpracticeCoverageCodeType medicalMalpracticeCoverageCode) {
		MedicalMalpracticeCoverageCode = medicalMalpracticeCoverageCode;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public List<MedicalMalpracticeCoverageVersionType> getMedicalMalpracticeCoverageVersion() {
		return MedicalMalpracticeCoverageVersion;
	}
	public void setMedicalMalpracticeCoverageVersion(
			List<MedicalMalpracticeCoverageVersionType> medicalMalpracticeCoverageVersion) {
		MedicalMalpracticeCoverageVersion = medicalMalpracticeCoverageVersion;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "\n\t\t\t[CoverageNumberId=" + CoverageNumberId + ", ParentCoverageNumberId="
				+ ParentCoverageNumberId + ", CurrentTermAmount=" + CurrentTermAmount + ", CurrentGrossTermAmount="
				+ CurrentGrossTermAmount + ", CurrentFundAmount=" + CurrentFundAmount + ", CurrentGrossFundAmount="
				+ CurrentGrossFundAmount + ", MedicalMalpracticeCoverageCode=" + MedicalMalpracticeCoverageCode
				+ ", ReferredInsured=" + ReferredInsured + ", MedicalMalpracticeCoverageVersion="
				+ MedicalMalpracticeCoverageVersion + ", Key=" + Key + "]";
	}
}
