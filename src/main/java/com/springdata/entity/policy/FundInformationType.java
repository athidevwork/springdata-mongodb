
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FundInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<FundDataType> fundData;
    protected String state;

    /**
     * Gets the value of the fundData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundDataType }
     * 
     * 
     */
    public List<FundDataType> getFundData() {
        if (fundData == null) {
            fundData = new ArrayList<FundDataType>();
        }
        return this.fundData;
    }

    /**
     * getFundDataValue - return the value for a fund field.
     * @param key - state
     * @return value of fund value for a fundInformation of a state
     */
    public String getFundDataValue(String key) {
        if (key.equalsIgnoreCase(""))
            return "";
        for (FundDataType data : fundData) {
            if (data.getKey().equalsIgnoreCase(key))
                return data.getValue();
        }
        return "";
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
