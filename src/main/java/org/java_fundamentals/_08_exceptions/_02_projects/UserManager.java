package org.java_fundamentals._08_exceptions._02_projects;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserManager {
    ArrayList<User> users = new ArrayList<>();

    public UserManager(){
        try{
            users.add(new User("admin", "1234", "ADMIN", true));
            users.add(new User("staff1", "pass", "STAFF", true));
        }catch (InvalidInputException e){
            System.out.println("Seeding users failed: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Unexpected error occurred.");
        }
    }


    public User authenticate(String userName,String passWord) throws UserNotFoundException{
        for (User u: users){
            if (u.getUsername().equalsIgnoreCase(userName) && u.getPassword().equals(passWord) && u.isActive()){
                return u;
            }
        }
        throw new UserNotFoundException("Invalid credentials or inactive account.");
    }





    public boolean addUser(User user){
        if (users.contains(user)){
            return false;
        }
        users.add(user);
        return true;
    }





    public boolean deactivateUser(String userName){
        for (User u: users){
            if (u.getUsername().equalsIgnoreCase(userName)){
                u.setActive(false);
                return true;
            }
        }
        return false;
    }





    public void listUsers(){
        if (users.isEmpty()){
            return;
        }
        for (User u: users){
            u.displayInfo();
        }
    }
}
