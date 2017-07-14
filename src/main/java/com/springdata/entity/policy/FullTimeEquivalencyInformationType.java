
package com.springdata.entity.policy;

import java.io.Serializable;

public class FullTimeEquivalencyInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FullTimeEquivalency;
    protected String FullTimeHours;
    protected String PartTimeHours;
    protected String PerDiemHours;
	public String getFullTimeEquivalency() {
		return FullTimeEquivalency;
	}
	public void setFullTimeEquivalency(String fullTimeEquivalency) {
		FullTimeEquivalency = fullTimeEquivalency;
	}
	public String getFullTimeHours() {
		return FullTimeHours;
	}
	public void setFullTimeHours(String fullTimeHours) {
		FullTimeHours = fullTimeHours;
	}
	public String getPartTimeHours() {
		return PartTimeHours;
	}
	public void setPartTimeHours(String partTimeHours) {
		PartTimeHours = partTimeHours;
	}
	public String getPerDiemHours() {
		return PerDiemHours;
	}
	public void setPerDiemHours(String perDiemHours) {
		PerDiemHours = perDiemHours;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[FullTimeEquivalency=" + FullTimeEquivalency + ", FullTimeHours="
				+ FullTimeHours + ", PartTimeHours=" + PartTimeHours + ", PerDiemHours=" + PerDiemHours + "]";
	}
}
