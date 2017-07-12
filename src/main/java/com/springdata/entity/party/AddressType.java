
package com.springdata.entity.party;

import java.io.Serializable;

public class AddressType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String addressNumberId;
    protected String lineOne;
    protected String lineTwo;
    protected String lineThree;
    protected String cityName;
    protected String countyCode;
    protected CodeWithDesc stateOrProvinceCode;
    protected String postalCode;
    protected CodeWithDesc countryCode;
    protected String countryName;
    protected String attentionName;
    protected CodeWithDesc postOfficeAddressIndicator;
    protected String sourceTableName;
    protected String sourceRecordId;
    protected String primaryaddress;
    protected String usaAddress;
    protected String addressSingleLine;
    protected String phoneNumber;
    protected String addressUsaZip;
    protected String expiredFlag;
    protected String zipPlusFour;
    protected String province;
    protected String legacyDataId;
    protected String expiredAddressId;
    protected String copiedAddressId;
    protected String reinsControlAddr;
    protected String expiredComputed;
    protected String addressCountyDesc;
    protected String undeliverable;
    protected String addrinmailOption;
    protected AdditionalInformationType additionalInformation;
    protected String key;

    /**
     * Gets the value of the addressNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumberId() {
        return addressNumberId;
    }

    /**
     * Sets the value of the addressNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumberId(String value) {
        this.addressNumberId = value;
    }

    /**
     * Gets the value of the lineOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOne() {
        return lineOne;
    }

    /**
     * Sets the value of the lineOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOne(String value) {
        this.lineOne = value;
    }

    /**
     * Gets the value of the lineTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineTwo() {
        return lineTwo;
    }

    /**
     * Sets the value of the lineTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineTwo(String value) {
        this.lineTwo = value;
    }

    /**
     * Gets the value of the lineThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineThree() {
        return lineThree;
    }

    /**
     * Sets the value of the lineThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineThree(String value) {
        this.lineThree = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyCode(String value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the stateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * Sets the value of the stateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setStateOrProvinceCode(CodeWithDesc value) {
        this.stateOrProvinceCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setCountryCode(CodeWithDesc value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the attentionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttentionName() {
        return attentionName;
    }

    /**
     * Sets the value of the attentionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttentionName(String value) {
        this.attentionName = value;
    }

    /**
     * Gets the value of the postOfficeAddressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getPostOfficeAddressIndicator() {
        return postOfficeAddressIndicator;
    }

    /**
     * Sets the value of the postOfficeAddressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setPostOfficeAddressIndicator(CodeWithDesc value) {
        this.postOfficeAddressIndicator = value;
    }

    /**
     * Gets the value of the sourceTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * Sets the value of the sourceTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTableName(String value) {
        this.sourceTableName = value;
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
     * Gets the value of the primaryaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryaddress() {
        return primaryaddress;
    }

    /**
     * Sets the value of the primaryaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryaddress(String value) {
        this.primaryaddress = value;
    }

    /**
     * Gets the value of the usaAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsaAddress() {
        return usaAddress;
    }

    /**
     * Sets the value of the usaAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsaAddress(String value) {
        this.usaAddress = value;
    }

    /**
     * Gets the value of the addressSingleLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSingleLine() {
        return addressSingleLine;
    }

    /**
     * Sets the value of the addressSingleLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSingleLine(String value) {
        this.addressSingleLine = value;
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
     * Gets the value of the addressUsaZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressUsaZip() {
        return addressUsaZip;
    }

    /**
     * Sets the value of the addressUsaZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressUsaZip(String value) {
        this.addressUsaZip = value;
    }

    /**
     * Gets the value of the expiredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredFlag() {
        return expiredFlag;
    }

    /**
     * Sets the value of the expiredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredFlag(String value) {
        this.expiredFlag = value;
    }

    /**
     * Gets the value of the zipPlusFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipPlusFour() {
        return zipPlusFour;
    }

    /**
     * Sets the value of the zipPlusFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipPlusFour(String value) {
        this.zipPlusFour = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the legacyDataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyDataId() {
        return legacyDataId;
    }

    /**
     * Sets the value of the legacyDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyDataId(String value) {
        this.legacyDataId = value;
    }

    /**
     * Gets the value of the expiredAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredAddressId() {
        return expiredAddressId;
    }

    /**
     * Sets the value of the expiredAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredAddressId(String value) {
        this.expiredAddressId = value;
    }

    /**
     * Gets the value of the copiedAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopiedAddressId() {
        return copiedAddressId;
    }

    /**
     * Sets the value of the copiedAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopiedAddressId(String value) {
        this.copiedAddressId = value;
    }

    /**
     * Gets the value of the reinsControlAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReinsControlAddr() {
        return reinsControlAddr;
    }

    /**
     * Sets the value of the reinsControlAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReinsControlAddr(String value) {
        this.reinsControlAddr = value;
    }

    /**
     * Gets the value of the expiredComputed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredComputed() {
        return expiredComputed;
    }

    /**
     * Sets the value of the expiredComputed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredComputed(String value) {
        this.expiredComputed = value;
    }

    /**
     * Gets the value of the addressCountyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCountyDesc() {
        return addressCountyDesc;
    }

    /**
     * Sets the value of the addressCountyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCountyDesc(String value) {
        this.addressCountyDesc = value;
    }

    /**
     * Gets the value of the undeliverable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndeliverable() {
        return undeliverable;
    }

    /**
     * Sets the value of the undeliverable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndeliverable(String value) {
        this.undeliverable = value;
    }

    /**
     * Gets the value of the addrinmailOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrinmailOption() {
        return addrinmailOption;
    }

    /**
     * Sets the value of the addrinmailOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrinmailOption(String value) {
        this.addrinmailOption = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformationType }
     *     
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformationType }
     *     
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
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
