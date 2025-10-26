package org.java_fundamentals._08_exceptions._01_concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_WrongInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int intNum = input.nextInt();
            System.out.println("The number you entered is " + intNum);

        }catch (InputMismatchException e){
            System.out.println("Please enter a number only.");
        }

    }
}
