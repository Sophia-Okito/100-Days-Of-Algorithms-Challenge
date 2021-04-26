package com.company;
//
//        You have to search all numbers from inclusive 1 to inclusive a given number x,
//        that have the given digit d in it.
//        The value of d will always be 0 - 9.
//        The value of x will always be greater than 0.
//
//        You have to return as an array
//
//        the count of these numbers,
//        their sum
//        and their product.
//
//        For example:
//        x = 11
//        d = 1
//        ->
//        Numbers: 1, 10, 11
//        Return: [3, 22, 110]
//
//        If there are no numbers, which include the digit, return [0,0,0].
//
//        Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//        I have created other katas. Have a look if you like coding and challenges.

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersWithDigitInside {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbersWithDigitInside(20, 5)));
    }

    public static long[] numbersWithDigitInside(long x, long d) {
        long[] realResult = new long[3];
        ArrayList<Long> result = new ArrayList<>();
        for (long i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                result.add(i);
            }
        }
        realResult[0] = result.size();
        realResult[1] = result.stream().reduce(0L, Long::sum);
        realResult[2] = result.size() == 0 ? 0 : result.stream().reduce(1L, (a, b) -> a * b);
        return realResult;
    }
}
