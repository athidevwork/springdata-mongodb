
package com.springdata.entity.policy;

import java.io.Serializable;

public class PrincipalBillingAccountInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String billingAccountNumber;
    protected String billingAccountIdentifier;
    protected String paymentPlanId;

    /**
     * Gets the value of the billingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    /**
     * Sets the value of the billingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountNumber(String value) {
        this.billingAccountNumber = value;
    }

    /**
     * Gets the value of the billingAccountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountIdentifier() {
        return billingAccountIdentifier;
    }

    /**
     * Sets the value of the billingAccountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountIdentifier(String value) {
        this.billingAccountIdentifier = value;
    }

    /**
     * Gets the value of the paymentPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPlanId() {
        return paymentPlanId;
    }

    /**
     * Sets the value of the paymentPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPlanId(String value) {
        this.paymentPlanId = value;
    }

}
