package com.example.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Game {


    private final List<GameNumber> gameNumbers;

    public Game(int size) {
        gameNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            gameNumbers.add(new GameNumber(i));
        }
    }

    public int size() {
        return gameNumbers.size();
    }
}
