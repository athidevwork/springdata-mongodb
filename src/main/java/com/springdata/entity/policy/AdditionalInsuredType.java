
package com.springdata.entity.policy;

import java.io.Serializable;

public class AdditionalInsuredType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String additionalInsuredNumberId;
    protected String entityRoleNumberId;
    protected ReferredPartyType referredParty;
    protected EffectivePeriodType effectivePeriod;
    protected ReferredInsuredType referredInsured;
    protected String name;
    protected String type;
    protected String retroDate;
    protected String renewalIndicator;
    protected String operationDescription;
    protected String squareFootage;
    protected String cglIndicator;
    protected String plIndicator;
    protected String showExcessIndicator;
    protected String limitApplyRule;
    protected String showSIRIndicator;
    protected String printDate;
    protected String blockedEntityIndicator;
    protected String key;
    protected String personReference;
    protected String organizationReference;

    /**
     * Gets the value of the additionalInsuredNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInsuredNumberId() {
        return additionalInsuredNumberId;
    }

    /**
     * Sets the value of the additionalInsuredNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInsuredNumberId(String value) {
        this.additionalInsuredNumberId = value;
    }

    /**
     * Gets the value of the entityRoleNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityRoleNumberId() {
        return entityRoleNumberId;
    }

    /**
     * Sets the value of the entityRoleNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityRoleNumberId(String value) {
        this.entityRoleNumberId = value;
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
     * Gets the value of the referredInsured property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredInsuredType }
     *     
     */
    public ReferredInsuredType getReferredInsured() {
        return referredInsured;
    }

    /**
     * Sets the value of the referredInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredInsuredType }
     *     
     */
    public void setReferredInsured(ReferredInsuredType value) {
        this.referredInsured = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the retroDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetroDate() {
        return retroDate;
    }

    /**
     * Sets the value of the retroDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetroDate(String value) {
        this.retroDate = value;
    }

    /**
     * Gets the value of the renewalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalIndicator() {
        return renewalIndicator;
    }

    /**
     * Sets the value of the renewalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalIndicator(String value) {
        this.renewalIndicator = value;
    }

    /**
     * Gets the value of the operationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationDescription() {
        return operationDescription;
    }

    /**
     * Sets the value of the operationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationDescription(String value) {
        this.operationDescription = value;
    }

    /**
     * Gets the value of the squareFootage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquareFootage() {
        return squareFootage;
    }

    /**
     * Sets the value of the squareFootage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquareFootage(String value) {
        this.squareFootage = value;
    }

    /**
     * Gets the value of the cglIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCglIndicator() {
        return cglIndicator;
    }

    /**
     * Sets the value of the cglIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCglIndicator(String value) {
        this.cglIndicator = value;
    }

    /**
     * Gets the value of the plIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlIndicator() {
        return plIndicator;
    }

    /**
     * Sets the value of the plIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlIndicator(String value) {
        this.plIndicator = value;
    }

    /**
     * Gets the value of the showExcessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowExcessIndicator() {
        return showExcessIndicator;
    }

    /**
     * Sets the value of the showExcessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowExcessIndicator(String value) {
        this.showExcessIndicator = value;
    }

    /**
     * Gets the value of the limitApplyRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitApplyRule() {
        return limitApplyRule;
    }

    /**
     * Sets the value of the limitApplyRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitApplyRule(String value) {
        this.limitApplyRule = value;
    }

    /**
     * Gets the value of the showSIRIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowSIRIndicator() {
        return showSIRIndicator;
    }

    /**
     * Sets the value of the showSIRIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowSIRIndicator(String value) {
        this.showSIRIndicator = value;
    }

    /**
     * Gets the value of the printDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintDate() {
        return printDate;
    }

    /**
     * Sets the value of the printDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintDate(String value) {
        this.printDate = value;
    }

    /**
     * Gets the value of the blockedEntityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedEntityIndicator() {
        return blockedEntityIndicator;
    }

    /**
     * Sets the value of the blockedEntityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedEntityIndicator(String value) {
        this.blockedEntityIndicator = value;
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

}
