
package com.springdata.entity.inquiryservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MessageStatusType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String MessageStatusCode;
    //protected List<ExtendedStatusType> extendedStatus;

    /**
     * Gets the value of the messageStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStatusCode() {
        return MessageStatusCode;
    }

    /**
     * Sets the value of the messageStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStatusCode(String value) {
        this.MessageStatusCode = value;
    }

	@Override
	public String toString() {
		return "MessageStatusType \n\t[MessageStatusCode=" + MessageStatusCode + "]";
	}

    /**
     * Gets the value of the extendedStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedStatusType }
     * 
     * 
     */
/*    public List<ExtendedStatusType> getExtendedStatus() {
        if (extendedStatus == null) {
            extendedStatus = new ArrayList<ExtendedStatusType>();
        }
        return this.extendedStatus;
    }*/

    
}
