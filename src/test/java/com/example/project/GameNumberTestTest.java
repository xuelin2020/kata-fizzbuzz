package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GameNumberTestTest {


    @Test
    void should_return_1_string_output_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertEquals("1", gameNumber.getNumber());
    }
}