
package com.springdata.entity.policy;

import java.io.Serializable;

public class AddressInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String AddressLine1;
    protected String AddressLine2;
    protected String City;
    protected String State;
    protected String Zip;
    protected String ZipPlusFour;
    
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getZipPlusFour() {
		return ZipPlusFour;
	}
	public void setZipPlusFour(String zipPlusFour) {
		ZipPlusFour = zipPlusFour;
	}
	@Override
	public String toString() {
		return "[AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2 + ", City=" + City
				+ ", State=" + State + ", Zip=" + Zip + ", ZipPlusFour=" + ZipPlusFour + "]";
	}
}
