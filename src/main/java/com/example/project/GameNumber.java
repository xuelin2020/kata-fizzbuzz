package com.example.project;

public class GameNumber {

    private int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        return String.valueOf(rawNumber);
    }
}
