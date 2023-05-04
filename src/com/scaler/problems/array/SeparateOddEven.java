package com.scaler.problems.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
You are given an integer T denoting the number of test cases.
For each test case, you are given an integer array A.

You have to print the odd and even elements of array A in 2 separate lines.

NOTE: Array elements should have the same relative order as in A.
 */
public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            int[] A = new int[N];
            for (int k = 0; k < N; k++) {
                A[k] = scan.nextInt();
            }
            solve(A);
            System.out.println();
        }
    }

    public static void solve(int[] A) {
        List<Integer> evenA = new ArrayList<>();
        List<Integer> oddA = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenA.add(A[i]);
            } else if (A[i] % 2 != 0) {
                oddA.add(A[i]);
            }
        }

        for (int x : oddA) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x : evenA) {
            System.out.print(x + " ");
        }
    }
}
