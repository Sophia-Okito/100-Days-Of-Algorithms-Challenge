package com.company;

public class CenturyFromYear {

    public static void main(String[] args) {
        System.out.println(century(1701));
    }
    public static int century(int number) {
        return number % 100 == 0 ? number / 100 : (number / 100) + 1;
    }
}
