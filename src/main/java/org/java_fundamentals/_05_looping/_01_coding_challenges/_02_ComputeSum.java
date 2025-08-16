package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _02_ComputeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i < number)
                System.out.print(i + "+");
            else
                System.out.print(i + "=");
            sum += i;
        }

        System.out.println(sum);


        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        sum = 0;
        String values = "";
        for (int i = 1; i <= number; i++) {
            values += i < number ? (i + "+") : (i + "=");
            sum += i;
        }

        System.out.println(values + sum);

    }
}
