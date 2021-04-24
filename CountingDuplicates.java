package com.company;

import java.util.stream.Collectors;


//        Count the number of Duplicates
//        Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
//        Example
//        "abcde" -> 0 # no characters repeats more than once
//        "aabbcde" -> 2 # 'a' and 'b'
//        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//        "indivisibility" -> 1 # 'i' occurs six times
//        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//        "aA11" -> 2 # 'a' and '1'
//        "ABBA" -> 2 # 'A' and 'B' each occur twice

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(duplicateCount("ayobammmy"));
    }

    public static int duplicateCount(String text) {
//        var test = (int) text.toLowerCase().chars().boxed().collect(Collectors.groupingBy(k->k,Collectors.counting())).values().stream().filter(e->e>1).count();
//        return test;

        text = text.toLowerCase();
        int count = 0;
        while (text.length() > 0) {
            String txt = text.replaceAll(text.substring(0,1), "");
            if (text.length() - txt.length() > 1) {
                count++;
            }
            text = txt;
        }
        return count;

    }
}
