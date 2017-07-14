
package com.springdata.entity.policy;

import java.io.Serializable;

public class RiskRelationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String RiskRelationNumberId;
    protected String RelationType;
    protected EffectivePeriodType EffectivePeriod;
    protected RiskParentType RiskParent;
    protected RiskChildType RiskChild;
    protected String RelationStatus;
    protected String ToRateIndicator;
    protected VersionDetailType VersionDetail;
    protected String Key;
    protected String PersonReference;
    protected String OrganizationReference;
	public String getRiskRelationNumberId() {
		return RiskRelationNumberId;
	}
	public void setRiskRelationNumberId(String riskRelationNumberId) {
		RiskRelationNumberId = riskRelationNumberId;
	}
	public String getRelationType() {
		return RelationType;
	}
	public void setRelationType(String relationType) {
		RelationType = relationType;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public RiskParentType getRiskParent() {
		return RiskParent;
	}
	public void setRiskParent(RiskParentType riskParent) {
		RiskParent = riskParent;
	}
	public RiskChildType getRiskChild() {
		return RiskChild;
	}
	public void setRiskChild(RiskChildType riskChild) {
		RiskChild = riskChild;
	}
	public String getRelationStatus() {
		return RelationStatus;
	}
	public void setRelationStatus(String relationStatus) {
		RelationStatus = relationStatus;
	}
	public String getToRateIndicator() {
		return ToRateIndicator;
	}
	public void setToRateIndicator(String toRateIndicator) {
		ToRateIndicator = toRateIndicator;
	}
	public VersionDetailType getVersionDetail() {
		return VersionDetail;
	}
	public void setVersionDetail(VersionDetailType versionDetail) {
		VersionDetail = versionDetail;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public String getPersonReference() {
		return PersonReference;
	}
	public void setPersonReference(String personReference) {
		PersonReference = personReference;
	}
	public String getOrganizationReference() {
		return OrganizationReference;
	}
	public void setOrganizationReference(String organizationReference) {
		OrganizationReference = organizationReference;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[RiskRelationNumberId=" + RiskRelationNumberId + ", RelationType=" + RelationType
				+ ", EffectivePeriod=" + EffectivePeriod + ", RiskParent=" + RiskParent + ", RiskChild=" + RiskChild
				+ ", RelationStatus=" + RelationStatus + ", ToRateIndicator=" + ToRateIndicator + ", VersionDetail="
				+ VersionDetail + ", Key=" + Key + ", PersonReference=" + PersonReference + ", OrganizationReference="
				+ OrganizationReference + "]";
	}
}
