package com.company;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("Abc"));
    }

    public static String accum(String s) {
        String[] arr = s.toLowerCase().split("");
        StringBuilder text = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            text.append(arr[i-1].toUpperCase());
            text.append(arr[i-1].repeat(i - 1));
            text.append(i == s.length() ? "" : "-");
        }
       return text.toString();
    }
}
