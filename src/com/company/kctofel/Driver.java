package com.company.kctofel;

/**
 * Driver class for Inheritance
 * Kevin C. Tofel
 * March 5, 2019
 */

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        // Create both super and sublass objects

        Computer Pixelbook = new Chromebook("Pixelbook","Intel Core i5", 80000000, 64000000, "Chrome OS", 45, 800, 13, true, 24000, true);
        Computer Pixel3 = new Smartphone("Pixel 3", "Snapdragon 845", 4000000, 64000000, "Android 9", 20, 400, 40, 6, 3000, false);
        Computer ThinkPad = new Computer("IBM Thinkpad 730", "AMD R7", 16000000, 256000000, "Windows 10", 65, 800);
        Computer PixelSlate = new ChromeTablet("PixelSlate", "Intel, Core i7", 800000000, 1280000000, "ChromeOS", 45, 800, 12, true, 27000, false, false);

        // Initialize ArrayList of Computer objects
        ArrayList<Computer> Devices = new ArrayList<>();

        // Add Computer objects to ArrayList for printing
        Devices.add(ThinkPad);
        Devices.add(PixelSlate);
        Devices.add(Pixel3);
        Devices.add(Pixelbook);

        for (Computer gadget: Devices){
            System.out.println(gadget.toString());
        }
    }
}
