package com.company;

import static java.util.Arrays.*;
public class OddOrEven {

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {0, -1, -5}));
    }
    public static String oddOrEven (int[] array) {
       return  stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
