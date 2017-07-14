
package com.springdata.entity.policy;

import java.io.Serializable;

public class TailVersionDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CodeWithDesc ParentVersionRiskNumberId;
    protected String ParentVersionCoverageNumberId;
    protected String ParentTermBaseNumberId;
    protected String VersionModeCode;
	public CodeWithDesc getParentVersionRiskNumberId() {
		return ParentVersionRiskNumberId;
	}
	public void setParentVersionRiskNumberId(CodeWithDesc parentVersionRiskNumberId) {
		ParentVersionRiskNumberId = parentVersionRiskNumberId;
	}
	public String getParentVersionCoverageNumberId() {
		return ParentVersionCoverageNumberId;
	}
	public void setParentVersionCoverageNumberId(String parentVersionCoverageNumberId) {
		ParentVersionCoverageNumberId = parentVersionCoverageNumberId;
	}
	public String getParentTermBaseNumberId() {
		return ParentTermBaseNumberId;
	}
	public void setParentTermBaseNumberId(String parentTermBaseNumberId) {
		ParentTermBaseNumberId = parentTermBaseNumberId;
	}
	public String getVersionModeCode() {
		return VersionModeCode;
	}
	public void setVersionModeCode(String versionModeCode) {
		VersionModeCode = versionModeCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[ParentVersionRiskNumberId=" + ParentVersionRiskNumberId
				+ ", ParentVersionCoverageNumberId=" + ParentVersionCoverageNumberId + ", ParentTermBaseNumberId="
				+ ParentTermBaseNumberId + ", VersionModeCode=" + VersionModeCode + "]";
	}
}
