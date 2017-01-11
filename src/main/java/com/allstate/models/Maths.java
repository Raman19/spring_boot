package com.allstate.models;


import java.lang.reflect.Array;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Maths {

    public static int square(int num){
        return num*num;
    }

    public static int factorial(int num){
        return  IntStream.iterate(1 , n -> n +1).limit(num).reduce(1,(fact,n) -> fact * n);
    }

    public static int fibonacci(int num){
        if(num < 2) return num;
        return fibonacci(num -1) + fibonacci (num -2);
    }
}
