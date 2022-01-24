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

    @Test
    void should_say_5_when_raw_number_is_Buzz(){
        GameNumber gameNumber = new GameNumber(5);
        Assertions.assertEquals(gameNumber.toString(), ("Buzz"));
    }

    @Test
    void should_say_15_when_raw_number_is_FizzBuzz(){
        GameNumber gameNumber = new GameNumber(15);
        Assertions.assertEquals(gameNumber.toString(), ("FizzBuzz"));
    }
}
