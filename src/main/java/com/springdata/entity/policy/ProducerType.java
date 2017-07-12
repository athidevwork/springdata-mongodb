
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProducerType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String producerNumberId;
    protected String producerAgentName;
    protected EffectivePeriodType effectivePeriod;
    protected ReferredPartyType referredParty;
    protected List<LicenseType> license;
    protected List<CommissionType> commission;
    protected String producerChangeTypeCode;
    protected String producerAuthorizationCode;
    protected String producerAgentTypeCode;
    protected String specialCondition;
    protected String agentNote;
    protected String overrideB;
    protected String personReference;
    protected String organizationReference;

    /**
     * Gets the value of the producerNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerNumberId() {
        return producerNumberId;
    }

    /**
     * Sets the value of the producerNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerNumberId(String value) {
        this.producerNumberId = value;
    }

    /**
     * Gets the value of the producerAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerAgentName() {
        return producerAgentName;
    }

    /**
     * Sets the value of the producerAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerAgentName(String value) {
        this.producerAgentName = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setEffectivePeriod(EffectivePeriodType value) {
        this.effectivePeriod = value;
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
     * Gets the value of the license property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseType }
     * 
     * 
     */
    public List<LicenseType> getLicense() {
        if (license == null) {
            license = new ArrayList<LicenseType>();
        }
        return this.license;
    }

    /**
     * Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionType }
     * 
     * 
     */
    public List<CommissionType> getCommission() {
        if (commission == null) {
            commission = new ArrayList<CommissionType>();
        }
        return this.commission;
    }

    /**
     * Gets the value of the producerChangeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerChangeTypeCode() {
        return producerChangeTypeCode;
    }

    /**
     * Sets the value of the producerChangeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerChangeTypeCode(String value) {
        this.producerChangeTypeCode = value;
    }

    /**
     * Gets the value of the producerAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerAuthorizationCode() {
        return producerAuthorizationCode;
    }

    /**
     * Sets the value of the producerAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerAuthorizationCode(String value) {
        this.producerAuthorizationCode = value;
    }

    /**
     * Gets the value of the producerAgentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerAgentTypeCode() {
        return producerAgentTypeCode;
    }

    /**
     * Sets the value of the producerAgentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerAgentTypeCode(String value) {
        this.producerAgentTypeCode = value;
    }

    /**
     * Gets the value of the specialCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCondition() {
        return specialCondition;
    }

    /**
     * Sets the value of the specialCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCondition(String value) {
        this.specialCondition = value;
    }

    /**
     * Gets the value of the agentNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentNote() {
        return agentNote;
    }

    /**
     * Sets the value of the agentNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentNote(String value) {
        this.agentNote = value;
    }

    /**
     * Gets the value of the overrideB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideB() {
        return overrideB;
    }

    /**
     * Sets the value of the overrideB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideB(String value) {
        this.overrideB = value;
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

}
