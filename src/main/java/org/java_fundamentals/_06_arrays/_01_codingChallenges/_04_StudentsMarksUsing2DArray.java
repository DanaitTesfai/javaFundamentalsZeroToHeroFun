package org.java_fundamentals._06_arrays._01_codingChallenges;

import java.util.Arrays;

public class _04_StudentsMarksUsing2DArray {
    public static void main(String[] args) {
        int[][] marks = {{85,90,78}, {68,97,82}, {90,61,89}};

        System.out.println("Student marks table: ");

        for (int i = 0 ; i< marks.length ; i++){
            System.out.println("Student " + (i+1) +":");
            //  System.out.println(Arrays.toString(marks[i]));

            for (int j = 0 ; j < marks[i].length ; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();

        }
    }
}
