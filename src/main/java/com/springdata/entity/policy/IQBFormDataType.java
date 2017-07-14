
package com.springdata.entity.policy;

import java.io.Serializable;

public class IQBFormDataType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String IqbFormDataId;
    protected String TermBaseRecordId;
    protected String FormType;
    protected String ExpirationDate;
    protected String AgentName;
    protected AddressInfoType AddressInfo;
    protected String AdditionalApplications;
    protected String ListOfApplications;
    protected String CoverSheet;
    protected String PredefinedNotes;
    protected String CoverageProvisions;
    protected UnderlyingLimitType UnderlyingLimit;
    protected String DraftSchedules;
	public String getIqbFormDataId() {
		return IqbFormDataId;
	}
	public void setIqbFormDataId(String iqbFormDataId) {
		IqbFormDataId = iqbFormDataId;
	}
	public String getTermBaseRecordId() {
		return TermBaseRecordId;
	}
	public void setTermBaseRecordId(String termBaseRecordId) {
		TermBaseRecordId = termBaseRecordId;
	}
	public String getFormType() {
		return FormType;
	}
	public void setFormType(String formType) {
		FormType = formType;
	}
	public String getExpirationDate() {
		return ExpirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}
	public String getAgentName() {
		return AgentName;
	}
	public void setAgentName(String agentName) {
		AgentName = agentName;
	}
	public AddressInfoType getAddressInfo() {
		return AddressInfo;
	}
	public void setAddressInfo(AddressInfoType addressInfo) {
		AddressInfo = addressInfo;
	}
	public String getAdditionalApplications() {
		return AdditionalApplications;
	}
	public void setAdditionalApplications(String additionalApplications) {
		AdditionalApplications = additionalApplications;
	}
	public String getListOfApplications() {
		return ListOfApplications;
	}
	public void setListOfApplications(String listOfApplications) {
		ListOfApplications = listOfApplications;
	}
	public String getCoverSheet() {
		return CoverSheet;
	}
	public void setCoverSheet(String coverSheet) {
		CoverSheet = coverSheet;
	}
	public String getPredefinedNotes() {
		return PredefinedNotes;
	}
	public void setPredefinedNotes(String predefinedNotes) {
		PredefinedNotes = predefinedNotes;
	}
	public String getCoverageProvisions() {
		return CoverageProvisions;
	}
	public void setCoverageProvisions(String coverageProvisions) {
		CoverageProvisions = coverageProvisions;
	}
	public UnderlyingLimitType getUnderlyingLimit() {
		return UnderlyingLimit;
	}
	public void setUnderlyingLimit(UnderlyingLimitType underlyingLimit) {
		UnderlyingLimit = underlyingLimit;
	}
	public String getDraftSchedules() {
		return DraftSchedules;
	}
	public void setDraftSchedules(String draftSchedules) {
		DraftSchedules = draftSchedules;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[IqbFormDataId=" + IqbFormDataId + ", TermBaseRecordId=" + TermBaseRecordId
				+ ", FormType=" + FormType + ", ExpirationDate=" + ExpirationDate + ", AgentName=" + AgentName
				+ ", AddressInfo=" + AddressInfo + ", AdditionalApplications=" + AdditionalApplications
				+ ", ListOfApplications=" + ListOfApplications + ", CoverSheet=" + CoverSheet + ", PredefinedNotes="
				+ PredefinedNotes + ", CoverageProvisions=" + CoverageProvisions + ", UnderlyingLimit="
				+ UnderlyingLimit + ", DraftSchedules=" + DraftSchedules + "]";
	}
}
