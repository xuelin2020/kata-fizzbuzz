package com.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    @Test
    void should_work_on() {
        assertEquals(1, 1);
    }

    @ParameterizedTest(name = "should return {1} given {0}")
    @CsvSource({
            "1,1",
            "3,Fizz",
            "5,Buzz",
    })
    void should_input_1_return_1(int input,String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz(input);
        assertEquals(expected, fizzBuzz.toString());
    }

}
