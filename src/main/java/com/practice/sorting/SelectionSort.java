package com.practice.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(new int[]{5,10,23,1,50,6});
    }

    private static void selectionSort(int[] array) {
        int length = array.length;
        for(int i=0;i<length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<length;j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            // swap with min value
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println("Sorted Array :"+ Arrays.toString(array));
    }
}
