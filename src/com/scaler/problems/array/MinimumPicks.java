package com.scaler.problems.array;

import java.util.ArrayList;
import java.util.Arrays;

/*
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and
the minimum among all odd numbers in A.
 */
public class MinimumPicks {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(solve(list));
    }

    public static int solve(ArrayList<Integer> A) {
        int maxEvenNum = Integer.MIN_VALUE;
        int minOddNum = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0 && A.get(i) > maxEvenNum) {
                maxEvenNum = A.get(i);
            } else if (A.get(i) % 2 != 0 && A.get(i) < minOddNum) {
                minOddNum = A.get(i);
            }
        }
        return maxEvenNum - minOddNum;
    }
}
