
package com.springdata.entity.party;

import java.io.Serializable;

public class PartyClassificationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ClassificationNumberId;
    protected String ClassificationCode;
    protected String SubClassificationCode;
    protected String SubTypeCode;
    protected EffectivePeriodType EffectivePeriod;
    protected String Key;
    
	public String getClassificationNumberId() {
		return ClassificationNumberId;
	}
	public void setClassificationNumberId(String classificationNumberId) {
		ClassificationNumberId = classificationNumberId;
	}
	public String getClassificationCode() {
		return ClassificationCode;
	}
	public void setClassificationCode(String classificationCode) {
		ClassificationCode = classificationCode;
	}
	public String getSubClassificationCode() {
		return SubClassificationCode;
	}
	public void setSubClassificationCode(String subClassificationCode) {
		SubClassificationCode = subClassificationCode;
	}
	public String getSubTypeCode() {
		return SubTypeCode;
	}
	public void setSubTypeCode(String subTypeCode) {
		SubTypeCode = subTypeCode;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[ClassificationNumberId=" + ClassificationNumberId + ", ClassificationCode="
				+ ClassificationCode + ", SubClassificationCode=" + SubClassificationCode + ", SubTypeCode="
				+ SubTypeCode + ", EffectivePeriod=" + EffectivePeriod + ", Key=" + Key + "]";
	}
}
