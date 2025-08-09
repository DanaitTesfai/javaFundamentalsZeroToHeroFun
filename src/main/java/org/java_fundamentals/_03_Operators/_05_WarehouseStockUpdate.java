package org.java_fundamentals._03_Operators;

import java.util.Scanner;

public class _05_WarehouseStockUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial stock: ");
        int initialStock = scanner.nextInt();

        System.out.print("Received: ");
        int received = scanner.nextInt();

        initialStock += received ;

        System.out.println("Updated Stock: " + initialStock);

    }



}
