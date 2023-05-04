package com.scaler.problems.array;

import java.util.ArrayList;

/*
Given an array of integers A and multiple values in B, which represents the
number of times array A needs to be left rotated.
Find the rotated array for each value and return the result in the from of a
matrix where ith row represents the rotated array for the ith value in B.
 */
public class MultipleLeftRotationsArray {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int x : B) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < A.size(); i++)
                temp.add(A.get((i + x) % A.size()));
            ans.add(temp);
        }
        return ans;
    }
}
