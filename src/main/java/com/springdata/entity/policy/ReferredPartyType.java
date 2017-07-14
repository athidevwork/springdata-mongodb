
package com.springdata.entity.policy;

import java.io.Serializable;

public class ReferredPartyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PartyNumberId;

    /**
     * Gets the value of the partyNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNumberId() {
        return PartyNumberId;
    }

    /**
     * Sets the value of the partyNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNumberId(String value) {
        this.PartyNumberId = value;
    }

	@Override
	public String toString() {
		return "[PartyNumberId=" + PartyNumberId + "]";
	}

}
