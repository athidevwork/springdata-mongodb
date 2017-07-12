
package com.springdata.entity.policy;

import java.io.Serializable;

public class MedicalMalpracticeCoverageVersionDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String versionModeCode;
    protected String parentVersionNumberId;
    protected String afterImageIndicator;

    /**
     * Gets the value of the versionModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionModeCode() {
        return versionModeCode;
    }

    /**
     * Sets the value of the versionModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionModeCode(String value) {
        this.versionModeCode = value;
    }

    /**
     * Gets the value of the parentVersionNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentVersionNumberId() {
        return parentVersionNumberId;
    }

    /**
     * Sets the value of the parentVersionNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentVersionNumberId(String value) {
        this.parentVersionNumberId = value;
    }

    /**
     * Gets the value of the afterImageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterImageIndicator() {
        return afterImageIndicator;
    }

    /**
     * Sets the value of the afterImageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterImageIndicator(String value) {
        this.afterImageIndicator = value;
    }

}
