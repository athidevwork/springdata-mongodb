
package com.springdata.entity.policy;

import java.io.Serializable;

public class HoursPerWeekType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String HoursPerWeekNumberId;
    protected ReferredInsuredType ReferredInsured;
    protected String OfficialRecordId;
    protected String RecordModeCode;
    protected String State;
    protected EffectivePeriodType EffectivePeriod;
    protected String Hours;
    protected String RenewalIndicator;
	public String getHoursPerWeekNumberId() {
		return HoursPerWeekNumberId;
	}
	public void setHoursPerWeekNumberId(String hoursPerWeekNumberId) {
		HoursPerWeekNumberId = hoursPerWeekNumberId;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public String getOfficialRecordId() {
		return OfficialRecordId;
	}
	public void setOfficialRecordId(String officialRecordId) {
		OfficialRecordId = officialRecordId;
	}
	public String getRecordModeCode() {
		return RecordModeCode;
	}
	public void setRecordModeCode(String recordModeCode) {
		RecordModeCode = recordModeCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getHours() {
		return Hours;
	}
	public void setHours(String hours) {
		Hours = hours;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[HoursPerWeekNumberId=" + HoursPerWeekNumberId + ", ReferredInsured=" + ReferredInsured
				+ ", OfficialRecordId=" + OfficialRecordId + ", RecordModeCode=" + RecordModeCode + ", State=" + State
				+ ", EffectivePeriod=" + EffectivePeriod + ", Hours=" + Hours + ", RenewalIndicator=" + RenewalIndicator
				+ "]";
	}
}
