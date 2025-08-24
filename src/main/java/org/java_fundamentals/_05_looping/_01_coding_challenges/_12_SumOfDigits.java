package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _12_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number ;
        int sum = 0 ;
        while(number > 0) {
            int digit = number % 10 ;
            sum += digit;
            number /= 10;
            System.out.print(digit + " + ");
        }
        System.out.println(" = " + sum);

    }
}
