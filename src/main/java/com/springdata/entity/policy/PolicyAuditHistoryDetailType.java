
package com.springdata.entity.policy;

import java.io.Serializable;

public class PolicyAuditHistoryDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Operation;
    protected String AffectedTable;
    protected String ShortDesc;
    protected String TransDesc;
    protected String SourceRecordID;
    protected String SourceRecordTable;
    protected String ModifiedTime;
    protected String ModifiedBy;
    protected String Details;
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	public String getAffectedTable() {
		return AffectedTable;
	}
	public void setAffectedTable(String affectedTable) {
		AffectedTable = affectedTable;
	}
	public String getShortDesc() {
		return ShortDesc;
	}
	public void setShortDesc(String shortDesc) {
		ShortDesc = shortDesc;
	}
	public String getTransDesc() {
		return TransDesc;
	}
	public void setTransDesc(String transDesc) {
		TransDesc = transDesc;
	}
	public String getSourceRecordID() {
		return SourceRecordID;
	}
	public void setSourceRecordID(String sourceRecordID) {
		SourceRecordID = sourceRecordID;
	}
	public String getSourceRecordTable() {
		return SourceRecordTable;
	}
	public void setSourceRecordTable(String sourceRecordTable) {
		SourceRecordTable = sourceRecordTable;
	}
	public String getModifiedTime() {
		return ModifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		ModifiedTime = modifiedTime;
	}
	public String getModifiedBy() {
		return ModifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[Operation=" + Operation + ", AffectedTable=" + AffectedTable
				+ ", ShortDesc=" + ShortDesc + ", TransDesc=" + TransDesc + ", SourceRecordID=" + SourceRecordID
				+ ", SourceRecordTable=" + SourceRecordTable + ", ModifiedTime=" + ModifiedTime + ", ModifiedBy="
				+ ModifiedBy + ", Details=" + Details + "]";
	}
}
