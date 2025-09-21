package org.java_fundamentals._06_arrays._01_codingChallenges;

import java.util.Scanner;

public class _06_StudentMarkSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = input.nextInt();
        input.nextLine();

        String[] names = new String[numberOfStudents];
        int[][] marks = new int[numberOfStudents][numberOfSubjects];

        double[] total = new double[numberOfStudents];

        //input
        for (int i = 0 ; i < numberOfStudents ; i++){
            System.out.print("Enter name for Student " + (i+1) + ": ");
            names[i] = input.nextLine();

            System.out.println("Enter marks for " + names[i] + ":");

            for (int j = 0 ; j < numberOfSubjects ; j++){
                System.out.print("Subject " + (j+1) + ": ");
                marks[i][j] = input.nextInt();
                total[i] += marks[i][j];

            }
            input.nextLine();

        }

        // header
        double highestScore = -1;
        String topScorer = "";
        System.out.println("Student Marks Report:");
        System.out.print("Name\t");
        for (int i = 0 ; i< numberOfSubjects ; i++){
            System.out.print("Sub"+ (i+1) + "\t");
        }
        System.out.println("Total\tAverage");


        //content
        for (int i = 0 ; i<numberOfStudents;i++){
            double average = total[i]/numberOfSubjects;
            System.out.print(names[i] + "\t" );
            for (int j = 0 ; j < numberOfSubjects ; j++){
                System.out.print(marks[i][j] + "\t");

            }
            System.out.println(total[i] + "\t" + average);

            if (average>highestScore){
                highestScore =average;
                topScorer = names[i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Topper: " + topScorer + " with average = " + highestScore);


    }
}
