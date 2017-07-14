
package com.springdata.entity.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PersonNumberId;
    protected String ClientId;
    protected String ExternalReferenceId;
    protected String GenderCode;
    protected String SocialSecurityNumberId;
    protected String BirthDate;
    protected String Title;
    protected String MaritalStatus;
    protected String DateOfDeath;
    protected String Deceased;
    protected String Minor;
    protected String MinorBComputedId;
    protected String FeinId;
    protected PersonNameType PersonName;
    protected CommonInformationType CommonInformation;
    protected List<BusinessEmailType> BusinessEmail;
    protected List<BasicPhoneNumberType> BasicPhoneNumber;
    protected List<BasicAddressType> BasicAddress;
    protected List<EducationInformationType> EducationInformation;
    protected List<ProfessionalLicenseType> ProfessionalLicense;
    protected List<CertificationType> Certification;
    protected List<ContactType> Contact;
    protected List<PartyNoteType> PartyNote;
    protected List<RelationshipType> Relationship;
    protected List<PartyClassificationType> PartyClassification;
    protected List<TrainingType> Training;
    protected String Key;
    
	public String getPersonNumberId() {
		return PersonNumberId;
	}
	public void setPersonNumberId(String personNumberId) {
		PersonNumberId = personNumberId;
	}
	public String getClientId() {
		return ClientId;
	}
	public void setClientId(String clientId) {
		ClientId = clientId;
	}
	public String getExternalReferenceId() {
		return ExternalReferenceId;
	}
	public void setExternalReferenceId(String externalReferenceId) {
		ExternalReferenceId = externalReferenceId;
	}
	public String getGenderCode() {
		return GenderCode;
	}
	public void setGenderCode(String genderCode) {
		GenderCode = genderCode;
	}
	public String getSocialSecurityNumberId() {
		return SocialSecurityNumberId;
	}
	public void setSocialSecurityNumberId(String socialSecurityNumberId) {
		SocialSecurityNumberId = socialSecurityNumberId;
	}
	public String getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getDateOfDeath() {
		return DateOfDeath;
	}
	public void setDateOfDeath(String dateOfDeath) {
		DateOfDeath = dateOfDeath;
	}
	public String getDeceased() {
		return Deceased;
	}
	public void setDeceased(String deceased) {
		Deceased = deceased;
	}
	public String getMinor() {
		return Minor;
	}
	public void setMinor(String minor) {
		Minor = minor;
	}
	public String getMinorBComputedId() {
		return MinorBComputedId;
	}
	public void setMinorBComputedId(String minorBComputedId) {
		MinorBComputedId = minorBComputedId;
	}
	public String getFeinId() {
		return FeinId;
	}
	public void setFeinId(String feinId) {
		FeinId = feinId;
	}
	public PersonNameType getPersonName() {
		return PersonName;
	}
	public void setPersonName(PersonNameType personName) {
		PersonName = personName;
	}
	public CommonInformationType getCommonInformation() {
		return CommonInformation;
	}
	public void setCommonInformation(CommonInformationType commonInformation) {
		CommonInformation = commonInformation;
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
	public List<BasicAddressType> getBasicAddress() {
		return BasicAddress;
	}
	public void setBasicAddress(List<BasicAddressType> basicAddress) {
		BasicAddress = basicAddress;
	}
	public List<EducationInformationType> getEducationInformation() {
		return EducationInformation;
	}
	public void setEducationInformation(List<EducationInformationType> educationInformation) {
		EducationInformation = educationInformation;
	}
	public List<ProfessionalLicenseType> getProfessionalLicense() {
		return ProfessionalLicense;
	}
	public void setProfessionalLicense(List<ProfessionalLicenseType> professionalLicense) {
		ProfessionalLicense = professionalLicense;
	}
	public List<CertificationType> getCertification() {
		return Certification;
	}
	public void setCertification(List<CertificationType> certification) {
		Certification = certification;
	}
	public List<ContactType> getContact() {
		return Contact;
	}
	public void setContact(List<ContactType> contact) {
		Contact = contact;
	}
	public List<PartyNoteType> getPartyNote() {
		return PartyNote;
	}
	public void setPartyNote(List<PartyNoteType> partyNote) {
		PartyNote = partyNote;
	}
	public List<RelationshipType> getRelationship() {
		return Relationship;
	}
	public void setRelationship(List<RelationshipType> relationship) {
		Relationship = relationship;
	}
	public List<PartyClassificationType> getPartyClassification() {
		return PartyClassification;
	}
	public void setPartyClassification(List<PartyClassificationType> partyClassification) {
		PartyClassification = partyClassification;
	}
	public List<TrainingType> getTraining() {
		return Training;
	}
	public void setTraining(List<TrainingType> training) {
		Training = training;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "\n\t\t[PersonNumberId=" + PersonNumberId + ", ClientId=" + ClientId + ", ExternalReferenceId="
				+ ExternalReferenceId + ", GenderCode=" + GenderCode + ", SocialSecurityNumberId="
				+ SocialSecurityNumberId + ", BirthDate=" + BirthDate + ", Title=" + Title + ", MaritalStatus="
				+ MaritalStatus + ", DateOfDeath=" + DateOfDeath + ", Deceased=" + Deceased + ", Minor=" + Minor
				+ ", MinorBComputedId=" + MinorBComputedId + ", FeinId=" + FeinId + ", PersonName=" + PersonName
				+ ", CommonInformation=" + CommonInformation + ", BusinessEmail=" + BusinessEmail
				+ ", BasicPhoneNumber=" + BasicPhoneNumber + ", BasicAddress=" + BasicAddress
				+ ", EducationInformation=" + EducationInformation + ", ProfessionalLicense=" + ProfessionalLicense
				+ ", Certification=" + Certification + ", Contact=" + Contact + ", PartyNote=" + PartyNote
				+ ", Relationship=" + Relationship + ", PartyClassification=" + PartyClassification + ", Training="
				+ Training + ", Key=" + Key + "]";
	}
}
