
package com.springdata.entity.policy;

import java.io.Serializable;

public class CreditStackingHeaderInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String categoryCode;
    protected CodeWithDesc ruleCode;
    protected String categoryRank;
    protected String categoryDesc;
    protected String capCredit;
    protected String capDebit;
    protected String selOrder;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the ruleCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getRuleCode() {
        return ruleCode;
    }

    /**
     * Sets the value of the ruleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setRuleCode(CodeWithDesc value) {
        this.ruleCode = value;
    }

    /**
     * Gets the value of the categoryRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryRank() {
        return categoryRank;
    }

    /**
     * Sets the value of the categoryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryRank(String value) {
        this.categoryRank = value;
    }

    /**
     * Gets the value of the categoryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /**
     * Sets the value of the categoryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDesc(String value) {
        this.categoryDesc = value;
    }

    /**
     * Gets the value of the capCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapCredit() {
        return capCredit;
    }

    /**
     * Sets the value of the capCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapCredit(String value) {
        this.capCredit = value;
    }

    /**
     * Gets the value of the capDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapDebit() {
        return capDebit;
    }

    /**
     * Sets the value of the capDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapDebit(String value) {
        this.capDebit = value;
    }

    /**
     * Gets the value of the selOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelOrder() {
        return selOrder;
    }

    /**
     * Sets the value of the selOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelOrder(String value) {
        this.selOrder = value;
    }

}
