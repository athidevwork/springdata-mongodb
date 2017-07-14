
package com.springdata.entity.party;

import java.io.Serializable;

public class ProfessionalLicenseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String LicenseNumberId;
    protected String LicenseNumber;
    protected EffectivePeriodType LicensePeriod;
    protected CodeWithDesc StateOrProvinceCode;
    protected SuspensionReinstatementInformationType SuspensionReinstatementInformation;
    protected String EntityId;
    protected String LicenseTypeCode;
    protected String ValidLicense;
    protected String VerificationDate;
    protected String SourceRecordId;
    protected String SourceTable;
    protected String ApplicationNo;
    protected String Key;
	public String getLicenseNumberId() {
		return LicenseNumberId;
	}
	public void setLicenseNumberId(String licenseNumberId) {
		LicenseNumberId = licenseNumberId;
	}
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	public EffectivePeriodType getLicensePeriod() {
		return LicensePeriod;
	}
	public void setLicensePeriod(EffectivePeriodType licensePeriod) {
		LicensePeriod = licensePeriod;
	}
	public CodeWithDesc getStateOrProvinceCode() {
		return StateOrProvinceCode;
	}
	public void setStateOrProvinceCode(CodeWithDesc stateOrProvinceCode) {
		StateOrProvinceCode = stateOrProvinceCode;
	}
	public SuspensionReinstatementInformationType getSuspensionReinstatementInformation() {
		return SuspensionReinstatementInformation;
	}
	public void setSuspensionReinstatementInformation(
			SuspensionReinstatementInformationType suspensionReinstatementInformation) {
		SuspensionReinstatementInformation = suspensionReinstatementInformation;
	}
	public String getEntityId() {
		return EntityId;
	}
	public void setEntityId(String entityId) {
		EntityId = entityId;
	}
	public String getLicenseTypeCode() {
		return LicenseTypeCode;
	}
	public void setLicenseTypeCode(String licenseTypeCode) {
		LicenseTypeCode = licenseTypeCode;
	}
	public String getValidLicense() {
		return ValidLicense;
	}
	public void setValidLicense(String validLicense) {
		ValidLicense = validLicense;
	}
	public String getVerificationDate() {
		return VerificationDate;
	}
	public void setVerificationDate(String verificationDate) {
		VerificationDate = verificationDate;
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
	public String getApplicationNo() {
		return ApplicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		ApplicationNo = applicationNo;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[LicenseNumberId=" + LicenseNumberId + ", LicenseNumber=" + LicenseNumber
				+ ", LicensePeriod=" + LicensePeriod + ", StateOrProvinceCode=" + StateOrProvinceCode
				+ ", SuspensionReinstatementInformation=" + SuspensionReinstatementInformation + ", EntityId="
				+ EntityId + ", LicenseTypeCode=" + LicenseTypeCode + ", ValidLicense=" + ValidLicense
				+ ", VerificationDate=" + VerificationDate + ", SourceRecordId=" + SourceRecordId + ", SourceTable="
				+ SourceTable + ", ApplicationNo=" + ApplicationNo + ", Key=" + Key + "]";
	}
}
