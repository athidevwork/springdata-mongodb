
package com.springdata.entity.policy;

import java.io.Serializable;

public class LimitType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected LimitTypeCodeType limitTypeCode;
    protected String sharedLimitIndicator;
    protected IncidentLimitTypeCodeType incidentLimitTypeCode;
    protected AgregateLimitTypeCodeType agregateLimitTypeCode;
    protected String subLimitIndicator;
    protected String erosionTypeCode;

    /**
     * Gets the value of the limitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LimitTypeCodeType }
     *     
     */
    public LimitTypeCodeType getLimitTypeCode() {
        return limitTypeCode;
    }

    /**
     * Sets the value of the limitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitTypeCodeType }
     *     
     */
    public void setLimitTypeCode(LimitTypeCodeType value) {
        this.limitTypeCode = value;
    }

    /**
     * Gets the value of the sharedLimitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedLimitIndicator() {
        return sharedLimitIndicator;
    }

    /**
     * Sets the value of the sharedLimitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedLimitIndicator(String value) {
        this.sharedLimitIndicator = value;
    }

    /**
     * Gets the value of the incidentLimitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentLimitTypeCodeType }
     *     
     */
    public IncidentLimitTypeCodeType getIncidentLimitTypeCode() {
        return incidentLimitTypeCode;
    }

    /**
     * Sets the value of the incidentLimitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentLimitTypeCodeType }
     *     
     */
    public void setIncidentLimitTypeCode(IncidentLimitTypeCodeType value) {
        this.incidentLimitTypeCode = value;
    }

    /**
     * Gets the value of the agregateLimitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AgregateLimitTypeCodeType }
     *     
     */
    public AgregateLimitTypeCodeType getAgregateLimitTypeCode() {
        return agregateLimitTypeCode;
    }

    /**
     * Sets the value of the agregateLimitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgregateLimitTypeCodeType }
     *     
     */
    public void setAgregateLimitTypeCode(AgregateLimitTypeCodeType value) {
        this.agregateLimitTypeCode = value;
    }

    /**
     * Gets the value of the subLimitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLimitIndicator() {
        return subLimitIndicator;
    }

    /**
     * Sets the value of the subLimitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLimitIndicator(String value) {
        this.subLimitIndicator = value;
    }

    /**
     * Gets the value of the erosionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErosionTypeCode() {
        return erosionTypeCode;
    }

    /**
     * Sets the value of the erosionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErosionTypeCode(String value) {
        this.erosionTypeCode = value;
    }

}
