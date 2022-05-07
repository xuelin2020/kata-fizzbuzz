package com.kata;

public class FizzBuzz {

    private int value;

    public FizzBuzz(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        if (isDivBy(5)) return "Buzz";
        if (isDivBy(3)) return "Fizz";
        return String.valueOf(this.value);
    }

    private boolean isDivBy(int i) {
        return value % i == 0;
    }

}
