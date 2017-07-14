
package com.springdata.entity.party;

import java.io.Serializable;

public class RelationshipType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String RelationshipNumberId;
    protected String RelationshipType;
    protected EffectivePeriodType EffectivePeriod;
    protected ReferredPartyType ReferredParty;
    protected String PrimaryIndicator;
    protected String ReverseRelationshipIndicator;
    protected String Key;
	public String getRelationshipNumberId() {
		return RelationshipNumberId;
	}
	public void setRelationshipNumberId(String relationshipNumberId) {
		RelationshipNumberId = relationshipNumberId;
	}
	public String getRelationshipType() {
		return RelationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		RelationshipType = relationshipType;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public String getPrimaryIndicator() {
		return PrimaryIndicator;
	}
	public void setPrimaryIndicator(String primaryIndicator) {
		PrimaryIndicator = primaryIndicator;
	}
	public String getReverseRelationshipIndicator() {
		return ReverseRelationshipIndicator;
	}
	public void setReverseRelationshipIndicator(String reverseRelationshipIndicator) {
		ReverseRelationshipIndicator = reverseRelationshipIndicator;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[RelationshipNumberId=" + RelationshipNumberId + ", RelationshipType="
				+ RelationshipType + ", EffectivePeriod=" + EffectivePeriod + ", ReferredParty=" + ReferredParty
				+ ", PrimaryIndicator=" + PrimaryIndicator + ", ReverseRelationshipIndicator="
				+ ReverseRelationshipIndicator + ", Key=" + Key + "]";
	}
}
