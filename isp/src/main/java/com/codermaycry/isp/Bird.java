package com.codermaycry.isp;

public class Bird extends Animal implements Running, Flying {
    @Override
    public void run() {
        System.out.print("Bird is running");
    }

    @Override
    public void fly() {
        System.out.print("Bird is flying");
    }
}