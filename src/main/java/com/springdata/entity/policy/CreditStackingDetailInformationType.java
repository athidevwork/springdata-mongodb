
package com.springdata.entity.policy;

import java.io.Serializable;

public class CreditStackingDetailInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ComponentCode;
    protected String ComponentType;
    protected String ComponentDescription;
    protected String CategoryDescription;
    protected EffectivePeriodType EffectivePeriod;
    protected String BucketCode;
    protected String WinningBucket;
    protected String InitFactor;
    protected String CompFactor;
    protected String DeltaFactor;
    protected String ActionText;
	public String getComponentCode() {
		return ComponentCode;
	}
	public void setComponentCode(String componentCode) {
		ComponentCode = componentCode;
	}
	public String getComponentType() {
		return ComponentType;
	}
	public void setComponentType(String componentType) {
		ComponentType = componentType;
	}
	public String getComponentDescription() {
		return ComponentDescription;
	}
	public void setComponentDescription(String componentDescription) {
		ComponentDescription = componentDescription;
	}
	public String getCategoryDescription() {
		return CategoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getBucketCode() {
		return BucketCode;
	}
	public void setBucketCode(String bucketCode) {
		BucketCode = bucketCode;
	}
	public String getWinningBucket() {
		return WinningBucket;
	}
	public void setWinningBucket(String winningBucket) {
		WinningBucket = winningBucket;
	}
	public String getInitFactor() {
		return InitFactor;
	}
	public void setInitFactor(String initFactor) {
		InitFactor = initFactor;
	}
	public String getCompFactor() {
		return CompFactor;
	}
	public void setCompFactor(String compFactor) {
		CompFactor = compFactor;
	}
	public String getDeltaFactor() {
		return DeltaFactor;
	}
	public void setDeltaFactor(String deltaFactor) {
		DeltaFactor = deltaFactor;
	}
	public String getActionText() {
		return ActionText;
	}
	public void setActionText(String actionText) {
		ActionText = actionText;
	}
	@Override
	public String toString() {
		return "[ComponentCode=" + ComponentCode + ", ComponentType="
				+ ComponentType + ", ComponentDescription=" + ComponentDescription + ", CategoryDescription="
				+ CategoryDescription + ", EffectivePeriod=" + EffectivePeriod + ", BucketCode=" + BucketCode
				+ ", WinningBucket=" + WinningBucket + ", InitFactor=" + InitFactor + ", CompFactor=" + CompFactor
				+ ", DeltaFactor=" + DeltaFactor + ", ActionText=" + ActionText + "]";
	}
}
