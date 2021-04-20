package com.company;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//        Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order
//        of the strings of a1 which are substrings of strings of a2.
//
//        #Example 1: a1 = ["arp", "live", "strong"]
//
//        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//        returns ["arp", "live", "strong"]
//
//        #Example 2: a1 = ["tarp", "mice", "bull"]
//
//        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//        returns []
//
//        Notes:
//        Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
//
//        In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
//
//        Beware: r must be without duplicates.
//        Don't mutate the inputs.



public class WhichAreIn {

    public static void main(String[] args) {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println(Arrays.toString(inArray(a, b)));
        // write your code here
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> strArr = new TreeSet<>();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i].contains(array1[j])) {
                    strArr.add(array1[j]);
                }
            }
        }
        String[] srr = new String[strArr.size()];
        strArr.toArray(srr);

        return srr;
    }
}
