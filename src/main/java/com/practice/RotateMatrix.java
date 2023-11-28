package com.practice;

import java.util.Arrays;

/*
* You are given a n x n 2D matrix A representing an image.
* Rotate the image by 90 degrees (clockwise).
* You need to do this in place.
* Note: If you end up using an additional array, you will only receive partial score.
* */
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] inputArray = new int[][]{ {1, 2,3},{4,5,6},{7,8,9}};
        rotate90Degree(inputArray);
    }

    private static void rotate90Degree(int[][] inputArray) {
        int length = inputArray.length;
        // interchange rows to columns
        for(int i = 0; i<length;i++){
            for(int  j = 0;j<length;j++) {
                if (j == i) break;
                else {
                    int temp = inputArray[i][j];
                    inputArray[i][j] = inputArray[j][i];
                    inputArray[j][i] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(inputArray));
        // interchange columns from first with last
        for(int i = 0;i<length;i++){
            int firstCol = 0, lastCol = length-1;
            while(firstCol < lastCol){
                int temp = inputArray[i][firstCol];
                inputArray[i][firstCol] = inputArray[i][lastCol];
                inputArray[i][lastCol] = temp;
                firstCol++;
                lastCol--;
            }
        }
        System.out.println(Arrays.deepToString(inputArray));
    }
}
