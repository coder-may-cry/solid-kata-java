package com.codermaycry.ocp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Payment system")
class EmployeeTest {

    private static final int BONUS = 100;
    private static final int SALARY = 1000;

    @Test
    @DisplayName("should not add bonus to the engineer pay amount")
    void not_add_bonus_to_the_engineer_pay_amount() {
        var employee = new Employee(SALARY, BONUS, EmployeeType.ENGINEER);
        assertThat(employee.payAmount())
                .isEqualTo(SALARY);
    }

    @Test
    @DisplayName("should add bonus to the manager pay amount")
    void add_bonus_to_the_manager_pay_amount() {
        var employee = new Employee(SALARY, BONUS, EmployeeType.MANAGER);
        assertThat(employee.payAmount())
                .isEqualTo(SALARY + BONUS);
    }
}