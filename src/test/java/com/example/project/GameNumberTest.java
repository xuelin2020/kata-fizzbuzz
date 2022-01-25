package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GameNumberTest {


    @Test
    void should_say_1_when_raw_number_is_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertEquals("1", gameNumber.toString());
    }
}
