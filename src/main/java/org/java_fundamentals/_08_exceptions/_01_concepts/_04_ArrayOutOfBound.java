package org.java_fundamentals._08_exceptions._01_concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_ArrayOutOfBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int[] integers = {7,6,5,4,3};

            System.out.print("Enter an index number you want to print: ");
            int ind = scanner.nextInt();

            System.out.println("The number is " + integers[ind]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index number out of bound.");
        }catch (InputMismatchException e){
            System.out.println("Invalid input.");
        }catch (Exception e){
            System.out.println("Unexpected error occurred.");
        }

        System.out.println("Hello");
    }
}
