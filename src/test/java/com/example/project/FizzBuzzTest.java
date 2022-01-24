package com.example.project;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FizzBuzzTest {

    public static Stream<Integer> threeMultipleList() {
        return Stream.of(3, 6, 9, 12);
    }

    @ParameterizedTest
    @MethodSource("threeMultipleList")
    void should_return_true_when_input_parameter_is_3_multiple(int num) {
        assertTrue(FizzBuzz.isThreeMultiple(num));
    }


}
