package com.company;

import java.util.Arrays;

import static java.util.stream.IntStream.iterate;

//        Build a function that returns an array of integers from n to 1 where n>0.
//        Example : n=5 --> [5,4,3,2,1]

public class Sequence {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(40)));
    }

    public static int[] reverse(int n){
//        int[] result = new int[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = n - i;
//        }
//        return result;

        return iterate(n, i -> --i).limit(n).toArray();

    }
}
