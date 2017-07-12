
package com.springdata.entity.policy;

import java.io.Serializable;

public class VehiclesOperatedInformationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String fleetIndicator;
    protected String vehicleManufacturerCode;
    protected String vehicleManufacturerSubclassCode;
    protected String vehicleModelCode;
    protected String vehicleYear;
    protected String vehicleOriginalCost;
    protected String vehicleVin;

    /**
     * Gets the value of the fleetIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetIndicator() {
        return fleetIndicator;
    }

    /**
     * Sets the value of the fleetIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleetIndicator(String value) {
        this.fleetIndicator = value;
    }

    /**
     * Gets the value of the vehicleManufacturerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleManufacturerCode() {
        return vehicleManufacturerCode;
    }

    /**
     * Sets the value of the vehicleManufacturerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleManufacturerCode(String value) {
        this.vehicleManufacturerCode = value;
    }

    /**
     * Gets the value of the vehicleManufacturerSubclassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleManufacturerSubclassCode() {
        return vehicleManufacturerSubclassCode;
    }

    /**
     * Sets the value of the vehicleManufacturerSubclassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleManufacturerSubclassCode(String value) {
        this.vehicleManufacturerSubclassCode = value;
    }

    /**
     * Gets the value of the vehicleModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModelCode() {
        return vehicleModelCode;
    }

    /**
     * Sets the value of the vehicleModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModelCode(String value) {
        this.vehicleModelCode = value;
    }

    /**
     * Gets the value of the vehicleYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleYear() {
        return vehicleYear;
    }

    /**
     * Sets the value of the vehicleYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleYear(String value) {
        this.vehicleYear = value;
    }

    /**
     * Gets the value of the vehicleOriginalCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleOriginalCost() {
        return vehicleOriginalCost;
    }

    /**
     * Sets the value of the vehicleOriginalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleOriginalCost(String value) {
        this.vehicleOriginalCost = value;
    }

    /**
     * Gets the value of the vehicleVin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleVin() {
        return vehicleVin;
    }

    /**
     * Sets the value of the vehicleVin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleVin(String value) {
        this.vehicleVin = value;
    }

}
