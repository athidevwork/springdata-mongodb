
package com.springdata.entity.policy;

import java.io.Serializable;

public class RiskInfoType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String RiskIBNRStatus;
    protected String RiskTypeCode;
    protected String RiskSlotId;
    protected String RiskPCFParticipate;
	public String getRiskIBNRStatus() {
		return RiskIBNRStatus;
	}
	public void setRiskIBNRStatus(String riskIBNRStatus) {
		RiskIBNRStatus = riskIBNRStatus;
	}
	public String getRiskTypeCode() {
		return RiskTypeCode;
	}
	public void setRiskTypeCode(String riskTypeCode) {
		RiskTypeCode = riskTypeCode;
	}
	public String getRiskSlotId() {
		return RiskSlotId;
	}
	public void setRiskSlotId(String riskSlotId) {
		RiskSlotId = riskSlotId;
	}
	public String getRiskPCFParticipate() {
		return RiskPCFParticipate;
	}
	public void setRiskPCFParticipate(String riskPCFParticipate) {
		RiskPCFParticipate = riskPCFParticipate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[RiskIBNRStatus=" + RiskIBNRStatus + ", RiskTypeCode=" + RiskTypeCode + ", RiskSlotId="
				+ RiskSlotId + ", RiskPCFParticipate=" + RiskPCFParticipate + "]";
	}
}
