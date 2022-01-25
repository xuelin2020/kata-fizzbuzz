package com.example.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {


    private final List<GameNumber> gameNumbers;

    public Game(int size) {
        List<GameNumber> gameNumbers = new ArrayList<>();
        IntStream.range(1, size+1).forEach(i -> gameNumbers.add(new GameNumber(i)));
        this.gameNumbers = gameNumbers;
    }

    public int size() {
        return gameNumbers.size();
    }

    public List<String> words() {
        return gameNumbers.stream().map(GameNumber::toString).collect(Collectors.toList());
    }
}
