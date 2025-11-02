package org.java_fundamentals._09_composition._01_PersonAndAddress;

public class Address {
    private String city;
    private String country;

    public Address(String city, String country){
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }
}
