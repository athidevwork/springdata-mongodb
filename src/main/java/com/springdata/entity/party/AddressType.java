
package com.springdata.entity.party;

import java.io.Serializable;

public class AddressType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String AddressNumberId;
    protected String LineOne;
    protected String LineTwo;
    protected String LineThree;
    protected String CityName;
    protected String CountyCode;
    protected CodeWithDesc StateOrProvinceCode;
    protected String PostalCode;
    protected CodeWithDesc CountryCode;
    protected String CountryName;
    protected String AttentionName;
    protected CodeWithDesc PostOfficeAddressIndicator;
    protected String SourceTableName;
    protected String SourceRecordId;
    protected String Primaryaddress;
    protected String UsaAddress;
    protected String AddressSingleLine;
    protected String PhoneNumber;
    protected String AddressUsaZip;
    protected String ExpiredFlag;
    protected String ZipPlusFour;
    protected String Province;
    protected String LegacyDataId;
    protected String ExpiredAddressId;
    protected String CopiedAddressId;
    protected String ReinsControlAddr;
    protected String ExpiredComputed;
    protected String AddressCountyDesc;
    protected String Undeliverable;
    protected String AddrinmailOption;
    protected AdditionalInformationType AdditionalInformation;
    protected String Key;

    /**
     * Gets the value of the addressNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumberId() {
        return AddressNumberId;
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
        this.AddressNumberId = value;
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
        return LineOne;
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
        this.LineOne = value;
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
        return LineTwo;
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
        this.LineTwo = value;
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
        return LineThree;
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
        this.LineThree = value;
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
        return CityName;
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
        this.CityName = value;
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
        return CountyCode;
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
        this.CountyCode = value;
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
        return StateOrProvinceCode;
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
        this.StateOrProvinceCode = value;
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
        return PostalCode;
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
        this.PostalCode = value;
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
        return CountryCode;
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
        this.CountryCode = value;
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
        return CountryName;
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
        this.CountryName = value;
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
        return AttentionName;
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
        this.AttentionName = value;
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
        return PostOfficeAddressIndicator;
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
        this.PostOfficeAddressIndicator = value;
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
        return SourceTableName;
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
        this.SourceTableName = value;
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
     * Gets the value of the primaryaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryaddress() {
        return Primaryaddress;
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
        this.Primaryaddress = value;
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
        return UsaAddress;
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
        this.UsaAddress = value;
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
        return AddressSingleLine;
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
        this.AddressSingleLine = value;
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
     * Gets the value of the addressUsaZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressUsaZip() {
        return AddressUsaZip;
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
        this.AddressUsaZip = value;
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
        return ExpiredFlag;
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
        this.ExpiredFlag = value;
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
        return ZipPlusFour;
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
        this.ZipPlusFour = value;
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
        return Province;
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
        this.Province = value;
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
        return LegacyDataId;
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
        this.LegacyDataId = value;
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
        return ExpiredAddressId;
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
        this.ExpiredAddressId = value;
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
        return CopiedAddressId;
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
        this.CopiedAddressId = value;
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
        return ReinsControlAddr;
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
        this.ReinsControlAddr = value;
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
        return ExpiredComputed;
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
        this.ExpiredComputed = value;
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
        return AddressCountyDesc;
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
        this.AddressCountyDesc = value;
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
        return Undeliverable;
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
        this.Undeliverable = value;
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
        return AddrinmailOption;
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
        this.AddrinmailOption = value;
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
        return AdditionalInformation;
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
        this.AdditionalInformation = value;
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
		return "\n\t\t[AddressNumberId=" + AddressNumberId + ", LineOne=" + LineOne + ", LineTwo=" + LineTwo
				+ ", LineThree=" + LineThree + ", CityName=" + CityName + ", CountyCode=" + CountyCode
				+ ", StateOrProvinceCode=" + StateOrProvinceCode + ", PostalCode=" + PostalCode + ", CountryCode="
				+ CountryCode + ", CountryName=" + CountryName + ", AttentionName=" + AttentionName
				+ ", PostOfficeAddressIndicator=" + PostOfficeAddressIndicator + ", SourceTableName=" + SourceTableName
				+ ", SourceRecordId=" + SourceRecordId + ", Primaryaddress=" + Primaryaddress + ", UsaAddress="
				+ UsaAddress + ", AddressSingleLine=" + AddressSingleLine + ", PhoneNumber=" + PhoneNumber
				+ ", AddressUsaZip=" + AddressUsaZip + ", ExpiredFlag=" + ExpiredFlag + ", ZipPlusFour=" + ZipPlusFour
				+ ", Province=" + Province + ", LegacyDataId=" + LegacyDataId + ", ExpiredAddressId=" + ExpiredAddressId
				+ ", CopiedAddressId=" + CopiedAddressId + ", ReinsControlAddr=" + ReinsControlAddr
				+ ", ExpiredComputed=" + ExpiredComputed + ", AddressCountyDesc=" + AddressCountyDesc
				+ ", Undeliverable=" + Undeliverable + ", AddrinmailOption=" + AddrinmailOption
				+ ", AdditionalInformation=" + AdditionalInformation + ", Key=" + Key + "]";
	}
}
