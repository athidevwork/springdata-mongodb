
package com.springdata.entity.policy;

import java.io.Serializable;

public class OverviewFormType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FormEndorsementNumberId;
    protected String OsFormNumberId;
    protected String TermBaseNumberId;
    protected String FormNumber;
    protected String FormId;
    protected String FormDesc;
    protected String FormType;
    protected EffectivePeriodType EffectivePeriod;
    protected String RiskId;
    protected String RiskName;
    protected String RiskType;
    protected String TriggeredForm;
    protected String RenewalStatus;
    protected String SourceTableName;
	public String getFormEndorsementNumberId() {
		return FormEndorsementNumberId;
	}
	public void setFormEndorsementNumberId(String formEndorsementNumberId) {
		FormEndorsementNumberId = formEndorsementNumberId;
	}
	public String getOsFormNumberId() {
		return OsFormNumberId;
	}
	public void setOsFormNumberId(String osFormNumberId) {
		OsFormNumberId = osFormNumberId;
	}
	public String getTermBaseNumberId() {
		return TermBaseNumberId;
	}
	public void setTermBaseNumberId(String termBaseNumberId) {
		TermBaseNumberId = termBaseNumberId;
	}
	public String getFormNumber() {
		return FormNumber;
	}
	public void setFormNumber(String formNumber) {
		FormNumber = formNumber;
	}
	public String getFormId() {
		return FormId;
	}
	public void setFormId(String formId) {
		FormId = formId;
	}
	public String getFormDesc() {
		return FormDesc;
	}
	public void setFormDesc(String formDesc) {
		FormDesc = formDesc;
	}
	public String getFormType() {
		return FormType;
	}
	public void setFormType(String formType) {
		FormType = formType;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getRiskId() {
		return RiskId;
	}
	public void setRiskId(String riskId) {
		RiskId = riskId;
	}
	public String getRiskName() {
		return RiskName;
	}
	public void setRiskName(String riskName) {
		RiskName = riskName;
	}
	public String getRiskType() {
		return RiskType;
	}
	public void setRiskType(String riskType) {
		RiskType = riskType;
	}
	public String getTriggeredForm() {
		return TriggeredForm;
	}
	public void setTriggeredForm(String triggeredForm) {
		TriggeredForm = triggeredForm;
	}
	public String getRenewalStatus() {
		return RenewalStatus;
	}
	public void setRenewalStatus(String renewalStatus) {
		RenewalStatus = renewalStatus;
	}
	public String getSourceTableName() {
		return SourceTableName;
	}
	public void setSourceTableName(String sourceTableName) {
		SourceTableName = sourceTableName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[FormEndorsementNumberId=" + FormEndorsementNumberId + ", OsFormNumberId="
				+ OsFormNumberId + ", TermBaseNumberId=" + TermBaseNumberId + ", FormNumber=" + FormNumber + ", FormId="
				+ FormId + ", FormDesc=" + FormDesc + ", FormType=" + FormType + ", EffectivePeriod=" + EffectivePeriod
				+ ", RiskId=" + RiskId + ", RiskName=" + RiskName + ", RiskType=" + RiskType + ", TriggeredForm="
				+ TriggeredForm + ", RenewalStatus=" + RenewalStatus + ", SourceTableName=" + SourceTableName + "]";
	}
}
