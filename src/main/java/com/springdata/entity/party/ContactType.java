
package com.springdata.entity.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContactType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ContactNumberId;
    protected String EntityId;
    protected String Primary;
    protected String PrimaryComputed;
    protected String NameComputed;
    protected String SocialSecurityNumber;
    protected String Title;
    protected EffectivePeriodType EffectivePeriod;
    protected String AreaCode;
    protected String ContactType;
    protected String AddressId;
    protected String NoteInd;
    protected String FaxAreaCode;
    protected String FaxPhoneNumber;
    protected PersonNameType PersonName;
    protected List<BusinessEmailType> BusinessEmail;
    protected List<BasicPhoneNumberType> BasicPhoneNumber;
    protected AdditionalInformationType AdditionalInformation;
    protected String Key;
	public String getContactNumberId() {
		return ContactNumberId;
	}
	public void setContactNumberId(String contactNumberId) {
		ContactNumberId = contactNumberId;
	}
	public String getEntityId() {
		return EntityId;
	}
	public void setEntityId(String entityId) {
		EntityId = entityId;
	}
	public String getPrimary() {
		return Primary;
	}
	public void setPrimary(String primary) {
		Primary = primary;
	}
	public String getPrimaryComputed() {
		return PrimaryComputed;
	}
	public void setPrimaryComputed(String primaryComputed) {
		PrimaryComputed = primaryComputed;
	}
	public String getNameComputed() {
		return NameComputed;
	}
	public void setNameComputed(String nameComputed) {
		NameComputed = nameComputed;
	}
	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		SocialSecurityNumber = socialSecurityNumber;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getAreaCode() {
		return AreaCode;
	}
	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}
	public String getContactType() {
		return ContactType;
	}
	public void setContactType(String contactType) {
		ContactType = contactType;
	}
	public String getAddressId() {
		return AddressId;
	}
	public void setAddressId(String addressId) {
		AddressId = addressId;
	}
	public String getNoteInd() {
		return NoteInd;
	}
	public void setNoteInd(String noteInd) {
		NoteInd = noteInd;
	}
	public String getFaxAreaCode() {
		return FaxAreaCode;
	}
	public void setFaxAreaCode(String faxAreaCode) {
		FaxAreaCode = faxAreaCode;
	}
	public String getFaxPhoneNumber() {
		return FaxPhoneNumber;
	}
	public void setFaxPhoneNumber(String faxPhoneNumber) {
		FaxPhoneNumber = faxPhoneNumber;
	}
	public PersonNameType getPersonName() {
		return PersonName;
	}
	public void setPersonName(PersonNameType personName) {
		PersonName = personName;
	}
	public List<BusinessEmailType> getBusinessEmail() {
		return BusinessEmail;
	}
	public void setBusinessEmail(List<BusinessEmailType> businessEmail) {
		BusinessEmail = businessEmail;
	}
	public List<BasicPhoneNumberType> getBasicPhoneNumber() {
		return BasicPhoneNumber;
	}
	public void setBasicPhoneNumber(List<BasicPhoneNumberType> basicPhoneNumber) {
		BasicPhoneNumber = basicPhoneNumber;
	}
	public AdditionalInformationType getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(AdditionalInformationType additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[ContactNumberId=" + ContactNumberId + ", EntityId=" + EntityId + ", Primary=" + Primary
				+ ", PrimaryComputed=" + PrimaryComputed + ", NameComputed=" + NameComputed + ", SocialSecurityNumber="
				+ SocialSecurityNumber + ", Title=" + Title + ", EffectivePeriod=" + EffectivePeriod + ", AreaCode="
				+ AreaCode + ", ContactType=" + ContactType + ", AddressId=" + AddressId + ", NoteInd=" + NoteInd
				+ ", FaxAreaCode=" + FaxAreaCode + ", FaxPhoneNumber=" + FaxPhoneNumber + ", PersonName=" + PersonName
				+ ", BusinessEmail=" + BusinessEmail + ", BasicPhoneNumber=" + BasicPhoneNumber
				+ ", AdditionalInformation=" + AdditionalInformation + ", Key=" + Key + "]";
	}
}
