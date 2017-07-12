
package com.springdata.entity.policy;

import java.io.Serializable;

public class PolicyDetailType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PolicyTypeCodeType policyTypeCode;
    protected String shortTermIndicator;
    protected PolicyStatusCodeType policyStatusCode;
    protected PolicyCycleCodeType policyCycleCode;
    protected String policyLayerCode;
    protected PriorPolicyType priorPolicy;
    protected String guaranteeDate;
    protected String declinationDate;
    protected IndicationType indication;
    protected IssueCompanyType issueCompany;
    protected String organizationType;
    protected String binderIndicator;
    protected String collateralIndicator;
    protected String programCode;
    protected String categoryCode;
    protected String hospitalTier;
    protected String claimsMadeYear;
    protected String peerGroupCode;
    protected String firstPotentialCancelDate;
    protected String secondPotentialCancelDate;
    protected String plAggregatCode;
    protected String glAggregateCode;
    protected String accountNumber;
    protected String accountIdentifier;
    protected String policyTermTypeCode;
    protected String inceptionDate;
    protected String requestedStartDate;
    protected String parentPolicyNumber;
    protected String processStatusCode;
    protected String questionaireDate;
    protected String termReasonCode;
    protected String termStatusCode;
    protected String quoteAccept;
    protected String additionalInsuredCount;
    protected String waitForPaymentIndicator;
    protected String leadQuoteIndicator;
    protected String onbaseKey;
    protected AdditionalInformationType additionalInformation;
    protected PolicyVersionDetailType policyVersionDetail;

    /**
     * Gets the value of the policyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyTypeCodeType }
     *     
     */
    public PolicyTypeCodeType getPolicyTypeCode() {
        return policyTypeCode;
    }

    /**
     *getOnbaseKey
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyTypeCodeType }
     *     
     */
    public void setPolicyTypeCode(PolicyTypeCodeType value) {
        this.policyTypeCode = value;
    }

    /**
     * Gets the value of the shortTermIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortTermIndicator() {
        return shortTermIndicator;
    }

    /**
     * Sets the value of the shortTermIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortTermIndicator(String value) {
        this.shortTermIndicator = value;
    }

    /**
     * Gets the value of the policyStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyStatusCodeType }
     *     
     */
    public PolicyStatusCodeType getPolicyStatusCode() {
        return policyStatusCode;
    }

    /**
     * Sets the value of the policyStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyStatusCodeType }
     *     
     */
    public void setPolicyStatusCode(PolicyStatusCodeType value) {
        this.policyStatusCode = value;
    }

    /**
     * Gets the value of the policyCycleCode property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyCycleCodeType }
     *     
     */
    public PolicyCycleCodeType getPolicyCycleCode() {
        return policyCycleCode;
    }

    /**
     * Sets the value of the policyCycleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyCycleCodeType }
     *     
     */
    public void setPolicyCycleCode(PolicyCycleCodeType value) {
        this.policyCycleCode = value;
    }

    /**
     * Gets the value of the policyLayerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyLayerCode() {
        return policyLayerCode;
    }

    /**
     * Sets the value of the policyLayerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyLayerCode(String value) {
        this.policyLayerCode = value;
    }

    /**
     * Gets the value of the priorPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PriorPolicyType }
     *     
     */
    public PriorPolicyType getPriorPolicy() {
        return priorPolicy;
    }

    /**
     * Sets the value of the priorPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorPolicyType }
     *     
     */
    public void setPriorPolicy(PriorPolicyType value) {
        this.priorPolicy = value;
    }

    /**
     * Gets the value of the guaranteeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeDate() {
        return guaranteeDate;
    }

    /**
     * Sets the value of the guaranteeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeDate(String value) {
        this.guaranteeDate = value;
    }

    /**
     * Gets the value of the declinationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclinationDate() {
        return declinationDate;
    }

    /**
     * Sets the value of the declinationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclinationDate(String value) {
        this.declinationDate = value;
    }

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link IndicationType }
     *     
     */
    public IndicationType getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationType }
     *     
     */
    public void setIndication(IndicationType value) {
        this.indication = value;
    }

    /**
     * Gets the value of the issueCompany property.
     * 
     * @return
     *     possible object is
     *     {@link IssueCompanyType }
     *     
     */
    public IssueCompanyType getIssueCompany() {
        return issueCompany;
    }

    /**
     * Sets the value of the issueCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueCompanyType }
     *     
     */
    public void setIssueCompany(IssueCompanyType value) {
        this.issueCompany = value;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }

    /**
     * Gets the value of the binderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderIndicator() {
        return binderIndicator;
    }

    /**
     * Sets the value of the binderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderIndicator(String value) {
        this.binderIndicator = value;
    }

    /**
     * Gets the value of the collateralIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralIndicator() {
        return collateralIndicator;
    }

    /**
     * Sets the value of the collateralIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralIndicator(String value) {
        this.collateralIndicator = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the hospitalTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalTier() {
        return hospitalTier;
    }

    /**
     * Sets the value of the hospitalTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalTier(String value) {
        this.hospitalTier = value;
    }

    /**
     * Gets the value of the claimsMadeYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimsMadeYear() {
        return claimsMadeYear;
    }

    /**
     * Sets the value of the claimsMadeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimsMadeYear(String value) {
        this.claimsMadeYear = value;
    }

    /**
     * Gets the value of the peerGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerGroupCode() {
        return peerGroupCode;
    }

    /**
     * Sets the value of the peerGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerGroupCode(String value) {
        this.peerGroupCode = value;
    }

    /**
     * Gets the value of the firstPotentialCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPotentialCancelDate() {
        return firstPotentialCancelDate;
    }

    /**
     * Sets the value of the firstPotentialCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPotentialCancelDate(String value) {
        this.firstPotentialCancelDate = value;
    }

    /**
     * Gets the value of the secondPotentialCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPotentialCancelDate() {
        return secondPotentialCancelDate;
    }

    /**
     * Sets the value of the secondPotentialCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPotentialCancelDate(String value) {
        this.secondPotentialCancelDate = value;
    }

    /**
     * Gets the value of the plAggregatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlAggregatCode() {
        return plAggregatCode;
    }

    /**
     * Sets the value of the plAggregatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlAggregatCode(String value) {
        this.plAggregatCode = value;
    }

    /**
     * Gets the value of the glAggregateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlAggregateCode() {
        return glAggregateCode;
    }

    /**
     * Sets the value of the glAggregateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlAggregateCode(String value) {
        this.glAggregateCode = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Sets the value of the accountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIdentifier(String value) {
        this.accountIdentifier = value;
    }

    /**
     * Gets the value of the policyTermTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTermTypeCode() {
        return policyTermTypeCode;
    }

    /**
     * Sets the value of the policyTermTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTermTypeCode(String value) {
        this.policyTermTypeCode = value;
    }

    /**
     * Gets the value of the inceptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInceptionDate() {
        return inceptionDate;
    }

    /**
     * Sets the value of the inceptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInceptionDate(String value) {
        this.inceptionDate = value;
    }

    /**
     * Gets the value of the requestedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedStartDate() {
        return requestedStartDate;
    }

    /**
     * Sets the value of the requestedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedStartDate(String value) {
        this.requestedStartDate = value;
    }

    /**
     * Gets the value of the parentPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPolicyNumber() {
        return parentPolicyNumber;
    }

    /**
     * Sets the value of the parentPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPolicyNumber(String value) {
        this.parentPolicyNumber = value;
    }

    /**
     * Gets the value of the processStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessStatusCode() {
        return processStatusCode;
    }

    /**
     * Sets the value of the processStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessStatusCode(String value) {
        this.processStatusCode = value;
    }

    /**
     * Gets the value of the questionaireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionaireDate() {
        return questionaireDate;
    }

    /**
     * Sets the value of the questionaireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionaireDate(String value) {
        this.questionaireDate = value;
    }

    /**
     * Gets the value of the termReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermReasonCode() {
        return termReasonCode;
    }

    /**
     * Sets the value of the termReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermReasonCode(String value) {
        this.termReasonCode = value;
    }

    /**
     * Gets the value of the termStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermStatusCode() {
        return termStatusCode;
    }

    /**
     * Sets the value of the termStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermStatusCode(String value) {
        this.termStatusCode = value;
    }

    /**
     * Gets the value of the quoteAccept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteAccept() {
        return quoteAccept;
    }

    /**
     * Sets the value of the quoteAccept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteAccept(String value) {
        this.quoteAccept = value;
    }

    /**
     * Gets the value of the additionalInsuredCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInsuredCount() {
        return additionalInsuredCount;
    }

    /**
     * Sets the value of the additionalInsuredCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInsuredCount(String value) {
        this.additionalInsuredCount = value;
    }

    /**
     * Gets the value of the waitForPaymentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitForPaymentIndicator() {
        return waitForPaymentIndicator;
    }

    /**
     * Sets the value of the waitForPaymentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitForPaymentIndicator(String value) {
        this.waitForPaymentIndicator = value;
    }

    /**
     * Gets the value of the leadQuoteIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadQuoteIndicator() {
        return leadQuoteIndicator;
    }

    /**
     * Sets the value of the leadQuoteIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadQuoteIndicator(String value) {
        this.leadQuoteIndicator = value;
    }

    /**
     * Gets the value of the onbaseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnbaseKey() {
        return onbaseKey;
    }

    /**
     * Sets the value of the onbaseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnbaseKey(String value) {
        this.onbaseKey = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformationType }
     *     
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformationType }
     *     
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the policyVersionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyVersionDetailType }
     *     
     */
    public PolicyVersionDetailType getPolicyVersionDetail() {
        return policyVersionDetail;
    }

    /**
     * Sets the value of the policyVersionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyVersionDetailType }
     *     
     */
    public void setPolicyVersionDetail(PolicyVersionDetailType value) {
        this.policyVersionDetail = value;
    }

}
