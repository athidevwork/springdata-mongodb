
package com.springdata.entity.policy;

import java.io.Serializable;

public class VersionDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String VersionModeCode;
    protected String AfterImageIndicator;
    protected String ClosingTransLogNumberId;
	public String getVersionModeCode() {
		return VersionModeCode;
	}
	public void setVersionModeCode(String versionModeCode) {
		VersionModeCode = versionModeCode;
	}
	public String getAfterImageIndicator() {
		return AfterImageIndicator;
	}
	public void setAfterImageIndicator(String afterImageIndicator) {
		AfterImageIndicator = afterImageIndicator;
	}
	public String getClosingTransLogNumberId() {
		return ClosingTransLogNumberId;
	}
	public void setClosingTransLogNumberId(String closingTransLogNumberId) {
		ClosingTransLogNumberId = closingTransLogNumberId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[VersionModeCode=" + VersionModeCode + ", AfterImageIndicator=" + AfterImageIndicator
				+ ", ClosingTransLogNumberId=" + ClosingTransLogNumberId + "]";
	}
}
