package org.java_fundamentals._07_OOP._07_interface._07_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation.");
        System.out.println("1.Add  2.Subtract? ");
        int option = scanner.nextInt();

        Operation op;
        if (option == 1){
            op = new AddOperation();
        } else if (option == 2) {
            op = new SubtractionOperation();
        }else {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int result = op.calculate(a,b);
        System.out.println("Result = " + result);


    }
}
