package org.java_fundamentals._08_exceptions._01_concepts;

import java.util.Scanner;

public class _01_DivisionByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            int div = num1 / num2;

            System.out.println("The division result is " + div);

        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }

    }
}
