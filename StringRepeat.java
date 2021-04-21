package com.company;

public class StringRepeat {

    public static void main(String[] args) {
        System.out.println(repeatStr(5, "Sophia"));
    }
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
