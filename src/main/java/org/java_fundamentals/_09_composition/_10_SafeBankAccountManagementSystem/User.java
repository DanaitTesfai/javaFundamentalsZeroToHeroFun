package org.java_fundamentals._09_composition._10_SafeBankAccountManagementSystem;

import java.util.Objects;

abstract public class User {
    private String username;
    private String password;
    private String role;
    private boolean approvalState;

    public User(String username, String password, String role, boolean approvalState) throws InvalidInputException{
        setUsername(username);
        setPassword(password);
        this.role = role;
        this.approvalState = approvalState;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws InvalidInputException{
        if (username != null || !username.isBlank()){
            this.username =  username;
        }else {
            throw new InvalidInputException("Username can not be empty.");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidInputException{
        if (password == null || password.isBlank()) throw new InvalidInputException("Password cannot be blank.");
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isApprovalState() {
        return approvalState;
    }

    public void setApprovalState(boolean approvalState) {
        this.approvalState = approvalState;
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
        System.out.println("Username: " + username + ", Role: " + role + ", Approval state: " + approvalState);
    }
}
