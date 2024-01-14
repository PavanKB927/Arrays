package com.practice.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(new int[]{2,13,5,79,4});
    }

    private static void bubbleSort(int[] array) {
        int length = array.length;
        for(int i=0;i<length;i++){
            for(int j=i+1; j< length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("output array :"+ Arrays.toString(array));
    }
}
