
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EndorsementOverviewType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<OverviewFormType> Form;

    /**
     * Gets the value of the form property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the form property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverviewFormType }
     * 
     * 
     */
    public List<OverviewFormType> getForm() {
        if (Form == null) {
            Form = new ArrayList<OverviewFormType>();
        }
        return this.Form;
    }

	@Override
	public String toString() {
		return "[Form=" + Form + "]";
	}
}
