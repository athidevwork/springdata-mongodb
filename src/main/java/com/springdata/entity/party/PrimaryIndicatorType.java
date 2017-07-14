
package com.springdata.entity.party;

import java.io.Serializable;

public class PrimaryIndicatorType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Value;
    protected String Description;
    
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "[Value=" + Value + ", Description=" + Description + "]";
	}
}
