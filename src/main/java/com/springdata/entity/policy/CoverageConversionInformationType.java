
package com.springdata.entity.policy;

import java.io.Serializable;

public class CoverageConversionInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ClaimsMadeDate;
    protected String ClaimsMadeOverrideDate;
    protected String OccurenceDate;
    protected String OccurenceOverrideDate;
	public String getClaimsMadeDate() {
		return ClaimsMadeDate;
	}
	public void setClaimsMadeDate(String claimsMadeDate) {
		ClaimsMadeDate = claimsMadeDate;
	}
	public String getClaimsMadeOverrideDate() {
		return ClaimsMadeOverrideDate;
	}
	public void setClaimsMadeOverrideDate(String claimsMadeOverrideDate) {
		ClaimsMadeOverrideDate = claimsMadeOverrideDate;
	}
	public String getOccurenceDate() {
		return OccurenceDate;
	}
	public void setOccurenceDate(String occurenceDate) {
		OccurenceDate = occurenceDate;
	}
	public String getOccurenceOverrideDate() {
		return OccurenceOverrideDate;
	}
	public void setOccurenceOverrideDate(String occurenceOverrideDate) {
		OccurenceOverrideDate = occurenceOverrideDate;
	}
	@Override
	public String toString() {
		return "[ClaimsMadeDate=" + ClaimsMadeDate + ", ClaimsMadeOverrideDate="
				+ ClaimsMadeOverrideDate + ", OccurenceDate=" + OccurenceDate + ", OccurenceOverrideDate="
				+ OccurenceOverrideDate + "]";
	}
}
