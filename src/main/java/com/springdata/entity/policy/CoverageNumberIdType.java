
package com.springdata.entity.policy;

import java.io.Serializable;

public class CoverageNumberIdType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String Value;
    protected String Description;
    protected String Type;
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
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	@Override
	public String toString() {
		return "[Value=" + Value + ", Description=" + Description + ", Type=" + Type + "]";
	}
}
