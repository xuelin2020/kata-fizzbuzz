package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    void should_return_1_when_raw_number_is_1() {
        Game game = new Game(1);
        assertEquals("1", game.getKey());
    }

    @Test
    void should_return_Fizz_when_raw_number_is_3() {
        Game game = new Game(3);
        assertEquals("Fizz", game.getKey());
    }

    @Test
    void should_return_Buzz_when_raw_number_is_5() {
        Game game = new Game(5);
        assertEquals("Buzz", game.getKey());
    }

    @Test
    void should_return_FizzBuzz_when_raw_number_is_15() {
        Game game = new Game(15);
        assertEquals("FizzBuzz", game.getKey());
    }

    @Test
    void should_return_list_with_size() {
        GameContainer gameContainer = new GameContainer(100);
        assertEquals(100, gameContainer.list().size());
        assertEquals("1", gameContainer.list().get(0).getKey());
        assertEquals("Fizz", gameContainer.list().get(2).getKey());
    }

    @Test
    void should_return_covered_list_with() {
        GameContainer gameContainer = new GameContainer(100);
        List<String> coveredList = gameContainer.coveredList();
        assertEquals("1", coveredList.get(0));
        assertEquals("Fizz", coveredList.get(2));
        assertEquals("Buzz", coveredList.get(4));
        System.out.println("coveredList = " + coveredList);
    }
}
