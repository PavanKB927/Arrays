package com.practice;

/* Question :
* You have a newspaper which has A lines to read.
* You decided to start reading the 1st line from Monday.
* You are given a schedule, B, where B[i] = number of lines you can read on that day.
* You are very strict in reading the newspaper and you will read as much as you can every day.
* Determine and return, which day of the week you will read the last line of the newspaper.
* */
public class ReadingNewspaper {
    public static void main(String[] args) {
        int A = 100;
        int [] B = new int []{15, 20, 20, 15, 10, 30, 45};
        System.out.println(dayOfLastLineRead(A,B));
    }

    private static int dayOfLastLineRead(int A, int[] B){
        int completedReadingLine = 0;
        int day = 0;
        for(int i = 0; i<B.length;i++){
            completedReadingLine += B[i];
            if(completedReadingLine >= A){
                day = i+1;
                break;
            }
            if(i == B.length) i = 0;
        }
        return day;
    }

}
