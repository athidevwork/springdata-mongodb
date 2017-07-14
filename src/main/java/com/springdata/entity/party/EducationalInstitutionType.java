
package com.springdata.entity.party;

import java.io.Serializable;

public class EducationalInstitutionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String InstitutionName;
    protected String CountryCode;
    protected String City;
    protected CodeWithDesc StateOrProvinceCode;
	public String getInstitutionName() {
		return InstitutionName;
	}
	public void setInstitutionName(String institutionName) {
		InstitutionName = institutionName;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public CodeWithDesc getStateOrProvinceCode() {
		return StateOrProvinceCode;
	}
	public void setStateOrProvinceCode(CodeWithDesc stateOrProvinceCode) {
		StateOrProvinceCode = stateOrProvinceCode;
	}
	@Override
	public String toString() {
		return "[InstitutionName=" + InstitutionName + ", CountryCode=" + CountryCode
				+ ", City=" + City + ", StateOrProvinceCode=" + StateOrProvinceCode + "]";
	}
}
