
package com.springdata.entity.party;

import java.io.Serializable;

public class TrainingType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String EducationProfileNumberId;
    protected String HospitalName;
    protected CodeWithDesc TrainingTypeCode;
    protected CodeWithDesc SpecialtyCode;
    protected EffectivePeriodType EffectivePeriod;
    protected String ApplicationNo;
    protected String EntityAttendeeId;
    protected String SourceRecordId;
    protected String SourceTable;
    protected String EntityInstitutionId;
    protected String Key;
    
	public String getEducationProfileNumberId() {
		return EducationProfileNumberId;
	}
	public void setEducationProfileNumberId(String educationProfileNumberId) {
		EducationProfileNumberId = educationProfileNumberId;
	}
	public String getHospitalName() {
		return HospitalName;
	}
	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}
	public CodeWithDesc getTrainingTypeCode() {
		return TrainingTypeCode;
	}
	public void setTrainingTypeCode(CodeWithDesc trainingTypeCode) {
		TrainingTypeCode = trainingTypeCode;
	}
	public CodeWithDesc getSpecialtyCode() {
		return SpecialtyCode;
	}
	public void setSpecialtyCode(CodeWithDesc specialtyCode) {
		SpecialtyCode = specialtyCode;
	}
	public EffectivePeriodType getEffectivePeriod() {
		return EffectivePeriod;
	}
	public void setEffectivePeriod(EffectivePeriodType effectivePeriod) {
		EffectivePeriod = effectivePeriod;
	}
	public String getApplicationNo() {
		return ApplicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		ApplicationNo = applicationNo;
	}
	public String getEntityAttendeeId() {
		return EntityAttendeeId;
	}
	public void setEntityAttendeeId(String entityAttendeeId) {
		EntityAttendeeId = entityAttendeeId;
	}
	public String getSourceRecordId() {
		return SourceRecordId;
	}
	public void setSourceRecordId(String sourceRecordId) {
		SourceRecordId = sourceRecordId;
	}
	public String getSourceTable() {
		return SourceTable;
	}
	public void setSourceTable(String sourceTable) {
		SourceTable = sourceTable;
	}
	public String getEntityInstitutionId() {
		return EntityInstitutionId;
	}
	public void setEntityInstitutionId(String entityInstitutionId) {
		EntityInstitutionId = entityInstitutionId;
	}
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	@Override
	public String toString() {
		return "[EducationProfileNumberId=" + EducationProfileNumberId + ", HospitalName=" + HospitalName
				+ ", TrainingTypeCode=" + TrainingTypeCode + ", SpecialtyCode=" + SpecialtyCode + ", EffectivePeriod="
				+ EffectivePeriod + ", ApplicationNo=" + ApplicationNo + ", EntityAttendeeId=" + EntityAttendeeId
				+ ", SourceRecordId=" + SourceRecordId + ", SourceTable=" + SourceTable + ", EntityInstitutionId="
				+ EntityInstitutionId + ", Key=" + Key + "]";
	}
}