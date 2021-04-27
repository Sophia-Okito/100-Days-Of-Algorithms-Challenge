package com.company;

public class DisemvowelTrolls {

    public static void main(String[] args) {
        System.out.println(disemvowel("I love you so much"));
    }
    public static String disemvowel(String str) {
        return str.replaceAll("[AEIOUaeiuo]","");
    }
}
