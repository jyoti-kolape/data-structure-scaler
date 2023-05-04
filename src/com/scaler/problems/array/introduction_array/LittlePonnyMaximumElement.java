package com.scaler.problems.array.introduction_array;

/*
Little Ponny is given an array, A, of N integers. In a particular operation,
he can set any element of the array equal to -1.
He wants your help in finding out the minimum number of
operations required such that the maximum element of the resulting array is B.
If it is not possible, then return -1.
 */
public class LittlePonnyMaximumElement {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int B = 3;

        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        if (isPresent(A, B)) {
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] > B) {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    public static boolean isPresent(int[] A, int B) {
        boolean isPresent = false;
        if (A.length == 0) {
            return isPresent;
        } else {
            for (int j = 0; j < A.length; j++) {
                if (A[j] == B) {
                    isPresent = true;
                }
            }
        }
        return isPresent;
    }
}
