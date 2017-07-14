
package com.springdata.entity.party;

import java.io.Serializable;

public class ReferredPartyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PartyNumberId;
    protected String PartyFullName;
    protected String ClientId;
    
	@Override
	public String toString() {
		return "[PartyNumberId=" + PartyNumberId + ", PartyFullName=" + PartyFullName + ", ClientId="
				+ ClientId + "]";
	}
	public String getPartyNumberId() {
		return PartyNumberId;
	}
	public void setPartyNumberId(String partyNumberId) {
		PartyNumberId = partyNumberId;
	}
	public String getPartyFullName() {
		return PartyFullName;
	}
	public void setPartyFullName(String partyFullName) {
		PartyFullName = partyFullName;
	}
	public String getClientId() {
		return ClientId;
	}
	public void setClientId(String clientId) {
		ClientId = clientId;
	}
}
