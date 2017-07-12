
package com.springdata.entity.party;

import java.io.Serializable;

public class BasicPhoneNumberType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String phoneNumberId;
    protected CodeWithDesc phoneTypeCode;
    protected String phoneNumber;
    protected CodeWithDesc primaryIndicator;
    protected String sourceRecordId;
    protected String entityId;
    protected String areaCode;
    protected String phoneNumberFormatted;
    protected String fullPhoneNumberFormatted;
    protected String phoneExtension;
    protected CodeWithDesc usaNumber;
    protected CodeWithDesc listedNumber;
    protected CodeWithDesc permissionToRelease;
    protected CodeWithDesc sourceTableName;
    protected String addressReference;
    protected String key;

    /**
     * Gets the value of the phoneNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * Sets the value of the phoneNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberId(String value) {
        this.phoneNumberId = value;
    }

    /**
     * Gets the value of the phoneTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getPhoneTypeCode() {
        return phoneTypeCode;
    }

    /**
     * Sets the value of the phoneTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setPhoneTypeCode(CodeWithDesc value) {
        this.phoneTypeCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

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
     * Gets the value of the sourceRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRecordId() {
        return sourceRecordId;
    }

    /**
     * Sets the value of the sourceRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRecordId(String value) {
        this.sourceRecordId = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the phoneNumberFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberFormatted() {
        return phoneNumberFormatted;
    }

    /**
     * Sets the value of the phoneNumberFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberFormatted(String value) {
        this.phoneNumberFormatted = value;
    }

    /**
     * Gets the value of the fullPhoneNumberFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPhoneNumberFormatted() {
        return fullPhoneNumberFormatted;
    }

    /**
     * Sets the value of the fullPhoneNumberFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPhoneNumberFormatted(String value) {
        this.fullPhoneNumberFormatted = value;
    }

    /**
     * Gets the value of the phoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Sets the value of the phoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
    }

    /**
     * Gets the value of the usaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getUsaNumber() {
        return usaNumber;
    }

    /**
     * Sets the value of the usaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setUsaNumber(CodeWithDesc value) {
        this.usaNumber = value;
    }

    /**
     * Gets the value of the listedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getListedNumber() {
        return listedNumber;
    }

    /**
     * Sets the value of the listedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setListedNumber(CodeWithDesc value) {
        this.listedNumber = value;
    }

    /**
     * Gets the value of the permissionToRelease property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getPermissionToRelease() {
        return permissionToRelease;
    }

    /**
     * Sets the value of the permissionToRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setPermissionToRelease(CodeWithDesc value) {
        this.permissionToRelease = value;
    }

    /**
     * Gets the value of the sourceTableName property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getSourceTableName() {
        return sourceTableName;
    }

    /**
     * Sets the value of the sourceTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setSourceTableName(CodeWithDesc value) {
        this.sourceTableName = value;
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
