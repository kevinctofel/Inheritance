package com.company.kctofel;

/**
 * Smartphone class for Inheritance from Computer class
 * Kevin C. Tofel
 * March 5, 2019
 */

public class Smartphone extends Computer {

    private double ModemSpeed;
    private double TouchDisplaySize;
    private double BatteryCapacity;
    private boolean HasWirelessCharging;

    /**
     * Constructor for Smartphone object, which is extended from a Computer object
     * @param modelName             Device model name
     * @param CPU                   Processor
     * @param memoryAmount          RAM
     * @param storageAmount         Local storage
     * @param operatingSystem       OS
     * @param powerSupplyWatts      PSU capacity
     * @param wifiSpeed             Max wireless speed on WiFi
     * @param modemSpeed            Max LTE speed
     * @param touchDisplaySize      Size of touchscreen
     * @param batteryCapacity       Watt hours of battery
     * @param hasWirelessCharging   Wireless charging capabilities
     */
    public Smartphone(String modelName, String CPU, int memoryAmount, double storageAmount, String operatingSystem, int powerSupplyWatts, double wifiSpeed, double modemSpeed, double touchDisplaySize, double batteryCapacity, boolean hasWirelessCharging) {
        super(modelName,CPU,memoryAmount,storageAmount, operatingSystem, powerSupplyWatts, wifiSpeed);
        ModemSpeed = modemSpeed;
        TouchDisplaySize = touchDisplaySize;
        BatteryCapacity = batteryCapacity;
        HasWirelessCharging = hasWirelessCharging;
    }

    /**
     * Get LTE modem speed
     * @return max LTE capabiilties
     */
    private double getModemSpeed() {
        return ModemSpeed;
    }

    /**
     * Get screen size
     * @return screen size
     */
    private double getTouchDisplaySize() {
        return TouchDisplaySize;
    }

    /**
     * Get battery capacity in mAh
     * @return battery capacity
     */
    private double getBatteryCapacity() {
        return BatteryCapacity;
    }

    /**
     * Check for wireless charging capabilities
     * @return if can be charged wirelessly or not
     */
    private boolean getHasWirelessCharging() {
        return HasWirelessCharging;
    }

    /**
     * Set max LTE speed
     * @param ModemSpeed
     */
    private void setModemSpeed(double ModemSpeed) {
        this.ModemSpeed = ModemSpeed;
    }

    /**
     * Set display size
     * @param TouchDisplaySize
     */
    private void setTouchDisplaySize(double TouchDisplaySize) {
        this.TouchDisplaySize = TouchDisplaySize;
    }

    /**
     * set battery capacity
     * @param BatteryCapacity
     */
    private void setBatteryCapacity(double BatteryCapacity) {
        this.BatteryCapacity = BatteryCapacity;
    }

    /**
     * Set flag for wireless charging or not
     * @param HasWirelessCharging
     */
    private void setHasWirelessCharging(boolean HasWirelessCharging) {
        this.HasWirelessCharging = HasWirelessCharging;
    }

    /**
     * Print string for all fields in a Smartphone object
     * @return
     */
    @Override
    public String toString() {
        return "Smartphone{" +
                "ModelName='" + ModelName + '\'' +
                ", CPU='" + CPU + '\'' +
                ", MemoryAmount=" + MemoryAmount +
                ", StorageAmount=" + StorageAmount +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", PowerSupplyWatts=" + PowerSupplyWatts +
                ", WiFiSpeed=" + WiFiSpeed +
                ", ModemSpeed=" + ModemSpeed +
                ", TouchDisplaySize=" + TouchDisplaySize +
                ", BatteryCapacity=" + BatteryCapacity +
                ", HasWirelessCharging=" + HasWirelessCharging +
                '}';
    }
}
