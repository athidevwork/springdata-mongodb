
package com.springdata.entity.policy;

import java.io.Serializable;

public class CancellationInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String cancellationMethodCode;
    protected String reason;
    protected String date;
    protected String cancelLevel;
    protected String cancelType;
    protected String accountingDate;
    protected String limitShareTail;
    protected String dedShareTail;
    protected String shareType;
    protected String limitShareGroupDesc;
    protected String deductShareGroupDesc;

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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the cancelLevel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCancelLevel() {
        return cancelLevel;
    }

    /**
     * Sets the value of the cancelLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCancelLevel(String value) {
        this.cancelLevel = value;
    }

    /**
     * Gets the value of the cancelType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCancelType() {
        return cancelType;
    }

    /**
     * Sets the value of the cancelType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCancelType(String value) {
        this.cancelType = value;
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
     * Gets the value of the limitShareTail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLimitShareTail() {
        return limitShareTail;
    }

    /**
     * Sets the value of the limitShareTail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLimitShareTail(String value) {
        this.limitShareTail = value;
    }

    /**
     * Gets the value of the dedShareTail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDedShareTail() {
        return dedShareTail;
    }

    /**
     * Sets the value of the dedShareTail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDedShareTail(String value) {
        this.dedShareTail = value;
    }

    /**
     * Gets the value of the shareType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShareType() {
        return shareType;
    }

    /**
     * Sets the value of the shareType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShareType(String value) {
        this.shareType = value;
    }

    /**
     * Gets the value of the limitShareGroupDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLimitShareGroupDesc() {
        return limitShareGroupDesc;
    }

    /**
     * Sets the value of the limitShareGroupDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLimitShareGroupDesc(String value) {
        this.limitShareGroupDesc = value;
    }

    /**
     * Gets the value of the deductShareGroupDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeductShareGroupDesc() {
        return deductShareGroupDesc;
    }

    /**
     * Sets the value of the deductShareGroupDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeductShareGroupDesc(String value) {
        this.deductShareGroupDesc = value;
    }
}
