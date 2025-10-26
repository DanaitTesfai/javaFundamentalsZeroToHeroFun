package org.java_fundamentals._08_exceptions._01_concepts._05_customException;

import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (age < 18){
                throw new InvalidAgeException("Age must be 18 or older!");
            }

            System.out.println("Age is " + age);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Invalid input.");
        }catch (Exception e){
            System.out.println("Unexpected error occurred.");
        }finally {
            sc.close();
        }
    }
}
