package com.practice;

/*
* You are given an integer array A.
* You have to find the second-largest element/value in the array
* or report that no such element exists.
* */
public class SecondLargest {
    public static void main(String[] args) {
        // input array :-
        int[] array = new int[]{2, 1, 2};
        secondLargestElement(array);
    }

    private static void secondLargestElement(int[] array) {
        // if array length is 1 or less
        if(array.length <= 1){
            System.out.println("no such element exists");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i: array){
            if(i > firstMax){
                firstMax = i;
            }
        }
        for(int j: array){
            if(j > secondMax && j < firstMax){
                secondMax = j;
            }
        }
        System.out.println("Second max element : "+secondMax);
    }
}
