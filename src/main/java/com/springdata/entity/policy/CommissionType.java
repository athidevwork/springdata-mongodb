
package com.springdata.entity.policy;

import java.io.Serializable;

public class CommissionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String commissionRatePercent;
    protected String commissionAmount;
    protected String limitChargeAmount;
    protected String commissionBasisCode;
    protected CodeWithDesc rateScheduleCode;
    protected String commissionPayCode;
    protected String commissionTypeCode;

    /**
     * Gets the value of the commissionRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionRatePercent() {
        return commissionRatePercent;
    }

    /**
     * Sets the value of the commissionRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionRatePercent(String value) {
        this.commissionRatePercent = value;
    }

    /**
     * Gets the value of the commissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionAmount() {
        return commissionAmount;
    }

    /**
     * Sets the value of the commissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionAmount(String value) {
        this.commissionAmount = value;
    }

    /**
     * Gets the value of the limitChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitChargeAmount() {
        return limitChargeAmount;
    }

    /**
     * Sets the value of the limitChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitChargeAmount(String value) {
        this.limitChargeAmount = value;
    }

    /**
     * Gets the value of the commissionBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionBasisCode() {
        return commissionBasisCode;
    }

    /**
     * Sets the value of the commissionBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionBasisCode(String value) {
        this.commissionBasisCode = value;
    }

    /**
     * Gets the value of the rateScheduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getRateScheduleCode() {
        return rateScheduleCode;
    }

    /**
     * Sets the value of the rateScheduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setRateScheduleCode(CodeWithDesc value) {
        this.rateScheduleCode = value;
    }

    /**
     * Gets the value of the commissionPayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionPayCode() {
        return commissionPayCode;
    }

    /**
     * Sets the value of the commissionPayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionPayCode(String value) {
        this.commissionPayCode = value;
    }

    /**
     * Gets the value of the commissionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionTypeCode() {
        return commissionTypeCode;
    }

    /**
     * Sets the value of the commissionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionTypeCode(String value) {
        this.commissionTypeCode = value;
    }

}
