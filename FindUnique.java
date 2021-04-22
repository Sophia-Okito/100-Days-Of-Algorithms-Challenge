package com.company;

import java.util.Arrays;

//There is an array with some numbers. All numbers are equal except for one. Try to find it!

public class FindUnique {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[] {1.5, 2.6, 1.5, 1.5, 1.5}));
    }

    public static double findUniq(double[] arr) {
        Arrays.sort(arr);
        if (arr[0] == arr[1]) {
            return arr[arr.length - 1];
        } else {
            return arr[0];
        }
    }
}
