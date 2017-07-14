
package com.springdata.entity.policy;

import java.io.Serializable;

public class VehiclesOperatedInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String FleetIndicator;
    protected String VehicleManufacturerCode;
    protected String VehicleManufacturerSubclassCode;
    protected String VehicleModelCode;
    protected String VehicleYear;
    protected String VehicleOriginalCost;
    protected String VehicleVin;
	public String getFleetIndicator() {
		return FleetIndicator;
	}
	public void setFleetIndicator(String fleetIndicator) {
		FleetIndicator = fleetIndicator;
	}
	public String getVehicleManufacturerCode() {
		return VehicleManufacturerCode;
	}
	public void setVehicleManufacturerCode(String vehicleManufacturerCode) {
		VehicleManufacturerCode = vehicleManufacturerCode;
	}
	public String getVehicleManufacturerSubclassCode() {
		return VehicleManufacturerSubclassCode;
	}
	public void setVehicleManufacturerSubclassCode(String vehicleManufacturerSubclassCode) {
		VehicleManufacturerSubclassCode = vehicleManufacturerSubclassCode;
	}
	public String getVehicleModelCode() {
		return VehicleModelCode;
	}
	public void setVehicleModelCode(String vehicleModelCode) {
		VehicleModelCode = vehicleModelCode;
	}
	public String getVehicleYear() {
		return VehicleYear;
	}
	public void setVehicleYear(String vehicleYear) {
		VehicleYear = vehicleYear;
	}
	public String getVehicleOriginalCost() {
		return VehicleOriginalCost;
	}
	public void setVehicleOriginalCost(String vehicleOriginalCost) {
		VehicleOriginalCost = vehicleOriginalCost;
	}
	public String getVehicleVin() {
		return VehicleVin;
	}
	public void setVehicleVin(String vehicleVin) {
		VehicleVin = vehicleVin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "[FleetIndicator=" + FleetIndicator + ", VehicleManufacturerCode="
				+ VehicleManufacturerCode + ", VehicleManufacturerSubclassCode=" + VehicleManufacturerSubclassCode
				+ ", VehicleModelCode=" + VehicleModelCode + ", VehicleYear=" + VehicleYear + ", VehicleOriginalCost="
				+ VehicleOriginalCost + ", VehicleVin=" + VehicleVin + "]";
	}
}
