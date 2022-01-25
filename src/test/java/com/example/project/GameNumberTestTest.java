package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GameNumberTestTest {


    @Test
    void should_return_1_string_output_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertEquals("1", gameNumber.getNumber());
        assertEquals("1",gameNumber.coveredWord());
    }

    @Test
    void should_return_Fizz_when_3() {
        GameNumber gameNumber = new GameNumber(3);
        assertEquals("Fizz", gameNumber.coveredWord());
    }

    @Test
    void should_return_Buzz_when_5() {
        GameNumber gameNumber = new GameNumber(5);
        assertEquals("Buzz", gameNumber.coveredWord());
    }
}