package org.java_fundamentals._07_OOP._01_classedAndObjects._08_restaurantOrder;

public class RestaurantOrder {
    String orderId;
    String customerName;
    String foodItem;
    Double price;

    public void placeOrder(){
        System.out.println("Order " + orderId + " placed for " + customerName);
    }

    public void cancelOrder(){
        System.out.println("Order " + orderId + " has been canceled.");
    }

    public void displayOrderInfo(){
        System.out.println("Order Info:");
        System.out.println("ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Price: $" + price);
    }
}
