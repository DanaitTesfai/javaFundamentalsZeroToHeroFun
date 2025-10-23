package org.java_fundamentals._07_OOP._09_realLifeProjects._01_FitLifeGymManagementSystem;

import java.util.ArrayList;

public class UserManager {
    ArrayList<User> users = new ArrayList<>();

    public UserManager(){
        users.add(new User("admin","1234","Admin",true));
        users.add(new User("staff1","pass","Staff",true));
    }

    public User authenticate(String username, String password){
        for (User u: users){
            if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equals(password) && u.isActive()){
                return u;
            }
        }
        return null;

    }


    public boolean addUser(User user){
        if (users.contains(user)){
            System.out.println("User already exists.");
            return false;
        }else {
            users.add(user);
            return true;
        }

    }



    public boolean deactivateUser(String username){
        for (User u: users){
            if (u.getUsername().equalsIgnoreCase(username)){
                u.setActive(false);
                return true;
            }
        }
        return false;

    }



    public void listUsers(){
        if (users.isEmpty()){
            System.out.println("No user found");
        }else {
            for (User u: users){
                u.displayInfo();
            }
        }

    }
}
