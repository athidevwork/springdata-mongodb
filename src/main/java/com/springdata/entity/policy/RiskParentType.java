
package com.springdata.entity.policy;

import java.io.Serializable;

public class RiskParentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String RiskName;
    protected String TypeOfInsured;
    protected String ParentNumberId;
    protected ReferredPartyType ReferredParty;
    protected String PracticeState;
    protected String County;
    protected String Territory;
    protected String Specialty;
    protected String Clazz;
    protected String InsuredType;
    protected String RiskStatus;
    protected String RiskSubClsUsedToRate;
    protected String IbnrStatus;
    protected String BlockedListIndicator;
	public String getRiskName() {
		return RiskName;
	}
	public void setRiskName(String riskName) {
		RiskName = riskName;
	}
	public String getTypeOfInsured() {
		return TypeOfInsured;
	}
	public void setTypeOfInsured(String typeOfInsured) {
		TypeOfInsured = typeOfInsured;
	}
	public String getParentNumberId() {
		return ParentNumberId;
	}
	public void setParentNumberId(String parentNumberId) {
		ParentNumberId = parentNumberId;
	}
	public ReferredPartyType getReferredParty() {
		return ReferredParty;
	}
	public void setReferredParty(ReferredPartyType referredParty) {
		ReferredParty = referredParty;
	}
	public String getPracticeState() {
		return PracticeState;
	}
	public void setPracticeState(String practiceState) {
		PracticeState = practiceState;
	}
	public String getCounty() {
		return County;
	}
	public void setCounty(String county) {
		County = county;
	}
	public String getTerritory() {
		return Territory;
	}
	public void setTerritory(String territory) {
		Territory = territory;
	}
	public String getSpecialty() {
		return Specialty;
	}
	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}
	public String getClazz() {
		return Clazz;
	}
	public void setClazz(String clazz) {
		Clazz = clazz;
	}
	public String getInsuredType() {
		return InsuredType;
	}
	public void setInsuredType(String insuredType) {
		InsuredType = insuredType;
	}
	public String getRiskStatus() {
		return RiskStatus;
	}
	public void setRiskStatus(String riskStatus) {
		RiskStatus = riskStatus;
	}
	public String getRiskSubClsUsedToRate() {
		return RiskSubClsUsedToRate;
	}
	public void setRiskSubClsUsedToRate(String riskSubClsUsedToRate) {
		RiskSubClsUsedToRate = riskSubClsUsedToRate;
	}
	public String getIbnrStatus() {
		return IbnrStatus;
	}
	public void setIbnrStatus(String ibnrStatus) {
		IbnrStatus = ibnrStatus;
	}
	public String getBlockedListIndicator() {
		return BlockedListIndicator;
	}
	public void setBlockedListIndicator(String blockedListIndicator) {
		BlockedListIndicator = blockedListIndicator;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[RiskName=" + RiskName + ", TypeOfInsured=" + TypeOfInsured + ", ParentNumberId="
				+ ParentNumberId + ", ReferredParty=" + ReferredParty + ", PracticeState=" + PracticeState + ", County="
				+ County + ", Territory=" + Territory + ", Specialty=" + Specialty + ", Clazz=" + Clazz
				+ ", InsuredType=" + InsuredType + ", RiskStatus=" + RiskStatus + ", RiskSubClsUsedToRate="
				+ RiskSubClsUsedToRate + ", IbnrStatus=" + IbnrStatus + ", BlockedListIndicator=" + BlockedListIndicator
				+ "]";
	}


}
