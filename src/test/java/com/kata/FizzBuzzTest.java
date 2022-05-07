package com.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void should_work_on() {
        assertEquals(1, 1);
    }

    @Test
    void should_input_1_return_1() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertEquals("1", fizzBuzz.toString());
    }

    @Test
    void should_input_3_return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertEquals("Fizz", fizzBuzz.toString());
    }
}
