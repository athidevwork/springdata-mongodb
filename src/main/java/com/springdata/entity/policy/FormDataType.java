
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class FormDataType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FormEndorsementNumberId;
    protected String EndVarTextNumberId;
    protected EffectivePeriodType EffectivePeriod;
    protected EffectivePeriodType PolicyRiskEffectivePeriod;
    protected EffectivePeriodType OrigRiskEffectivePeriod;
    protected String PolicyNumberId;
    protected String SourceRecordId;
    protected String SourceTableName;
    protected String RecordModeCode;
    protected String RiskName;
    protected String RiskBaseNumberId;
    protected String RiskType;
    protected String Status;
    protected String OfficialNumberId;
    protected String RenewalIndicator;
    protected List<AdditionalInformationType> AdditionalInformation;
	public String getFormEndorsementNumberId() {
		return FormEndorsementNumberId;
	}
	public void setFormEndorsementNumberId(String formEndorsementNumberId) {
		FormEndorsementNumberId = formEndorsementNumberId;
	}
	public String getEndVarTextNumberId() {
		return EndVarTextNumberId;
	}
	public void setEndVarTextNumberId(String endVarTextNumberId) {
		EndVarTextNumberId = endVarTextNumberId;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public EffectivePeriodType getPolicyRiskEffectivePeriod() {
		return PolicyRiskEffectivePeriod;
	}
	public void setPolicyRiskEffectivePeriod(EffectivePeriodType policyRiskEffectivePeriod) {
		PolicyRiskEffectivePeriod = policyRiskEffectivePeriod;
	}
	public EffectivePeriodType getOrigRiskEffectivePeriod() {
		return OrigRiskEffectivePeriod;
	}
	public void setOrigRiskEffectivePeriod(EffectivePeriodType origRiskEffectivePeriod) {
		OrigRiskEffectivePeriod = origRiskEffectivePeriod;
	}
	public String getPolicyNumberId() {
		return PolicyNumberId;
	}
	public void setPolicyNumberId(String policyNumberId) {
		PolicyNumberId = policyNumberId;
	}
	public String getSourceRecordId() {
		return SourceRecordId;
	}
	public void setSourceRecordId(String sourceRecordId) {
		SourceRecordId = sourceRecordId;
	}
	public String getSourceTableName() {
		return SourceTableName;
	}
	public void setSourceTableName(String sourceTableName) {
		SourceTableName = sourceTableName;
	}
	public String getRecordModeCode() {
		return RecordModeCode;
	}
	public void setRecordModeCode(String recordModeCode) {
		RecordModeCode = recordModeCode;
	}
	public String getRiskName() {
		return RiskName;
	}
	public void setRiskName(String riskName) {
		RiskName = riskName;
	}
	public String getRiskBaseNumberId() {
		return RiskBaseNumberId;
	}
	public void setRiskBaseNumberId(String riskBaseNumberId) {
		RiskBaseNumberId = riskBaseNumberId;
	}
	public String getRiskType() {
		return RiskType;
	}
	public void setRiskType(String riskType) {
		RiskType = riskType;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getOfficialNumberId() {
		return OfficialNumberId;
	}
	public void setOfficialNumberId(String officialNumberId) {
		OfficialNumberId = officialNumberId;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public List<AdditionalInformationType> getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(List<AdditionalInformationType> additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	@Override
	public String toString() {
		return "[FormEndorsementNumberId=" + FormEndorsementNumberId + ", EndVarTextNumberId="
				+ EndVarTextNumberId + ", EffectivePeriod=" + EffectivePeriod + ", PolicyRiskEffectivePeriod="
				+ PolicyRiskEffectivePeriod + ", OrigRiskEffectivePeriod=" + OrigRiskEffectivePeriod
				+ ", PolicyNumberId=" + PolicyNumberId + ", SourceRecordId=" + SourceRecordId + ", SourceTableName="
				+ SourceTableName + ", RecordModeCode=" + RecordModeCode + ", RiskName=" + RiskName
				+ ", RiskBaseNumberId=" + RiskBaseNumberId + ", RiskType=" + RiskType + ", Status=" + Status
				+ ", OfficialNumberId=" + OfficialNumberId + ", RenewalIndicator=" + RenewalIndicator
				+ ", AdditionalInformation=" + AdditionalInformation + "]";
	}
}
