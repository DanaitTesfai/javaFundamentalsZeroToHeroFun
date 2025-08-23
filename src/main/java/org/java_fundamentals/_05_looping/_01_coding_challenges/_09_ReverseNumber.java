package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _09_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Original number: " + number);
        int reversedNumber = 0 ;
        while (number > 0){
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
