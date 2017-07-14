
package com.springdata.entity.policy;

import java.io.Serializable;

public class LicenseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String LicenseOrPermitNumberId;
    protected String LicenseClassCode;
    protected CodeWithDesc ProducerLicTypeCode;
	public String getLicenseOrPermitNumberId() {
		return LicenseOrPermitNumberId;
	}
	public void setLicenseOrPermitNumberId(String licenseOrPermitNumberId) {
		LicenseOrPermitNumberId = licenseOrPermitNumberId;
	}
	public String getLicenseClassCode() {
		return LicenseClassCode;
	}
	public void setLicenseClassCode(String licenseClassCode) {
		LicenseClassCode = licenseClassCode;
	}
	public CodeWithDesc getProducerLicTypeCode() {
		return ProducerLicTypeCode;
	}
	public void setProducerLicTypeCode(CodeWithDesc producerLicTypeCode) {
		ProducerLicTypeCode = producerLicTypeCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[LicenseOrPermitNumberId=" + LicenseOrPermitNumberId + ", LicenseClassCode="
				+ LicenseClassCode + ", ProducerLicTypeCode=" + ProducerLicTypeCode + "]";
	}
}
