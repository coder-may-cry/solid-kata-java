package com.codermaycry.lsp;

public class ElectricCar extends Vehicle implements ElectricPowered {

    private static final int BATTERY_FULL = 100;
    private int batteryLevel;

    @Override
    public void chargeBattery() {
        batteryLevel = BATTERY_FULL;
    }

    public int batteryLevel() {
        return batteryLevel;
    }
}
