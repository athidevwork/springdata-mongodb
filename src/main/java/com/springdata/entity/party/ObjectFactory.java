
package com.springdata.entity.party;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/*
 *
 * Revision Date    Revised By  Description
 * ---------------------------------------------------
 * 07/29/2016       Arun        177966 - Implement GAP Changes for Party
*/

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.delphi_tech.ows.party package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Property_QNAME = new QName("http://www.delphi-tech.com/ows/Party", "Property");
    private final static QName _Organization_QNAME = new QName("http://www.delphi-tech.com/ows/Party", "Organization");
    private final static QName _Address_QNAME = new QName("http://www.delphi-tech.com/ows/Party", "Address");
    private final static QName _Person_QNAME = new QName("http://www.delphi-tech.com/ows/Party", "Person");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.delphi_tech.ows.party
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link OrganizationNameType }
     * 
     */
    public OrganizationNameType createOrganizationNameType() {
        return new OrganizationNameType();
    }

    /**
     * Create an instance of {@link PropertyNameType }
     * 
     */
    public PropertyNameType createPropertyNameType() {
        return new PropertyNameType();
    }

    /**
     * Create an instance of {@link EducationInformationType }
     * 
     */
    public EducationInformationType createEducationInformationType() {
        return new EducationInformationType();
    }

    /**
     * Create an instance of {@link PartyNoteType }
     * 
     */
    public PartyNoteType createPartyNoteType() {
        return new PartyNoteType();
    }

    /**
     * Create an instance of {@link ReferredPartyType }
     * 
     */
    public ReferredPartyType createReferredPartyType() {
        return new ReferredPartyType();
    }

    /**
     * Create an instance of {@link TrainingType }
     * 
     */
    public TrainingType createTrainingType() {
        return new TrainingType();
    }

    /**
     * Create an instance of {@link AdditionalDataType }
     * 
     */
    public AdditionalDataType createAdditionalDataType() {
        return new AdditionalDataType();
    }

    /**
     * Create an instance of {@link PredecessorFirmType }
     * 
     */
    public PredecessorFirmType createPredecessorFirmType() {
        return new PredecessorFirmType();
    }

    /**
     * Create an instance of {@link SpecialHandlingPartyType }
     * 
     */
    public SpecialHandlingPartyType createSpecialHandlingPartyType() {
        return new SpecialHandlingPartyType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link SuspensionReinstatementInformationType }
     * 
     */
    public SuspensionReinstatementInformationType createSuspensionReinstatementInformationType() {
        return new SuspensionReinstatementInformationType();
    }

    /**
     * Create an instance of {@link BusinessEmailType }
     * 
     */
    public BusinessEmailType createBusinessEmailType() {
        return new BusinessEmailType();
    }

    /**
     * Create an instance of {@link EducationalInstitutionType }
     * 
     */
    public EducationalInstitutionType createEducationalInstitutionType() {
        return new EducationalInstitutionType();
    }

    /**
     * Create an instance of {@link ProfessionalLicenseType }
     * 
     */
    public ProfessionalLicenseType createProfessionalLicenseType() {
        return new ProfessionalLicenseType();
    }

    /**
     * Create an instance of {@link EffectivePeriodType }
     * 
     */
    public EffectivePeriodType createEffectivePeriodType() {
        return new EffectivePeriodType();
    }

    /**
     * Create an instance of {@link DisciplineDeclineListType }
     * 
     */
    public DisciplineDeclineListType createDisciplineDeclineListType() {
        return new DisciplineDeclineListType();
    }

    /**
     * Create an instance of {@link AdditionalInformationType }
     * 
     */
    public AdditionalInformationType createAdditionalInformationType() {
        return new AdditionalInformationType();
    }

    /**
     * Create an instance of {@link PriorCarriorType }
     * 
     */
    public PriorCarriorType createPriorCarriorType() {
        return new PriorCarriorType();
    }

    /**
     * Create an instance of {@link AdditionalDateTimeType }
     * 
     */
    public AdditionalDateTimeType createAdditionalDateTimeType() {
        return new AdditionalDateTimeType();
    }

    /**
     * Create an instance of {@link BasicAddressType }
     * 
     */
    public BasicAddressType createBasicAddressType() {
        return new BasicAddressType();
    }

    /**
     * Create an instance of {@link CodeWithDesc }
     * 
     */
    public CodeWithDesc createCodeWithDesc() {
        return new CodeWithDesc();
    }

    /**
     * Create an instance of {@link BasicPhoneNumberType }
     * 
     */
    public BasicPhoneNumberType createBasicPhoneNumberType() {
        return new BasicPhoneNumberType();
    }

    /**
     * Create an instance of {@link ClientInformationType }
     * 
     */
    public ClientInformationType createClientInformationType() {
        return new ClientInformationType();
    }

    /**
     * Create an instance of {@link CommonInformationType }
     * 
     */
    public CommonInformationType createCommonInformationType() {
        return new CommonInformationType();
    }

    /**
     * Create an instance of {@link CertificationType }
     * 
     */
    public CertificationType createCertificationType() {
        return new CertificationType();
    }

    /**
     * Create an instance of {@link RelationshipType }
     * 
     */
    public RelationshipType createRelationshipType() {
        return new RelationshipType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link AdditionalNumberType }
     * 
     */
    public AdditionalNumberType createAdditionalNumberType() {
        return new AdditionalNumberType();
    }

    /**
     * Create an instance of {@link PartyClassificationType }
     * 
     */
    public PartyClassificationType createPartyClassificationType() {
        return new PartyClassificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.delphi-tech.com/ows/Party", name = "Property")
    public JAXBElement<PropertyType> createProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_Property_QNAME, PropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.delphi-tech.com/ows/Party", name = "Organization")
    public JAXBElement<OrganizationType> createOrganization(OrganizationType value) {
        return new JAXBElement<OrganizationType>(_Organization_QNAME, OrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.delphi-tech.com/ows/Party", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.delphi-tech.com/ows/Party", name = "Person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

}
