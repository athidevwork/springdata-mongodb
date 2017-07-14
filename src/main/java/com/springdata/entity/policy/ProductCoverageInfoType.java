
package com.springdata.entity.policy;

import java.io.Serializable;

public class ProductCoverageInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CoverageGroup;
    protected String PracticeStateCode;
    protected String ProductSplitRetroIndicator;
    protected String SegmentCode;
    protected String SubCoverageAvailableIndicator;
    protected String NoseCoverageIndicator;
    protected String PolicyFormCode;
	public String getCoverageGroup() {
		return CoverageGroup;
	}
	public void setCoverageGroup(String coverageGroup) {
		CoverageGroup = coverageGroup;
	}
	public String getPracticeStateCode() {
		return PracticeStateCode;
	}
	public void setPracticeStateCode(String practiceStateCode) {
		PracticeStateCode = practiceStateCode;
	}
	public String getProductSplitRetroIndicator() {
		return ProductSplitRetroIndicator;
	}
	public void setProductSplitRetroIndicator(String productSplitRetroIndicator) {
		ProductSplitRetroIndicator = productSplitRetroIndicator;
	}
	public String getSegmentCode() {
		return SegmentCode;
	}
	public void setSegmentCode(String segmentCode) {
		SegmentCode = segmentCode;
	}
	public String getSubCoverageAvailableIndicator() {
		return SubCoverageAvailableIndicator;
	}
	public void setSubCoverageAvailableIndicator(String subCoverageAvailableIndicator) {
		SubCoverageAvailableIndicator = subCoverageAvailableIndicator;
	}
	public String getNoseCoverageIndicator() {
		return NoseCoverageIndicator;
	}
	public void setNoseCoverageIndicator(String noseCoverageIndicator) {
		NoseCoverageIndicator = noseCoverageIndicator;
	}
	public String getPolicyFormCode() {
		return PolicyFormCode;
	}
	public void setPolicyFormCode(String policyFormCode) {
		PolicyFormCode = policyFormCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[CoverageGroup=" + CoverageGroup + ", PracticeStateCode=" + PracticeStateCode
				+ ", ProductSplitRetroIndicator=" + ProductSplitRetroIndicator + ", SegmentCode=" + SegmentCode
				+ ", SubCoverageAvailableIndicator=" + SubCoverageAvailableIndicator + ", NoseCoverageIndicator="
				+ NoseCoverageIndicator + ", PolicyFormCode=" + PolicyFormCode + "]";
	}
}
