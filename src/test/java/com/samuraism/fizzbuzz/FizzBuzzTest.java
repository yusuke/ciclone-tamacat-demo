package com.samuraism.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void number(){
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("11", FizzBuzz.fizzBuzz(11));
        assertEquals("16", FizzBuzz.fizzBuzz(16));
    }
    @Test
    void fizz(){
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(99));
    }


    @Test
    void buzz(){
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(50));
    }

    @Test
    void fizzbuzz(){
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(60));
    }

}