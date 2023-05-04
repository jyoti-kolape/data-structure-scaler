package com.scaler.problems.array;

/*
You are given an integer array A. You have to
find the second largest element/value in the array or report that no such element exists.
 */
public class SecondLargest {
    public static void main(String[] args) {
        Long[] A = {2l, 1l, 2l};
        System.out.println(getSecondLargestElement(A));
    }

    public static long getSecondLargestElement(Long[] A) {
        long first, second;
        first = second = A[0];
        if (A == null || A.length < 2) {
            return -1;
        } else {
            for (int i = 0; i < A.length; i++) {
                if (A[i] > first) {
                    second = first;
                    first = A[i];
                } else if (A[i] > second && A[i] != first) {
                    second = A[i];
                }
            }
            return second;
        }

    }
}
