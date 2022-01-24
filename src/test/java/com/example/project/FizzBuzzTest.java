package com.example.project;


import static com.example.project.FizzBuzz.fizzBuzz;
import static com.example.project.FizzBuzz.isFiveMultiple;
import static com.example.project.FizzBuzz.isThreeMultiple;
import static com.example.project.FizzBuzz.replaceFizz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.IntStream;
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
        return Stream.of(5, 10, 20);
    }

    public static Stream<Integer> notFiveMultipleList() {
        return Stream.of(1, 2, 3);
    }

    public static Stream<Integer> notThreeAndFiveMultipleList() {
        return Stream.of(10, 0, 20, 9);
    }

    public static Stream<Integer> threeAndFiveMultipleList() {
        return Stream.of(15, 30, 45);
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

    @ParameterizedTest
    @MethodSource("fiveMultipleList")
    void should_return_Fizz_when_input_fiveMultiple(int num) {
        assertEquals("Buzz", FizzBuzz.replaceBuzz(num));
    }

    @ParameterizedTest
    @MethodSource("notFiveMultipleList")
    void should_return_source_when_input_notFiveMultiple(int num) {
        assertEquals(String.valueOf(num), FizzBuzz.replaceBuzz(num));
    }

    @ParameterizedTest
    @MethodSource("threeAndFiveMultipleList")
    void should_return_true_when_input_parameter_is_3_and_5_multiple(int num) {
        assertTrue(FizzBuzz.isThreeAndFiveMultiple(num));
    }


    @ParameterizedTest
    @MethodSource("notThreeAndFiveMultipleList")
    void should_return_false_when_input_parameter_is_3_and_5_multiple(int num) {
        assertFalse(FizzBuzz.isThreeAndFiveMultiple(num));
    }

    @ParameterizedTest
    @MethodSource("threeAndFiveMultipleList")
    void should_return_FizzBuzz_when_input_three_and_fiveMultiple(int num) {
        assertEquals("FizzBuzz", FizzBuzz.replaceFizzBuzz(num));
    }

    @ParameterizedTest
    @MethodSource("notThreeAndFiveMultipleList")
    void should_return_source_when_input_notThreeAndFiveMultiple(int num) {
        assertEquals(String.valueOf(num), FizzBuzz.replaceFizzBuzz(num));
    }

    @ParameterizedTest
    @MethodSource("threeAndFiveMultipleList")
    void should_return_result_when_input_(int num) {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(num));
    }

    @ParameterizedTest
    @MethodSource("threeMultipleList")
    void should_return_result_when_input_2(int num) {
        assertEquals("Fizz", fizzBuzz(num));
    }


    @ParameterizedTest
    @MethodSource("fiveMultipleList")
    void should_return_result_when_input_3(int num) {
        assertEquals("Buzz", fizzBuzz(num));
    }


    @Test
    void log() {
        IntStream.range(1,100).forEach(i -> System.out.print(i + " -> " + (fizzBuzz(i)) +"\n"));
    }
}
