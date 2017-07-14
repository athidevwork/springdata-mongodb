
package com.springdata.entity.policy;

import java.io.Serializable;

public class SpecialHandlingType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String SpecialHandlingNumberId;
    protected String Category;
    protected String SubCategory;
    protected EffectivePeriodType EffectivePeriod;
    protected String RenewalIndicator;
    protected String ChangeDate;
    protected String AltRiskSubCategory;
	public String getSpecialHandlingNumberId() {
		return SpecialHandlingNumberId;
	}
	public void setSpecialHandlingNumberId(String specialHandlingNumberId) {
		SpecialHandlingNumberId = specialHandlingNumberId;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getSubCategory() {
		return SubCategory;
	}
	public void setSubCategory(String subCategory) {
		SubCategory = subCategory;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getRenewalIndicator() {
		return RenewalIndicator;
	}
	public void setRenewalIndicator(String renewalIndicator) {
		RenewalIndicator = renewalIndicator;
	}
	public String getChangeDate() {
		return ChangeDate;
	}
	public void setChangeDate(String changeDate) {
		ChangeDate = changeDate;
	}
	public String getAltRiskSubCategory() {
		return AltRiskSubCategory;
	}
	public void setAltRiskSubCategory(String altRiskSubCategory) {
		AltRiskSubCategory = altRiskSubCategory;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[SpecialHandlingNumberId=" + SpecialHandlingNumberId + ", Category=" + Category
				+ ", SubCategory=" + SubCategory + ", EffectivePeriod=" + EffectivePeriod + ", RenewalIndicator="
				+ RenewalIndicator + ", ChangeDate=" + ChangeDate + ", AltRiskSubCategory=" + AltRiskSubCategory + "]";
	}
}
