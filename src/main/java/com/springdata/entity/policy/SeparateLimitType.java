
package com.springdata.entity.policy;

import java.io.Serializable;

public class SeparateLimitType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredInsuredType ReferredInsured;
    protected ReferredMedicalMalpracticeCoverageType ReferredMedicalMalpracticeCoverage;
    protected String ErosionReserve;
    protected String ErosionPaid;
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
	public String getErosionReserve() {
		return ErosionReserve;
	}
	public void setErosionReserve(String erosionReserve) {
		ErosionReserve = erosionReserve;
	}
	public String getErosionPaid() {
		return ErosionPaid;
	}
	public void setErosionPaid(String erosionPaid) {
		ErosionPaid = erosionPaid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[ReferredInsured=" + ReferredInsured + ", ReferredMedicalMalpracticeCoverage="
				+ ReferredMedicalMalpracticeCoverage + ", ErosionReserve=" + ErosionReserve + ", ErosionPaid="
				+ ErosionPaid + "]";
	}
}
