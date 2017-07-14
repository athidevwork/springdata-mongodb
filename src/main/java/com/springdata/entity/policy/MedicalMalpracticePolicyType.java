
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicalMalpracticePolicyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String PolicyId;
    protected String PolicyNumberId;
    protected String PolicyTermNumberId;
    protected String CurrentTermAmount;
    protected String CurrentFundAmount;
    protected String CurrentTotalAmount;
    protected PrintNameType PrintName;
    protected ContractPeriodType ContractPeriod;
    protected TransactionDetailType TransactionDetail;
    protected RenewalDetailType RenewalDetail;
    protected PolicyHolderType PolicyHolder;
    protected List<InsurerType> Insurer;
    protected List<ProducerType> Producer;
    protected UnderwriterType Underwriter;
    protected PrincipalBillingAccountInformationType PrincipalBillingAccountInformation;
    protected PolicyDetailType PolicyDetail;
    protected List<AdditionalInsuredType> AdditionalInsured;
    protected List<CollateralType> Collateral;
    protected List<CreditStackingInformationType> CreditStackingInformation;
    protected PolicyAuditHistoryType PolicyAuditHistory;
    protected IQBFormDataType IqbFormData;
    protected LimitDeductibleSharingType LimitDeductibleSharing;
    protected List<PaymentType> Payment;
    protected List<SpecialHandlingType> SpecialHandling;
    protected List<TailType> Tail;
    protected List<TransactionType> Transaction;
    protected CancellationDetailType CancellationDetail;
    protected List<InsuredType> Insured;
    protected List<COIHolderType> CoiHolder;
    protected List<FTERiskNamesInformationType> FteRiskNamesInformation;
    protected List<NationalProgramType> NationalProgram;
    protected List<RiskRelationType> RiskRelation;
    protected List<ScheduleType> Schedule;
    protected List<FundSubmissionInformationType> FundSubmissionInformation;
    protected List<HoursPerWeekType> HoursPerWeek;
    protected List<SelectedAddressType> SelectedAddress;
    protected MedicalMalpracticeLineOfBusinessType MedicalMalpracticeLineOfBusiness;
    protected List<ManuscriptType> Manuscript;
    protected VarTextEndorsementType VarTextEndorsement;
    protected EndorsementType Endorsement;
    protected List<CreditSurchargeDeductibleType> CreditSurchargeDeductible;
    
	public String getPolicyId() {
		return PolicyId;
	}
	public void setPolicyId(String policyId) {
		PolicyId = policyId;
	}
	public String getPolicyNumberId() {
		return PolicyNumberId;
	}
	public void setPolicyNumberId(String policyNumberId) {
		PolicyNumberId = policyNumberId;
	}
	public String getPolicyTermNumberId() {
		return PolicyTermNumberId;
	}
	public void setPolicyTermNumberId(String policyTermNumberId) {
		PolicyTermNumberId = policyTermNumberId;
	}
	public String getCurrentTermAmount() {
		return CurrentTermAmount;
	}
	public void setCurrentTermAmount(String currentTermAmount) {
		CurrentTermAmount = currentTermAmount;
	}
	public String getCurrentFundAmount() {
		return CurrentFundAmount;
	}
	public void setCurrentFundAmount(String currentFundAmount) {
		CurrentFundAmount = currentFundAmount;
	}
	public String getCurrentTotalAmount() {
		return CurrentTotalAmount;
	}
	public void setCurrentTotalAmount(String currentTotalAmount) {
		CurrentTotalAmount = currentTotalAmount;
	}
	public PrintNameType getPrintName() {
		return PrintName;
	}
	public void setPrintName(PrintNameType printName) {
		PrintName = printName;
	}
	public ContractPeriodType getContractPeriod() {
		return ContractPeriod;
	}
	public void setContractPeriod(ContractPeriodType contractPeriod) {
		ContractPeriod = contractPeriod;
	}
	public TransactionDetailType getTransactionDetail() {
		return TransactionDetail;
	}
	public void setTransactionDetail(TransactionDetailType transactionDetail) {
		TransactionDetail = transactionDetail;
	}
	public RenewalDetailType getRenewalDetail() {
		return RenewalDetail;
	}
	public void setRenewalDetail(RenewalDetailType renewalDetail) {
		RenewalDetail = renewalDetail;
	}
	public PolicyHolderType getPolicyHolder() {
		return PolicyHolder;
	}
	public void setPolicyHolder(PolicyHolderType policyHolder) {
		PolicyHolder = policyHolder;
	}
	public List<InsurerType> getInsurer() {
		return Insurer;
	}
	public void setInsurer(List<InsurerType> insurer) {
		Insurer = insurer;
	}
	public List<ProducerType> getProducer() {
		return Producer;
	}
	public void setProducer(List<ProducerType> producer) {
		Producer = producer;
	}
	public UnderwriterType getUnderwriter() {
		return Underwriter;
	}
	public void setUnderwriter(UnderwriterType underwriter) {
		Underwriter = underwriter;
	}
	public PrincipalBillingAccountInformationType getPrincipalBillingAccountInformation() {
		return PrincipalBillingAccountInformation;
	}
	public void setPrincipalBillingAccountInformation(
			PrincipalBillingAccountInformationType principalBillingAccountInformation) {
		PrincipalBillingAccountInformation = principalBillingAccountInformation;
	}
	public PolicyDetailType getPolicyDetail() {
		return PolicyDetail;
	}
	public void setPolicyDetail(PolicyDetailType policyDetail) {
		PolicyDetail = policyDetail;
	}
	public List<AdditionalInsuredType> getAdditionalInsured() {
		return AdditionalInsured;
	}
	public void setAdditionalInsured(List<AdditionalInsuredType> additionalInsured) {
		AdditionalInsured = additionalInsured;
	}
	public List<CollateralType> getCollateral() {
		return Collateral;
	}
	public void setCollateral(List<CollateralType> collateral) {
		Collateral = collateral;
	}
	public List<CreditStackingInformationType> getCreditStackingInformation() {
		return CreditStackingInformation;
	}
	public void setCreditStackingInformation(List<CreditStackingInformationType> creditStackingInformation) {
		CreditStackingInformation = creditStackingInformation;
	}
	public PolicyAuditHistoryType getPolicyAuditHistory() {
		return PolicyAuditHistory;
	}
	public void setPolicyAuditHistory(PolicyAuditHistoryType policyAuditHistory) {
		PolicyAuditHistory = policyAuditHistory;
	}
	public IQBFormDataType getIqbFormData() {
		return IqbFormData;
	}
	public void setIqbFormData(IQBFormDataType iqbFormData) {
		IqbFormData = iqbFormData;
	}
	public LimitDeductibleSharingType getLimitDeductibleSharing() {
		return LimitDeductibleSharing;
	}
	public void setLimitDeductibleSharing(LimitDeductibleSharingType limitDeductibleSharing) {
		LimitDeductibleSharing = limitDeductibleSharing;
	}
	public List<PaymentType> getPayment() {
		return Payment;
	}
	public void setPayment(List<PaymentType> payment) {
		Payment = payment;
	}
	public List<SpecialHandlingType> getSpecialHandling() {
		return SpecialHandling;
	}
	public void setSpecialHandling(List<SpecialHandlingType> specialHandling) {
		SpecialHandling = specialHandling;
	}
	public List<TailType> getTail() {
		return Tail;
	}
	public void setTail(List<TailType> tail) {
		Tail = tail;
	}
	public List<TransactionType> getTransaction() {
		return Transaction;
	}
	public void setTransaction(List<TransactionType> transaction) {
		Transaction = transaction;
	}
	public CancellationDetailType getCancellationDetail() {
		return CancellationDetail;
	}
	public void setCancellationDetail(CancellationDetailType cancellationDetail) {
		CancellationDetail = cancellationDetail;
	}
	public List<InsuredType> getInsured() {
		return Insured;
	}
	public void setInsured(List<InsuredType> insured) {
		Insured = insured;
	}
	public List<COIHolderType> getCoiHolder() {
		return CoiHolder;
	}
	public void setCoiHolder(List<COIHolderType> coiHolder) {
		CoiHolder = coiHolder;
	}
	public List<FTERiskNamesInformationType> getFteRiskNamesInformation() {
		return FteRiskNamesInformation;
	}
	public void setFteRiskNamesInformation(List<FTERiskNamesInformationType> fteRiskNamesInformation) {
		FteRiskNamesInformation = fteRiskNamesInformation;
	}
	public List<NationalProgramType> getNationalProgram() {
		return NationalProgram;
	}
	public void setNationalProgram(List<NationalProgramType> nationalProgram) {
		NationalProgram = nationalProgram;
	}
	public List<RiskRelationType> getRiskRelation() {
		return RiskRelation;
	}
	public void setRiskRelation(List<RiskRelationType> riskRelation) {
		RiskRelation = riskRelation;
	}
	public List<ScheduleType> getSchedule() {
		return Schedule;
	}
	public void setSchedule(List<ScheduleType> schedule) {
		Schedule = schedule;
	}
	public List<FundSubmissionInformationType> getFundSubmissionInformation() {
		return FundSubmissionInformation;
	}
	public void setFundSubmissionInformation(List<FundSubmissionInformationType> fundSubmissionInformation) {
		FundSubmissionInformation = fundSubmissionInformation;
	}
	public List<HoursPerWeekType> getHoursPerWeek() {
		return HoursPerWeek;
	}
	public void setHoursPerWeek(List<HoursPerWeekType> hoursPerWeek) {
		HoursPerWeek = hoursPerWeek;
	}
	public List<SelectedAddressType> getSelectedAddress() {
		return SelectedAddress;
	}
	public void setSelectedAddress(List<SelectedAddressType> selectedAddress) {
		SelectedAddress = selectedAddress;
	}
	public MedicalMalpracticeLineOfBusinessType getMedicalMalpracticeLineOfBusiness() {
		return MedicalMalpracticeLineOfBusiness;
	}
	public void setMedicalMalpracticeLineOfBusiness(MedicalMalpracticeLineOfBusinessType medicalMalpracticeLineOfBusiness) {
		MedicalMalpracticeLineOfBusiness = medicalMalpracticeLineOfBusiness;
	}
	public List<ManuscriptType> getManuscript() {
		return Manuscript;
	}
	public void setManuscript(List<ManuscriptType> manuscript) {
		Manuscript = manuscript;
	}
	public VarTextEndorsementType getVarTextEndorsement() {
		return VarTextEndorsement;
	}
	public void setVarTextEndorsement(VarTextEndorsementType varTextEndorsement) {
		VarTextEndorsement = varTextEndorsement;
	}
	public EndorsementType getEndorsement() {
		return Endorsement;
	}
	public void setEndorsement(EndorsementType endorsement) {
		Endorsement = endorsement;
	}
	public List<CreditSurchargeDeductibleType> getCreditSurchargeDeductible() {
		return CreditSurchargeDeductible;
	}
	public void setCreditSurchargeDeductible(List<CreditSurchargeDeductibleType> creditSurchargeDeductible) {
		CreditSurchargeDeductible = creditSurchargeDeductible;
	}
	@Override
	public String toString() {
		return "\n\t\t[PolicyId=" + PolicyId + ", PolicyNumberId=" + PolicyNumberId
				+ ", PolicyTermNumberId=" + PolicyTermNumberId + ", CurrentTermAmount=" + CurrentTermAmount
				+ ", CurrentFundAmount=" + CurrentFundAmount + ", CurrentTotalAmount=" + CurrentTotalAmount
				+ ", PrintName=" + PrintName + ", ContractPeriod=" + ContractPeriod + ", TransactionDetail="
				+ TransactionDetail + ", RenewalDetail=" + RenewalDetail + ", PolicyHolder=" + PolicyHolder
				+ ", Insurer=" + Insurer + ", Producer=" + Producer + ", Underwriter=" + Underwriter
				+ ", PrincipalBillingAccountInformation=" + PrincipalBillingAccountInformation + ", PolicyDetail="
				+ PolicyDetail + ", AdditionalInsured=" + AdditionalInsured + ", Collateral=" + Collateral
				+ ", CreditStackingInformation=" + CreditStackingInformation + ", PolicyAuditHistory="
				+ PolicyAuditHistory + ", IqbFormData=" + IqbFormData + ", LimitDeductibleSharing="
				+ LimitDeductibleSharing + ", Payment=" + Payment + ", SpecialHandling=" + SpecialHandling + ", Tail="
				+ Tail + ", Transaction=" + Transaction + ", CancellationDetail=" + CancellationDetail + ", Insured="
				+ Insured + ", CoiHolder=" + CoiHolder + ", FteRiskNamesInformation=" + FteRiskNamesInformation
				+ ", NationalProgram=" + NationalProgram + ", RiskRelation=" + RiskRelation + ", Schedule=" + Schedule
				+ ", FundSubmissionInformation=" + FundSubmissionInformation + ", HoursPerWeek=" + HoursPerWeek
				+ ", SelectedAddress=" + SelectedAddress + ", MedicalMalpracticeLineOfBusiness="
				+ MedicalMalpracticeLineOfBusiness + ", Manuscript=" + Manuscript + ", VarTextEndorsement="
				+ VarTextEndorsement + ", Endorsement=" + Endorsement + ", CreditSurchargeDeductible="
				+ CreditSurchargeDeductible + "]";
	}
}
