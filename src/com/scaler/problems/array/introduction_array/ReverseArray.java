package com.scaler.problems.array.introduction_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
You are given a constant array A.
You are required to return another array which is the reversed form of the input array.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr = {1,1,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(solve(list));
    }

    public static ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = A.size() - 1; i >= 0; i--) {
            ans.add(A.get(i));
        }
        return ans;
    }
}
