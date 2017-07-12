
package com.springdata.entity.party;

import java.io.Serializable;

public class SuspensionReinstatementInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected EffectivePeriodType licenseSuspensionPeriod;
    protected String suspensionRevocationReasonCode;

    /**
     * Gets the value of the licenseSuspensionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getLicenseSuspensionPeriod() {
        return licenseSuspensionPeriod;
    }

    /**
     * Sets the value of the licenseSuspensionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setLicenseSuspensionPeriod(EffectivePeriodType value) {
        this.licenseSuspensionPeriod = value;
    }

    /**
     * Gets the value of the suspensionRevocationReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspensionRevocationReasonCode() {
        return suspensionRevocationReasonCode;
    }

    /**
     * Sets the value of the suspensionRevocationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspensionRevocationReasonCode(String value) {
        this.suspensionRevocationReasonCode = value;
    }

}
