package com.codermaycry.isp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A bird")
class BirdTest {
    private final ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    private final Bird bird = new Bird();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(consoleContent));
    }

    @Test
    @DisplayName("should run")
    void run() {
        bird.run();
        assertThat(consoleContent)
                .hasToString("Bird is running");
    }

    @Test
    @DisplayName("should fly")
    void fly() {
        bird.fly();
        assertThat(consoleContent)
                .hasToString("Bird is flying");
    }
}