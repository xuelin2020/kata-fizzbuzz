package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameNumberTest {

    @Test
    void should_say_1_when_raw_number_is_1(){
        GameNumber gameNumber = new GameNumber(1);
        assertEquals(gameNumber.toString(), ("1"));
    }

    @Test
    void should_say_3_when_raw_number_is_Fizz(){
        GameNumber gameNumber = new GameNumber(3);
        assertEquals(gameNumber.toString(), ("Fizz"));
    }

    @Test
    void should_say_5_when_raw_number_is_Buzz(){
        GameNumber gameNumber = new GameNumber(5);
        assertEquals(gameNumber.toString(), ("Buzz"));
    }

    @Test
    void should_say_15_when_raw_number_is_FizzBuzz(){
        GameNumber gameNumber = new GameNumber(15);
        assertEquals(gameNumber.toString(), ("FizzBuzz"));
    }


    @Test
    void should_create_game_object_with_given_size(){
        Game game = new Game(100);
        assertEquals(100, game.size());
    }

    @Test
    void should_provide_words_to_be_spoken() {
        Game game = new Game(100);
        List<String> wordsToBeSpoken = game.words();
        assertEquals(100, wordsToBeSpoken.size());
        assertEquals("1", wordsToBeSpoken.get(0));
    }


}
