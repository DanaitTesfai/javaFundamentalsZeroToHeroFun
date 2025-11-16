package org.java_fundamentals._10_fileHandling._02_bufferedApi._02_miniProjects;

public class Rental {
    Vehicle rentedVehicle;
    private String rentalDate;

    public Rental(Vehicle rentedVehicle, String rentalDate) {
        this.rentedVehicle = rentedVehicle;
        this.rentalDate = rentalDate;
    }

    public Vehicle getRentedVehicle() {
        return rentedVehicle;
    }

    public void setRentedVehicle(Vehicle rentedVehicle) {
        this.rentedVehicle = rentedVehicle;
    }

    public String getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(String rentalDate) {
        this.rentalDate = rentalDate;
    }

    @Override
    public String toString() {
        return rentedVehicle.getModel() + " rented on " + rentalDate;
    }
}
