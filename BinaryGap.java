package com.company;

class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(1041));
    }
    public static int solution(int x) {
        String binary = Integer.toBinaryString(x);
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                count++;
            } else {
                if(count > maxCount) {
                    maxCount = count;
                    count = 0;
                }
            }
        }
        return maxCount;
    }
}
