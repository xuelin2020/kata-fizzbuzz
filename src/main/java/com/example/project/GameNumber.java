package com.example.project;

public class GameNumber {


    private final int number;

    public GameNumber(int i) {
        this.number = i;
    }

    public String getNumber() {
        return String.valueOf(number);
    }


    public String coveredWord() {

        return "Fizz";
    }
}
