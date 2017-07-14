
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SharedGroupType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String SharedGroupMasterId;
    protected CodeWithDesc SharedGroupNunmber;
    protected String ShareLimitsIndicator;
    protected String ShareDeductIndicator;
    protected String ShareSIRIndicator;
    protected EffectivePeriodType EffectivePeriod;
    protected String ErosionPaid;
    protected String ErosionReserve;
    protected String RenewalIndicator;
    protected String MaxGroupNumber;
    protected String GroupCount;
    protected VersionDetailType VersionDetail;
    protected List<SharedGroupDetailType> SharedGroupDetail;
	public String getSharedGroupMasterId() {
		return SharedGroupMasterId;
	}
	public void setSharedGroupMasterId(String sharedGroupMasterId) {
		SharedGroupMasterId = sharedGroupMasterId;
	}
	public CodeWithDesc getSharedGroupNunmber() {
		return SharedGroupNunmber;
	}
	public void setSharedGroupNunmber(CodeWithDesc sharedGroupNunmber) {
		SharedGroupNunmber = sharedGroupNunmber;
	}
	public String getShareLimitsIndicator() {
		return ShareLimitsIndicator;
	}
	public void setShareLimitsIndicator(String shareLimitsIndicator) {
		ShareLimitsIndicator = shareLimitsIndicator;
	}
	public String getShareDeductIndicator() {
		return ShareDeductIndicator;
	}
	public void setShareDeductIndicator(String shareDeductIndicator) {
		ShareDeductIndicator = shareDeductIndicator;
	}
	public String getShareSIRIndicator() {
		return ShareSIRIndicator;
	}
	public void setShareSIRIndicator(String shareSIRIndicator) {
		ShareSIRIndicator = shareSIRIndicator;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getErosionPaid() {
		return ErosionPaid;
	}
	public void setErosionPaid(String erosionPaid) {
		ErosionPaid = erosionPaid;
	}
	public String getErosionReserve() {
		return ErosionReserve;
	}
	public void setErosionReserve(String erosionReserve) {
		ErosionReserve = erosionReserve;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public String getMaxGroupNumber() {
		return MaxGroupNumber;
	}
	public void setMaxGroupNumber(String maxGroupNumber) {
		MaxGroupNumber = maxGroupNumber;
	}
	public String getGroupCount() {
		return GroupCount;
	}
	public void setGroupCount(String groupCount) {
		GroupCount = groupCount;
	}
	public VersionDetailType getVersionDetail() {
		return VersionDetail;
	}
	public void setVersionDetail(VersionDetailType versionDetail) {
		VersionDetail = versionDetail;
	}
	public List<SharedGroupDetailType> getSharedGroupDetail() {
		return SharedGroupDetail;
	}
	public void setSharedGroupDetail(List<SharedGroupDetailType> sharedGroupDetail) {
		SharedGroupDetail = sharedGroupDetail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[SharedGroupMasterId=" + SharedGroupMasterId + ", SharedGroupNunmber="
				+ SharedGroupNunmber + ", ShareLimitsIndicator=" + ShareLimitsIndicator + ", ShareDeductIndicator="
				+ ShareDeductIndicator + ", ShareSIRIndicator=" + ShareSIRIndicator + ", EffectivePeriod="
				+ EffectivePeriod + ", ErosionPaid=" + ErosionPaid + ", ErosionReserve=" + ErosionReserve
				+ ", RenewalIndicator=" + RenewalIndicator + ", MaxGroupNumber=" + MaxGroupNumber + ", GroupCount="
				+ GroupCount + ", VersionDetail=" + VersionDetail + ", SharedGroupDetail=" + SharedGroupDetail + "]";
	} 
}
