package com.company;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(rotation(test, 5)));

    }

    public static int[] rotation(int[] array, int x) {
        int len = array.length;
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[(x + i) % len] = array[i];
        }

        return newArray;
    }
}
