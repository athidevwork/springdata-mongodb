
package com.springdata.entity.policy;

import java.io.Serializable;

public class PaymentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CodeWithDesc paymentPlanId;
    protected String instalmentNo;
    protected String dueDate;
    protected String amount;
    protected String pcfAmount;
    protected String taxAmount;
    protected String financeCharges;
    protected String serviceCharges;
    protected String otherAmount;
    protected String interfaceTransactionStatus;
    protected String paymentPlanFrequency;

    /**
     * Gets the value of the paymentPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getPaymentPlanId() {
        return paymentPlanId;
    }

    /**
     * Sets the value of the paymentPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setPaymentPlanId(CodeWithDesc value) {
        this.paymentPlanId = value;
    }

    /**
     * Gets the value of the instalmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalmentNo() {
        return instalmentNo;
    }

    /**
     * Sets the value of the instalmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalmentNo(String value) {
        this.instalmentNo = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the pcfAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcfAmount() {
        return pcfAmount;
    }

    /**
     * Sets the value of the pcfAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcfAmount(String value) {
        this.pcfAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the financeCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceCharges() {
        return financeCharges;
    }

    /**
     * Sets the value of the financeCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceCharges(String value) {
        this.financeCharges = value;
    }

    /**
     * Gets the value of the serviceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCharges() {
        return serviceCharges;
    }

    /**
     * Sets the value of the serviceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCharges(String value) {
        this.serviceCharges = value;
    }

    /**
     * Gets the value of the otherAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAmount() {
        return otherAmount;
    }

    /**
     * Sets the value of the otherAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAmount(String value) {
        this.otherAmount = value;
    }

    /**
     * Gets the value of the interfaceTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceTransactionStatus() {
        return interfaceTransactionStatus;
    }

    /**
     * Sets the value of the interfaceTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceTransactionStatus(String value) {
        this.interfaceTransactionStatus = value;
    }

    /**
     * Gets the value of the paymentPlanFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPlanFrequency() {
        return paymentPlanFrequency;
    }

    /**
     * Sets the value of the paymentPlanFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPlanFrequency(String value) {
        this.paymentPlanFrequency = value;
    }

}
