package com.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* Given an array A and an integer B.
* A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
* Check if any good pair exist or not.
* */
public class GoodPair {
    public static void main(String[] args) {
        int[] A = new int[]{1,3,2,4};
        int B = 19;
        isGoodPair(A, B);
    }

    private static void isGoodPair(int[] A, int B) { //-> OverAll TimeComplexity O(NlogN)
        // sort array
        Arrays.sort(A); // Time Complexity - O(NlogN)
        System.out.println("sorted array : "+Arrays.toString(A));
        int first = 0, last = A.length-1;
        while (first < last){ // Time Complexity - O(N)
            int val = A[first] + A[last];
            if(val == B) {
                System.out.println("Good Pair..");
                return;
            }else if(val > B) last--;
            else first++;
        }
        System.out.println("Bad Pair..");
        return;
    }
}
