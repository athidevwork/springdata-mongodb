
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TransactionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String TransactionLogId;
    protected String EffectiveFromDate;
    protected String AccountingFromDate;
    protected String Comments;
    protected String RermBaseRecordNumberId;
    protected String PolicyTermCode;
    protected String Status;
    protected CodeWithDesc TransTypeCode;
    protected TransactionCodeType TransactionCode;
    protected String CancellationMethodCode;
    protected String User;
    protected String InitTermIndictaor;
    protected String PrtExist;
    protected String ForceRerateIndicator;
    protected List<ChangeDetailType> ChangeDetail;
    protected List<TransactionFormType> TransactionForm;
	public String getTransactionLogId() {
		return TransactionLogId;
	}
	public void setTransactionLogId(String transactionLogId) {
		TransactionLogId = transactionLogId;
	}
	public String getEffectiveFromDate() {
		return EffectiveFromDate;
	}
	public void setEffectiveFromDate(String effectiveFromDate) {
		EffectiveFromDate = effectiveFromDate;
	}
	public String getAccountingFromDate() {
		return AccountingFromDate;
	}
	public void setAccountingFromDate(String accountingFromDate) {
		AccountingFromDate = accountingFromDate;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getRermBaseRecordNumberId() {
		return RermBaseRecordNumberId;
	}
	public void setRermBaseRecordNumberId(String rermBaseRecordNumberId) {
		RermBaseRecordNumberId = rermBaseRecordNumberId;
	}
	public String getPolicyTermCode() {
		return PolicyTermCode;
	}
	public void setPolicyTermCode(String policyTermCode) {
		PolicyTermCode = policyTermCode;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public CodeWithDesc getTransTypeCode() {
		return TransTypeCode;
	}
	public void setTransTypeCode(CodeWithDesc transTypeCode) {
		TransTypeCode = transTypeCode;
	}
	public TransactionCodeType getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(TransactionCodeType transactionCode) {
		TransactionCode = transactionCode;
	}
	public String getCancellationMethodCode() {
		return CancellationMethodCode;
	}
	public void setCancellationMethodCode(String cancellationMethodCode) {
		CancellationMethodCode = cancellationMethodCode;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getInitTermIndictaor() {
		return InitTermIndictaor;
	}
	public void setInitTermIndictaor(String initTermIndictaor) {
		InitTermIndictaor = initTermIndictaor;
	}
	public String getPrtExist() {
		return PrtExist;
	}
	public void setPrtExist(String prtExist) {
		PrtExist = prtExist;
	}
	public String getForceRerateIndicator() {
		return ForceRerateIndicator;
	}
	public void setForceRerateIndicator(String forceRerateIndicator) {
		ForceRerateIndicator = forceRerateIndicator;
	}
	public List<ChangeDetailType> getChangeDetail() {
		return ChangeDetail;
	}
	public void setChangeDetail(List<ChangeDetailType> changeDetail) {
		ChangeDetail = changeDetail;
	}
	public List<TransactionFormType> getTransactionForm() {
		return TransactionForm;
	}
	public void setTransactionForm(List<TransactionFormType> transactionForm) {
		TransactionForm = transactionForm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[TransactionLogId=" + TransactionLogId + ", EffectiveFromDate=" + EffectiveFromDate
				+ ", AccountingFromDate=" + AccountingFromDate + ", Comments=" + Comments + ", RermBaseRecordNumberId="
				+ RermBaseRecordNumberId + ", PolicyTermCode=" + PolicyTermCode + ", Status=" + Status
				+ ", TransTypeCode=" + TransTypeCode + ", TransactionCode=" + TransactionCode
				+ ", CancellationMethodCode=" + CancellationMethodCode + ", User=" + User + ", InitTermIndictaor="
				+ InitTermIndictaor + ", PrtExist=" + PrtExist + ", ForceRerateIndicator=" + ForceRerateIndicator
				+ ", ChangeDetail=" + ChangeDetail + ", TransactionForm=" + TransactionForm + "]";
	}
}