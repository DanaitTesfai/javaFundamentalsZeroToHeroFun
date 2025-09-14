package org.java_fundamentals._07_OOP._01_classedAndObjects._08_restaurantOrder;

public class Main {
    public static void main(String[] args) {
        RestaurantOrder restaurantOrder = new RestaurantOrder();

        restaurantOrder.orderId = "O123";
        restaurantOrder.customerName = "Alice";
        restaurantOrder.foodItem = "Burger";
        restaurantOrder.price = 8.5;

        restaurantOrder.placeOrder();
        restaurantOrder.cancelOrder();
        restaurantOrder.displayOrderInfo();
    }
}
