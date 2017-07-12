
package com.springdata.entity.policy;

import java.io.Serializable;

public class RiskInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String riskIBNRStatus;
    protected String riskTypeCode;
    protected String riskSlotId;
    protected String riskPCFParticipate;

    /**
     * Gets the value of the riskIBNRStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskIBNRStatus() {
        return riskIBNRStatus;
    }

    /**
     * Sets the value of the riskIBNRStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskIBNRStatus(String value) {
        this.riskIBNRStatus = value;
    }

    /**
     * Gets the value of the riskTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskTypeCode() {
        return riskTypeCode;
    }

    /**
     * Sets the value of the riskTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskTypeCode(String value) {
        this.riskTypeCode = value;
    }

    /**
     * Gets the value of the riskSlotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskSlotId() {
        return riskSlotId;
    }

    /**
     * Sets the value of the riskSlotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskSlotId(String value) {
        this.riskSlotId = value;
    }

    /**
     * Gets the value of the riskPCFParticipate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskPCFParticipate() {
        return riskPCFParticipate;
    }

    /**
     * Sets the value of the riskPCFParticipate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskPCFParticipate(String value) {
        this.riskPCFParticipate = value;
    }

}
