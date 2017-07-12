
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SharedGroupType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String sharedGroupMasterId;
    protected CodeWithDesc sharedGroupNunmber;
    protected String shareLimitsIndicator;
    protected String shareDeductIndicator;
    protected String shareSIRIndicator;
    protected EffectivePeriodType effectivePeriod;
    protected String erosionPaid;
    protected String erosionReserve;
    protected String renewalIndicator;
    protected String maxGroupNumber;
    protected String groupCount;
    protected VersionDetailType versionDetail;
    protected List<SharedGroupDetailType> sharedGroupDetail;

    /**
     * Gets the value of the sharedGroupMasterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedGroupMasterId() {
        return sharedGroupMasterId;
    }

    /**
     * Sets the value of the sharedGroupMasterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedGroupMasterId(String value) {
        this.sharedGroupMasterId = value;
    }

    /**
     * Gets the value of the sharedGroupNunmber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithDesc }
     *     
     */
    public CodeWithDesc getSharedGroupNunmber() {
        return sharedGroupNunmber;
    }

    /**
     * Sets the value of the sharedGroupNunmber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithDesc }
     *     
     */
    public void setSharedGroupNunmber(CodeWithDesc value) {
        this.sharedGroupNunmber = value;
    }

    /**
     * Gets the value of the shareLimitsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareLimitsIndicator() {
        return shareLimitsIndicator;
    }

    /**
     * Sets the value of the shareLimitsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareLimitsIndicator(String value) {
        this.shareLimitsIndicator = value;
    }

    /**
     * Gets the value of the shareDeductIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareDeductIndicator() {
        return shareDeductIndicator;
    }

    /**
     * Sets the value of the shareDeductIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareDeductIndicator(String value) {
        this.shareDeductIndicator = value;
    }

    /**
     * Gets the value of the shareSIRIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSIRIndicator() {
        return shareSIRIndicator;
    }

    /**
     * Sets the value of the shareSIRIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSIRIndicator(String value) {
        this.shareSIRIndicator = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EffectivePeriodType }
     *     
     */
    public EffectivePeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectivePeriodType }
     *     
     */
    public void setEffectivePeriod(EffectivePeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the erosionPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErosionPaid() {
        return erosionPaid;
    }

    /**
     * Sets the value of the erosionPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErosionPaid(String value) {
        this.erosionPaid = value;
    }

    /**
     * Gets the value of the erosionReserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErosionReserve() {
        return erosionReserve;
    }

    /**
     * Sets the value of the erosionReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErosionReserve(String value) {
        this.erosionReserve = value;
    }

    /**
     * Gets the value of the renewalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalIndicator() {
        return renewalIndicator;
    }

    /**
     * Sets the value of the renewalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalIndicator(String value) {
        this.renewalIndicator = value;
    }

    /**
     * Gets the value of the maxGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxGroupNumber() {
        return maxGroupNumber;
    }

    /**
     * Sets the value of the maxGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxGroupNumber(String value) {
        this.maxGroupNumber = value;
    }

    /**
     * Gets the value of the groupCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCount() {
        return groupCount;
    }

    /**
     * Sets the value of the groupCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCount(String value) {
        this.groupCount = value;
    }

    /**
     * Gets the value of the versionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link VersionDetailType }
     *     
     */
    public VersionDetailType getVersionDetail() {
        return versionDetail;
    }

    /**
     * Sets the value of the versionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionDetailType }
     *     
     */
    public void setVersionDetail(VersionDetailType value) {
        this.versionDetail = value;
    }

    /**
     * Gets the value of the sharedGroupDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedGroupDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedGroupDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedGroupDetailType }
     * 
     * 
     */
    public List<SharedGroupDetailType> getSharedGroupDetail() {
        if (sharedGroupDetail == null) {
            sharedGroupDetail = new ArrayList<SharedGroupDetailType>();
        }
        return this.sharedGroupDetail;
    }

    public void setSharedGroupDetail(List<SharedGroupDetailType> sharedGroupDetail) {
        this.sharedGroupDetail = sharedGroupDetail;    }

}
