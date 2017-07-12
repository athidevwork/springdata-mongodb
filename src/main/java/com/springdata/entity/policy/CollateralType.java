
package com.springdata.entity.policy;

import java.io.Serializable;

public class CollateralType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String policyReinsuranceNumberId;
    protected String contractNO;
    protected EffectivePeriodType effectivePeriod;
    protected String type;
    protected String amount;
    protected String note;

    /**
     * Gets the value of the policyReinsuranceNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyReinsuranceNumberId() {
        return policyReinsuranceNumberId;
    }

    /**
     * Sets the value of the policyReinsuranceNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyReinsuranceNumberId(String value) {
        this.policyReinsuranceNumberId = value;
    }

    /**
     * Gets the value of the contractNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNO() {
        return contractNO;
    }

    /**
     * Sets the value of the contractNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNO(String value) {
        this.contractNO = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setEffectivePeriod(EffectivePeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
