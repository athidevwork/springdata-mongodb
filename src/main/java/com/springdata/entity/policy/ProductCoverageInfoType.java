
package com.springdata.entity.policy;

import java.io.Serializable;

public class ProductCoverageInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String coverageGroup;
    protected String practiceStateCode;
    protected String productSplitRetroIndicator;
    protected String segmentCode;
    protected String subCoverageAvailableIndicator;
    protected String noseCoverageIndicator;
    protected String policyFormCode;

    /**
     * Gets the value of the coverageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageGroup() {
        return coverageGroup;
    }

    /**
     * Sets the value of the coverageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageGroup(String value) {
        this.coverageGroup = value;
    }

    /**
     * Gets the value of the practiceStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPracticeStateCode() {
        return practiceStateCode;
    }

    /**
     * Sets the value of the practiceStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPracticeStateCode(String value) {
        this.practiceStateCode = value;
    }

    /**
     * Gets the value of the productSplitRetroIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSplitRetroIndicator() {
        return productSplitRetroIndicator;
    }

    /**
     * Sets the value of the productSplitRetroIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSplitRetroIndicator(String value) {
        this.productSplitRetroIndicator = value;
    }

    /**
     * Gets the value of the segmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentCode() {
        return segmentCode;
    }

    /**
     * Sets the value of the segmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentCode(String value) {
        this.segmentCode = value;
    }

    /**
     * Gets the value of the subCoverageAvailableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCoverageAvailableIndicator() {
        return subCoverageAvailableIndicator;
    }

    /**
     * Sets the value of the subCoverageAvailableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCoverageAvailableIndicator(String value) {
        this.subCoverageAvailableIndicator = value;
    }

    /**
     * Gets the value of the noseCoverageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoseCoverageIndicator() {
        return noseCoverageIndicator;
    }

    /**
     * Sets the value of the noseCoverageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoseCoverageIndicator(String value) {
        this.noseCoverageIndicator = value;
    }

    /**
     * Gets the value of the policyFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyFormCode() {
        return policyFormCode;
    }

    /**
     * Sets the value of the policyFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyFormCode(String value) {
        this.policyFormCode = value;
    }

}
