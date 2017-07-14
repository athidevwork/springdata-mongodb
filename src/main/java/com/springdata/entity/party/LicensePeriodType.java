
package com.springdata.entity.party;

import java.io.Serializable;

public class LicensePeriodType
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
		return "[StartDate=" + StartDate + ", EndDate=" + EndDate + "]";
	}
}
