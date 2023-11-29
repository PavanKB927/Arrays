package com.practice;

import java.util.Arrays;

/*
* Given an array of integers A and multiple values in B,
*  which represents the number of times array A needs to be left rotated.
* Find the rotated array for each value and
* return the result in the form of a matrix where ith row represents the rotated array for the ith value in B.
* */
public class MultipleLeftRotationsOfTheArray {
    public static void main(String[] args) {
        // given input args
        int[] A = new int[]{1,2,3,4,5};
        int[] B = new int[]{2,3};
        int length = B.length;
        int arrayLength = A.length;
        int[][] result = new int[length][arrayLength];

        // for each value of B rotate and store in result
        for(int i=0; i < length; i++){
            int rotatedBy = B[i];
            int[] arrayCopy = A.clone();
            // rotate complete array
            reverseArray(0,arrayLength-1, arrayCopy);
            // rotate before B
            reverseArray(0,rotatedBy-1,arrayCopy);
            // rotate from B to last
            reverseArray(rotatedBy,arrayLength-1,arrayCopy);

            // insert array to result
            for(int j=0;j<arrayLength;j++){
                result[i][j] = arrayCopy[j];
            }
        }
        System.out.println("Result array :: "+ Arrays.deepToString(result));
    }

    private static void reverseArray(int first, int last, int[] array){
        while(first < last){
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
    }
}
