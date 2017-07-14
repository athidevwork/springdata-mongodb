
package com.springdata.entity.inquiryservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.springdata.entity.party.AddressType;
import com.springdata.entity.party.OrganizationType;
import com.springdata.entity.party.PersonType;
import com.springdata.entity.party.PropertyType;
import com.springdata.entity.policy.MedicalMalpracticePolicyType;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class PolicyInquiryResultType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String MessageId;
    protected String CorrelationId;
    protected List<AddressType> Address;
    protected List<PersonType> Person;
    protected List<OrganizationType> Organization;
    protected List<PropertyType> Property;
    protected List<MedicalMalpracticePolicyType> MedicalMalpracticePolicy;
    protected MessageStatusType MessageStatus;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return MessageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.MessageId = value;
    }

    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setAddress(List<AddressType> address) {
		this.Address = address;
	}

	public void setPerson(List<PersonType> person) {
		this.Person = person;
	}

	public void setOrganization(List<OrganizationType> organization) {
		this.Organization = organization;
	}

	public void setProperty(List<PropertyType> property) {
		this.Property = property;
	}

	public void setMedicalMalpracticePolicy(List<MedicalMalpracticePolicyType> medicalMalpracticePolicy) {
		this.MedicalMalpracticePolicy = medicalMalpracticePolicy;
	}

	/**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return CorrelationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.CorrelationId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (Address == null) {
            Address = new ArrayList<AddressType>();
        }
        return this.Address;
    }

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPerson() {
        if (Person == null) {
            Person = new ArrayList<PersonType>();
        }
        return this.Person;
    }

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationType }
     * 
     * 
     */
    public List<OrganizationType> getOrganization() {
        if (Organization == null) {
            Organization = new ArrayList<OrganizationType>();
        }
        return this.Organization;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getProperty() {
        if (Property == null) {
            Property = new ArrayList<PropertyType>();
        }
        return this.Property;
    }

    /**
     * Gets the value of the medicalMalpracticePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicalMalpracticePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicalMalpracticePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicalMalpracticePolicyType }
     * 
     * 
     */
    public List<MedicalMalpracticePolicyType> getMedicalMalpracticePolicy() {
        if (MedicalMalpracticePolicy == null) {
            MedicalMalpracticePolicy = new ArrayList<MedicalMalpracticePolicyType>();
        }
        return this.MedicalMalpracticePolicy;
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusType }
     *     
     */
    public MessageStatusType getMessageStatus() {
        return MessageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusType }
     *     
     */
    public void setMessageStatus(MessageStatusType value) {
        this.MessageStatus = value;
    }

	@Override
	public String toString() {
		return "PolicyInquiryResultType \n\t[Address=" + Address + ", \n\t Person=" + Person + ", \n\t Organization=" + Organization
				+ ", \n\t Property=" + Property + ", \n\t MedicalMalpracticePolicy=" + MedicalMalpracticePolicy + "]";
	}

    
}
