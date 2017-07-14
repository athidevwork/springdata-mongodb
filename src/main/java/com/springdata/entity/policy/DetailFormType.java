
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class DetailFormType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FormDataDesc;
    protected String RiskBaseRecordId;
    protected String RiskType;
    protected EffectivePeriodType PolicyRiskEffectivePeriod;
    protected String Status;
    protected EffectivePeriodType OrigRiskEffectivePeriod;
    protected String FormEndorsementId;
    protected String EndVarTextId;
    protected String EndVtId;
    protected String PolicyId;
    protected String SourceRecordId;
    protected String SourceTableName;
    protected String RecordModeCode;
    protected String OfficialRecordId;
    protected EffectivePeriodType EffectivePeriod;
    protected String RenewalIndicator;
    protected List<AdditionalInformationType> AdditionalInformation;
	public String getFormDataDesc() {
		return FormDataDesc;
	}
	public void setFormDataDesc(String formDataDesc) {
		FormDataDesc = formDataDesc;
	}
	public String getRiskBaseRecordId() {
		return RiskBaseRecordId;
	}
	public void setRiskBaseRecordId(String riskBaseRecordId) {
		RiskBaseRecordId = riskBaseRecordId;
	}
	public String getRiskType() {
		return RiskType;
	}
	public void setRiskType(String riskType) {
		RiskType = riskType;
	}
	public EffectivePeriodType getPolicyRiskEffectivePeriod() {
		return PolicyRiskEffectivePeriod;
	}
	public void setPolicyRiskEffectivePeriod(EffectivePeriodType policyRiskEffectivePeriod) {
		PolicyRiskEffectivePeriod = policyRiskEffectivePeriod;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public EffectivePeriodType getOrigRiskEffectivePeriod() {
		return OrigRiskEffectivePeriod;
	}
	public void setOrigRiskEffectivePeriod(EffectivePeriodType origRiskEffectivePeriod) {
		OrigRiskEffectivePeriod = origRiskEffectivePeriod;
	}
	public String getFormEndorsementId() {
		return FormEndorsementId;
	}
	public void setFormEndorsementId(String formEndorsementId) {
		FormEndorsementId = formEndorsementId;
	}
	public String getEndVarTextId() {
		return EndVarTextId;
	}
	public void setEndVarTextId(String endVarTextId) {
		EndVarTextId = endVarTextId;
	}
	public String getEndVtId() {
		return EndVtId;
	}
	public void setEndVtId(String endVtId) {
		EndVtId = endVtId;
	}
	public String getPolicyId() {
		return PolicyId;
	}
	public void setPolicyId(String policyId) {
		PolicyId = policyId;
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
	public String getOfficialRecordId() {
		return OfficialRecordId;
	}
	public void setOfficialRecordId(String officialRecordId) {
		OfficialRecordId = officialRecordId;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
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
		return "[FormDataDesc=" + FormDataDesc + ", RiskBaseRecordId=" + RiskBaseRecordId + ", RiskType="
				+ RiskType + ", PolicyRiskEffectivePeriod=" + PolicyRiskEffectivePeriod + ", Status=" + Status
				+ ", OrigRiskEffectivePeriod=" + OrigRiskEffectivePeriod + ", FormEndorsementId=" + FormEndorsementId
				+ ", EndVarTextId=" + EndVarTextId + ", EndVtId=" + EndVtId + ", PolicyId=" + PolicyId
				+ ", SourceRecordId=" + SourceRecordId + ", SourceTableName=" + SourceTableName + ", RecordModeCode="
				+ RecordModeCode + ", OfficialRecordId=" + OfficialRecordId + ", EffectivePeriod=" + EffectivePeriod
				+ ", RenewalIndicator=" + RenewalIndicator + ", AdditionalInformation=" + AdditionalInformation + "]";
	}
}
