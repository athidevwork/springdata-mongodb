
package com.springdata.entity.party;

import java.io.Serializable;

public class BasicAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CodeWithDesc PrimaryIndicator;
    protected CodeWithDesc FuturePrimaryIndicator;
    protected CodeWithDesc AddressTypeCode;
    protected EffectivePeriodType AddressPeriod;
    protected String AddressReference;
    protected String Key;

    /**
     * Gets the value of the primaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getPrimaryIndicator() {
        return PrimaryIndicator;
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
        this.PrimaryIndicator = value;
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
        return FuturePrimaryIndicator;
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
        this.FuturePrimaryIndicator = value;
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
        return AddressTypeCode;
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
        this.AddressTypeCode = value;
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
        return AddressPeriod;
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
        this.AddressPeriod = value;
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
        return AddressReference;
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
        this.AddressReference = value;
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
        return Key;
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
        this.Key = value;
    }

	@Override
	public String toString() {
		return "[PrimaryIndicator=" + PrimaryIndicator + ", FuturePrimaryIndicator="
				+ FuturePrimaryIndicator + ", AddressTypeCode=" + AddressTypeCode + ", AddressPeriod=" + AddressPeriod
				+ ", AddressReference=" + AddressReference + ", Key=" + Key + "]";
	}

}
