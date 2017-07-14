
package com.springdata.entity.party;

import java.io.Serializable;
import java.util.List;

public class PropertyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PropertyNumberId;
    protected PropertyNameType PropertyName;
    protected List<BasicPhoneNumberType> BasicPhoneNumber;
    protected BasicAddressType BasicAddress;
    protected String Key;
    
	public String getPropertyNumberId() {
		return PropertyNumberId;
	}
	public void setPropertyNumberId(String propertyNumberId) {
		PropertyNumberId = propertyNumberId;
	}
	public PropertyNameType getPropertyName() {
		return PropertyName;
	}
	public void setPropertyName(PropertyNameType propertyName) {
		PropertyName = propertyName;
	}
	public List<BasicPhoneNumberType> getBasicPhoneNumber() {
		return BasicPhoneNumber;
	}
	public void setBasicPhoneNumber(List<BasicPhoneNumberType> basicPhoneNumber) {
		BasicPhoneNumber = basicPhoneNumber;
	}
	public BasicAddressType getBasicAddress() {
		return BasicAddress;
	}
	public void setBasicAddress(BasicAddressType basicAddress) {
		BasicAddress = basicAddress;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[PropertyNumberId=" + PropertyNumberId + ", PropertyName=" + PropertyName
				+ ", BasicPhoneNumber=" + BasicPhoneNumber + ", BasicAddress=" + BasicAddress + ", Key=" + Key + "]";
	}
}
