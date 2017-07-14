
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VarTextEndorsementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<EndorsementListType> EndorsementList;

    /**
     * Gets the value of the endorsementList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndorsementListType }
     * 
     * 
     */
    public List<EndorsementListType> getEndorsementList() {
        if (EndorsementList == null) {
            EndorsementList = new ArrayList<EndorsementListType>();
        }
        return this.EndorsementList;
    }

	@Override
	public String toString() {
		return "[EndorsementList=" + EndorsementList + "]";
	}

}
