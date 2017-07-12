
package com.springdata.entity.policy;

import java.io.Serializable;

public class TailVersionDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CodeWithDesc parentVersionRiskNumberId;
    protected String parentVersionCoverageNumberId;
    protected String parentTermBaseNumberId;
    protected String versionModeCode;

    /**
     * Gets the value of the parentVersionRiskNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getParentVersionRiskNumberId() {
        return parentVersionRiskNumberId;
    }

    /**
     * Sets the value of the parentVersionRiskNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setParentVersionRiskNumberId(CodeWithDesc value) {
        this.parentVersionRiskNumberId = value;
    }

    /**
     * Gets the value of the parentVersionCoverageNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentVersionCoverageNumberId() {
        return parentVersionCoverageNumberId;
    }

    /**
     * Sets the value of the parentVersionCoverageNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentVersionCoverageNumberId(String value) {
        this.parentVersionCoverageNumberId = value;
    }

    /**
     * Gets the value of the parentTermBaseNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTermBaseNumberId() {
        return parentTermBaseNumberId;
    }

    /**
     * Sets the value of the parentTermBaseNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTermBaseNumberId(String value) {
        this.parentTermBaseNumberId = value;
    }

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

}
