package com.codermaycry.ocp;

public class Employee {

    private int salary;
    private int bonus;
    private EmployeeType type;

    Employee(int salary, int bonus, EmployeeType type) {
        this.salary = salary;
        this.bonus = bonus;
        this.type = type;
    }

    public int payAmount() {
        return switch (this.type) {
            case ENGINEER -> salary;
            case MANAGER -> salary + bonus;
        };
    }

}