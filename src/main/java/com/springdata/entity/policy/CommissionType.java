
package com.springdata.entity.policy;

import java.io.Serializable;

public class CommissionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CommissionRatePercent;
    protected String CommissionAmount;
    protected String LimitChargeAmount;
    protected String CommissionBasisCode;
    protected CodeWithDesc RateScheduleCode;
    protected String CommissionPayCode;
    protected String CommissionTypeCode;
	public String getCommissionRatePercent() {
		return CommissionRatePercent;
	}
	public void setCommissionRatePercent(String commissionRatePercent) {
		CommissionRatePercent = commissionRatePercent;
	}
	public String getCommissionAmount() {
		return CommissionAmount;
	}
	public void setCommissionAmount(String commissionAmount) {
		CommissionAmount = commissionAmount;
	}
	public String getLimitChargeAmount() {
		return LimitChargeAmount;
	}
	public void setLimitChargeAmount(String limitChargeAmount) {
		LimitChargeAmount = limitChargeAmount;
	}
	public String getCommissionBasisCode() {
		return CommissionBasisCode;
	}
	public void setCommissionBasisCode(String commissionBasisCode) {
		CommissionBasisCode = commissionBasisCode;
	}
	public CodeWithDesc getRateScheduleCode() {
		return RateScheduleCode;
	}
	public void setRateScheduleCode(CodeWithDesc rateScheduleCode) {
		RateScheduleCode = rateScheduleCode;
	}
	public String getCommissionPayCode() {
		return CommissionPayCode;
	}
	public void setCommissionPayCode(String commissionPayCode) {
		CommissionPayCode = commissionPayCode;
	}
	public String getCommissionTypeCode() {
		return CommissionTypeCode;
	}
	public void setCommissionTypeCode(String commissionTypeCode) {
		CommissionTypeCode = commissionTypeCode;
	}
	@Override
	public String toString() {
		return "[CommissionRatePercent=" + CommissionRatePercent + ", CommissionAmount="
				+ CommissionAmount + ", LimitChargeAmount=" + LimitChargeAmount + ", CommissionBasisCode="
				+ CommissionBasisCode + ", RateScheduleCode=" + RateScheduleCode + ", CommissionPayCode="
				+ CommissionPayCode + ", CommissionTypeCode=" + CommissionTypeCode + "]";
	}
}
