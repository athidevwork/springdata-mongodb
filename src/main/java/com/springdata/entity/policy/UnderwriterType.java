
package com.springdata.entity.policy;

import java.io.Serializable;

public class UnderwriterType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredPartyType ReferredParty;
    protected EffectivePeriodType EffectivePeriod;
    protected String UnderwriterNumberId;
    protected String RenewalB;
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getUnderwriterNumberId() {
		return UnderwriterNumberId;
	}
	public void setUnderwriterNumberId(String underwriterNumberId) {
		UnderwriterNumberId = underwriterNumberId;
	}
	public String getRenewalB() {
		return RenewalB;
	}
	public void setRenewalB(String renewalB) {
		RenewalB = renewalB;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[ReferredParty=" + ReferredParty + ", EffectivePeriod=" + EffectivePeriod
				+ ", UnderwriterNumberId=" + UnderwriterNumberId + ", RenewalB=" + RenewalB + "]";
	}
}
