
package com.springdata.entity.policy;

import java.io.Serializable;

public class PcfType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PracticeCountyCode;
    protected String PracticeStateCode;
    protected String StartDate;
	public String getPracticeCountyCode() {
		return PracticeCountyCode;
	}
	public void setPracticeCountyCode(String practiceCountyCode) {
		PracticeCountyCode = practiceCountyCode;
	}
	public String getPracticeStateCode() {
		return PracticeStateCode;
	}
	public void setPracticeStateCode(String practiceStateCode) {
		PracticeStateCode = practiceStateCode;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[PracticeCountyCode=" + PracticeCountyCode + ", PracticeStateCode=" + PracticeStateCode
				+ ", StartDate=" + StartDate + "]";
	}
}
