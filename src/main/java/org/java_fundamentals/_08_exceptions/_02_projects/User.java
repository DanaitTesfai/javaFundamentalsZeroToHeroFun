package org.java_fundamentals._08_exceptions._02_projects;

import java.util.Objects;

public class User {
    private String username;
    private String password;
    private String role;
    private boolean active;

    public User(String username, String password, String role, boolean active) throws InvalidInputException{
        setUsername(username);
        setPassword(password);
        setRole(role);
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws InvalidInputException {
        if (username != null && !username.isBlank()){
            this.username = username;
        }else {
            throw new InvalidInputException("Username cannot be blank.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidInputException{
        if (password != null && !password.isBlank()){
            this.password = password;
        }else {
            throw new InvalidInputException("Password cannot be blank.");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) throws InvalidInputException {
        if (role != null && !role.isBlank()){
            this.role = role;
        }else {
            throw new InvalidInputException("Role cannot be blank.");
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAdmin() {
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

    public void displayInfo() {
        System.out.println("Username: " + username + ", Role: " + role + ", Active status: " + active);
    }

}
