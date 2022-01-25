package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class GameNumberTestTest {


    @Test
    void should_return_1_string_output_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertEquals("1", gameNumber.getNumber());
        assertEquals("1",gameNumber.coveredWord());
    }

    @Test
    void should_return_Fizz_when_3_multiple() {
        GameNumber gameNumber = new GameNumber(3);
        assertEquals("Fizz", gameNumber.coveredWord());
        GameNumber gameNumber2 = new GameNumber(6);
        assertEquals("Fizz", gameNumber2.coveredWord());
    }

    @Test
    void should_return_Buzz_when_5_multiple() {
        GameNumber gameNumber = new GameNumber(5);
        assertEquals("Buzz", gameNumber.coveredWord());
        GameNumber gameNumber2 = new GameNumber(10);
        assertEquals("Buzz", gameNumber2.coveredWord());
    }

    @Test
    void should_return_FizzBuzz_when_15_multiple() {
        GameNumber gameNumber = new GameNumber(15);
        assertEquals("FizzBuzz",gameNumber.coveredWord());
        GameNumber gameNumber2 = new GameNumber(30);
        assertEquals("FizzBuzz",gameNumber2.coveredWord());
    }

    @Test
    void should_create_mockList() {
        MockList mockList = new MockList();
        assertEquals(100, mockList.getList().size());
        assertEquals(1, mockList.getList().get(0));
        assertEquals(100, mockList.getList().get(99));
    }

    @Test
    void should_covert_list() {
        MockList mockList = new MockList();
        List<String> words = mockList.coveredWordList();
        assertEquals("Fizz",words.get(2));
        assertEquals("Buzz",words.get(4));
        assertEquals("7",words.get(6));
        assertEquals("FizzBuzz",words.get(14));
    }
}