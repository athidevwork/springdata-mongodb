
package com.springdata.entity.policy;

import java.io.Serializable;

public class ProductComponentInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String LowValue;
    protected String HighValue;
    protected String ExpiryDateIndicator;
    protected String ApplyRiskSuspendIndicator;
    protected String AdvanceClaimsMadeYearIndicator;
    protected String CycleIndicator;
    protected String ReasonIndicator;
    protected String PartTimeIndicator;
    protected String NoteIndicator;
    protected String PercentValueIndicator;
    protected String ScheduleIndicator;
    protected String Sign;
	public String getLowValue() {
		return LowValue;
	}
	public void setLowValue(String lowValue) {
		LowValue = lowValue;
	}
	public String getHighValue() {
		return HighValue;
	}
	public void setHighValue(String highValue) {
		HighValue = highValue;
	}
	public String getExpiryDateIndicator() {
		return ExpiryDateIndicator;
	}
	public void setExpiryDateIndicator(String expiryDateIndicator) {
		ExpiryDateIndicator = expiryDateIndicator;
	}
	public String getApplyRiskSuspendIndicator() {
		return ApplyRiskSuspendIndicator;
	}
	public void setApplyRiskSuspendIndicator(String applyRiskSuspendIndicator) {
		ApplyRiskSuspendIndicator = applyRiskSuspendIndicator;
	}
	public String getAdvanceClaimsMadeYearIndicator() {
		return AdvanceClaimsMadeYearIndicator;
	}
	public void setAdvanceClaimsMadeYearIndicator(String advanceClaimsMadeYearIndicator) {
		AdvanceClaimsMadeYearIndicator = advanceClaimsMadeYearIndicator;
	}
	public String getCycleIndicator() {
		return CycleIndicator;
	}
	public void setCycleIndicator(String cycleIndicator) {
		CycleIndicator = cycleIndicator;
	}
	public String getReasonIndicator() {
		return ReasonIndicator;
	}
	public void setReasonIndicator(String reasonIndicator) {
		ReasonIndicator = reasonIndicator;
	}
	public String getPartTimeIndicator() {
		return PartTimeIndicator;
	}
	public void setPartTimeIndicator(String partTimeIndicator) {
		PartTimeIndicator = partTimeIndicator;
	}
	public String getNoteIndicator() {
		return NoteIndicator;
	}
	public void setNoteIndicator(String noteIndicator) {
		NoteIndicator = noteIndicator;
	}
	public String getPercentValueIndicator() {
		return PercentValueIndicator;
	}
	public void setPercentValueIndicator(String percentValueIndicator) {
		PercentValueIndicator = percentValueIndicator;
	}
	public String getScheduleIndicator() {
		return ScheduleIndicator;
	}
	public void setScheduleIndicator(String scheduleIndicator) {
		ScheduleIndicator = scheduleIndicator;
	}
	public String getSign() {
		return Sign;
	}
	public void setSign(String sign) {
		Sign = sign;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[LowValue=" + LowValue + ", HighValue=" + HighValue + ", ExpiryDateIndicator="
				+ ExpiryDateIndicator + ", ApplyRiskSuspendIndicator=" + ApplyRiskSuspendIndicator
				+ ", AdvanceClaimsMadeYearIndicator=" + AdvanceClaimsMadeYearIndicator + ", CycleIndicator="
				+ CycleIndicator + ", ReasonIndicator=" + ReasonIndicator + ", PartTimeIndicator=" + PartTimeIndicator
				+ ", NoteIndicator=" + NoteIndicator + ", PercentValueIndicator=" + PercentValueIndicator
				+ ", ScheduleIndicator=" + ScheduleIndicator + ", Sign=" + Sign + "]";
	}
}
