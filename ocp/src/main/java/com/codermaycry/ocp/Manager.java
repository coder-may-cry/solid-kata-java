package com.codermaycry.ocp;

public class Manager extends Employee {
    protected int bonus;

    public Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public int payAmount() {
        return salary + bonus;
    }
}
