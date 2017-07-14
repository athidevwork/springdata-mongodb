
package com.springdata.entity.policy;

import java.io.Serializable;

public class MedicalMalpracticeCoverageVersionDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String VersionModeCode;
    protected String ParentVersionNumberId;
    protected String AfterImageIndicator;
	public String getVersionModeCode() {
		return VersionModeCode;
	}
	public void setVersionModeCode(String versionModeCode) {
		VersionModeCode = versionModeCode;
	}
	public String getParentVersionNumberId() {
		return ParentVersionNumberId;
	}
	public void setParentVersionNumberId(String parentVersionNumberId) {
		ParentVersionNumberId = parentVersionNumberId;
	}
	public String getAfterImageIndicator() {
		return AfterImageIndicator;
	}
	public void setAfterImageIndicator(String afterImageIndicator) {
		AfterImageIndicator = afterImageIndicator;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[VersionModeCode=" + VersionModeCode
				+ ", ParentVersionNumberId=" + ParentVersionNumberId + ", AfterImageIndicator=" + AfterImageIndicator
				+ "]";
	}
}
