
package com.springdata.entity.policy;

import java.io.Serializable;

public class CollateralType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PolicyReinsuranceNumberId;
    protected String ContractNO;
    protected EffectivePeriodType EffectivePeriod;
    protected String Type;
    protected String Amount;
    protected String Note;
	public String getPolicyReinsuranceNumberId() {
		return PolicyReinsuranceNumberId;
	}
	public void setPolicyReinsuranceNumberId(String policyReinsuranceNumberId) {
		PolicyReinsuranceNumberId = policyReinsuranceNumberId;
	}
	public String getContractNO() {
		return ContractNO;
	}
	public void setContractNO(String contractNO) {
		ContractNO = contractNO;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	@Override
	public String toString() {
		return "[PolicyReinsuranceNumberId=" + PolicyReinsuranceNumberId + ", ContractNO=" + ContractNO
				+ ", EffectivePeriod=" + EffectivePeriod + ", Type=" + Type + ", Amount=" + Amount + ", Note=" + Note
				+ "]";
	}
}
