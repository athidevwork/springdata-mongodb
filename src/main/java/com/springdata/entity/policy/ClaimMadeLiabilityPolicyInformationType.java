
package com.springdata.entity.policy;

import java.io.Serializable;

public class ClaimMadeLiabilityPolicyInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CurrentRetroactiveDate;
    protected String SplitRetroactiveDate;
    protected String ClaimsMadeDate;
    
	public String getCurrentRetroactiveDate() {
		return CurrentRetroactiveDate;
	}
	public void setCurrentRetroactiveDate(String currentRetroactiveDate) {
		CurrentRetroactiveDate = currentRetroactiveDate;
	}
	public String getSplitRetroactiveDate() {
		return SplitRetroactiveDate;
	}
	public void setSplitRetroactiveDate(String splitRetroactiveDate) {
		SplitRetroactiveDate = splitRetroactiveDate;
	}
	public String getClaimsMadeDate() {
		return ClaimsMadeDate;
	}
	public void setClaimsMadeDate(String claimsMadeDate) {
		ClaimsMadeDate = claimsMadeDate;
	}
	@Override
	public String toString() {
		return "[CurrentRetroactiveDate=" + CurrentRetroactiveDate
				+ ", SplitRetroactiveDate=" + SplitRetroactiveDate + ", ClaimsMadeDate=" + ClaimsMadeDate + "]";
	}
}
