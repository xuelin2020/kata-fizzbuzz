package com.example.project;


import static com.example.project.FizzBuzz.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FizzBuzzTest {

    public static Stream<Integer> threeMultipleList() {
        return Stream.of(3, 6, 9, 12);
    }

    public static Stream<Integer> notThreeMultipleList() {
        return Stream.of(1, 2, 0);
    }

    public static Stream<Integer> fiveMultipleList() {
        return Stream.of(5, 10, 15);
    }

    public static Stream<Integer> notFiveMultipleList() {
        return Stream.of(1, 2, 3);
    }

    @ParameterizedTest
    @MethodSource("threeMultipleList")
    void should_return_true_when_input_parameter_is_3_multiple(int num) {
        assertTrue(isThreeMultiple(num));
    }


    @ParameterizedTest
    @MethodSource("notThreeMultipleList")
    void should_return_false_when_input_parameter_is_3_multiple(int num) {
        assertFalse(isThreeMultiple(num));
    }


    @ParameterizedTest
    @MethodSource("fiveMultipleList")
    void should_return_true_when_input_parameter_is_5_multiple(int num) {
        assertTrue(isFiveMultiple(num));
    }

    @ParameterizedTest
    @MethodSource("notFiveMultipleList")
    void should_return_false_when_input_parameter_is_5_multiple(int num) {
        assertFalse(isFiveMultiple(num));
    }

    @ParameterizedTest
    @MethodSource("threeMultipleList")
    void should_return_Fizz_when_input_threeMultiple(int num) {
        assertEquals("Fizz", replaceFizz(num));
    }

    @ParameterizedTest
    @MethodSource("notThreeMultipleList")
    void should_return_source_when_input_notThreeMultiple(int num) {
        assertEquals(String.valueOf(num), replaceFizz(num));
    }

}
