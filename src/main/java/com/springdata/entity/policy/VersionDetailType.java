
package com.springdata.entity.policy;

import java.io.Serializable;

public class VersionDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String versionModeCode;
    protected String afterImageIndicator;
    protected String closingTransLogNumberId;

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

    /**
     * Gets the value of the closingTransLogNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingTransLogNumberId() {
        return closingTransLogNumberId;
    }

    /**
     * Sets the value of the closingTransLogNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingTransLogNumberId(String value) {
        this.closingTransLogNumberId = value;
    }

}
