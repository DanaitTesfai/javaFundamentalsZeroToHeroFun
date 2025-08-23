package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _11_Comparing3Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInt = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondInt = input.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInt = input.nextInt();

        if (firstInt > secondInt && firstInt > thirdInt) {
            System.out.println(firstInt);
        } else if (secondInt > firstInt && secondInt > thirdInt) {
            System.out.println(secondInt);
        }else {
            System.out.println(thirdInt);
        }

        //Or
        //int largest = a > b ? a : b
        int largest = (firstInt > secondInt)
                ? (firstInt > thirdInt ? firstInt : thirdInt)
                : (secondInt > thirdInt ? secondInt : thirdInt);

        System.out.println(largest);
    }
}
