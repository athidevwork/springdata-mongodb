
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PolicyAuditHistoryType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PolicyAuditHistoryDetailType> policyAuditHistoryDetail;

    /**
     * Gets the value of the policyAuditHistoryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyAuditHistoryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyAuditHistoryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyAuditHistoryDetailType }
     * 
     * 
     */
    public List<PolicyAuditHistoryDetailType> getPolicyAuditHistoryDetail() {
        if (policyAuditHistoryDetail == null) {
            policyAuditHistoryDetail = new ArrayList<PolicyAuditHistoryDetailType>();
        }
        return this.policyAuditHistoryDetail;
    }

    public void setPolicyAuditHistoryDetail(PolicyAuditHistoryDetailType policyAuditHistoryDetailType) {
        if (this.policyAuditHistoryDetail == null) {
            this.policyAuditHistoryDetail = new ArrayList<PolicyAuditHistoryDetailType>();
        }
        this.policyAuditHistoryDetail.add(policyAuditHistoryDetailType);
    }

}
