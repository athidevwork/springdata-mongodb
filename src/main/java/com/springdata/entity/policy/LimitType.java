
package com.springdata.entity.policy;

import java.io.Serializable;

public class LimitType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected LimitTypeCodeType LimitTypeCode;
    protected String SharedLimitIndicator;
    protected IncidentLimitTypeCodeType IncidentLimitTypeCode;
    protected AgregateLimitTypeCodeType AgregateLimitTypeCode;
    protected String SubLimitIndicator;
    protected String ErosionTypeCode;
	public LimitTypeCodeType getLimitTypeCode() {
		return LimitTypeCode;
	}
	public void setLimitTypeCode(LimitTypeCodeType limitTypeCode) {
		LimitTypeCode = limitTypeCode;
	}
	public String getSharedLimitIndicator() {
		return SharedLimitIndicator;
	}
	public void setSharedLimitIndicator(String sharedLimitIndicator) {
		SharedLimitIndicator = sharedLimitIndicator;
	}
	public IncidentLimitTypeCodeType getIncidentLimitTypeCode() {
		return IncidentLimitTypeCode;
	}
	public void setIncidentLimitTypeCode(IncidentLimitTypeCodeType incidentLimitTypeCode) {
		IncidentLimitTypeCode = incidentLimitTypeCode;
	}
	public AgregateLimitTypeCodeType getAgregateLimitTypeCode() {
		return AgregateLimitTypeCode;
	}
	public void setAgregateLimitTypeCode(AgregateLimitTypeCodeType agregateLimitTypeCode) {
		AgregateLimitTypeCode = agregateLimitTypeCode;
	}
	public String getSubLimitIndicator() {
		return SubLimitIndicator;
	}
	public void setSubLimitIndicator(String subLimitIndicator) {
		SubLimitIndicator = subLimitIndicator;
	}
	public String getErosionTypeCode() {
		return ErosionTypeCode;
	}
	public void setErosionTypeCode(String erosionTypeCode) {
		ErosionTypeCode = erosionTypeCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[LimitTypeCode=" + LimitTypeCode + ", SharedLimitIndicator=" + SharedLimitIndicator
				+ ", IncidentLimitTypeCode=" + IncidentLimitTypeCode + ", AgregateLimitTypeCode="
				+ AgregateLimitTypeCode + ", SubLimitIndicator=" + SubLimitIndicator + ", ErosionTypeCode="
				+ ErosionTypeCode + "]";
	}
}
