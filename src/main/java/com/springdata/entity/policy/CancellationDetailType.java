
package com.springdata.entity.policy;

import java.io.Serializable;

public class CancellationDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String cancellationDate;
    protected String cancellationReasonCode;
    protected String cancellationLevel;
    protected String cancellationComments;
    protected String cancellationMethod;
    protected String cancellationType;
    protected String accountingDate;
    protected String markAsDdl;
    protected String ddlComments;
    protected String ddlReason;
    protected String selectToDdl;
    protected String addToIbnrInactiveB;

    /**
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationDate(String value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the cancellationReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationReasonCode() {
        return cancellationReasonCode;
    }

    /**
     * Sets the value of the cancellationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationReasonCode(String value) {
        this.cancellationReasonCode = value;
    }

    /**
     * Gets the value of the cancellationLevel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCancellationLevel() {
        return cancellationLevel;
    }

    /**
     * Sets the value of the cancellationLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCancellationLevel(String value) {
        this.cancellationLevel = value;
    }

    /**
     * Gets the value of the cancellationComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationComments() {
        return cancellationComments;
    }

    /**
     * Sets the value of the cancellationComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationComments(String value) {
        this.cancellationComments = value;
    }

    /**
     * Gets the value of the cancellationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationMethod() {
        return cancellationMethod;
    }

    /**
     * Sets the value of the cancellationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationMethod(String value) {
        this.cancellationMethod = value;
    }

    /**
     * Gets the value of the cancellationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationType() {
        return cancellationType;
    }

    /**
     * Sets the value of the cancellationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationType(String value) {
        this.cancellationType = value;
    }

    /**
     * Gets the value of the accountingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingDate() {
        return accountingDate;
    }

    /**
     * Sets the value of the accountingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingDate(String value) {
        this.accountingDate = value;
    }

    /**
     * Gets the value of the markAsDdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkAsDdl() {
        return markAsDdl;
    }

    /**
     * Sets the value of the markAsDdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkAsDdl(String value) {
        this.markAsDdl = value;
    }

    /**
     * Gets the value of the ddlComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdlComments() {
        return ddlComments;
    }

    /**
     * Sets the value of the ddlComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdlComments(String value) {
        this.ddlComments = value;
    }

    /**
     * Gets the value of the ddlReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdlReason() {
        return ddlReason;
    }

    /**
     * Sets the value of the ddlReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdlReason(String value) {
        this.ddlReason = value;
    }

    /**
     * Gets the value of the selectToDdl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSelectToDdl() {
        return selectToDdl;
    }

    /**
     * Sets the value of the selectToDdl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSelectToDdl(String value) {
        this.selectToDdl = value;
    }

    /**
     * Gets the value of the addToIbnrInactiveB property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */

    public String getAddToIbnrInactiveB() {
        return addToIbnrInactiveB;
    }

    /**
     * Sets the value of the addToIbnrInactiveB property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddToIbnrInactiveB(String value) {
        this.addToIbnrInactiveB = value;
    }

}
