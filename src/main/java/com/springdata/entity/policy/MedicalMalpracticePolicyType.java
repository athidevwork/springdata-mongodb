
package com.springdata.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicalMalpracticePolicyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String policyId;
    protected String policyNumberId;
    protected String policyTermNumberId;
    protected String currentTermAmount;
    protected String currentFundAmount;
    protected String currentTotalAmount;
    protected PrintNameType printName;
    protected ContractPeriodType contractPeriod;
    protected TransactionDetailType transactionDetail;
    protected RenewalDetailType renewalDetail;
    protected PolicyHolderType policyHolder;
    protected List<InsurerType> insurer;
    protected List<ProducerType> producer;
    protected UnderwriterType underwriter;
    protected PrincipalBillingAccountInformationType principalBillingAccountInformation;
    protected PolicyDetailType policyDetail;
    protected List<AdditionalInsuredType> additionalInsured;
    protected List<CollateralType> collateral;
    protected List<CreditStackingInformationType> creditStackingInformation;
    protected PolicyAuditHistoryType policyAuditHistory;
    protected IQBFormDataType iqbFormData;
    protected LimitDeductibleSharingType limitDeductibleSharing;
    protected List<PaymentType> payment;
    protected List<SpecialHandlingType> specialHandling;
    protected List<TailType> tail;
    protected List<TransactionType> transaction;
    protected CancellationDetailType cancellationDetail;
    protected List<InsuredType> insured;
    protected List<COIHolderType> coiHolder;
    protected List<FTERiskNamesInformationType> fteRiskNamesInformation;
    protected List<NationalProgramType> nationalProgram;
    protected List<RiskRelationType> riskRelation;
    protected List<ScheduleType> schedule;
    protected List<FundSubmissionInformationType> fundSubmissionInformation;
    protected List<HoursPerWeekType> hoursPerWeek;
    protected List<SelectedAddressType> selectedAddress;
    protected MedicalMalpracticeLineOfBusinessType medicalMalpracticeLineOfBusiness;
    protected List<ManuscriptType> manuscript;
    protected VarTextEndorsementType varTextEndorsement;
    protected EndorsementType endorsement;
    protected List<CreditSurchargeDeductibleType> creditSurchargeDeductible;

    /**
     * Gets the value of the policyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the policyNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumberId() {
        return policyNumberId;
    }

    /**
     * Sets the value of the policyNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumberId(String value) {
        this.policyNumberId = value;
    }

    /**
     * Gets the value of the policyTermNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTermNumberId() {
        return policyTermNumberId;
    }

    /**
     * Sets the value of the policyTermNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTermNumberId(String value) {
        this.policyTermNumberId = value;
    }

    /**
     * Gets the value of the currentTermAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTermAmount() {
        return currentTermAmount;
    }

    /**
     * Sets the value of the currentTermAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTermAmount(String value) {
        this.currentTermAmount = value;
    }

    /**
     * Gets the value of the currentFundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFundAmount() {
        return currentFundAmount;
    }

    /**
     * Sets the value of the currentFundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFundAmount(String value) {
        this.currentFundAmount = value;
    }

    /**
     * Gets the value of the currentTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTotalAmount() {
        return currentTotalAmount;
    }

    /**
     * Sets the value of the currentTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTotalAmount(String value) {
        this.currentTotalAmount = value;
    }

    /**
     * Gets the value of the printName property.
     * 
     * @return
     *     possible object is
     *     {@link PrintNameType }
     *     
     */
    public PrintNameType getPrintName() {
        return printName;
    }

    /**
     * Sets the value of the printName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintNameType }
     *     
     */
    public void setPrintName(PrintNameType value) {
        this.printName = value;
    }

    /**
     * Gets the value of the contractPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractPeriodType }
     *     
     */
    public ContractPeriodType getContractPeriod() {
        return contractPeriod;
    }

    /**
     * Sets the value of the contractPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractPeriodType }
     *     
     */
    public void setContractPeriod(ContractPeriodType value) {
        this.contractPeriod = value;
    }

    /**
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetailType }
     *     
     */
    public TransactionDetailType getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetailType }
     *     
     */
    public void setTransactionDetail(TransactionDetailType value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the renewalDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RenewalDetailType }
     *     
     */
    public RenewalDetailType getRenewalDetail() {
        return renewalDetail;
    }

    /**
     * Sets the value of the renewalDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewalDetailType }
     *     
     */
    public void setRenewalDetail(RenewalDetailType value) {
        this.renewalDetail = value;
    }

    /**
     * Gets the value of the policyHolder property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyHolderType }
     *     
     */
    public PolicyHolderType getPolicyHolder() {
        return policyHolder;
    }

    /**
     * Sets the value of the policyHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyHolderType }
     *     
     */
    public void setPolicyHolder(PolicyHolderType value) {
        this.policyHolder = value;
    }

    /**
     * Gets the value of the insurer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurerType }
     * 
     * 
     */
    public List<InsurerType> getInsurer() {
        if (insurer == null) {
            insurer = new ArrayList<InsurerType>();
        }
        return this.insurer;
    }

    /**
     * Gets the value of the producer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerType }
     * 
     * 
     */
    public List<ProducerType> getProducer() {
        if (producer == null) {
            producer = new ArrayList<ProducerType>();
        }
        return this.producer;
    }

    /**
     * Gets the value of the underwriter property.
     * 
     * @return
     *     possible object is
     *     {@link UnderwriterType }
     *     
     */
    public UnderwriterType getUnderwriter() {
        return underwriter;
    }

    /**
     * Sets the value of the underwriter property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderwriterType }
     *     
     */
    public void setUnderwriter(UnderwriterType value) {
        this.underwriter = value;
    }

    /**
     * Gets the value of the principalBillingAccountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalBillingAccountInformationType }
     *     
     */
    public PrincipalBillingAccountInformationType getPrincipalBillingAccountInformation() {
        return principalBillingAccountInformation;
    }

    /**
     * Sets the value of the principalBillingAccountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalBillingAccountInformationType }
     *     
     */
    public void setPrincipalBillingAccountInformation(PrincipalBillingAccountInformationType value) {
        this.principalBillingAccountInformation = value;
    }

    /**
     * Gets the value of the policyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDetailType }
     *     
     */
    public PolicyDetailType getPolicyDetail() {
        return policyDetail;
    }

    /**
     * Sets the value of the policyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDetailType }
     *     
     */
    public void setPolicyDetail(PolicyDetailType value) {
        this.policyDetail = value;
    }

    /**
     * Gets the value of the additionalInsured property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInsured property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInsured().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInsuredType }
     * 
     * 
     */
    public List<AdditionalInsuredType> getAdditionalInsured() {
        if (additionalInsured == null) {
            additionalInsured = new ArrayList<AdditionalInsuredType>();
        }
        return this.additionalInsured;
    }

    /**
     * Gets the value of the collateral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralType }
     * 
     * 
     */
    public List<CollateralType> getCollateral() {
        if (collateral == null) {
            collateral = new ArrayList<CollateralType>();
        }
        return this.collateral;
    }

    /**
     * Gets the value of the creditStackingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditStackingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditStackingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditStackingInformationType }
     * 
     * 
     */
    public List<CreditStackingInformationType> getCreditStackingInformation() {
        if (creditStackingInformation == null) {
            creditStackingInformation = new ArrayList<CreditStackingInformationType>();
        }
        return this.creditStackingInformation;
    }

    /**
     * Gets the value of the policyAuditHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyAuditHistoryType }
     *     
     */
    public PolicyAuditHistoryType getPolicyAuditHistory() {
        return policyAuditHistory;
    }

    /**
     * Sets the value of the policyAuditHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyAuditHistoryType }
     *     
     */
    public void setPolicyAuditHistory(PolicyAuditHistoryType value) {
        this.policyAuditHistory = value;
    }

    /**
     * Gets the value of the iqbFormData property.
     * 
     * @return
     *     possible object is
     *     {@link IQBFormDataType }
     *     
     */
    public IQBFormDataType getIQBFormData() {
        return iqbFormData;
    }

    /**
     * Sets the value of the iqbFormData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IQBFormDataType }
     *     
     */
    public void setIQBFormData(IQBFormDataType value) {
        this.iqbFormData = value;
    }

    /**
     * Gets the value of the limitDeductibleSharing property.
     * 
     * @return
     *     possible object is
     *     {@link LimitDeductibleSharingType }
     *     
     */
    public LimitDeductibleSharingType getLimitDeductibleSharing() {
        return limitDeductibleSharing;
    }

    /**
     * Sets the value of the limitDeductibleSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitDeductibleSharingType }
     *     
     */
    public void setLimitDeductibleSharing(LimitDeductibleSharingType value) {
        this.limitDeductibleSharing = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType }
     * 
     * 
     */
    public List<PaymentType> getPayment() {
        if (payment == null) {
            payment = new ArrayList<PaymentType>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the specialHandling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingType }
     * 
     * 
     */
    public List<SpecialHandlingType> getSpecialHandling() {
        if (specialHandling == null) {
            specialHandling = new ArrayList<SpecialHandlingType>();
        }
        return this.specialHandling;
    }

    /**
     * Gets the value of the tail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TailType }
     * 
     * 
     */
    public List<TailType> getTail() {
        if (tail == null) {
            tail = new ArrayList<TailType>();
        }
        return this.tail;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionType }
     * 
     * 
     */
    public List<TransactionType> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<TransactionType>();
        }
        return this.transaction;
    }

    /**
     * Gets the value of the cancellationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationDetailType }
     *     
     */
    public CancellationDetailType getCancellationDetail() {
        return cancellationDetail;
    }

    /**
     * Sets the value of the cancellationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationDetailType }
     *     
     */
    public void setCancellationDetail(CancellationDetailType value) {
        this.cancellationDetail = value;
    }

    /**
     * Gets the value of the insured property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insured property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsured().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuredType }
     * 
     * 
     */
    public List<InsuredType> getInsured() {
        if (insured == null) {
            insured = new ArrayList<InsuredType>();
        }
        return this.insured;
    }

    /**
     * Gets the value of the coiHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coiHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOIHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COIHolderType }
     * 
     * 
     */
    public List<COIHolderType> getCOIHolder() {
        if (coiHolder == null) {
            coiHolder = new ArrayList<COIHolderType>();
        }
        return this.coiHolder;
    }

    /**
     * Gets the value of the fteRiskNamesInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fteRiskNamesInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFTERiskNamesInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTERiskNamesInformationType }
     * 
     * 
     */
    public List<FTERiskNamesInformationType> getFTERiskNamesInformation() {
        if (fteRiskNamesInformation == null) {
            fteRiskNamesInformation = new ArrayList<FTERiskNamesInformationType>();
        }
        return this.fteRiskNamesInformation;
    }

    /**
     * Gets the value of the nationalProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalProgramType }
     * 
     * 
     */
    public List<NationalProgramType> getNationalProgram() {
        if (nationalProgram == null) {
            nationalProgram = new ArrayList<NationalProgramType>();
        }
        return this.nationalProgram;
    }

    /**
     * Gets the value of the riskRelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskRelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskRelationType }
     * 
     * 
     */
    public List<RiskRelationType> getRiskRelation() {
        if (riskRelation == null) {
            riskRelation = new ArrayList<RiskRelationType>();
        }
        return this.riskRelation;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleType }
     * 
     * 
     */
    public List<ScheduleType> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<ScheduleType>();
        }
        return this.schedule;
    }

    /**
     * Gets the value of the fundSubmissionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundSubmissionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundSubmissionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundSubmissionInformationType }
     * 
     * 
     */
    public List<FundSubmissionInformationType> getFundSubmissionInformation() {
        if (fundSubmissionInformation == null) {
            fundSubmissionInformation = new ArrayList<FundSubmissionInformationType>();
        }
        return this.fundSubmissionInformation;
    }

    /**
     * Gets the value of the hoursPerWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hoursPerWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoursPerWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoursPerWeekType }
     * 
     * 
     */
    public List<HoursPerWeekType> getHoursPerWeek() {
        if (hoursPerWeek == null) {
            hoursPerWeek = new ArrayList<HoursPerWeekType>();
        }
        return this.hoursPerWeek;
    }

    /**
     * Gets the value of the selectedAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedAddressType }
     * 
     * 
     */
    public List<SelectedAddressType> getSelectedAddress() {
        if (selectedAddress == null) {
            selectedAddress = new ArrayList<SelectedAddressType>();
        }
        return this.selectedAddress;
    }

    /**
     * Gets the value of the medicalMalpracticeLineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalMalpracticeLineOfBusinessType }
     *     
     */
    public MedicalMalpracticeLineOfBusinessType getMedicalMalpracticeLineOfBusiness() {
        return medicalMalpracticeLineOfBusiness;
    }

    /**
     * Sets the value of the medicalMalpracticeLineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalMalpracticeLineOfBusinessType }
     *     
     */
    public void setMedicalMalpracticeLineOfBusiness(MedicalMalpracticeLineOfBusinessType value) {
        this.medicalMalpracticeLineOfBusiness = value;
    }

    /**
     * Gets the value of the manuscript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manuscript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManuscript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManuscriptType }
     * 
     * 
     */
    public List<ManuscriptType> getManuscript() {
        if (manuscript == null) {
            manuscript = new ArrayList<ManuscriptType>();
        }
        return this.manuscript;
    }

    /**
     * Gets the value of the varTextEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link VarTextEndorsementType }
     *     
     */
    public VarTextEndorsementType getVarTextEndorsement() {
        return varTextEndorsement;
    }

    /**
     * Sets the value of the varTextEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarTextEndorsementType }
     *     
     */
    public void setVarTextEndorsement(VarTextEndorsementType value) {
        this.varTextEndorsement = value;
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link EndorsementType }
     *     
     */
    public EndorsementType getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorsementType }
     *     
     */
    public void setEndorsement(EndorsementType value) {
        this.endorsement = value;
    }

    /**
     * Gets the value of the creditSurchargeDeductible property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditSurchargeDeductible property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditSurchargeDeductible().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditSurchargeDeductibleType }
     * 
     * 
     */
    public List<CreditSurchargeDeductibleType> getCreditSurchargeDeductible() {
        if (creditSurchargeDeductible == null) {
            creditSurchargeDeductible = new ArrayList<CreditSurchargeDeductibleType>();
        }
        return this.creditSurchargeDeductible;
    }

}
