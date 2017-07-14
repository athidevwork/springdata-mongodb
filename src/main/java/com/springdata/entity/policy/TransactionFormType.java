
package com.springdata.entity.policy;

import java.io.Serializable;

public class TransactionFormType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected FormIdType FormId;
    protected String EndNo;
    protected String CoiName;
    protected String Risk;
    protected String FullPath;
    protected String CopyType;
	public FormIdType getFormId() {
		return FormId;
	}
	public void setFormId(FormIdType formId) {
		FormId = formId;
	}
	public String getEndNo() {
		return EndNo;
	}
	public void setEndNo(String endNo) {
		EndNo = endNo;
	}
	public String getCoiName() {
		return CoiName;
	}
	public void setCoiName(String coiName) {
		CoiName = coiName;
	}
	public String getRisk() {
		return Risk;
	}
	public void setRisk(String risk) {
		Risk = risk;
	}
	public String getFullPath() {
		return FullPath;
	}
	public void setFullPath(String fullPath) {
		FullPath = fullPath;
	}
	public String getCopyType() {
		return CopyType;
	}
	public void setCopyType(String copyType) {
		CopyType = copyType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[FormId=" + FormId + ", EndNo=" + EndNo + ", CoiName=" + CoiName + ", Risk=" + Risk
				+ ", FullPath=" + FullPath + ", CopyType=" + CopyType + "]";
	}
}
