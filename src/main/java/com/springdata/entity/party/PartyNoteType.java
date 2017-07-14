
package com.springdata.entity.party;

import java.io.Serializable;

public class PartyNoteType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PartyNoteNumberId;
    protected String PartyNoteType;
    protected String PartyNoteDateTime;
    protected String PartyNoteStatus;
    protected String Note;
    protected String Key;
    
	public String getPartyNoteNumberId() {
		return PartyNoteNumberId;
	}
	public void setPartyNoteNumberId(String partyNoteNumberId) {
		PartyNoteNumberId = partyNoteNumberId;
	}
	public String getPartyNoteType() {
		return PartyNoteType;
	}
	public void setPartyNoteType(String partyNoteType) {
		PartyNoteType = partyNoteType;
	}
	public String getPartyNoteDateTime() {
		return PartyNoteDateTime;
	}
	public void setPartyNoteDateTime(String partyNoteDateTime) {
		PartyNoteDateTime = partyNoteDateTime;
	}
	public String getPartyNoteStatus() {
		return PartyNoteStatus;
	}
	public void setPartyNoteStatus(String partyNoteStatus) {
		PartyNoteStatus = partyNoteStatus;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[PartyNoteNumberId=" + PartyNoteNumberId + ", PartyNoteType=" + PartyNoteType
				+ ", PartyNoteDateTime=" + PartyNoteDateTime + ", PartyNoteStatus=" + PartyNoteStatus + ", Note=" + Note
				+ ", Key=" + Key + "]";
	}
}