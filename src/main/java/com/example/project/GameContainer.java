package com.example.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameContainer {


    private final List<Game> list;

    public GameContainer(int size) {

        ArrayList<Game> list = new ArrayList<>();
        for (int i = 1; i < size + 1 ; i++) {
            list.add(new Game(i));
        }
        this.list = list;

    }

    public List<Game> list() {
        return list;
    }

    public List<String> coveredList() {
        return this.list.stream().map(Game::getKey).collect(Collectors.toList());
    }
}
