package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GameNumberTest {

    @Test
    void should_return_1_when_game_number_1() {
        //given
        GameNumber gameNumber = new GameNumber(1);
        //when
        String word = gameNumber.toString();
        //then
        assertEquals("1", word);
    }

    @Test
    void should_return_Fizz_when_game_number_3() {
        //given
        GameNumber gameNumber = new GameNumber(3);
        //when
        String word = gameNumber.toString();
        //then
        assertEquals("Fizz", word);
    }

    @Test
    void should_return_Buzz_when_game_number_5() {
        //given
        GameNumber gameNumber = new GameNumber(5);
        //when
        String word = gameNumber.toString();
        //then
        assertEquals("Buzz", word);
    }

    @Test
    void should_return_FizzBuzz_when_game_number_15() {
        //given
        GameNumber gameNumber = new GameNumber(15);
        //when
        String word = gameNumber.toString();
        //then
        assertEquals("FizzBuzz", word);
    }

    @Test
    void should_return_100_when_size_is_100() {
        //given
        GameList gameList = new GameList(100);
        //when
        List<GameNumber> list = gameList.list();
        int size = list.size();
        //then
        assertEquals(100, size);
        assertEquals("1", list.get(0).toString());
        assertEquals("Fizz", list.get(2).toString());
    }

    @Test
    void should_return_words_when_size_is_100() {
        //given
        GameList gameList = new GameList(100);
        //when
        List<String> list = gameList.words();
        //then
        assertEquals("1", list.get(0));
        assertEquals("Fizz", list.get(2));
        System.out.println("list = " + list);
    }
}
