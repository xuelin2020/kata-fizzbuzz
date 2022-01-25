package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GameNumberTest {


    @Test
    void should_say_1_when_raw_number_is_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertEquals("1", gameNumber.toString());
    }


    @Test
    void should_say_Fizz_when_raw_number_is_3() {
        GameNumber gameNumber = new GameNumber(3);
        assertEquals("Fizz", gameNumber.toString());
    }

    @Test
    void should_say_Buzz_when_raw_number_is_5() {
        GameNumber gameNumber = new GameNumber(5);
        assertEquals("Buzz", gameNumber.toString());
    }


    @Test
    void should_say_FizzBuzz_when_raw_number_is_15() {
        GameNumber gameNumber = new GameNumber(15);
        assertEquals("FizzBuzz", gameNumber.toString());
    }

}
