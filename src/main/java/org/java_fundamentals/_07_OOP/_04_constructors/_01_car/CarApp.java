package org.java_fundamentals._07_OOP._04_constructors._01_car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2021);
        Car car3 = new Car("BMW", "3 Series", 2022);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("Traditional for loop");
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }


        System.out.println("Enhanced for loop");
        for(Car c : cars){
            System.out.println(c);
        }

        System.out.print("Enter car type to search: ");
        String carWanted = sc.nextLine();


    }
}
