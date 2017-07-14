
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PolicyAuditHistoryType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PolicyAuditHistoryDetailType> PolicyAuditHistoryDetail;

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
        if (PolicyAuditHistoryDetail == null) {
            PolicyAuditHistoryDetail = new ArrayList<PolicyAuditHistoryDetailType>();
        }
        return this.PolicyAuditHistoryDetail;
    }

    public void setPolicyAuditHistoryDetail(PolicyAuditHistoryDetailType policyAuditHistoryDetailType) {
        if (this.PolicyAuditHistoryDetail == null) {
            this.PolicyAuditHistoryDetail = new ArrayList<PolicyAuditHistoryDetailType>();
        }
        this.PolicyAuditHistoryDetail.add(policyAuditHistoryDetailType);
    }

	@Override
	public String toString() {
		return "[PolicyAuditHistoryDetail=" + PolicyAuditHistoryDetail + "]";
	}

}
