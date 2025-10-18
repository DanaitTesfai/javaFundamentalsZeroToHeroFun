package org.java_fundamentals._07_OOP._07_interface._09_megaMart;

public class GroceryProduct extends Product{
   private int expiryDays;

    public GroceryProduct(String productId, String name, double basePrice, int expiryDays) {
        super(productId, name, basePrice);
        this.expiryDays = expiryDays;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }
}
