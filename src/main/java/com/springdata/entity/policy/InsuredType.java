
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InsuredType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String insuredNumberId;
    protected ReferredPartyType referredParty;
    protected String currentTermAmount;
    protected String currentFundAmount;
    protected String markInsAsDdl;
    protected List<InsuredVersionType> insuredVersion;
    protected String key;
    protected String personReference;
    protected String organizationReference;
    protected String propertyReference;

    /**
     * Gets the value of the insuredNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredNumberId() {
        return insuredNumberId;
    }

    /**
     * Sets the value of the insuredNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredNumberId(String value) {
        this.insuredNumberId = value;
    }

    /**
     * Gets the value of the referredParty property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredPartyType }
     *     
     */
    public ReferredPartyType getReferredParty() {
        return referredParty;
    }

    /**
     * Sets the value of the referredParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredPartyType }
     *     
     */
    public void setReferredParty(ReferredPartyType value) {
        this.referredParty = value;
    }

    /**
     * Gets the value of the currentTermAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTermAmount() {
        return currentTermAmount;
    }

    /**
     * Sets the value of the currentTermAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTermAmount(String value) {
        this.currentTermAmount = value;
    }

    /**
     * Gets the value of the currentFundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFundAmount() {
        return currentFundAmount;
    }

    /**
     * Sets the value of the currentFundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFundAmount(String value) {
        this.currentFundAmount = value;
    }

    /**
     * Gets the value of the markInsAsDdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkInsAsDdl() {
        return markInsAsDdl;
    }

    /**
     * Sets the value of the markInsAsDdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkInsAsDdl(String value) {
        this.markInsAsDdl = value;
    }

    /**
     * Gets the value of the insuredVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuredVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuredVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuredVersionType }
     * 
     * 
     */
    public List<InsuredVersionType> getInsuredVersion() {
        if (insuredVersion == null) {
            insuredVersion = new ArrayList<InsuredVersionType>();
        }
        return this.insuredVersion;
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

    /**
     * Gets the value of the personReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonReference() {
        return personReference;
    }

    /**
     * Sets the value of the personReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonReference(String value) {
        this.personReference = value;
    }

    /**
     * Gets the value of the organizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationReference(String value) {
        this.organizationReference = value;
    }

    /**
     * Gets the value of the propertyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyReference() {
        return propertyReference;
    }

    /**
     * Sets the value of the propertyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyReference(String value) {
        this.propertyReference = value;
    }

}
