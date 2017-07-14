
package com.springdata.entity.party;

import java.io.Serializable;

public class SpecialHandlingPartyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String SpecialHandlingId;
    protected String SourceRecordId;
    protected String SourceTable;
    protected String Userid;
    protected String Category;
    protected EffectivePeriodType EffectivePeriod;
    protected String Notes;
    protected String Key;
    
	public String getSpecialHandlingId() {
		return SpecialHandlingId;
	}
	public void setSpecialHandlingId(String specialHandlingId) {
		SpecialHandlingId = specialHandlingId;
	}
	public String getSourceRecordId() {
		return SourceRecordId;
	}
	public void setSourceRecordId(String sourceRecordId) {
		SourceRecordId = sourceRecordId;
	}
	public String getSourceTable() {
		return SourceTable;
	}
	public void setSourceTable(String sourceTable) {
		SourceTable = sourceTable;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[SpecialHandlingId=" + SpecialHandlingId + ", SourceRecordId=" + SourceRecordId
				+ ", SourceTable=" + SourceTable + ", Userid=" + Userid + ", Category=" + Category
				+ ", EffectivePeriod=" + EffectivePeriod + ", Notes=" + Notes + ", Key=" + Key + "]";
	}
}
