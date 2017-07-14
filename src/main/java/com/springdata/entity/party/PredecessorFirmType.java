
package com.springdata.entity.party;

import java.io.Serializable;

public class PredecessorFirmType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FirmNameHistoryId;
    protected String EntityId;
    protected String FirmName;
    protected EffectivePeriodType EffectivePeriod;
    protected String Key;
    
	public String getFirmNameHistoryId() {
		return FirmNameHistoryId;
	}
	public void setFirmNameHistoryId(String firmNameHistoryId) {
		FirmNameHistoryId = firmNameHistoryId;
	}
	public String getEntityId() {
		return EntityId;
	}
	public void setEntityId(String entityId) {
		EntityId = entityId;
	}
	public String getFirmName() {
		return FirmName;
	}
	public void setFirmName(String firmName) {
		FirmName = firmName;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[FirmNameHistoryId=" + FirmNameHistoryId + ", EntityId=" + EntityId + ", FirmName="
				+ FirmName + ", EffectivePeriod=" + EffectivePeriod + ", Key=" + Key + "]";
	}
}
