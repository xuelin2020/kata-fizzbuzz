package com.example.project;

public class GameNumber {

    private final int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isaBoolean(5) && isaBoolean(3)) return "FizzBuzz";
        if (isaBoolean(3)) return "Fizz";
        if (isaBoolean(5)) return "Buzz";
        return rawNumber + "";
    }

    private boolean isaBoolean(int i) {
        return rawNumber % i == 0;
    }
}
