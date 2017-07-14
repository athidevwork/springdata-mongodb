
package com.springdata.entity.policy;

import java.io.Serializable;

public class PriorActsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PriorActsIndicator;
    protected String PriorActsType;
    protected String PriorActsRetroactiveDate;
	public String getPriorActsIndicator() {
		return PriorActsIndicator;
	}
	public void setPriorActsIndicator(String priorActsIndicator) {
		PriorActsIndicator = priorActsIndicator;
	}
	public String getPriorActsType() {
		return PriorActsType;
	}
	public void setPriorActsType(String priorActsType) {
		PriorActsType = priorActsType;
	}
	public String getPriorActsRetroactiveDate() {
		return PriorActsRetroactiveDate;
	}
	public void setPriorActsRetroactiveDate(String priorActsRetroactiveDate) {
		PriorActsRetroactiveDate = priorActsRetroactiveDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[PriorActsIndicator=" + PriorActsIndicator + ", PriorActsType=" + PriorActsType
				+ ", PriorActsRetroactiveDate=" + PriorActsRetroactiveDate + "]";
	}
}
