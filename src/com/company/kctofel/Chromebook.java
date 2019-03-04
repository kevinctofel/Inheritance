package com.company.kctofel;

/**
 * Chromebook class for Inheritance from Computer class
 * Kevin C. Tofel
 * February 28, 2019
 */

public class Chromebook extends Computer {

    /**
     *
     */
    private double DisplaySize;
    private boolean IsTouchScreen;
    private double BatteryCapacity;
    private boolean HasKeyboard;
    private boolean HasMemoryCardSlot;

    /**
     * @param modelName             Device model name
     * @param CPU                   Processor
     * @param memoryAmount          RAM
     * @param storageAmount         Local storage
     * @param operatingSystem       OS
     * @param powerSupplyWatts      PSU capacity
     * @param wiFiSpeed             Max wireless speed on WiFi
     * @param displaySize           Screen size
     * @param isTouchScreen         Has touch screen or not
     * @param batteryCapacity       Battery capacity in watt hours
     * @param hasKeyboard           Has a keyboard or not (tablet)
     * @param hasMemoryCardSlot     Has a memory card slot for expansion
     */
    public Chromebook(String modelName, String CPU, int memoryAmount, double storageAmount, String operatingSystem, int powerSupplyWatts, double wiFiSpeed, int displaySize, boolean isTouchScreen, double batteryCapacity, boolean hasKeyboard, boolean hasMemoryCardSlot) {
        super(modelName, CPU, memoryAmount, storageAmount, operatingSystem, powerSupplyWatts, wiFiSpeed);
        DisplaySize = displaySize;
        IsTouchScreen = isTouchScreen;
        BatteryCapacity = batteryCapacity;
        HasKeyboard = hasKeyboard;
        HasMemoryCardSlot = hasMemoryCardSlot;
    }




    /**
     * Gets the display size
     * @return display size in inches
     */
    public double getDisplaySize() {
        return DisplaySize;
    }

    /**
     * Gets touch screen capabilities
     * @return touch screen or not
     */
    public boolean getIsTouchScreen() {
        return IsTouchScreen;
    }

    /**
     * Gets battery capacity in watt hours
     * @return battery capacity
     */
    public double getBatteryCapacity() {
        return BatteryCapacity;
    }

    /**
     * Gets flag for if keyboard or not
     * @return keyboard or not (tablet)
     */
    public boolean getHasKeyboard() {
        return HasKeyboard;
    }

    /**
     * Gets flag for if memory can be expanded or not
     * @return has memory card slot or not
     */
    public boolean getHasMemoryCardSlot() {
        return HasMemoryCardSlot;
    }

    /**
     * Sets display size in inches
     * @param DisplaySize
     */
    public void setDisplaySize(double DisplaySize) {
        this.DisplaySize = DisplaySize;
    }

    /**
     * Sets if has a touchscreen or not
     * @param IsTouchScreen
     */
    public void setIsTouchScreen(boolean IsTouchScreen) {
        this.IsTouchScreen = IsTouchScreen;
    }

    /**
     * Sets battery capacity in watt hours
     * @param BatteryCapacity
     */
    public void setBatteryCapacity(double BatteryCapacity) {
        this.BatteryCapacity = BatteryCapacity;
    }

    /**
     * Sets flag for if keyboard or not (tablet)
     * @param HasKeyboard
     */
    public void setHasKeyboard(boolean HasKeyboard) {
        this.HasKeyboard = HasKeyboard;
    }

    /**
     * Sets flag if memory can be expanded or not
     * @param HasMemoryCardSlot
     */
    public void setHasMemoryCardSlot(boolean HasMemoryCardSlot) {
        this.HasMemoryCardSlot = HasMemoryCardSlot;
    }

    /**
     * Print string for all fields in a Chromebook object
     * @return
     */
    @Override
    public String toString() {
        return "Chromebook{" +
                "ModelName='" + ModelName + '\'' +
                ", CPU='" + CPU + '\'' +
                ", MemoryAmount=" + MemoryAmount +
                ", StorageAmount=" + StorageAmount +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", PowerSupplyWatts=" + PowerSupplyWatts +
                ", WiFiSpeed=" + WiFiSpeed +
                ", DisplaySize=" + DisplaySize +
                ", IsTouchScreen=" + IsTouchScreen +
                ", BatteryCapacity=" + BatteryCapacity +
                ", HasKeyboard=" + HasKeyboard +
                ", HasMemoryCardSlot=" + HasMemoryCardSlot +
                '}';
    }
}
