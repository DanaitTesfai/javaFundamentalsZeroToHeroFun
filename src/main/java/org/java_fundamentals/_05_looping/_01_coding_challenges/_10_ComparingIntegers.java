package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _10_ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInt = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondInt = input.nextInt();

        if (firstInt > secondInt) {
            System.out.println(firstInt);
        }else {
            System.out.println(secondInt);
        }
    }
}
