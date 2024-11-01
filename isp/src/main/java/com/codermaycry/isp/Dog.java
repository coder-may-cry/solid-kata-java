package com.codermaycry.isp;

public class Dog extends Animal implements Barking, Running {
    @Override
    public void run() {
        System.out.print("Dog is running");
    }

    @Override
    public void bark() {
        System.out.print("Dog is barking");
    }
}
