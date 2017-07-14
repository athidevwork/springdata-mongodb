
package com.springdata.entity.policy;

import java.io.Serializable;

public class FundSubmissionInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FundSubmissionNumberId;
    protected ReferredInsuredType ReferredInsured;
    protected String State;
    protected EffectivePeriodType EffectivePeriod;
    protected String TransactionType;
    protected String TransactionCode;
    protected String FundEligibleIndicator;
    protected String FundExemptIndicator;
    protected String FundStatus;
    protected String FundSubmittedDate;
	public String getFundSubmissionNumberId() {
		return FundSubmissionNumberId;
	}
	public void setFundSubmissionNumberId(String fundSubmissionNumberId) {
		FundSubmissionNumberId = fundSubmissionNumberId;
	}
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	public String getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		TransactionCode = transactionCode;
	}
	public String getFundEligibleIndicator() {
		return FundEligibleIndicator;
	}
	public void setFundEligibleIndicator(String fundEligibleIndicator) {
		FundEligibleIndicator = fundEligibleIndicator;
	}
	public String getFundExemptIndicator() {
		return FundExemptIndicator;
	}
	public void setFundExemptIndicator(String fundExemptIndicator) {
		FundExemptIndicator = fundExemptIndicator;
	}
	public String getFundStatus() {
		return FundStatus;
	}
	public void setFundStatus(String fundStatus) {
		FundStatus = fundStatus;
	}
	public String getFundSubmittedDate() {
		return FundSubmittedDate;
	}
	public void setFundSubmittedDate(String fundSubmittedDate) {
		FundSubmittedDate = fundSubmittedDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[FundSubmissionNumberId=" + FundSubmissionNumberId + ", ReferredInsured="
				+ ReferredInsured + ", State=" + State + ", EffectivePeriod=" + EffectivePeriod + ", TransactionType="
				+ TransactionType + ", TransactionCode=" + TransactionCode + ", FundEligibleIndicator="
				+ FundEligibleIndicator + ", FundExemptIndicator=" + FundExemptIndicator + ", FundStatus=" + FundStatus
				+ ", FundSubmittedDate=" + FundSubmittedDate + "]";
	}
}
