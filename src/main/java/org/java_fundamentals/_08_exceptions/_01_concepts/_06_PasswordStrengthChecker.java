package org.java_fundamentals._08_exceptions._01_concepts;

import java.util.Scanner;

public class _06_PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (password.length() < 6 ){
                throw new Exception("Password must not be less than six characters.");
            }
            /*
            boolean hasDigit = false;
            for (char c:password.toCharArray()){  //admin123---->['a','d','m','i','n','1','2','3']
                if (Character.isDigit(c)){
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit){
                throw new Exception("Password must contain a digit.");
            }

             */
            if (!password.matches(".*\\d+.*")){
                throw new Exception("Password must contain a digit.");
            }
            System.out.println("Your password is " + password);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
