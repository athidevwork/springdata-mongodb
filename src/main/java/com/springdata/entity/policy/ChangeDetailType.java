
package com.springdata.entity.policy;

import java.io.Serializable;

public class ChangeDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ChangeDesc;
    protected String CovgPart;
    protected String Risk;
    protected String Coverage;
    protected String CovgClass;
    protected String Component;
    protected String From;
    protected String To;
    
	public String getChangeDesc() {
		return ChangeDesc;
	}
	public void setChangeDesc(String changeDesc) {
		ChangeDesc = changeDesc;
	}
	public String getCovgPart() {
		return CovgPart;
	}
	public void setCovgPart(String covgPart) {
		CovgPart = covgPart;
	}
	public String getRisk() {
		return Risk;
	}
	public void setRisk(String risk) {
		Risk = risk;
	}
	public String getCoverage() {
		return Coverage;
	}
	public void setCoverage(String coverage) {
		Coverage = coverage;
	}
	public String getCovgClass() {
		return CovgClass;
	}
	public void setCovgClass(String covgClass) {
		CovgClass = covgClass;
	}
	public String getComponent() {
		return Component;
	}
	public void setComponent(String component) {
		Component = component;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	@Override
	public String toString() {
		return "[ChangeDesc=" + ChangeDesc + ", CovgPart=" + CovgPart + ", Risk=" + Risk
				+ ", Coverage=" + Coverage + ", CovgClass=" + CovgClass + ", Component=" + Component + ", From=" + From
				+ ", To=" + To + "]";
	}
}
