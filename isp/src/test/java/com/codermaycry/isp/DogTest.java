package com.codermaycry.isp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A dog")
class DogTest {
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    private final Dog dog = new Dog();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(consoleContent));
    }


    @Test
    @DisplayName("should run")
    void run() {
        dog.run();
        assertThat(consoleContent.toString())
                .isEqualTo("Dog is running");
    }

    @Test
    @DisplayName("should bark")
    void bark() {
        dog.bark();
        assertThat(consoleContent.toString())
                .isEqualTo("Dog is barking");
    }
}