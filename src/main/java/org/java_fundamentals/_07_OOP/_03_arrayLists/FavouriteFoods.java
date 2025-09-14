package org.java_fundamentals._07_OOP._03_arrayLists;

import java.util.ArrayList;

public class FavouriteFoods {
    public static void main(String[] args) {
        ArrayList <String> foods = new ArrayList<>();
        foods.add("pizza");
        foods.add("pasta");
        foods.add("burger");

        System.out.println(foods);
        boolean isRemoved = foods.remove("pasta");
        if (isRemoved){
            System.out.println("Item removed successfully.");
        }else {
            System.out.println("Item cant be found.");
        }
        System.out.println(foods);


        isRemoved = foods.remove("pasta");
        if (isRemoved){
            System.out.println("Item removed successfully.");
        }else {
            System.out.println("Item cant be found.");
        }
        System.out.println(foods);



    }
}
