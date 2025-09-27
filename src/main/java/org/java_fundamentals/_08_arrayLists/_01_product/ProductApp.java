package org.java_fundamentals._08_arrayLists._01_product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Product 1");
        p1.setPrice(111);
        products.add(p1);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Product 2");
        p2.setPrice(222);
        products.add(p2);

        Product p3 = new Product();
        p3.setId(3);
        p3.setName("Product 3");
        p3.setPrice(333);
        products.add(p3);

        Product p4 = new Product();
        p4.setId(4);
        p4.setName("Product 4");
        p4.setPrice(444);
        products.add(p4);

        Product p5 = new Product();
        p5.setId(5);
        p5.setName("Product 5");
        p5.setPrice(555);
        products.add(p5);

        for(Product p : products){
            p.printDetails();
        }

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        boolean isFound = false;
        for (Product p : products){
            if (p.getName().equals(productName)){
                p.printDetails();
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Product not found!");
        }



    }
}
