package com.codermaycry.ocp;

public abstract class Employee implements Payable {
    protected int salary;

    public Employee(int salary) {
        this.salary = salary;
    }
}