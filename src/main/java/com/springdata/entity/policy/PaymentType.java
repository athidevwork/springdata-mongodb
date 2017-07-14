
package com.springdata.entity.policy;

import java.io.Serializable;

public class PaymentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CodeWithDesc PaymentPlanId;
    protected String InstalmentNo;
    protected String DueDate;
    protected String Amount;
    protected String PcfAmount;
    protected String TaxAmount;
    protected String FinanceCharges;
    protected String ServiceCharges;
    protected String OtherAmount;
    protected String InterfaceTransactionStatus;
    protected String PaymentPlanFrequency;
	public CodeWithDesc getPaymentPlanId() {
		return PaymentPlanId;
	}
	public void setPaymentPlanId(CodeWithDesc paymentPlanId) {
		PaymentPlanId = paymentPlanId;
	}
	public String getInstalmentNo() {
		return InstalmentNo;
	}
	public void setInstalmentNo(String instalmentNo) {
		InstalmentNo = instalmentNo;
	}
	public String getDueDate() {
		return DueDate;
	}
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getPcfAmount() {
		return PcfAmount;
	}
	public void setPcfAmount(String pcfAmount) {
		PcfAmount = pcfAmount;
	}
	public String getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		TaxAmount = taxAmount;
	}
	public String getFinanceCharges() {
		return FinanceCharges;
	}
	public void setFinanceCharges(String financeCharges) {
		FinanceCharges = financeCharges;
	}
	public String getServiceCharges() {
		return ServiceCharges;
	}
	public void setServiceCharges(String serviceCharges) {
		ServiceCharges = serviceCharges;
	}
	public String getOtherAmount() {
		return OtherAmount;
	}
	public void setOtherAmount(String otherAmount) {
		OtherAmount = otherAmount;
	}
	public String getInterfaceTransactionStatus() {
		return InterfaceTransactionStatus;
	}
	public void setInterfaceTransactionStatus(String interfaceTransactionStatus) {
		InterfaceTransactionStatus = interfaceTransactionStatus;
	}
	public String getPaymentPlanFrequency() {
		return PaymentPlanFrequency;
	}
	public void setPaymentPlanFrequency(String paymentPlanFrequency) {
		PaymentPlanFrequency = paymentPlanFrequency;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[PaymentPlanId=" + PaymentPlanId + ", InstalmentNo=" + InstalmentNo + ", DueDate=" + DueDate
				+ ", Amount=" + Amount + ", PcfAmount=" + PcfAmount + ", TaxAmount=" + TaxAmount + ", FinanceCharges="
				+ FinanceCharges + ", ServiceCharges=" + ServiceCharges + ", OtherAmount=" + OtherAmount
				+ ", InterfaceTransactionStatus=" + InterfaceTransactionStatus + ", PaymentPlanFrequency="
				+ PaymentPlanFrequency + "]";
	}
}
