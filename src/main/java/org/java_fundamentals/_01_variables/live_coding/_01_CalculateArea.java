package org.java_fundamentals._01_variables.live_coding;

import java.util.Scanner;

public class _01_CalculateArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        double area = length * width;
        System.out.print("Area of rectangle: " + area);


    }
}
