package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/*
* Given an integer array A of size N and an integer B,
* you have to print the same array after rotating it B times towards the right.
* */
public class RotationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        int i = 0;
        while(arraySize > i){
            A[i] = scanner.nextInt();
            i++;
        }
        int B = scanner.nextInt();
        B = B%arraySize;
        System.out.println("Input Array :: "+ Arrays.toString(A));
        rotateArray(A,B);
    }

    private static void rotateArray(int[] A, int B) {
        int length = A.length-1;
        // reverse the complete array elements
        reverseArray(0,length,A);

        // reverse the elements before Bth length
        reverseArray(0,B-1, A);

        // reverse the elements from B to last
        reverseArray(B, length,A);

        System.out.println("Rotated  Array by "+B+" times is : "+Arrays.toString(A));
    }

    private static void reverseArray(int first, int last, int[] A) {
        while(first < last){
            int temp = A[first];
            A[first] = A[last];
            A[last] = temp;
            first++;
            last--;
        }
    }
}
