package org.java_fundamentals._09_composition._02_BatteryAndCamera;

public class Main {
    public static void main(String[] args) {
         Battery battery = new Battery();
         battery.displayBatteryLevel();
         Camera camera = new Camera();
         camera.takePicture();
    }
}
