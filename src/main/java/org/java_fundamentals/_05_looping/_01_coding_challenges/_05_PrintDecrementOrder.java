package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _05_PrintDecrementOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int i = number;  //Mutation, keeping the original value and modifying the copied value.
        while (i >= 1){
            System.out.println(i);
            i--;
        }
    }
}
