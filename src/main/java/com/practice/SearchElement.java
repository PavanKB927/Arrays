package com.practice;

/* Question :
* You are given an integer T (number of test cases). You are given array A and an integer B
* for each test case. You have to tell whether B is present in array A or not.
* */
public class SearchElement {
    public static void main(String[] args) {
        int[] array = new int[]{};
        int B = 100;
        System.out.println("is Number Exists : "+isNumberExists(array,B));
    }

    private static boolean isNumberExists(int[] array, int number){
        for(int i: array){
            if(i == number) return true;
        }
        return false;
    }
}
