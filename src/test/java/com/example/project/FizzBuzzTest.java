package com.example.project;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("threeMultipleList")
    void should_return_true_when_input_parameter_is_3_multiple(int num) {
        assertTrue(FizzBuzz.isThreeMultiple(num));
    }


    @ParameterizedTest
    @MethodSource("notThreeMultipleList")
    void should_return_false_when_input_parameter_is_3_multiple(int num) {
        assertFalse(FizzBuzz.isThreeMultiple(num));
    }


    @ParameterizedTest
    @MethodSource("fiveMultipleList")
    void should_return_true_when_input_parameter_is_5_multiple(int num) {
        assertTrue(FizzBuzz.isFiveMultiple(num));
    }



}
