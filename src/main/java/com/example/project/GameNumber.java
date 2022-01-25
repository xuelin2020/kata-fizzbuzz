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
        if (number == 3){
            return "Fizz";
        }
        if (number == 5){
            return "Buzz";
        }
        return getNumber();
    }
}
