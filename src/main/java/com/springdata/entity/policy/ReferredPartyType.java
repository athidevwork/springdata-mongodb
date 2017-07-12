
package com.springdata.entity.policy;

import java.io.Serializable;

public class ReferredPartyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String partyNumberId;

    /**
     * Gets the value of the partyNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNumberId() {
        return partyNumberId;
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
        this.partyNumberId = value;
    }

}
