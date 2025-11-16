package org.java_fundamentals._10_fileHandling._02_bufferedApi._02_miniProjects;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String username;
    private String password;

    ArrayList<Rental> rentals = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }

    public void addRental(Rental r){
        rentals.add(r);

    }

    public void showRentals(){
        if (rentals.isEmpty()){
            System.out.println("There are no cars rented.");
            return;
        }
        for (Rental r: rentals){
            System.out.println("- " + r);
        }

    }


}
