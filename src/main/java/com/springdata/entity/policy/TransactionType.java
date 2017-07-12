
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TransactionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String transactionLogId;
    protected String effectiveFromDate;
    protected String accountingFromDate;
    protected String comments;
    protected String termBaseRecordNumberId;
    protected String policyTermCode;
    protected String status;
    protected CodeWithDesc transTypeCode;
    protected TransactionCodeType transactionCode;
    protected String cancellationMethodCode;
    protected String user;
    protected String initTermIndictaor;
    protected String prtExist;
    protected String forceRerateIndicator;
    protected List<ChangeDetailType> changeDetail;
    protected List<TransactionFormType> transactionForm;

    /**
     * Gets the value of the transactionLogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLogId() {
        return transactionLogId;
    }

    /**
     * Sets the value of the transactionLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLogId(String value) {
        this.transactionLogId = value;
    }

    /**
     * Gets the value of the effectiveFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveFromDate() {
        return effectiveFromDate;
    }

    /**
     * Sets the value of the effectiveFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveFromDate(String value) {
        this.effectiveFromDate = value;
    }

    /**
     * Gets the value of the accountingFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingFromDate() {
        return accountingFromDate;
    }

    /**
     * Sets the value of the accountingFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingFromDate(String value) {
        this.accountingFromDate = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the termBaseRecordNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermBaseRecordNumberId() {
        return termBaseRecordNumberId;
    }

    /**
     * Sets the value of the termBaseRecordNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermBaseRecordNumberId(String value) {
        this.termBaseRecordNumberId = value;
    }

    /**
     * Gets the value of the policyTermCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTermCode() {
        return policyTermCode;
    }

    /**
     * Sets the value of the policyTermCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTermCode(String value) {
        this.policyTermCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the transTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getTransTypeCode() {
        return transTypeCode;
    }

    /**
     * Sets the value of the transTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setTransTypeCode(CodeWithDesc value) {
        this.transTypeCode = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCodeType }
     *     
     */
    public TransactionCodeType getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCodeType }
     *     
     */
    public void setTransactionCode(TransactionCodeType value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the cancellationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationMethodCode() {
        return cancellationMethodCode;
    }

    /**
     * Sets the value of the cancellationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationMethodCode(String value) {
        this.cancellationMethodCode = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the initTermIndictaor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitTermIndictaor() {
        return initTermIndictaor;
    }

    /**
     * Sets the value of the initTermIndictaor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitTermIndictaor(String value) {
        this.initTermIndictaor = value;
    }

    /**
     * Gets the value of the prtExist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtExist() {
        return prtExist;
    }

    /**
     * Sets the value of the prtExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtExist(String value) {
        this.prtExist = value;
    }

    /**
     * Gets the value of the forceRerateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceRerateIndicator() {
        return forceRerateIndicator;
    }

    /**
     * Sets the value of the forceRerateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceRerateIndicator(String value) {
        this.forceRerateIndicator = value;
    }

    /**
     * Gets the value of the changeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeDetailType }
     * 
     * 
     */
    public List<ChangeDetailType> getChangeDetail() {
        if (changeDetail == null) {
            changeDetail = new ArrayList<ChangeDetailType>();
        }
        return this.changeDetail;
    }

    /**
     * Gets the value of the transactionForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionFormType }
     * 
     * 
     */
    public List<TransactionFormType> getTransactionForm() {
        if (transactionForm == null) {
            transactionForm = new ArrayList<TransactionFormType>();
        }
        return this.transactionForm;
    }

    /**
     * Sets the value of the changeDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link ChangeDetailType }
     *
     */
    public void setChangeDetail(ChangeDetailType value) {
        if (changeDetail == null) {
            changeDetail = new ArrayList<ChangeDetailType>();
        }
        changeDetail.add(value);
    }

    /**
     * Sets the value of the transactionForm property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionFormType }
     *
     */
    public void setTransactionForm(TransactionFormType value) {
        if (transactionForm == null) {
            transactionForm = new ArrayList<TransactionFormType>();
        }
        transactionForm.add(value);
    }

}