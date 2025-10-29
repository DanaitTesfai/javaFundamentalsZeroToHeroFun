package org.java_fundamentals._08_exceptions._01_concepts;

import java.util.Scanner;

public class _06_PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (password.length() < 6 || !password.matches("[A-Za-z0-9]+") ){
                throw new Exception("Password must contain letters and numebers.");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
