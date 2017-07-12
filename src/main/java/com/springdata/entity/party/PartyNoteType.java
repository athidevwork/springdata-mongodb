
package com.springdata.entity.party;

import java.io.Serializable;

public class PartyNoteType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String partyNoteNumberId;
    protected String partyNoteType;
    protected String partyNoteDateTime;
    protected String partyNoteStatus;
    protected String note;
    protected String key;

    /**
     * Gets the value of the partyNoteNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNoteNumberId() {
        return partyNoteNumberId;
    }

    /**
     * Sets the value of the partyNoteNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNoteNumberId(String value) {
        this.partyNoteNumberId = value;
    }

    /**
     * Gets the value of the partyNoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNoteType() {
        return partyNoteType;
    }

    /**
     * Sets the value of the partyNoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNoteType(String value) {
        this.partyNoteType = value;
    }

    /**
     * Gets the value of the partyNoteDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNoteDateTime() {
        return partyNoteDateTime;
    }

    /**
     * Sets the value of the partyNoteDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNoteDateTime(String value) {
        this.partyNoteDateTime = value;
    }

    /**
     * Gets the value of the partyNoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNoteStatus() {
        return partyNoteStatus;
    }

    /**
     * Sets the value of the partyNoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNoteStatus(String value) {
        this.partyNoteStatus = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
