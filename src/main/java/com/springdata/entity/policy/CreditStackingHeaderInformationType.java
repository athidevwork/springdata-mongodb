
package com.springdata.entity.policy;

import java.io.Serializable;

public class CreditStackingHeaderInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CategoryCode;
    protected CodeWithDesc RuleCode;
    protected String CategoryRank;
    protected String CategoryDesc;
    protected String CapCredit;
    protected String CapDebit;
    protected String SelOrder;
	public String getCategoryCode() {
		return CategoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		CategoryCode = categoryCode;
	}
	public CodeWithDesc getRuleCode() {
		return RuleCode;
	}
	public void setRuleCode(CodeWithDesc ruleCode) {
		RuleCode = ruleCode;
	}
	public String getCategoryRank() {
		return CategoryRank;
	}
	public void setCategoryRank(String categoryRank) {
		CategoryRank = categoryRank;
	}
	public String getCategoryDesc() {
		return CategoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		CategoryDesc = categoryDesc;
	}
	public String getCapCredit() {
		return CapCredit;
	}
	public void setCapCredit(String capCredit) {
		CapCredit = capCredit;
	}
	public String getCapDebit() {
		return CapDebit;
	}
	public void setCapDebit(String capDebit) {
		CapDebit = capDebit;
	}
	public String getSelOrder() {
		return SelOrder;
	}
	public void setSelOrder(String selOrder) {
		SelOrder = selOrder;
	}
	@Override
	public String toString() {
		return "[CategoryCode=" + CategoryCode + ", RuleCode=" + RuleCode
				+ ", CategoryRank=" + CategoryRank + ", CategoryDesc=" + CategoryDesc + ", CapCredit=" + CapCredit
				+ ", CapDebit=" + CapDebit + ", SelOrder=" + SelOrder + "]";
	}
}
