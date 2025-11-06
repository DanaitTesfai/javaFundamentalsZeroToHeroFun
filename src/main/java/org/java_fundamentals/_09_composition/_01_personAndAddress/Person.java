package org.java_fundamentals._09_composition._01_personAndAddress;

public class Person {
    String name;
    Address address;


    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo(){
        //System.out.println(name+ " lives in " + address.getCity() + ", " + address.getCountry());
        System.out.print(name+ " lives in ");
        address.displayInfo();
    }


}
