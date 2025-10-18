package org.java_fundamentals._07_OOP._07_interface._09_megaMart;

import java.util.Objects;

public class Product implements Displayable, Billable{
    private String productId;
    private String name;
    private double basePrice;

    public Product(String productId, String name, double basePrice) {
        setProductId(productId);
        setName(name);
        setBasePrice(basePrice);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        if (productId != null && productId.matches("[A-Za-z0-9]+"))
            this.productId = productId;
        else
            this.productId = "UNKNOWN";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name != null && !name.trim().isEmpty()) ? name : "UNNAMED";
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice > 0 ? basePrice : 0;
    }

    @Override
    public double calculateBill() {
        return 0;
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productId);
    }

    @Override
    public String toString() {
        return "ID: " + productId + " | Name: " + name + "  | Base: $" + basePrice;
    }
}
