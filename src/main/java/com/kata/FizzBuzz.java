package com.kata;

public class FizzBuzz {

    private int value;

    public FizzBuzz(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        if (value % 5 == 0) return "Buzz";
        if (value % 3 == 0) return "Fizz";
        return String.valueOf(this.value);
    }

}
