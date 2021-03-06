package com.company;

//        The input is a string str of digits. Cut the string into chunks (a chunk here is a
//        substring of the initial string) of size sz (ignore the last chunk if its size is less than sz).
//
//        If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2,
//        reverse that chunk; otherwise rotate it to the left by one position. Put together these modified chunks
//        and return the result as a string.
//
//        If
//        sz is <= 0 or if str is empty return ""
//        sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".

//        Examples:
//        revrot("123456987654", 6) --> "234561876549"
//        revrot("123456987653", 6) --> "234561356789"
//        revrot("66443875", 4) --> "44668753"
//        revrot("66443875", 8) --> "64438756"
//        revrot("664438769", 8) --> "67834466"
//        revrot("123456779", 8) --> "23456771"
//        revrot("", 8) --> ""
//        revrot("123456779", 0) --> ""
//        revrot("563000655734469485", 4) --> "0365065073456944"

public class RevRot {

    public static void main(String[] args) {
        String s = "733049910872815764";
        System.out.println(revRot(s, 3));
        // write your code here
    }

    public static String revRot(String strng, int sz) {
        if (strng.length() == 0 || sz <= 0 || sz > strng.length())
            return "";
        int first = 0;
        int last = sz;
        String result = "";
        for (int i = 0; i < strng.length() / sz; i++) {
            String sub = strng.substring(first, last);
            boolean check = checkCubes(sub);
            String subs;
            if (check)
                subs = reverse(sub);
            else
                subs = rotate(sub);
            result += subs;
            last += sz;
            first += sz;
        }
        return result;
    }

    private static String rotate(String sub) {
        String res = "";
        char temp = sub.charAt(0);
        for (int i =1; i < sub.length() + 1 ; i++) {
            if (i == sub.length())
                res += temp;
            else
                res += sub.charAt(i);
        }
        return res;

    }

    private static String reverse(String sub) {
        String res = "";
        for (int i = sub.length() - 1; i >= 0 ; i--)
            res += sub.charAt(i);
        return res;
    }

    public static boolean checkCubes(String sub) {
        boolean boo = false;
        int sum = 0;
        for (int i = 0; i < sub.length(); i++) {
            int cube = Integer.parseInt(String.valueOf(sub.charAt(i)));
            int cubes = cube * cube * cube;
            sum += cubes;
        }
        if (sum % 2 == 0)
            boo = true;
        return boo;
    }
}
