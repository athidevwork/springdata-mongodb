
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CreditStackingInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ReferredMedicalMalpracticeCoverageType referredMedicalMalpracticeCoverage;
    protected List<CreditStackingHeaderInformationType> creditStackingHeaderInformation;
    protected List<CreditStackingDetailInformationType> creditStackingDetailInformation;
    protected String key;

    /**
     * Gets the value of the referredMedicalMalpracticeCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredMedicalMalpracticeCoverageType }
     *     
     */
    public ReferredMedicalMalpracticeCoverageType getReferredMedicalMalpracticeCoverage() {
        return referredMedicalMalpracticeCoverage;
    }

    /**
     * Sets the value of the referredMedicalMalpracticeCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredMedicalMalpracticeCoverageType }
     *     
     */
    public void setReferredMedicalMalpracticeCoverage(ReferredMedicalMalpracticeCoverageType value) {
        this.referredMedicalMalpracticeCoverage = value;
    }

    /**
     * Gets the value of the creditStackingHeaderInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditStackingHeaderInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditStackingHeaderInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditStackingHeaderInformationType }
     * 
     * 
     */
    public List<CreditStackingHeaderInformationType> getCreditStackingHeaderInformation() {
        if (creditStackingHeaderInformation == null) {
            creditStackingHeaderInformation = new ArrayList<CreditStackingHeaderInformationType>();
        }
        return this.creditStackingHeaderInformation;
    }

    /**
     * Gets the value of the creditStackingDetailInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditStackingDetailInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditStackingDetailInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditStackingDetailInformationType }
     * 
     * 
     */
    public List<CreditStackingDetailInformationType> getCreditStackingDetailInformation() {
        if (creditStackingDetailInformation == null) {
            creditStackingDetailInformation = new ArrayList<CreditStackingDetailInformationType>();
        }
        return this.creditStackingDetailInformation;
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

}
