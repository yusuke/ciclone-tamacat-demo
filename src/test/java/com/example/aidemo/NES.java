package com.example.aidemo;

public class NES {
    public static void main(String[] args) {
        printFruit("apple");
    }
    
    public static void printFruit(String fruitName){
        int repeat = 10;
        for (int i = 0; i < repeat; i++) {
            System.out.println(fruitName);
            
        }
    }
}
