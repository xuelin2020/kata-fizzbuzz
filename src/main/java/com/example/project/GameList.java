package com.example.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameList {

    private List<GameNumber> gameNumbers = new ArrayList<>();

    public GameList(int size) {
        for (int i = 1; i <= size; i++) {
            gameNumbers.add(new GameNumber(i));
        }
    }

    public List<GameNumber> list() {
        return gameNumbers;
    }

    public List<String> words() {
        return gameNumbers.stream().map(GameNumber::toString).collect(Collectors.toList());
    }
}
