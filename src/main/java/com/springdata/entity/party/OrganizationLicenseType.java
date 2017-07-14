
package com.springdata.entity.party;

import java.io.Serializable;

public class OrganizationLicenseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String LicenseNumberId;
    protected String LicenseNumber;
    protected LicensePeriodType LicensePeriod;
    protected StateOrProvinceCodeType StateOrProvinceCode;
    protected SuspensionReinstatementInformationType SuspensionReinstatementInformation;
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
	public LicensePeriodType getLicensePeriod() {
		return LicensePeriod;
	}
	public void setLicensePeriod(LicensePeriodType licensePeriod) {
		LicensePeriod = licensePeriod;
	}
	public StateOrProvinceCodeType getStateOrProvinceCode() {
		return StateOrProvinceCode;
	}
	public void setStateOrProvinceCode(StateOrProvinceCodeType stateOrProvinceCode) {
		StateOrProvinceCode = stateOrProvinceCode;
	}
	public SuspensionReinstatementInformationType getSuspensionReinstatementInformation() {
		return SuspensionReinstatementInformation;
	}
	public void setSuspensionReinstatementInformation(
			SuspensionReinstatementInformationType suspensionReinstatementInformation) {
		SuspensionReinstatementInformation = suspensionReinstatementInformation;
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
				+ ", SuspensionReinstatementInformation=" + SuspensionReinstatementInformation + ", Key=" + Key + "]";
	}
}