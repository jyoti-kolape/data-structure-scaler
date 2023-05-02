package com.scaler.problems.array;


/*
Given an integer array A of size N and an integer B, you have to print the same array
after rotating it B times towards the right.
*/

public class RotationGame {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        int B = 2;
        System.out.println(rotateGame(A, B));
    }

    public static int[] rotateGame(int[] A, int B) {
        B = B % A.length;
        reverse(A, 0, A.length - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, A.length - 1);
        return A;
    }

    public static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}
