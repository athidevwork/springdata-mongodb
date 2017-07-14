
package com.springdata.entity.policy;

import java.io.Serializable;

public class BuildingInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String BuildingClassCode;
    protected String BuildingValue;
    protected String BuildingTypeCode;
    protected String BuildingUseTypeCode;
    protected String FrameTypeCode;
    protected String ProtectionClassCode;
    protected String SprinklerIndicator;
    protected String ConstructionTypeCode;
    protected String RoofTypeCode;
    protected String FloorTypeCode;
    protected String ProtectionTypeCode;
    protected String FireServiceTypeCode;
    protected String HydrantTypeCode;
    protected String SecurityTypeCode;
    protected String LocationCode;
    protected String LocationDescription;
    protected String AddressReference;
    
	public String getBuildingClassCode() {
		return BuildingClassCode;
	}
	public void setBuildingClassCode(String buildingClassCode) {
		BuildingClassCode = buildingClassCode;
	}
	public String getBuildingValue() {
		return BuildingValue;
	}
	public void setBuildingValue(String buildingValue) {
		BuildingValue = buildingValue;
	}
	public String getBuildingTypeCode() {
		return BuildingTypeCode;
	}
	public void setBuildingTypeCode(String buildingTypeCode) {
		BuildingTypeCode = buildingTypeCode;
	}
	public String getBuildingUseTypeCode() {
		return BuildingUseTypeCode;
	}
	public void setBuildingUseTypeCode(String buildingUseTypeCode) {
		BuildingUseTypeCode = buildingUseTypeCode;
	}
	public String getFrameTypeCode() {
		return FrameTypeCode;
	}
	public void setFrameTypeCode(String frameTypeCode) {
		FrameTypeCode = frameTypeCode;
	}
	public String getProtectionClassCode() {
		return ProtectionClassCode;
	}
	public void setProtectionClassCode(String protectionClassCode) {
		ProtectionClassCode = protectionClassCode;
	}
	public String getSprinklerIndicator() {
		return SprinklerIndicator;
	}
	public void setSprinklerIndicator(String sprinklerIndicator) {
		SprinklerIndicator = sprinklerIndicator;
	}
	public String getConstructionTypeCode() {
		return ConstructionTypeCode;
	}
	public void setConstructionTypeCode(String constructionTypeCode) {
		ConstructionTypeCode = constructionTypeCode;
	}
	public String getRoofTypeCode() {
		return RoofTypeCode;
	}
	public void setRoofTypeCode(String roofTypeCode) {
		RoofTypeCode = roofTypeCode;
	}
	public String getFloorTypeCode() {
		return FloorTypeCode;
	}
	public void setFloorTypeCode(String floorTypeCode) {
		FloorTypeCode = floorTypeCode;
	}
	public String getProtectionTypeCode() {
		return ProtectionTypeCode;
	}
	public void setProtectionTypeCode(String protectionTypeCode) {
		ProtectionTypeCode = protectionTypeCode;
	}
	public String getFireServiceTypeCode() {
		return FireServiceTypeCode;
	}
	public void setFireServiceTypeCode(String fireServiceTypeCode) {
		FireServiceTypeCode = fireServiceTypeCode;
	}
	public String getHydrantTypeCode() {
		return HydrantTypeCode;
	}
	public void setHydrantTypeCode(String hydrantTypeCode) {
		HydrantTypeCode = hydrantTypeCode;
	}
	public String getSecurityTypeCode() {
		return SecurityTypeCode;
	}
	public void setSecurityTypeCode(String securityTypeCode) {
		SecurityTypeCode = securityTypeCode;
	}
	public String getLocationCode() {
		return LocationCode;
	}
	public void setLocationCode(String locationCode) {
		LocationCode = locationCode;
	}
	public String getLocationDescription() {
		return LocationDescription;
	}
	public void setLocationDescription(String locationDescription) {
		LocationDescription = locationDescription;
	}
	public String getAddressReference() {
		return AddressReference;
	}
	public void setAddressReference(String addressReference) {
		AddressReference = addressReference;
	}
	@Override
	public String toString() {
		return "[BuildingClassCode=" + BuildingClassCode + ", BuildingValue=" + BuildingValue
				+ ", BuildingTypeCode=" + BuildingTypeCode + ", BuildingUseTypeCode=" + BuildingUseTypeCode
				+ ", FrameTypeCode=" + FrameTypeCode + ", ProtectionClassCode=" + ProtectionClassCode
				+ ", SprinklerIndicator=" + SprinklerIndicator + ", ConstructionTypeCode=" + ConstructionTypeCode
				+ ", RoofTypeCode=" + RoofTypeCode + ", FloorTypeCode=" + FloorTypeCode + ", ProtectionTypeCode="
				+ ProtectionTypeCode + ", FireServiceTypeCode=" + FireServiceTypeCode + ", HydrantTypeCode="
				+ HydrantTypeCode + ", SecurityTypeCode=" + SecurityTypeCode + ", LocationCode=" + LocationCode
				+ ", LocationDescription=" + LocationDescription + ", AddressReference=" + AddressReference + "]";
	}
}
