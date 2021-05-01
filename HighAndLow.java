package com.company;

public class HighAndLow {

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for (int i = 0; i <  arr.length; i++) {
            int cha = Integer.parseInt(arr[i]);
            min =  cha < min ? cha : min;
            max = cha > max ? cha : max;
        }
        return max + " " + min;
    }
//        IntSummaryStatistics stat = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
//        return stat.getMax() + " " + stat.getMin();
}
