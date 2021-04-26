package com.company;

//        John and Mary want to travel between a few towns A, B, C ... Mary has on a sheet of paper a
//        list of distances between these towns. ls = [50, 55, 57, 58, 60]. John is tired of driving and
//        he says to Mary that he doesn't want to drive more than t = 174 miles and he will visit only 3 towns.
//
//        Which distances, hence which towns, they will choose so that the sum of the distances is the
//        biggest possible to please Mary and John?
//
//        Example:
//        With list ls and 3 towns to visit they can make a choice between: [50,55,57],[50,55,58],[50,55,60],
//        [50,57,58],[50,57,60],[50,58,60],[55,57,58],[55,57,60],[55,58,60],[57,58,60].
//
//        The sums of distances are then: 162, 163, 165, 165, 167, 168, 170, 172, 173, 175.
//
//        The biggest possible sum taking a limit of 174 into account is then 173 and the distances of
//        the 3 corresponding towns is [55, 58, 60].
//
//        The function chooseBestSum (or choose_best_sum or ... depending on the language) will take as
//        parameters t (maximum sum of distances, integer >= 0), k (number of towns to visit, k >= 1) and
//        ls (list of distances, all distances are positive or null integers and this list has at least one element).
//        The function returns the "best" sum ie the biggest possible sum of k distances less than or equal to the
//        given limit t, if that sum exists, or otherwise nil, null, None, Nothing, depending on the language.
//
//        With C++, C, Rust, Swift, Go, Kotlin, Dart return -1.
//
//        Examples:
//        ts = [50, 55, 56, 57, 58] choose_best_sum(163, 3, ts) -> 163
//
//        xs = [50] choose_best_sum(163, 3, xs) -> nil (or null or ... or -1 (C++, C, Rust, Swift, Go)
//
//        ys = [91, 74, 73, 85, 73, 81, 87] choose_best_sum(230, 3, ys) -> 228
//
//        Note:
//        don't modify the input list ls

import java.util.ArrayList;
import java.util.List;

public class BestTravel {

    public static void main(String[] args) {
        List lt = new  ArrayList();
        lt.add(50);
        lt.add(55);
        lt.add(57);
        lt.add(58);
        lt.add(60);
        System.out.println(chooseBestSum(174, 3, lt));
    }
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int n = ls.size();
        Integer max = -1;
        int sum;
        if (k > n)
            return null;

        int[] index = new int[k];
        for (int i = 0; i < k; i++) {
            index[i] = i + 1;
        }
        do {
            sum = 0;
            for (int i = 0; i < k; i++) {
                sum += ls.get(index[i] - 1);
            }
            if (max < sum && sum <= t) max = sum;

        } while ((index = generateCombination(k, n, index)) != null);

        return (max > 0) ? max : null;
    }

    static int[] generateCombination(int k, int n, int[] index) {
        for (int i = k - 1; i >= 0; i--) {
            if (index[i] < n - k + i + 1) {
                index[i]++;
                for (int j = i + 1; j < k; j++) {
                    index[j] = index[j-1] + 1;
                }
                return index;
            }
        }
        return null;
    }
}
