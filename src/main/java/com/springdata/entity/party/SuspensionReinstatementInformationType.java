
package com.springdata.entity.party;

import java.io.Serializable;

public class SuspensionReinstatementInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected EffectivePeriodType LicenseSuspensionPeriod;
    protected String SuspensionRevocationReasonCode;
    
	public EffectivePeriodType getLicenseSuspensionPeriod() {
		return LicenseSuspensionPeriod;
	}
	public void setLicenseSuspensionPeriod(EffectivePeriodType licenseSuspensionPeriod) {
		LicenseSuspensionPeriod = licenseSuspensionPeriod;
	}
	public String getSuspensionRevocationReasonCode() {
		return SuspensionRevocationReasonCode;
	}
	public void setSuspensionRevocationReasonCode(String suspensionRevocationReasonCode) {
		SuspensionRevocationReasonCode = suspensionRevocationReasonCode;
	}
	@Override
	public String toString() {
		return "[LicenseSuspensionPeriod=" + LicenseSuspensionPeriod
				+ ", SuspensionRevocationReasonCode=" + SuspensionRevocationReasonCode + "]";
	}
}