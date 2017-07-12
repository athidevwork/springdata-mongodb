
package com.springdata.entity.policy;

import java.io.Serializable;

public class ChangeDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String changeDesc;
    protected String covgPart;
    protected String risk;
    protected String coverage;
    protected String covgClass;
    protected String component;
    protected String from;
    protected String to;

    /**
     * Gets the value of the changeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeDesc() {
        return changeDesc;
    }

    /**
     * Sets the value of the changeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeDesc(String value) {
        this.changeDesc = value;
    }

    /**
     * Gets the value of the covgPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCovgPart() {
        return covgPart;
    }

    /**
     * Sets the value of the covgPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCovgPart(String value) {
        this.covgPart = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisk(String value) {
        this.risk = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the covgClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCovgClass() {
        return covgClass;
    }

    /**
     * Sets the value of the covgClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCovgClass(String value) {
        this.covgClass = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

}
