package com.scaler.problems.array;
/*
Take input an array A of size N and write a
program to print maximum and minimum elements of the input.
The only line of the input would contain a single integer N that represents the
length of the array followed by the N elements of the input array A.
 */
public class MaxMinArray {
    public static void main(String[] args) {
        int[] A = {5, 1, 2, 3, 4, 5};
        getMinMax(A);
    }

    public static void getMinMax(int[] A) {
        int min = A[0];
        int max = A[0];

        for (int i = 0; i < A.length; i++) {
            if (min > A[i]) {
                min = A[i];
            }

            if (max < A[i]) {
                max = A[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
