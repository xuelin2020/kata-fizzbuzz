package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class Game {


    private List<GameNumber> gameNumbers;

    public Game(int size) {
        gameNumbers = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            gameNumbers.add(new GameNumber(i));
        }
    }

    public int size() {
        return gameNumbers.size();
    }

    public List<String> words() {
        List<String> result  = new ArrayList<>();
        for(GameNumber gameNumber : gameNumbers) {
            result.add(gameNumber.toString());
        }
        return result;
    }
}
