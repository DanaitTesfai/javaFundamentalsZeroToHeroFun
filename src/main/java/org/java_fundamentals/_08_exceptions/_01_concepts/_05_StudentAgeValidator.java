package org.java_fundamentals._08_exceptions._01_concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05_StudentAgeValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter age: ");
            int age = input.nextInt();

            if (age < 18 || age > 35){
                throw new Exception("Age out of range.");
            }
            System.out.println("Age is " + age);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
