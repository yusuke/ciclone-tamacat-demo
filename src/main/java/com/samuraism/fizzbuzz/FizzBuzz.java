package com.samuraism.fizzbuzz;

public class FizzBuzz {
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        for (int i = 0; i < MAX_NUMBER; i++) {
            System.out.printf(calculateFizzBuzz(i) + "\n");
        }
    }

    static String calculateFizzBuzz(int number) {
//        var divisibleBy3 = number % 3 == 0;
//        var divisibleBy5 = number % 5 == 0;
//
//        if (divisibleBy3 && divisibleBy5) {
//            return "FizzBuzz";
//        } else if (divisibleBy3) {
//            return "Fizz";
//        } else if (divisibleBy5) {
//            return "Buzz";
//        } else {
//            return Integer.toString(number);
//        }
        return "";
    }
}
