
package com.springdata.entity.party;

import java.io.Serializable;

public class PersonNameType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Surname;
    protected String GivenName;
    protected String OtherGivenName;
    protected String PersonTitlePrefix;
    protected String NameSuffix;
    protected String FullName;
    
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getGivenName() {
		return GivenName;
	}
	public void setGivenName(String givenName) {
		GivenName = givenName;
	}
	public String getOtherGivenName() {
		return OtherGivenName;
	}
	public void setOtherGivenName(String otherGivenName) {
		OtherGivenName = otherGivenName;
	}
	public String getPersonTitlePrefix() {
		return PersonTitlePrefix;
	}
	public void setPersonTitlePrefix(String personTitlePrefix) {
		PersonTitlePrefix = personTitlePrefix;
	}
	public String getNameSuffix() {
		return NameSuffix;
	}
	public void setNameSuffix(String nameSuffix) {
		NameSuffix = nameSuffix;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	@Override
	public String toString() {
		return "[Surname=" + Surname + ", GivenName=" + GivenName + ", OtherGivenName=" + OtherGivenName
				+ ", PersonTitlePrefix=" + PersonTitlePrefix + ", NameSuffix=" + NameSuffix + ", FullName=" + FullName
				+ "]";
	}
}
