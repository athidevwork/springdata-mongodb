
package com.springdata.entity.party;

import java.io.Serializable;

public class BasicAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CodeWithDesc primaryIndicator;
    protected CodeWithDesc futurePrimaryIndicator;
    protected CodeWithDesc addressTypeCode;
    protected EffectivePeriodType addressPeriod;
    protected String addressReference;
    protected String key;

    /**
     * Gets the value of the primaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * Sets the value of the primaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setPrimaryIndicator(CodeWithDesc value) {
        this.primaryIndicator = value;
    }

    /**
     * Gets the value of the futurePrimaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getFuturePrimaryIndicator() {
        return futurePrimaryIndicator;
    }

    /**
     * Sets the value of the futurePrimaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setFuturePrimaryIndicator(CodeWithDesc value) {
        this.futurePrimaryIndicator = value;
    }

    /**
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setAddressTypeCode(CodeWithDesc value) {
        this.addressTypeCode = value;
    }

    /**
     * Gets the value of the addressPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getAddressPeriod() {
        return addressPeriod;
    }

    /**
     * Sets the value of the addressPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setAddressPeriod(EffectivePeriodType value) {
        this.addressPeriod = value;
    }

    /**
     * Gets the value of the addressReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressReference() {
        return addressReference;
    }

    /**
     * Sets the value of the addressReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressReference(String value) {
        this.addressReference = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
