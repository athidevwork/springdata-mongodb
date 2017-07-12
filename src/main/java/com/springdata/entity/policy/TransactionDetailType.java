
package com.springdata.entity.policy;

import java.io.Serializable;

public class TransactionDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String transactionNumberId;
    protected String transactionEffectiveDate;
    protected TransactionCodeType transactionCode;
    protected String transactionEndorsmentCode;
    protected String transactionEndorsmentQuoteNumberId;
    protected String lastTermIndicator;

    /**
     * Gets the value of the transactionNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNumberId() {
        return transactionNumberId;
    }

    /**
     * Sets the value of the transactionNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNumberId(String value) {
        this.transactionNumberId = value;
    }

    /**
     * Gets the value of the transactionEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionEffectiveDate() {
        return transactionEffectiveDate;
    }

    /**
     * Sets the value of the transactionEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionEffectiveDate(String value) {
        this.transactionEffectiveDate = value;
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
     * Gets the value of the transactionEndorsmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionEndorsmentCode() {
        return transactionEndorsmentCode;
    }

    /**
     * Sets the value of the transactionEndorsmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionEndorsmentCode(String value) {
        this.transactionEndorsmentCode = value;
    }

    /**
     * Gets the value of the transactionEndorsmentQuoteNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionEndorsmentQuoteNumberId() {
        return transactionEndorsmentQuoteNumberId;
    }

    /**
     * Sets the value of the transactionEndorsmentQuoteNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionEndorsmentQuoteNumberId(String value) {
        this.transactionEndorsmentQuoteNumberId = value;
    }

    /**
     * Gets the value of the lastTermIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTermIndicator() {
        return lastTermIndicator;
    }

    /**
     * Sets the value of the lastTermIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTermIndicator(String value) {
        this.lastTermIndicator = value;
    }

}
