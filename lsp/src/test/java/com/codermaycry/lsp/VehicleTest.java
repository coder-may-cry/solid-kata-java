package com.codermaycry.lsp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A vehicle")
class VehicleTest {
    @Test
    @DisplayName("should start")
    void startEngine() {
        var vehicle = new TestableVehicle();

        vehicle.startEngine();

        assertThat(vehicle.engineIsStarted())
                .isTrue();

    }

    @Test
    @DisplayName("should stop when already started")
    void stopEngine() {
        var vehicle = new TestableVehicle();

        vehicle.startEngine();
        vehicle.stopEngine();

        assertThat(vehicle.engineIsStarted())
                .isFalse();
    }

    static class TestableVehicle extends Vehicle {
        @Override
        public void fillUpWithFuel() {

        }

        @Override
        public void chargeBattery() {

        }
    }
}