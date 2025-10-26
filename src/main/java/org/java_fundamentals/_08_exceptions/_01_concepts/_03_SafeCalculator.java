package org.java_fundamentals._08_exceptions._01_concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03_SafeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //withoutInvalidOperator(sc);
        withInvalidOperator(sc);
    }

    private static void withoutInvalidOperator(Scanner sc) {
        try {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            System.out.print("Choose an operator: 1.+  2.-  3.*  4./  : ");
            int operator = sc.nextInt();

            int result = 0;
            if (operator == 1) {
                result = num1 + num2;
            } else if (operator == 2) {
                result = num1 - num2;
            } else if (operator == 3) {
                result = num1 * num2;
            } else if (operator == 4) {
                result = num1 / num2;
            } else {
                System.out.println("Invalid input.");
            }
            System.out.println("The result is " + result);

        } catch (InputMismatchException e) {
            System.out.println("Wrong input type.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        } catch (Exception e) {
            System.out.println("Invalid operator");
        }
    }



    private static void withInvalidOperator(Scanner sc) {
        try {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            sc.nextLine();

            System.out.print("Choose an operator: +, -, *, / : ");
            String operator = sc.nextLine().trim();

            int result = 0;
            switch (operator){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    throw new Exception("Invalid operator used.");
            }
            System.out.println("The result is " + result);

        } catch (InputMismatchException e) {
            System.out.println("Wrong input type.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
