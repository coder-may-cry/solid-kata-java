package com.codermaycry.lsp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@DisplayName("A filling station")
class FillingStationTest {
    private static final int FULL = 100;
    private final FillingStation fillingStation = new FillingStation();

    @Test
    @DisplayName("should refuel a petrol car")
    void refuel_a_petrol_car() {
        var car = new PetrolCar();

        fillingStation.refuel(car);

        assertThat(car.fuelTankLevel())
                .isEqualTo(FULL);
    }


    @Test
    @DisplayName("should not fail refueling an electric car")
    void not_fail_refueling_an_electric_car() {
        var car = new ElectricCar();

        Throwable throwable = catchThrowable(() -> fillingStation.refuel(car));

        assertThat(throwable)
                .isNull();
    }


    @Test
    @DisplayName("should recharge an electric car")
    void recharge_an_electric_car() {
        var car = new ElectricCar();

        fillingStation.charge(car);

        assertThat(car.batteryLevel())
                .isEqualTo(FULL);
    }


    @Test
    @DisplayName("should not fail recharging a petrol car")
    void not_fail_recharging_a_petrol_car() {
        var car = new PetrolCar();

        Throwable throwable = catchThrowable(() -> fillingStation.charge(car));

        assertThat(throwable)
                .isNull();
    }
}
