
package com.springdata.entity.policy;

import java.io.Serializable;

public class CancellationInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CancellationMethodCode;
    protected String Reason;
    protected String Date;
    protected String CancelLevel;
    protected String CancelType;
    protected String AccountingDate;
    protected String LimitShareTail;
    protected String DedShareTail;
    protected String ShareType;
    protected String LimitShareGroupDesc;
    protected String DeductShareGroupDesc;
    
	public String getCancellationMethodCode() {
		return CancellationMethodCode;
	}
	public void setCancellationMethodCode(String cancellationMethodCode) {
		CancellationMethodCode = cancellationMethodCode;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getCancelLevel() {
		return CancelLevel;
	}
	public void setCancelLevel(String cancelLevel) {
		CancelLevel = cancelLevel;
	}
	public String getCancelType() {
		return CancelType;
	}
	public void setCancelType(String cancelType) {
		CancelType = cancelType;
	}
	public String getAccountingDate() {
		return AccountingDate;
	}
	public void setAccountingDate(String accountingDate) {
		AccountingDate = accountingDate;
	}
	public String getLimitShareTail() {
		return LimitShareTail;
	}
	public void setLimitShareTail(String limitShareTail) {
		LimitShareTail = limitShareTail;
	}
	public String getDedShareTail() {
		return DedShareTail;
	}
	public void setDedShareTail(String dedShareTail) {
		DedShareTail = dedShareTail;
	}
	public String getShareType() {
		return ShareType;
	}
	public void setShareType(String shareType) {
		ShareType = shareType;
	}
	public String getLimitShareGroupDesc() {
		return LimitShareGroupDesc;
	}
	public void setLimitShareGroupDesc(String limitShareGroupDesc) {
		LimitShareGroupDesc = limitShareGroupDesc;
	}
	public String getDeductShareGroupDesc() {
		return DeductShareGroupDesc;
	}
	public void setDeductShareGroupDesc(String deductShareGroupDesc) {
		DeductShareGroupDesc = deductShareGroupDesc;
	}
	@Override
	public String toString() {
		return "[CancellationMethodCode=" + CancellationMethodCode + ", Reason=" + Reason
				+ ", Date=" + Date + ", CancelLevel=" + CancelLevel + ", CancelType=" + CancelType + ", AccountingDate="
				+ AccountingDate + ", LimitShareTail=" + LimitShareTail + ", DedShareTail=" + DedShareTail
				+ ", ShareType=" + ShareType + ", LimitShareGroupDesc=" + LimitShareGroupDesc
				+ ", DeductShareGroupDesc=" + DeductShareGroupDesc + "]";
	}
}
