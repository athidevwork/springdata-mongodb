
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CreditStackingInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredMedicalMalpracticeCoverageType ReferredMedicalMalpracticeCoverage;
    protected List<CreditStackingHeaderInformationType> CreditStackingHeaderInformation;
    protected List<CreditStackingDetailInformationType> CreditStackingDetailInformation;
    protected String Key;
	public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
		return ReferredMedicalMalpracticeCoverage;
	}
	public void setReferredMedicalMalpracticeCoverage(
			ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage) {
		ReferredMedicalMalpracticeCoverage = referredMedicalMalpracticeCoverage;
	}
	public List<CreditStackingHeaderInformationType> getCreditStackingHeaderInformation() {
		return CreditStackingHeaderInformation;
	}
	public void setCreditStackingHeaderInformation(
			List<CreditStackingHeaderInformationType> creditStackingHeaderInformation) {
		CreditStackingHeaderInformation = creditStackingHeaderInformation;
	}
	public List<CreditStackingDetailInformationType> getCreditStackingDetailInformation() {
		return CreditStackingDetailInformation;
	}
	public void setCreditStackingDetailInformation(
			List<CreditStackingDetailInformationType> creditStackingDetailInformation) {
		CreditStackingDetailInformation = creditStackingDetailInformation;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[ReferredMedicalMalpracticeCoverage=" + ReferredMedicalMalpracticeCoverage
				+ ", CreditStackingHeaderInformation=" + CreditStackingHeaderInformation
				+ ", CreditStackingDetailInformation=" + CreditStackingDetailInformation + ", Key=" + Key + "]";
	}
}
