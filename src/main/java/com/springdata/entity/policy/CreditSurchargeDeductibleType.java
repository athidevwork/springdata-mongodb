
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class CreditSurchargeDeductibleType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CreditSurchargeDeductibleNumberId;
    protected ReferredMedicalMalpracticeCoverageType ReferredMedicalMalpracticeCoverage;
    protected String CreditSurchargeDeductibleCodeNumberId;
    protected String CurrentTermAmount;
    protected CreditSurchargeDeductibleCodeType CreditSurchargeDeductibleCode;
    protected CreditSurchargeDeductibleTypeCodeType CreditSurchargeDeductibleTypeCode;
    protected List<CreditSurchargeDeductibleVersionType> CreditSurchargeDeductibleVersion;
    protected String Key;
    
	public String getCreditSurchargeDeductibleNumberId() {
		return CreditSurchargeDeductibleNumberId;
	}
	public void setCreditSurchargeDeductibleNumberId(String creditSurchargeDeductibleNumberId) {
		CreditSurchargeDeductibleNumberId = creditSurchargeDeductibleNumberId;
	}
	public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
		return ReferredMedicalMalpracticeCoverage;
	}
	public void setReferredMedicalMalpracticeCoverage(
			ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage) {
		ReferredMedicalMalpracticeCoverage = referredMedicalMalpracticeCoverage;
	}
	public String getCreditSurchargeDeductibleCodeNumberId() {
		return CreditSurchargeDeductibleCodeNumberId;
	}
	public void setCreditSurchargeDeductibleCodeNumberId(String creditSurchargeDeductibleCodeNumberId) {
		CreditSurchargeDeductibleCodeNumberId = creditSurchargeDeductibleCodeNumberId;
	}
	public String getCurrentTermAmount() {
		return CurrentTermAmount;
	}
	public void setCurrentTermAmount(String currentTermAmount) {
		CurrentTermAmount = currentTermAmount;
	}
	public CreditSurchargeDeductibleCodeType getCreditSurchargeDeductibleCode() {
		return CreditSurchargeDeductibleCode;
	}
	public void setCreditSurchargeDeductibleCode(CreditSurchargeDeductibleCodeType creditSurchargeDeductibleCode) {
		CreditSurchargeDeductibleCode = creditSurchargeDeductibleCode;
	}
	public CreditSurchargeDeductibleTypeCodeType getCreditSurchargeDeductibleTypeCode() {
		return CreditSurchargeDeductibleTypeCode;
	}
	public void setCreditSurchargeDeductibleTypeCode(
			CreditSurchargeDeductibleTypeCodeType creditSurchargeDeductibleTypeCode) {
		CreditSurchargeDeductibleTypeCode = creditSurchargeDeductibleTypeCode;
	}
	public List<CreditSurchargeDeductibleVersionType> getCreditSurchargeDeductibleVersion() {
		return CreditSurchargeDeductibleVersion;
	}
	public void setCreditSurchargeDeductibleVersion(
			List<CreditSurchargeDeductibleVersionType> creditSurchargeDeductibleVersion) {
		CreditSurchargeDeductibleVersion = creditSurchargeDeductibleVersion;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "\n\t\t\t[CreditSurchargeDeductibleNumberId=" + CreditSurchargeDeductibleNumberId
				+ ", ReferredMedicalMalpracticeCoverage=" + ReferredMedicalMalpracticeCoverage
				+ ", CreditSurchargeDeductibleCodeNumberId=" + CreditSurchargeDeductibleCodeNumberId
				+ ", CurrentTermAmount=" + CurrentTermAmount + ", CreditSurchargeDeductibleCode="
				+ CreditSurchargeDeductibleCode + ", CreditSurchargeDeductibleTypeCode="
				+ CreditSurchargeDeductibleTypeCode + ", CreditSurchargeDeductibleVersion="
				+ CreditSurchargeDeductibleVersion + ", Key=" + Key + "]";
	}
}
