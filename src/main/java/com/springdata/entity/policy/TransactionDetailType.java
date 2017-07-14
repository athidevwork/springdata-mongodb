
package com.springdata.entity.policy;

import java.io.Serializable;

public class TransactionDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String TransactionNumberId;
    protected String TransactionEffectiveDate;
    protected TransactionCodeType TransactionCode;
    protected String TransactionEndorsmentCode;
    protected String TransactionEndorsmentQuoteNumberId;
    protected String LastTermIndicator;
	public String getTransactionNumberId() {
		return TransactionNumberId;
	}
	public void setTransactionNumberId(String transactionNumberId) {
		TransactionNumberId = transactionNumberId;
	}
	public String getTransactionEffectiveDate() {
		return TransactionEffectiveDate;
	}
	public void setTransactionEffectiveDate(String transactionEffectiveDate) {
		TransactionEffectiveDate = transactionEffectiveDate;
	}
	public TransactionCodeType getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(TransactionCodeType transactionCode) {
		TransactionCode = transactionCode;
	}
	public String getTransactionEndorsmentCode() {
		return TransactionEndorsmentCode;
	}
	public void setTransactionEndorsmentCode(String transactionEndorsmentCode) {
		TransactionEndorsmentCode = transactionEndorsmentCode;
	}
	public String getTransactionEndorsmentQuoteNumberId() {
		return TransactionEndorsmentQuoteNumberId;
	}
	public void setTransactionEndorsmentQuoteNumberId(String transactionEndorsmentQuoteNumberId) {
		TransactionEndorsmentQuoteNumberId = transactionEndorsmentQuoteNumberId;
	}
	public String getLastTermIndicator() {
		return LastTermIndicator;
	}
	public void setLastTermIndicator(String lastTermIndicator) {
		LastTermIndicator = lastTermIndicator;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[TransactionNumberId=" + TransactionNumberId + ", TransactionEffectiveDate="
				+ TransactionEffectiveDate + ", TransactionCode=" + TransactionCode + ", TransactionEndorsmentCode="
				+ TransactionEndorsmentCode + ", TransactionEndorsmentQuoteNumberId="
				+ TransactionEndorsmentQuoteNumberId + ", LastTermIndicator=" + LastTermIndicator + "]";
	}
}
