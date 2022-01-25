package com.example.project;

public class Game {

    private int rawNumber;

    public Game(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    public String getKey() {
        if (rawNumber %5 == 0 && rawNumber%3==0) return "FizzBuzz";
        if (rawNumber %3 ==0) return "Fizz";
        if (rawNumber %5 ==0) return "Buzz";
        return rawNumber + "";
    }
}
