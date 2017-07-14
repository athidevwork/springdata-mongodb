
package com.springdata.entity.party;

import java.io.Serializable;

public class BasicPhoneNumberType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PhoneNumberId;
    protected CodeWithDesc PhoneTypeCode;
    protected String PhoneNumber;
    protected CodeWithDesc PrimaryIndicator;
    protected String SourceRecordId;
    protected String EntityId;
    protected String AreaCode;
    protected String PhoneNumberFormatted;
    protected String FullPhoneNumberFormatted;
    protected String PhoneExtension;
    protected CodeWithDesc UsaNumber;
    protected CodeWithDesc ListedNumber;
    protected CodeWithDesc PermissionToRelease;
    protected CodeWithDesc SourceTableName;
    protected String AddressReference;
    protected String Key;

    /**
     * Gets the value of the phoneNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberId() {
        return PhoneNumberId;
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
        this.PhoneNumberId = value;
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
        return PhoneTypeCode;
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
        this.PhoneTypeCode = value;
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
        return PhoneNumber;
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
        this.PhoneNumber = value;
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
     * Gets the value of the sourceRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRecordId() {
        return SourceRecordId;
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
        this.SourceRecordId = value;
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
        return EntityId;
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
        this.EntityId = value;
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
        return AreaCode;
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
        this.AreaCode = value;
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
        return PhoneNumberFormatted;
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
        this.PhoneNumberFormatted = value;
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
        return FullPhoneNumberFormatted;
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
        this.FullPhoneNumberFormatted = value;
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
        return PhoneExtension;
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
        this.PhoneExtension = value;
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
        return UsaNumber;
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
        this.UsaNumber = value;
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
        return ListedNumber;
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
        this.ListedNumber = value;
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
        return PermissionToRelease;
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
        this.PermissionToRelease = value;
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
        return SourceTableName;
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
        this.SourceTableName = value;
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
		return "[PhoneNumberId=" + PhoneNumberId + ", PhoneTypeCode=" + PhoneTypeCode
				+ ", PhoneNumber=" + PhoneNumber + ", PrimaryIndicator=" + PrimaryIndicator + ", SourceRecordId="
				+ SourceRecordId + ", EntityId=" + EntityId + ", AreaCode=" + AreaCode + ", PhoneNumberFormatted="
				+ PhoneNumberFormatted + ", FullPhoneNumberFormatted=" + FullPhoneNumberFormatted + ", PhoneExtension="
				+ PhoneExtension + ", UsaNumber=" + UsaNumber + ", ListedNumber=" + ListedNumber
				+ ", PermissionToRelease=" + PermissionToRelease + ", SourceTableName=" + SourceTableName
				+ ", AddressReference=" + AddressReference + ", Key=" + Key + "]";
	}

}
