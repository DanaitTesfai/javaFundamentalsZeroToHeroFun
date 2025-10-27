package org.java_fundamentals._07_OOP._09_realLifeProjects._02_royalStayHotel;

import java.util.Objects;

public class User {
    private String username;
    private String password;
    private String role;
    private boolean active;

    public User(String username, String password, String role, boolean active) {
        setUsername(username);
        setPassword(password);
        setRole(role);
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username != null && !username.trim().isEmpty() ? username : "Staff";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password != null && password.matches("[A-Aa-z0-9]+") ? password : "1234";
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role.equalsIgnoreCase("Admin") || role.equalsIgnoreCase("Staff") ? role : "User";
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAdmin(){
        return role.equalsIgnoreCase("Admin");
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

    public void displayInfo(){
        System.out.println("Username: " + username + ", Role: " + role + ", Active status: " + active);
    }
}
