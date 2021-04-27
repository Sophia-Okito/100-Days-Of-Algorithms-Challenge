package com.company;

import java.util.function.UnaryOperator;

public class MovesInSquaredStrings  {

    public static void main(String[] args) {
        System.out.println(oper(MovesInSquaredStrings::vertMirror, "\"abcd\\nefgh\\nijkl\\nmnop\""));
        System.out.println(oper(MovesInSquaredStrings::horMirror, "\"abcd\\nefgh\\nijkl\\nmnop\""));

    }

    public static String vertMirror(String strng) {
        String[] arr = strng.split("\\r?\\n");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() -1; j >= 0; j--)
                res += arr[i].charAt(j);
            if ( i != arr.length - 1)
                res += "\n";
        }
        return res;
    }

    public static String horMirror (String strng) {
        String[] arr = strng.split("\\r?\\n");
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i];
            if (i != 0)
                res += "\n";
        }
        return res;
    }
    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
