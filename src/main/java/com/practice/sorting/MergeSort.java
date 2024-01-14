package com.practice.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{10,4,16,99,28,6};
        mergeSort(array,0, array.length-1);
        System.out.println("Sorted Array :"+ Arrays.toString(array));
    }

    private static void mergeSort(int[] array,int left,int right) {
        if(left < right){
            int mid = (left + right)>>1; // (left + right)/2
            mergeSort(array,left,mid);
            mergeSort(array,mid+1,right);

            // merge sorted array
            mergeArr(array,left,mid,right);
        }
    }

    private static void mergeArr(int[] array, int left, int mid, int right) {
        // find the sizes for twp arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create two temp arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n1];

        // copy the data to temp arrays
        for(int i=0;i<n1;i++){
            leftArray[i] = array[left+i];
        }
        for(int i=0;i<n2;i++){
            rightArray[i] = array[mid+1+i];
        }

        // merge two temp arrays
        int i=0,j=0; // initializing indices of two arrays
        int k = left;
        while (i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // add the pending elements to array
        while(i < n1){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
