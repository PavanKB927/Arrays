package com.practice.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        insertionSort(new int[]{90,1,35,6,70});
    }

    private static void insertionSort(int[] array) {
        int length = array.length;
        for(int i=1;i<length;i++){
            int key = array[i];
            int j = i-1;
            while(j >= 0 && key <= array[j]){
                array[j+1] = array[j];
                --j; // j = j-1;
            }
            array[j+1] = key;
        }
        System.out.println("Sorted Array :"+ Arrays.toString(array));
    }
}
