
package com.springdata.entity.policy;

import java.io.Serializable;

public class AdditionalInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Value;
    protected String Key;
    protected String Desc;
    
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	@Override
	public String toString() {
		return "[Value=" + Value + ", Key=" + Key + ", Desc=" + Desc + "]";
	}
}
