package com.company;

public class Persistence {

    public static void main(String[] args) {
        System.out.println(persistence(537));
    }
    public static int persistence(long n) {
        String nString = String.valueOf(n);
        String[] res = nString.split("");
        int count = 0;
        while (res.length > 1) {
            int mult = 1;
            count++;
            for (String re : res) {
                mult *= Integer.parseInt(re);
            }
            res = String.valueOf(mult).split("");
        }
        return count;
    }
}
