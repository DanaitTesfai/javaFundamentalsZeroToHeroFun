package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

import java.util.Objects;

public class User {
    private String userName;
    private String passWord;
    private String role;
    private boolean isActive;

    public User(String userName, String passWord, String role, boolean isActive) {
        setUserName(userName);
        setPassWord(passWord);
        setRole(role);
        this.isActive = isActive;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName != null && !userName.trim().isEmpty() ? userName : "user" ;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord != null && !passWord.trim().isEmpty() ? passWord : "pass";
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (role.equalsIgnoreCase("admin") || role.equalsIgnoreCase("staff")){
            this.role = role;
        }else {
            this.role = "Staff";
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public boolean isAdmin(){
        return role.equalsIgnoreCase("admin");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }

    public void displayInfo(){
        System.out.println("Username: "+ userName + "Role: " + role +"Active status: " + isActive);
    }
}
