
package com.springdata.entity.policy;

import java.io.Serializable;

public class EffectivePeriodType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String StartDate;
    protected String EndDate;
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	@Override
	public String toString() {
		return "EffectivePeriodType [StartDate=" + StartDate + ", EndDate=" + EndDate + "]";
	}
}
