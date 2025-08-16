package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _01_PrintNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter up to which number you want to print: ");
        int inputNumber = input.nextInt();

        for (int i = 1; i <= inputNumber; i++){
            System.out.print(i + " ");
        }
        System.out.println();



    }
}
