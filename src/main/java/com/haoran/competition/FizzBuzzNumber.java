package com.haoran.competition;

public class FizzBuzzNumber {
    private int rawNumber;

    public FizzBuzzNumber(int num) {

        rawNumber = num;
    }

    public String readed() {
        String res = "";
        if (rawNumber % 3 == 0) {
            res += "Fizz";
        }
        if (rawNumber % 5 == 0) {
            res += "Buzz";
        }
        if (res.isEmpty()) {
            return String.valueOf(rawNumber);

        }
        return res;
    }
}
