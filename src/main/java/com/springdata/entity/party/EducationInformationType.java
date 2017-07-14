
package com.springdata.entity.party;

import java.io.Serializable;

public class EducationInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String EducationInformationNumberId;
    protected String EducationTypeCode;
    protected String EducationDegree;
    protected String GraduationYear;
    protected EducationalInstitutionType EducationalInstitution;
    protected String EntityAttendeeId;
    protected String EntityInstitutionId;
    protected String ApplicationNo;
    protected String SourceRecordId;
    protected String SourceTable;
    protected String DateOfBirth;
    protected EffectivePeriodType EffectivePeriod;
    protected String Key;
	public String getEducationInformationNumberId() {
		return EducationInformationNumberId;
	}
	public void setEducationInformationNumberId(String educationInformationNumberId) {
		EducationInformationNumberId = educationInformationNumberId;
	}
	public String getEducationTypeCode() {
		return EducationTypeCode;
	}
	public void setEducationTypeCode(String educationTypeCode) {
		EducationTypeCode = educationTypeCode;
	}
	public String getEducationDegree() {
		return EducationDegree;
	}
	public void setEducationDegree(String educationDegree) {
		EducationDegree = educationDegree;
	}
	public String getGraduationYear() {
		return GraduationYear;
	}
	public void setGraduationYear(String graduationYear) {
		GraduationYear = graduationYear;
	}
	public EducationalInstitutionType getEducationalInstitution() {
		return EducationalInstitution;
	}
	public void setEducationalInstitution(EducationalInstitutionType educationalInstitution) {
		EducationalInstitution = educationalInstitution;
	}
	public String getEntityAttendeeId() {
		return EntityAttendeeId;
	}
	public void setEntityAttendeeId(String entityAttendeeId) {
		EntityAttendeeId = entityAttendeeId;
	}
	public String getEntityInstitutionId() {
		return EntityInstitutionId;
	}
	public void setEntityInstitutionId(String entityInstitutionId) {
		EntityInstitutionId = entityInstitutionId;
	}
	public String getApplicationNo() {
		return ApplicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		ApplicationNo = applicationNo;
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
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
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
		return "[EducationInformationNumberId=" + EducationInformationNumberId
				+ ", EducationTypeCode=" + EducationTypeCode + ", EducationDegree=" + EducationDegree
				+ ", GraduationYear=" + GraduationYear + ", EducationalInstitution=" + EducationalInstitution
				+ ", EntityAttendeeId=" + EntityAttendeeId + ", EntityInstitutionId=" + EntityInstitutionId
				+ ", ApplicationNo=" + ApplicationNo + ", SourceRecordId=" + SourceRecordId + ", SourceTable="
				+ SourceTable + ", DateOfBirth=" + DateOfBirth + ", EffectivePeriod=" + EffectivePeriod + ", Key=" + Key
				+ "]";
	}
}
