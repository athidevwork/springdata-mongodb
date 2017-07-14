
package com.springdata.entity.party;

import java.io.Serializable;

public class DisciplineDeclineListType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String DisciplineDeclineListId;
    protected String EntityId;
    protected String ReasonCode;
    protected String MethodCode;
    protected String Comments;
    protected EffectivePeriodType EffectivePeriod;
    protected String TransactionLogId;
    protected String Key;
	public String getDisciplineDeclineListId() {
		return DisciplineDeclineListId;
	}
	public void setDisciplineDeclineListId(String disciplineDeclineListId) {
		DisciplineDeclineListId = disciplineDeclineListId;
	}
	public String getEntityId() {
		return EntityId;
	}
	public void setEntityId(String entityId) {
		EntityId = entityId;
	}
	public String getReasonCode() {
		return ReasonCode;
	}
	public void setReasonCode(String reasonCode) {
		ReasonCode = reasonCode;
	}
	public String getMethodCode() {
		return MethodCode;
	}
	public void setMethodCode(String methodCode) {
		MethodCode = methodCode;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getTransactionLogId() {
		return TransactionLogId;
	}
	public void setTransactionLogId(String transactionLogId) {
		TransactionLogId = transactionLogId;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[DisciplineDeclineListId=" + DisciplineDeclineListId + ", EntityId="
				+ EntityId + ", ReasonCode=" + ReasonCode + ", MethodCode=" + MethodCode + ", Comments=" + Comments
				+ ", EffectivePeriod=" + EffectivePeriod + ", TransactionLogId=" + TransactionLogId + ", Key=" + Key
				+ "]";
	}
}
