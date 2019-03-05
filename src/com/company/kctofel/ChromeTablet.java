package com.company.kctofel;

/**
 * ChromeTablet class for Inheritance from Computer class
 * Kevin C. Tofel
 * March 5, 2019
 */

public class ChromeTablet extends Chromebook {

    private boolean hasKeyboard; // Is this a true tablet or a 2-in-1 convertible device?

    /**
     * Constructor for ChromeTablet object, which is extended from a Chromebook --> Computer object
     * @param hasKeyboard does it have a keyboard
     */
    public ChromeTablet(String modelName, String CPU, int memoryAmount, double storageAmount, String operatingSystem, int powerSupplyWatts, double wiFiSpeed, int displaySize, boolean isTouchScreen, double batteryCapacity, boolean hasMemoryCardSlot, boolean hasKeyboard) {
        super(modelName, CPU, memoryAmount, storageAmount, operatingSystem, powerSupplyWatts, wiFiSpeed, displaySize, isTouchScreen, batteryCapacity, hasMemoryCardSlot);
        this.hasKeyboard = hasKeyboard;
    }

    /**
     * Method to return true or false value if object has a keyboard
     * @return true if has a connected keyboard but still can be used in tablet mode
     */
    public boolean getHasKeyboard() {
        return hasKeyboard;
    }

    /**
     * Method to set true or false value if object has a keyboard
     * @return no return
     */
    public void setHasKeyboard(boolean hasKeyboard) {
        this.hasKeyboard = hasKeyboard;
    }
}
