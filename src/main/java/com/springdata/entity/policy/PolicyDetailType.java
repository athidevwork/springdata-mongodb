
package com.springdata.entity.policy;

import java.io.Serializable;

public class PolicyDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PolicyTypeCodeType PolicyTypeCode;
    protected String ShortTermIndicator;
    protected PolicyStatusCodeType PolicyStatusCode;
    protected PolicyCycleCodeType PolicyCycleCode;
    protected String PolicyLayerCode;
    protected PriorPolicyType PriorPolicy;
    protected String GuaranteeDate;
    protected String DeclinationDate;
    protected IndicationType Indication;
    protected IssueCompanyType IssueCompany;
    protected String OrganizationType;
    protected String BinderIndicator;
    protected String CollateralIndicator;
    protected String ProgramCode;
    protected String CategoryCode;
    protected String HospitalTier;
    protected String ClaimsMadeYear;
    protected String PeerGroupCode;
    protected String FirstPotentialCancelDate;
    protected String SecondPotentialCancelDate;
    protected String PlAggregatCode;
    protected String GlAggregateCode;
    protected String AccountNumber;
    protected String AccountIdentifier;
    protected String PolicyTermTypeCode;
    protected String InceptionDate;
    protected String RequestedStartDate;
    protected String ParentPolicyNumber;
    protected String ProcessStatusCode;
    protected String QuestionaireDate;
    protected String TermReasonCode;
    protected String TermStatusCode;
    protected String QuoteAccept;
    protected String AdditionalInsuredCount;
    protected String WaitForPaymentIndicator;
    protected String LeadQuoteIndicator;
    protected String OnbaseKey;
    protected AdditionalInformationType AdditionalInformation;
    protected PolicyVersionDetailType PolicyVersionDetail;
	public PolicyTypeCodeType getPolicyTypeCode() {
		return PolicyTypeCode;
	}
	public void setPolicyTypeCode(PolicyTypeCodeType policyTypeCode) {
		PolicyTypeCode = policyTypeCode;
	}
	public String getShortTermIndicator() {
		return ShortTermIndicator;
	}
	public void setShortTermIndicator(String shortTermIndicator) {
		ShortTermIndicator = shortTermIndicator;
	}
	public PolicyStatusCodeType getPolicyStatusCode() {
		return PolicyStatusCode;
	}
	public void setPolicyStatusCode(PolicyStatusCodeType policyStatusCode) {
		PolicyStatusCode = policyStatusCode;
	}
	public PolicyCycleCodeType getPolicyCycleCode() {
		return PolicyCycleCode;
	}
	public void setPolicyCycleCode(PolicyCycleCodeType policyCycleCode) {
		PolicyCycleCode = policyCycleCode;
	}
	public String getPolicyLayerCode() {
		return PolicyLayerCode;
	}
	public void setPolicyLayerCode(String policyLayerCode) {
		PolicyLayerCode = policyLayerCode;
	}
	public PriorPolicyType getPriorPolicy() {
		return PriorPolicy;
	}
	public void setPriorPolicy(PriorPolicyType priorPolicy) {
		PriorPolicy = priorPolicy;
	}
	public String getGuaranteeDate() {
		return GuaranteeDate;
	}
	public void setGuaranteeDate(String guaranteeDate) {
		GuaranteeDate = guaranteeDate;
	}
	public String getDeclinationDate() {
		return DeclinationDate;
	}
	public void setDeclinationDate(String declinationDate) {
		DeclinationDate = declinationDate;
	}
	public IndicationType getIndication() {
		return Indication;
	}
	public void setIndication(IndicationType indication) {
		Indication = indication;
	}
	public IssueCompanyType getIssueCompany() {
		return IssueCompany;
	}
	public void setIssueCompany(IssueCompanyType issueCompany) {
		IssueCompany = issueCompany;
	}
	public String getOrganizationType() {
		return OrganizationType;
	}
	public void setOrganizationType(String organizationType) {
		OrganizationType = organizationType;
	}
	public String getBinderIndicator() {
		return BinderIndicator;
	}
	public void setBinderIndicator(String binderIndicator) {
		BinderIndicator = binderIndicator;
	}
	public String getCollateralIndicator() {
		return CollateralIndicator;
	}
	public void setCollateralIndicator(String collateralIndicator) {
		CollateralIndicator = collateralIndicator;
	}
	public String getProgramCode() {
		return ProgramCode;
	}
	public void setProgramCode(String programCode) {
		ProgramCode = programCode;
	}
	public String getCategoryCode() {
		return CategoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		CategoryCode = categoryCode;
	}
	public String getHospitalTier() {
		return HospitalTier;
	}
	public void setHospitalTier(String hospitalTier) {
		HospitalTier = hospitalTier;
	}
	public String getClaimsMadeYear() {
		return ClaimsMadeYear;
	}
	public void setClaimsMadeYear(String claimsMadeYear) {
		ClaimsMadeYear = claimsMadeYear;
	}
	public String getPeerGroupCode() {
		return PeerGroupCode;
	}
	public void setPeerGroupCode(String peerGroupCode) {
		PeerGroupCode = peerGroupCode;
	}
	public String getFirstPotentialCancelDate() {
		return FirstPotentialCancelDate;
	}
	public void setFirstPotentialCancelDate(String firstPotentialCancelDate) {
		FirstPotentialCancelDate = firstPotentialCancelDate;
	}
	public String getSecondPotentialCancelDate() {
		return SecondPotentialCancelDate;
	}
	public void setSecondPotentialCancelDate(String secondPotentialCancelDate) {
		SecondPotentialCancelDate = secondPotentialCancelDate;
	}
	public String getPlAggregatCode() {
		return PlAggregatCode;
	}
	public void setPlAggregatCode(String plAggregatCode) {
		PlAggregatCode = plAggregatCode;
	}
	public String getGlAggregateCode() {
		return GlAggregateCode;
	}
	public void setGlAggregateCode(String glAggregateCode) {
		GlAggregateCode = glAggregateCode;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountIdentifier() {
		return AccountIdentifier;
	}
	public void setAccountIdentifier(String accountIdentifier) {
		AccountIdentifier = accountIdentifier;
	}
	public String getPolicyTermTypeCode() {
		return PolicyTermTypeCode;
	}
	public void setPolicyTermTypeCode(String policyTermTypeCode) {
		PolicyTermTypeCode = policyTermTypeCode;
	}
	public String getInceptionDate() {
		return InceptionDate;
	}
	public void setInceptionDate(String inceptionDate) {
		InceptionDate = inceptionDate;
	}
	public String getRequestedStartDate() {
		return RequestedStartDate;
	}
	public void setRequestedStartDate(String requestedStartDate) {
		RequestedStartDate = requestedStartDate;
	}
	public String getParentPolicyNumber() {
		return ParentPolicyNumber;
	}
	public void setParentPolicyNumber(String parentPolicyNumber) {
		ParentPolicyNumber = parentPolicyNumber;
	}
	public String getProcessStatusCode() {
		return ProcessStatusCode;
	}
	public void setProcessStatusCode(String processStatusCode) {
		ProcessStatusCode = processStatusCode;
	}
	public String getQuestionaireDate() {
		return QuestionaireDate;
	}
	public void setQuestionaireDate(String questionaireDate) {
		QuestionaireDate = questionaireDate;
	}
	public String getTermReasonCode() {
		return TermReasonCode;
	}
	public void setTermReasonCode(String termReasonCode) {
		TermReasonCode = termReasonCode;
	}
	public String getTermStatusCode() {
		return TermStatusCode;
	}
	public void setTermStatusCode(String termStatusCode) {
		TermStatusCode = termStatusCode;
	}
	public String getQuoteAccept() {
		return QuoteAccept;
	}
	public void setQuoteAccept(String quoteAccept) {
		QuoteAccept = quoteAccept;
	}
	public String getAdditionalInsuredCount() {
		return AdditionalInsuredCount;
	}
	public void setAdditionalInsuredCount(String additionalInsuredCount) {
		AdditionalInsuredCount = additionalInsuredCount;
	}
	public String getWaitForPaymentIndicator() {
		return WaitForPaymentIndicator;
	}
	public void setWaitForPaymentIndicator(String waitForPaymentIndicator) {
		WaitForPaymentIndicator = waitForPaymentIndicator;
	}
	public String getLeadQuoteIndicator() {
		return LeadQuoteIndicator;
	}
	public void setLeadQuoteIndicator(String leadQuoteIndicator) {
		LeadQuoteIndicator = leadQuoteIndicator;
	}
	public String getOnbaseKey() {
		return OnbaseKey;
	}
	public void setOnbaseKey(String onbaseKey) {
		OnbaseKey = onbaseKey;
	}
	public AdditionalInformationType getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(AdditionalInformationType additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	public PolicyVersionDetailType getPolicyVersionDetail() {
		return PolicyVersionDetail;
	}
	public void setPolicyVersionDetail(PolicyVersionDetailType policyVersionDetail) {
		PolicyVersionDetail = policyVersionDetail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[PolicyTypeCode=" + PolicyTypeCode + ", ShortTermIndicator=" + ShortTermIndicator
				+ ", PolicyStatusCode=" + PolicyStatusCode + ", PolicyCycleCode=" + PolicyCycleCode
				+ ", PolicyLayerCode=" + PolicyLayerCode + ", PriorPolicy=" + PriorPolicy + ", GuaranteeDate="
				+ GuaranteeDate + ", DeclinationDate=" + DeclinationDate + ", Indication=" + Indication
				+ ", IssueCompany=" + IssueCompany + ", OrganizationType=" + OrganizationType + ", BinderIndicator="
				+ BinderIndicator + ", CollateralIndicator=" + CollateralIndicator + ", ProgramCode=" + ProgramCode
				+ ", CategoryCode=" + CategoryCode + ", HospitalTier=" + HospitalTier + ", ClaimsMadeYear="
				+ ClaimsMadeYear + ", PeerGroupCode=" + PeerGroupCode + ", FirstPotentialCancelDate="
				+ FirstPotentialCancelDate + ", SecondPotentialCancelDate=" + SecondPotentialCancelDate
				+ ", PlAggregatCode=" + PlAggregatCode + ", GlAggregateCode=" + GlAggregateCode + ", AccountNumber="
				+ AccountNumber + ", AccountIdentifier=" + AccountIdentifier + ", PolicyTermTypeCode="
				+ PolicyTermTypeCode + ", InceptionDate=" + InceptionDate + ", RequestedStartDate=" + RequestedStartDate
				+ ", ParentPolicyNumber=" + ParentPolicyNumber + ", ProcessStatusCode=" + ProcessStatusCode
				+ ", QuestionaireDate=" + QuestionaireDate + ", TermReasonCode=" + TermReasonCode + ", TermStatusCode="
				+ TermStatusCode + ", QuoteAccept=" + QuoteAccept + ", AdditionalInsuredCount=" + AdditionalInsuredCount
				+ ", WaitForPaymentIndicator=" + WaitForPaymentIndicator + ", LeadQuoteIndicator=" + LeadQuoteIndicator
				+ ", OnbaseKey=" + OnbaseKey + ", AdditionalInformation=" + AdditionalInformation
				+ ", PolicyVersionDetail=" + PolicyVersionDetail + "]";
	}
}
