package com.company;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
    }

    public static int sum(List<?> mixed) {
        var hg = (int) mixed.stream().map(m -> Integer.parseInt(String.valueOf(m))).reduce(0, (a, b) -> a + b);
        return hg;
    }
}
