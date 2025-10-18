package org.java_fundamentals._07_OOP._07_interface._09_megaMart;

public class ElectronicProduct extends Product{
    private int warrantyYears;

    public ElectronicProduct(String productId, String name, double basePrice, int warrantyYears) {
        super(productId, name, basePrice);
        this.warrantyYears = warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }



    @Override
    public double calculateBill() {
        return super.getBasePrice()*1.15;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Electronic] ID: " + getProductId() + " | Name: " + getName() +
                "  | Base: $" + getBasePrice() + " | Warranty: " + warrantyYears + " years " + " | Final Price: " + calculateBill());
    }
}
