package com.scaler.problems.array.introduction_array;

/*
You are given an integer T (number of test cases).
You are given array A and an integer B for each test case.
You have to tell whether B is present in array A or not.
 */
public class SearchElement {
    public static void main(String[] args) {
        int[] A = {4, 1, 5, 9, 1};
        int B = 5;
        System.out.println(solve(A, B));

    }

    public static int solve(int[] A, int B) {
        int isPresent = 0;
        if (A.length == 0) {
            return isPresent;
        } else {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == B) {
                    isPresent = 1;
                }
            }
        }
        return isPresent;
    }
}
