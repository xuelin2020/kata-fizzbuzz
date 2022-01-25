package com.example.project;

public class GameNumber {


    private final int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (divisibleBy(3) && divisibleBy(5)) {
            return "FizzBuzz";
        }
        if (divisibleBy(3)) {
            return "Fizz";
        }
        if (divisibleBy(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean divisibleBy(int i) {
        return rawNumber % i == 0;
    }
}
