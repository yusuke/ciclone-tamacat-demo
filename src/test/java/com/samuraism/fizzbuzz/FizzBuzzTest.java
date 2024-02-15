package com.samuraism.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void number(){
        assertEquals("4", FizzBuzz.calculateFizzBuzz(4));
        assertEquals("11", FizzBuzz.calculateFizzBuzz(11));
        assertEquals("16", FizzBuzz.calculateFizzBuzz(16));
    }
    @Test
    void fizz(){
        assertEquals("Fizz", FizzBuzz.calculateFizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.calculateFizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.calculateFizzBuzz(99));
    }


    @Test
    void buzz(){
        assertEquals("Buzz", FizzBuzz.calculateFizzBuzz(5));

        assertEquals("Buzz", FizzBuzz.calculateFizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.calculateFizzBuzz(50));
    }

    @Test
    void fizzbuzz(){
        assertEquals("FizzBuzz", FizzBuzz.calculateFizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.calculateFizzBuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.calculateFizzBuzz(60));
    }

}