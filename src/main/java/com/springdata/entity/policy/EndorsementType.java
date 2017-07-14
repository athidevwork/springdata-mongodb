
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.List;

public class EndorsementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<EndorsementOverviewType> EndorsementOverview;
    protected List<FormMgmtDetailType> FormMgmtDetail;
	public List<EndorsementOverviewType> getEndorsementOverview() {
		return EndorsementOverview;
	}
	public void setEndorsementOverview(List<EndorsementOverviewType> endorsementOverview) {
		EndorsementOverview = endorsementOverview;
	}
	public List<FormMgmtDetailType> getFormMgmtDetail() {
		return FormMgmtDetail;
	}
	public void setFormMgmtDetail(List<FormMgmtDetailType> formMgmtDetail) {
		FormMgmtDetail = formMgmtDetail;
	}
	@Override
	public String toString() {
		return "[EndorsementOverview=" + EndorsementOverview + ", FormMgmtDetail=" + FormMgmtDetail
				+ "]";
	}
}
