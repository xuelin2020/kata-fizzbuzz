package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGameNumberTest {

    @Test
    void should_say_1_when_raw_number_is_1(){
        GameNumber gameNumber = new GameNumber(1);
        Assertions.assertEquals(gameNumber.toString(), ("1"));
    }

    @Test
    void should_say_3_when_raw_number_is_Fizz(){
        GameNumber gameNumber = new GameNumber(3);
        Assertions.assertEquals(gameNumber.toString(), ("Fizz"));
    }

}
