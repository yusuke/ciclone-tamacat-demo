package com.samuraism.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        int a = 100;
        String[] results = new String[a];
        for (int i = 0; i < a; i++) {
            var result = "";
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                result += i;
            }
            results[i] = result;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(results[i]);
        }
    }
}
