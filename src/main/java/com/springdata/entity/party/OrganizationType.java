
package com.springdata.entity.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrganizationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String OrganizationNumberId;
    protected String ClientId;
    protected String ExternalReferenceId;
    protected String FeinId;
    protected OrganizationNameType OrganizationName;
    protected CommonInformationType CommonInformation;
    protected List<BusinessEmailType> BusinessEmail;
    protected List<BasicPhoneNumberType> BasicPhoneNumber;
    protected List<BasicAddressType> BasicAddress;
    protected List<ProfessionalLicenseType> ProfessionalLicense;
    protected List<CertificationType> Certification;
    protected List<PartyNoteType> PartyNote;
    protected List<ContactType> Contact;
    protected List<RelationshipType> Relationship;
    protected List<PartyClassificationType> PartyClassification;
    protected List<PredecessorFirmType> PredecessorFirm;
    protected String Key;
    
	public String getOrganizationNumberId() {
		return OrganizationNumberId;
	}
	public void setOrganizationNumberId(String organizationNumberId) {
		OrganizationNumberId = organizationNumberId;
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
	public String getFeinId() {
		return FeinId;
	}
	public void setFeinId(String feinId) {
		FeinId = feinId;
	}
	public OrganizationNameType getOrganizationName() {
		return OrganizationName;
	}
	public void setOrganizationName(OrganizationNameType organizationName) {
		OrganizationName = organizationName;
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
	public List<PartyNoteType> getPartyNote() {
		return PartyNote;
	}
	public void setPartyNote(List<PartyNoteType> partyNote) {
		PartyNote = partyNote;
	}
	public List<ContactType> getContact() {
		return Contact;
	}
	public void setContact(List<ContactType> contact) {
		Contact = contact;
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
	public List<PredecessorFirmType> getPredecessorFirm() {
		return PredecessorFirm;
	}
	public void setPredecessorFirm(List<PredecessorFirmType> predecessorFirm) {
		PredecessorFirm = predecessorFirm;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "\n\t\t[OrganizationNumberId=" + OrganizationNumberId + ", ClientId=" + ClientId
				+ ", ExternalReferenceId=" + ExternalReferenceId + ", FeinId=" + FeinId + ", OrganizationName="
				+ OrganizationName + ", CommonInformation=" + CommonInformation + ", BusinessEmail=" + BusinessEmail
				+ ", BasicPhoneNumber=" + BasicPhoneNumber + ", BasicAddress=" + BasicAddress + ", ProfessionalLicense="
				+ ProfessionalLicense + ", Certification=" + Certification + ", PartyNote=" + PartyNote + ", Contact="
				+ Contact + ", Relationship=" + Relationship + ", PartyClassification=" + PartyClassification
				+ ", PredecessorFirm=" + PredecessorFirm + ", Key=" + Key + "]";
	}
}
