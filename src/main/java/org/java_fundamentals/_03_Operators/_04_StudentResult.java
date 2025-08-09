package org.java_fundamentals._03_Operators;

import java.util.Scanner;

public class _04_StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Maths: ");
        double maths = scanner.nextDouble();

        System.out.print("Science: ");
        double science = scanner.nextDouble();

        /*

        String mathsResult = maths >= 50 ? "pass" : "fail";

        String scienceResult = science >= 50 ? "pass" : "fail";

        boolean isPass = (mathsResult == "pass" && scienceResult == "pass");
        System.out.println("Result: " + (isPass ? "pass" : "fail"));

         */

        String result = maths >= 50 && science >= 50 ? "pass" : "fail";
        System.out.println("Result: " + result);











    }
}
