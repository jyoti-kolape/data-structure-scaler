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
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int index = (i + B) % A.length;
            ans[index] = A[i];
        }
        return ans;
    }
}
