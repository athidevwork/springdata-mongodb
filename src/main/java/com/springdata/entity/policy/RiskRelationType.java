
package com.springdata.entity.policy;

import java.io.Serializable;

public class RiskRelationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String riskRelationNumberId;
    protected String relationType;
    protected EffectivePeriodType effectivePeriod;
    protected RiskParentType riskParent;
    protected RiskChildType riskChild;
    protected String relationStatus;
    protected String toRateIndicator;
    protected VersionDetailType versionDetail;
    protected String key;
    protected String personReference;
    protected String organizationReference;

    /**
     * Gets the value of the riskRelationNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskRelationNumberId() {
        return riskRelationNumberId;
    }

    /**
     * Sets the value of the riskRelationNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskRelationNumberId(String value) {
        this.riskRelationNumberId = value;
    }

    /**
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType(String value) {
        this.relationType = value;
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
     * Gets the value of the riskParent property.
     * 
     * @return
     *     possible object is
     *     {@link RiskParentType }
     *     
     */
    public RiskParentType getRiskParent() {
        return riskParent;
    }

    /**
     * Sets the value of the riskParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskParentType }
     *     
     */
    public void setRiskParent(RiskParentType value) {
        this.riskParent = value;
    }

    /**
     * Gets the value of the riskChild property.
     * 
     * @return
     *     possible object is
     *     {@link RiskChildType }
     *     
     */
    public RiskChildType getRiskChild() {
        return riskChild;
    }

    /**
     * Sets the value of the riskChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskChildType }
     *     
     */
    public void setRiskChild(RiskChildType value) {
        this.riskChild = value;
    }

    /**
     * Gets the value of the relationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationStatus() {
        return relationStatus;
    }

    /**
     * Sets the value of the relationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationStatus(String value) {
        this.relationStatus = value;
    }

    /**
     * Gets the value of the toRateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRateIndicator() {
        return toRateIndicator;
    }

    /**
     * Sets the value of the toRateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRateIndicator(String value) {
        this.toRateIndicator = value;
    }

    /**
     * Gets the value of the versionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link VersionDetailType }
     *     
     */
    public VersionDetailType getVersionDetail() {
        return versionDetail;
    }

    /**
     * Sets the value of the versionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionDetailType }
     *     
     */
    public void setVersionDetail(VersionDetailType value) {
        this.versionDetail = value;
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
