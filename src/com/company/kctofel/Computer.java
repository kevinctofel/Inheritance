package com.company.kctofel;

/**
 * Computer class for Inheritance
 * Kevin C. Tofel
 * March 5, 2019
 */

public class Computer {

    protected String ModelName;
    protected String CPU;
    protected int MemoryAmount;
    protected double StorageAmount;
    protected String OperatingSystem;
    protected int PowerSupplyWatts;
    protected double WiFiSpeed;

    /**
     * Constructor for Computer objects that will also extend to children of Computers
     *
     * @param modelName             Device model name
     * @param CPU                   Processor
     * @param memoryAmount          RAM
     * @param storageAmount         Local storage
     * @param operatingSystem       OS
     * @param powerSupplyWatts      PSU capacity
     * @param wifiSpeed             Max wireless speed on WiFi
     */
    protected Computer(String modelName, String CPU, int memoryAmount, double storageAmount, String operatingSystem, int powerSupplyWatts, double wifiSpeed) {
        ModelName = modelName;
        this.CPU = CPU;
        MemoryAmount = memoryAmount;
        StorageAmount = storageAmount;
        OperatingSystem = operatingSystem;
        PowerSupplyWatts = powerSupplyWatts;
        WiFiSpeed = wifiSpeed;
    }


    /**
     * Get the model name of the Computer object
     * @return name of Computer
     */
    public String getModelName() {
        return ModelName;
    }

    /**
     * Get the CPU of the Computer object
     * @return name of CPU
     */
    public String getCPU() {
        return CPU;
    }

    /**
     * Get amount of RAM
     * @return RAM
     */
    public double getMemoryAmount() {
        return MemoryAmount;
    }

    /**
     * Get local storage amount
     * @return storage capcity
     */
    public double getStorageAmount() {
        return StorageAmount;
    }

    /**
     * Get operating system
     * @return OS
     */
    public String getOperatingSystem() {
        return OperatingSystem;
    }

    /**
     * Get power supply wattage
     * @return PSU watts
     */
    public int getPowerSupplyWatts() {
        return PowerSupplyWatts;
    }

    /**
     * Get maximum WiFi speeds
     * @return max WiFi
     */
    public double getWiFiSpeed() {
        return WiFiSpeed;
    }

    /**
     * Set name of computer
     * @param model
     */
    public void setModelName(String model) {
        this.ModelName = model;
    }

    /**
     * Set the CPU name
     * @param chipset
     */
    public void setCPU(String chipset) {
        this.CPU = chipset;
    }

    /**
     * Set amount of RAM
     * @param ram
     */
    public void setMemoryAmount(int ram) {
        this.MemoryAmount = ram;
    }

    /**
     * Set local storage capacity
     * @param hardDrive
     */
    public void setStorageAmount(double hardDrive) {
        this.StorageAmount = hardDrive;
    }

    /**
     * Set operating system
     * @param platform
     */
    public void setOperatingSystem(String platform) {
        this.OperatingSystem = platform;
    }

    /**
     * Set PSU wattage
     * @param psu
     */
    public void setPowerSupplyWatts(int psu) {
        this.PowerSupplyWatts = psu;
    }

    /**
     * Set maximum WiFi speed
     * @param wirelessSpeed
     */
    public void setWiFiSpeed(double wirelessSpeed) {
        this.WiFiSpeed = WiFiSpeed;
    }

    /**
     * Print string for all fields in Computer object
     * @return
     */
    @Override
    public String  toString() {
        return "Computer{" +
                "ModelName='" + ModelName + '\'' +
                ", CPU='" + CPU + '\'' +
                ", MemoryAmount=" + MemoryAmount +
                ", StorageAmount=" + StorageAmount +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", PowerSupplyWatts=" + PowerSupplyWatts +
                ", WiFiSpeed=" + WiFiSpeed +
                '}';
    }
}
