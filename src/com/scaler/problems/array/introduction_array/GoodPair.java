package com.scaler.problems.array.introduction_array;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an array A and an integer B. A pair(i, j) in the array is a good pair
if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 */
public class GoodPair {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int B = 7;
        System.out.println(solve(list, B));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) + A.get(j)) == B) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
