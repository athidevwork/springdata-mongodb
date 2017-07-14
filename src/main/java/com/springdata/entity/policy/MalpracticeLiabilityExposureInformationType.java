
package com.springdata.entity.policy;

import java.io.Serializable;

public class MalpracticeLiabilityExposureInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String ExposureUnit;
    protected String ExposureBasisCode;
    protected String DoctorCount;
    protected String SquareFootage;
    protected String VapCount;
    protected String BedCount;
    protected String ExtendedBedCount;
    protected String SkillBedCount;
    protected String CensusCount;
    protected String OutpatientVisitCount;
    protected String DeliveryCount;
    protected String ImpatientSurgeryCount;
    protected String OutpatientSurgeryCount;
    protected String EmergencyRoomVisitCount;
	public String getExposureUnit() {
		return ExposureUnit;
	}
	public void setExposureUnit(String exposureUnit) {
		ExposureUnit = exposureUnit;
	}
	public String getExposureBasisCode() {
		return ExposureBasisCode;
	}
	public void setExposureBasisCode(String exposureBasisCode) {
		ExposureBasisCode = exposureBasisCode;
	}
	public String getDoctorCount() {
		return DoctorCount;
	}
	public void setDoctorCount(String doctorCount) {
		DoctorCount = doctorCount;
	}
	public String getSquareFootage() {
		return SquareFootage;
	}
	public void setSquareFootage(String squareFootage) {
		SquareFootage = squareFootage;
	}
	public String getVapCount() {
		return VapCount;
	}
	public void setVapCount(String vapCount) {
		VapCount = vapCount;
	}
	public String getBedCount() {
		return BedCount;
	}
	public void setBedCount(String bedCount) {
		BedCount = bedCount;
	}
	public String getExtendedBedCount() {
		return ExtendedBedCount;
	}
	public void setExtendedBedCount(String extendedBedCount) {
		ExtendedBedCount = extendedBedCount;
	}
	public String getSkillBedCount() {
		return SkillBedCount;
	}
	public void setSkillBedCount(String skillBedCount) {
		SkillBedCount = skillBedCount;
	}
	public String getCensusCount() {
		return CensusCount;
	}
	public void setCensusCount(String censusCount) {
		CensusCount = censusCount;
	}
	public String getOutpatientVisitCount() {
		return OutpatientVisitCount;
	}
	public void setOutpatientVisitCount(String outpatientVisitCount) {
		OutpatientVisitCount = outpatientVisitCount;
	}
	public String getDeliveryCount() {
		return DeliveryCount;
	}
	public void setDeliveryCount(String deliveryCount) {
		DeliveryCount = deliveryCount;
	}
	public String getImpatientSurgeryCount() {
		return ImpatientSurgeryCount;
	}
	public void setImpatientSurgeryCount(String impatientSurgeryCount) {
		ImpatientSurgeryCount = impatientSurgeryCount;
	}
	public String getOutpatientSurgeryCount() {
		return OutpatientSurgeryCount;
	}
	public void setOutpatientSurgeryCount(String outpatientSurgeryCount) {
		OutpatientSurgeryCount = outpatientSurgeryCount;
	}
	public String getEmergencyRoomVisitCount() {
		return EmergencyRoomVisitCount;
	}
	public void setEmergencyRoomVisitCount(String emergencyRoomVisitCount) {
		EmergencyRoomVisitCount = emergencyRoomVisitCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[ExposureUnit=" + ExposureUnit + ", ExposureBasisCode="
				+ ExposureBasisCode + ", DoctorCount=" + DoctorCount + ", SquareFootage=" + SquareFootage
				+ ", VapCount=" + VapCount + ", BedCount=" + BedCount + ", ExtendedBedCount=" + ExtendedBedCount
				+ ", SkillBedCount=" + SkillBedCount + ", CensusCount=" + CensusCount + ", OutpatientVisitCount="
				+ OutpatientVisitCount + ", DeliveryCount=" + DeliveryCount + ", ImpatientSurgeryCount="
				+ ImpatientSurgeryCount + ", OutpatientSurgeryCount=" + OutpatientSurgeryCount
				+ ", EmergencyRoomVisitCount=" + EmergencyRoomVisitCount + "]";
	}
}
