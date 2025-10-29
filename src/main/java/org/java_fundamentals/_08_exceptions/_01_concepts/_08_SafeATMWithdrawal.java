package org.java_fundamentals._08_exceptions._01_concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _08_SafeATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter you balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter the amount to be withdrawn: ");
            double withdrawal  = sc.nextDouble();

            if (withdrawal > balance){
                throw new Exception("Insufficient funds!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Invalid input.");
        }
    }
}
