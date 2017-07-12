
package com.springdata.entity.party;

import java.io.Serializable;

public class ReferredPartyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String partyNumberId;
    protected String partyFullName;
    protected String clientId;

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

    /**
     * Gets the value of the partyFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyFullName() {
        return partyFullName;
    }

    /**
     * Sets the value of the partyFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyFullName(String value) {
        this.partyFullName = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

}
