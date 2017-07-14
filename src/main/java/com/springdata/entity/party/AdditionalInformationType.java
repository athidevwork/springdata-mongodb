
package com.springdata.entity.party;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AdditionalInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<AdditionalDataType> AdditionalData;
    protected List<AdditionalNumberType> AdditionalNumber;
    protected List<AdditionalDateTimeType> AdditionalDateTime;

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalDataType }
     * 
     * 
     */
    public List<AdditionalDataType> getAdditionalData() {
        if (AdditionalData == null) {
            AdditionalData = new ArrayList<AdditionalDataType>();
        }
        return this.AdditionalData;
    }

    /**
     * Gets the value of the additionalNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalNumberType }
     * 
     * 
     */
    public List<AdditionalNumberType> getAdditionalNumber() {
        if (AdditionalNumber == null) {
            AdditionalNumber = new ArrayList<AdditionalNumberType>();
        }
        return this.AdditionalNumber;
    }

    /**
     * Gets the value of the additionalDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalDateTimeType }
     * 
     * 
     */
    public List<AdditionalDateTimeType> getAdditionalDateTime() {
        if (AdditionalDateTime == null) {
            AdditionalDateTime = new ArrayList<AdditionalDateTimeType>();
        }
        return this.AdditionalDateTime;
    }

	@Override
	public String toString() {
		return "[AdditionalData=" + AdditionalData + ", AdditionalNumber=" + AdditionalNumber
				+ ", AdditionalDateTime=" + AdditionalDateTime + "]";
	}

}
