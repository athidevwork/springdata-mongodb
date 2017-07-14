
package com.springdata.entity.policy;

import java.io.Serializable;

public class CreditSurchargeDeductibleVersionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String CreditSurchargeDeductibleVersionId;
    protected EffectivePeriodType EffectivePeriod;
    protected ProductComponentInfoType ProductCoverageComponentInfo;
    protected String NumericValue;
    protected String IncidentDeductibleNumericValue;
    protected String AggregateDeductibleNumericValue;
    protected String CycleDate;
    protected String ProrateIndicator;
    protected String RenewalIndicator;
    protected String ClassificationCode;
    protected String AdditionalNotes;
    protected AdditionalInformationType AdditionalInformation;
    protected CreditSurchargeDeductibleVersionDetailType CreditSurchargeDeductibleVersionDetail;
    
	public String getCreditSurchargeDeductibleVersionId() {
		return CreditSurchargeDeductibleVersionId;
	}
	public void setCreditSurchargeDeductibleVersionId(String creditSurchargeDeductibleVersionId) {
		CreditSurchargeDeductibleVersionId = creditSurchargeDeductibleVersionId;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public ProductComponentInfoType getProductCoverageComponentInfo() {
		return ProductCoverageComponentInfo;
	}
	public void setProductCoverageComponentInfo(ProductComponentInfoType productCoverageComponentInfo) {
		ProductCoverageComponentInfo = productCoverageComponentInfo;
	}
	public String getNumericValue() {
		return NumericValue;
	}
	public void setNumericValue(String numericValue) {
		NumericValue = numericValue;
	}
	public String getIncidentDeductibleNumericValue() {
		return IncidentDeductibleNumericValue;
	}
	public void setIncidentDeductibleNumericValue(String incidentDeductibleNumericValue) {
		IncidentDeductibleNumericValue = incidentDeductibleNumericValue;
	}
	public String getAggregateDeductibleNumericValue() {
		return AggregateDeductibleNumericValue;
	}
	public void setAggregateDeductibleNumericValue(String aggregateDeductibleNumericValue) {
		AggregateDeductibleNumericValue = aggregateDeductibleNumericValue;
	}
	public String getCycleDate() {
		return CycleDate;
	}
	public void setCycleDate(String cycleDate) {
		CycleDate = cycleDate;
	}
	public String getProrateIndicator() {
		return ProrateIndicator;
	}
	public void setProrateIndicator(String prorateIndicator) {
		ProrateIndicator = prorateIndicator;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public String getClassificationCode() {
		return ClassificationCode;
	}
	public void setClassificationCode(String classificationCode) {
		ClassificationCode = classificationCode;
	}
	public String getAdditionalNotes() {
		return AdditionalNotes;
	}
	public void setAdditionalNotes(String additionalNotes) {
		AdditionalNotes = additionalNotes;
	}
	public AdditionalInformationType getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(AdditionalInformationType additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	public CreditSurchargeDeductibleVersionDetailType getCreditSurchargeDeductibleVersionDetail() {
		return CreditSurchargeDeductibleVersionDetail;
	}
	public void setCreditSurchargeDeductibleVersionDetail(
			CreditSurchargeDeductibleVersionDetailType creditSurchargeDeductibleVersionDetail) {
		CreditSurchargeDeductibleVersionDetail = creditSurchargeDeductibleVersionDetail;
	}
	@Override
	public String toString() {
		return "\n\t\t\t\t[CreditSurchargeDeductibleVersionId="
				+ CreditSurchargeDeductibleVersionId + ", EffectivePeriod=" + EffectivePeriod
				+ ", ProductCoverageComponentInfo=" + ProductCoverageComponentInfo + ", NumericValue=" + NumericValue
				+ ", IncidentDeductibleNumericValue=" + IncidentDeductibleNumericValue
				+ ", AggregateDeductibleNumericValue=" + AggregateDeductibleNumericValue + ", CycleDate=" + CycleDate
				+ ", ProrateIndicator=" + ProrateIndicator + ", RenewalIndicator=" + RenewalIndicator
				+ ", ClassificationCode=" + ClassificationCode + ", AdditionalNotes=" + AdditionalNotes
				+ ", AdditionalInformation=" + AdditionalInformation + ", CreditSurchargeDeductibleVersionDetail="
				+ CreditSurchargeDeductibleVersionDetail + "]";
	}
}
