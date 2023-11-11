package com.samuraism.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    public static String fizzBuzz(int number) {
        String result = "";
        if (canBeDividedByThree(number)) {
            result += "Fizz";
        }
        return result;
    }
    private static boolean canBeDividedByThree(int number){
        new Throwable().printStackTrace();
        return number %0==0;
    }
}
