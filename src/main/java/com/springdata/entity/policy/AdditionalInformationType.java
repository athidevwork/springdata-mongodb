
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class AdditionalInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<AdditionalDateTimeType> AdditionalDateTime;
    protected List<AdditionalNumberType> AdditionalNumber;
    protected List<AdditionalDataType> AdditionalData;
    protected List<AdditionalInfoType> AdditionalInfo;
    
	public List<AdditionalDateTimeType> getAdditionalDateTime() {
		return AdditionalDateTime;
	}
	public void setAdditionalDateTime(List<AdditionalDateTimeType> additionalDateTime) {
		AdditionalDateTime = additionalDateTime;
	}
	public List<AdditionalNumberType> getAdditionalNumber() {
		return AdditionalNumber;
	}
	public void setAdditionalNumber(List<AdditionalNumberType> additionalNumber) {
		AdditionalNumber = additionalNumber;
	}
	public List<AdditionalDataType> getAdditionalData() {
		return AdditionalData;
	}
	public void setAdditionalData(List<AdditionalDataType> additionalData) {
		AdditionalData = additionalData;
	}
	public List<AdditionalInfoType> getAdditionalInfo() {
		return AdditionalInfo;
	}
	public void setAdditionalInfo(List<AdditionalInfoType> additionalInfo) {
		AdditionalInfo = additionalInfo;
	}
	@Override
	public String toString() {
		return "[AdditionalDateTime=" + AdditionalDateTime + ", AdditionalNumber="
				+ AdditionalNumber + ", AdditionalData=" + AdditionalData + ", AdditionalInfo=" + AdditionalInfo + "]";
	}
}
