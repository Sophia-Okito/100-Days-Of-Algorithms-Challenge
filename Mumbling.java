package com.company;

public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("Abc"));
    }

    public static String accum(String s) {
        String[] arr = s.toLowerCase().split("");
        StringBuilder text = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            int j = 0;
            do {
                text.append(j == 0 ? arr[i - 1].toUpperCase() : arr[i - 1]);
                j++;
            } while (j < i);
            text.append(i == s.length() ? "" : "-");
        }
       return text.toString();
    }
}
