package org.java_fundamentals._05_looping._01_coding_challenges;

import java.util.Scanner;

public class _03_PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for(int i = 2 ; i <= number ; i+=2){
            if (i < number){
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }

        }


        int i = 2;
        while (i <= number){
            if (i < number)
                System.out.print(i + ", ");
            else
                System.out.print(i);
            i += 2;

        }



    }
}
