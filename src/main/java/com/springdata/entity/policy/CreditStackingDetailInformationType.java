
package com.springdata.entity.policy;

import java.io.Serializable;

public class CreditStackingDetailInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String componentCode;
    protected String componentType;
    protected String componentDescription;
    protected String categoryDescription;
    protected EffectivePeriodType effectivePeriod;
    protected String bucketCode;
    protected String winningBucket;
    protected String initFactor;
    protected String compFactor;
    protected String deltaFactor;
    protected String actionText;

    /**
     * Gets the value of the componentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentCode() {
        return componentCode;
    }

    /**
     * Sets the value of the componentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentCode(String value) {
        this.componentCode = value;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the componentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDescription() {
        return componentDescription;
    }

    /**
     * Sets the value of the componentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDescription(String value) {
        this.componentDescription = value;
    }

    /**
     * Gets the value of the categoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * Sets the value of the categoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDescription(String value) {
        this.categoryDescription = value;
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
     * Gets the value of the bucketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketCode() {
        return bucketCode;
    }

    /**
     * Sets the value of the bucketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketCode(String value) {
        this.bucketCode = value;
    }

    /**
     * Gets the value of the winningBucket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinningBucket() {
        return winningBucket;
    }

    /**
     * Sets the value of the winningBucket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinningBucket(String value) {
        this.winningBucket = value;
    }

    /**
     * Gets the value of the initFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitFactor() {
        return initFactor;
    }

    /**
     * Sets the value of the initFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitFactor(String value) {
        this.initFactor = value;
    }

    /**
     * Gets the value of the compFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompFactor() {
        return compFactor;
    }

    /**
     * Sets the value of the compFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompFactor(String value) {
        this.compFactor = value;
    }

    /**
     * Gets the value of the deltaFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltaFactor() {
        return deltaFactor;
    }

    /**
     * Sets the value of the deltaFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltaFactor(String value) {
        this.deltaFactor = value;
    }

    /**
     * Gets the value of the actionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionText() {
        return actionText;
    }

    /**
     * Sets the value of the actionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionText(String value) {
        this.actionText = value;
    }

}
