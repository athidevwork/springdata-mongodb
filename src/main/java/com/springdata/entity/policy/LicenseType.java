
package com.springdata.entity.policy;

import java.io.Serializable;

public class LicenseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String licenseOrPermitNumberId;
    protected String licenseClassCode;
    protected CodeWithDesc producerLicTypeCode;

    /**
     * Gets the value of the licenseOrPermitNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseOrPermitNumberId() {
        return licenseOrPermitNumberId;
    }

    /**
     * Sets the value of the licenseOrPermitNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseOrPermitNumberId(String value) {
        this.licenseOrPermitNumberId = value;
    }

    /**
     * Gets the value of the licenseClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseClassCode() {
        return licenseClassCode;
    }

    /**
     * Sets the value of the licenseClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseClassCode(String value) {
        this.licenseClassCode = value;
    }

    /**
     * Gets the value of the producerLicTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getProducerLicTypeCode() {
        return producerLicTypeCode;
    }

    /**
     * Sets the value of the producerLicTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setProducerLicTypeCode(CodeWithDesc value) {
        this.producerLicTypeCode = value;
    }

}
