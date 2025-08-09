package org.java_fundamentals._03_Operators;

import java.util.Scanner;

public class _03_RestaurantBillCalculator {
    public static void main(String[] args) {
        double serviceCharge = 18.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Meal Cost: $");
        double mealCost = scanner.nextDouble();

        System.out.println("Service Charge: $" + serviceCharge);

        double totalBill = mealCost + serviceCharge;
        System.out.println("Total Bill: $" + totalBill);

        String paymentMethod = totalBill > 200 ? "card" : "cash";
        System.out.println("Pay by: " + paymentMethod);



    }
}
