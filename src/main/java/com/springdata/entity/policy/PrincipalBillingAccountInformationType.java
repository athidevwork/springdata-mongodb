
package com.springdata.entity.policy;

import java.io.Serializable;

public class PrincipalBillingAccountInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String BillingAccountNumber;
    protected String BillingAccountIdentifier;
    protected String PaymentPlanId;
	public String getBillingAccountNumber() {
		return BillingAccountNumber;
	}
	public void setBillingAccountNumber(String billingAccountNumber) {
		BillingAccountNumber = billingAccountNumber;
	}
	public String getBillingAccountIdentifier() {
		return BillingAccountIdentifier;
	}
	public void setBillingAccountIdentifier(String billingAccountIdentifier) {
		BillingAccountIdentifier = billingAccountIdentifier;
	}
	public String getPaymentPlanId() {
		return PaymentPlanId;
	}
	public void setPaymentPlanId(String paymentPlanId) {
		PaymentPlanId = paymentPlanId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[BillingAccountNumber=" + BillingAccountNumber
				+ ", BillingAccountIdentifier=" + BillingAccountIdentifier + ", PaymentPlanId=" + PaymentPlanId + "]";
	}
}
