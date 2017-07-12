
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EndorsementOverviewType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<OverviewFormType> form;

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
        if (form == null) {
            form = new ArrayList<OverviewFormType>();
        }
        return this.form;
    }

}
