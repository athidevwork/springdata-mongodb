
package com.springdata.entity.policy;

import java.io.Serializable;

public class AttorneyInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String numberOfAttornerys;
    protected String continuingLawEducationHours;
    protected String attorneyName;
    protected String stateAdmittedToBar;
    protected String statusCode;
    protected String yearsInPractice;

    /**
     * Gets the value of the numberOfAttornerys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfAttornerys() {
        return numberOfAttornerys;
    }

    /**
     * Sets the value of the numberOfAttornerys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfAttornerys(String value) {
        this.numberOfAttornerys = value;
    }

    /**
     * Gets the value of the continuingLawEducationHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinuingLawEducationHours() {
        return continuingLawEducationHours;
    }

    /**
     * Sets the value of the continuingLawEducationHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinuingLawEducationHours(String value) {
        this.continuingLawEducationHours = value;
    }

    /**
     * Gets the value of the attorneyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttorneyName() {
        return attorneyName;
    }

    /**
     * Sets the value of the attorneyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttorneyName(String value) {
        this.attorneyName = value;
    }

    /**
     * Gets the value of the stateAdmittedToBar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateAdmittedToBar() {
        return stateAdmittedToBar;
    }

    /**
     * Sets the value of the stateAdmittedToBar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateAdmittedToBar(String value) {
        this.stateAdmittedToBar = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the yearsInPractice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsInPractice() {
        return yearsInPractice;
    }

    /**
     * Sets the value of the yearsInPractice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsInPractice(String value) {
        this.yearsInPractice = value;
    }

}
