
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SelectedAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredInsuredType ReferredInsured;
    protected List<ReferredAddressType> ReferredAddress;
    protected EffectivePeriodType EffectivePeriod;
    protected String AccountingFromDate;
    protected String RiskAddressNumberId;
    protected String AddressRoleNumberId;
    protected String EntityRoleNumberId;
    protected String TransactionLogNumberId;
    protected String OfficialRecordNumberId;
    protected String PracticePercentage;
    protected String RatingAddressIndicator;
    protected String RiskPrimaryIndicator;
    protected String UndeliverableIndicator;
    protected String CurrentTransactionIndicator;
	public ReferredInsuredType getReferredInsured() {
		return ReferredInsured;
	}
	public void setReferredInsured(ReferredInsuredType referredInsured) {
		ReferredInsured = referredInsured;
	}
	public List<ReferredAddressType> getReferredAddress() {
		return ReferredAddress;
	}
	public void setReferredAddress(List<ReferredAddressType> referredAddress) {
		ReferredAddress = referredAddress;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getAccountingFromDate() {
		return AccountingFromDate;
	}
	public void setAccountingFromDate(String accountingFromDate) {
		AccountingFromDate = accountingFromDate;
	}
	public String getRiskAddressNumberId() {
		return RiskAddressNumberId;
	}
	public void setRiskAddressNumberId(String riskAddressNumberId) {
		RiskAddressNumberId = riskAddressNumberId;
	}
	public String getAddressRoleNumberId() {
		return AddressRoleNumberId;
	}
	public void setAddressRoleNumberId(String addressRoleNumberId) {
		AddressRoleNumberId = addressRoleNumberId;
	}
	public String getEntityRoleNumberId() {
		return EntityRoleNumberId;
	}
	public void setEntityRoleNumberId(String entityRoleNumberId) {
		EntityRoleNumberId = entityRoleNumberId;
	}
	public String getTransactionLogNumberId() {
		return TransactionLogNumberId;
	}
	public void setTransactionLogNumberId(String transactionLogNumberId) {
		TransactionLogNumberId = transactionLogNumberId;
	}
	public String getOfficialRecordNumberId() {
		return OfficialRecordNumberId;
	}
	public void setOfficialRecordNumberId(String officialRecordNumberId) {
		OfficialRecordNumberId = officialRecordNumberId;
	}
	public String getPracticePercentage() {
		return PracticePercentage;
	}
	public void setPracticePercentage(String practicePercentage) {
		PracticePercentage = practicePercentage;
	}
	public String getRatingAddressIndicator() {
		return RatingAddressIndicator;
	}
	public void setRatingAddressIndicator(String ratingAddressIndicator) {
		RatingAddressIndicator = ratingAddressIndicator;
	}
	public String getRiskPrimaryIndicator() {
		return RiskPrimaryIndicator;
	}
	public void setRiskPrimaryIndicator(String riskPrimaryIndicator) {
		RiskPrimaryIndicator = riskPrimaryIndicator;
	}
	public String getUndeliverableIndicator() {
		return UndeliverableIndicator;
	}
	public void setUndeliverableIndicator(String undeliverableIndicator) {
		UndeliverableIndicator = undeliverableIndicator;
	}
	public String getCurrentTransactionIndicator() {
		return CurrentTransactionIndicator;
	}
	public void setCurrentTransactionIndicator(String currentTransactionIndicator) {
		CurrentTransactionIndicator = currentTransactionIndicator;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[ReferredInsured=" + ReferredInsured + ", ReferredAddress=" + ReferredAddress
				+ ", EffectivePeriod=" + EffectivePeriod + ", AccountingFromDate=" + AccountingFromDate
				+ ", RiskAddressNumberId=" + RiskAddressNumberId + ", AddressRoleNumberId=" + AddressRoleNumberId
				+ ", EntityRoleNumberId=" + EntityRoleNumberId + ", TransactionLogNumberId=" + TransactionLogNumberId
				+ ", OfficialRecordNumberId=" + OfficialRecordNumberId + ", PracticePercentage=" + PracticePercentage
				+ ", RatingAddressIndicator=" + RatingAddressIndicator + ", RiskPrimaryIndicator="
				+ RiskPrimaryIndicator + ", UndeliverableIndicator=" + UndeliverableIndicator
				+ ", CurrentTransactionIndicator=" + CurrentTransactionIndicator + "]";
	}
}
