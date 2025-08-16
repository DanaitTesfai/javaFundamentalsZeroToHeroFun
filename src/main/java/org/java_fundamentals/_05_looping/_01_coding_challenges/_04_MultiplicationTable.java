package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _04_MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            int multiplication = i * number ;

            System.out.println(number + " x " + i + " = " + multiplication);
        }
    }
}
