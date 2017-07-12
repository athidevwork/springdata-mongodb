
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EndorsementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<EndorsementOverviewType> endorsementOverview;
    protected List<FormMgmtDetailType> formMgmtDetail;

    /**
     * Gets the value of the endorsementOverview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endorsementOverview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndorsementOverview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndorsementOverviewType }
     * 
     * 
     */
    public List<EndorsementOverviewType> getEndorsementOverview() {
        if (endorsementOverview == null) {
            endorsementOverview = new ArrayList<EndorsementOverviewType>();
        }
        return this.endorsementOverview;
    }

    /**
     * Gets the value of the formMgmtDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formMgmtDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormMgmtDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormMgmtDetailType }
     * 
     * 
     */
    public List<FormMgmtDetailType> getFormMgmtDetail() {
        if (formMgmtDetail == null) {
            formMgmtDetail = new ArrayList<FormMgmtDetailType>();
        }
        return this.formMgmtDetail;
    }

}
