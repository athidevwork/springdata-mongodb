
package com.springdata.entity.policy;

import java.io.Serializable;

public class CancellationDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CancellationDate;
    protected String CancellationReasonCode;
    protected String CancellationLevel;
    protected String CancellationComments;
    protected String CancellationMethod;
    protected String CancellationType;
    protected String AccountingDate;
    protected String MarkAsDdl;
    protected String DdlComments;
    protected String DdlReason;
    protected String SelectToDdl;
    protected String AddToIbnrInactiveB;
    
	public String getCancellationDate() {
		return CancellationDate;
	}
	public void setCancellationDate(String cancellationDate) {
		CancellationDate = cancellationDate;
	}
	public String getCancellationReasonCode() {
		return CancellationReasonCode;
	}
	public void setCancellationReasonCode(String cancellationReasonCode) {
		CancellationReasonCode = cancellationReasonCode;
	}
	public String getCancellationLevel() {
		return CancellationLevel;
	}
	public void setCancellationLevel(String cancellationLevel) {
		CancellationLevel = cancellationLevel;
	}
	public String getCancellationComments() {
		return CancellationComments;
	}
	public void setCancellationComments(String cancellationComments) {
		CancellationComments = cancellationComments;
	}
	public String getCancellationMethod() {
		return CancellationMethod;
	}
	public void setCancellationMethod(String cancellationMethod) {
		CancellationMethod = cancellationMethod;
	}
	public String getCancellationType() {
		return CancellationType;
	}
	public void setCancellationType(String cancellationType) {
		CancellationType = cancellationType;
	}
	public String getAccountingDate() {
		return AccountingDate;
	}
	public void setAccountingDate(String accountingDate) {
		AccountingDate = accountingDate;
	}
	public String getMarkAsDdl() {
		return MarkAsDdl;
	}
	public void setMarkAsDdl(String markAsDdl) {
		MarkAsDdl = markAsDdl;
	}
	public String getDdlComments() {
		return DdlComments;
	}
	public void setDdlComments(String ddlComments) {
		DdlComments = ddlComments;
	}
	public String getDdlReason() {
		return DdlReason;
	}
	public void setDdlReason(String ddlReason) {
		DdlReason = ddlReason;
	}
	public String getSelectToDdl() {
		return SelectToDdl;
	}
	public void setSelectToDdl(String selectToDdl) {
		SelectToDdl = selectToDdl;
	}
	public String getAddToIbnrInactiveB() {
		return AddToIbnrInactiveB;
	}
	public void setAddToIbnrInactiveB(String addToIbnrInactiveB) {
		AddToIbnrInactiveB = addToIbnrInactiveB;
	}
	@Override
	public String toString() {
		return "[CancellationDate=" + CancellationDate + ", CancellationReasonCode="
				+ CancellationReasonCode + ", CancellationLevel=" + CancellationLevel + ", CancellationComments="
				+ CancellationComments + ", CancellationMethod=" + CancellationMethod + ", CancellationType="
				+ CancellationType + ", AccountingDate=" + AccountingDate + ", MarkAsDdl=" + MarkAsDdl
				+ ", DdlComments=" + DdlComments + ", DdlReason=" + DdlReason + ", SelectToDdl=" + SelectToDdl
				+ ", AddToIbnrInactiveB=" + AddToIbnrInactiveB + "]";
	}
}
