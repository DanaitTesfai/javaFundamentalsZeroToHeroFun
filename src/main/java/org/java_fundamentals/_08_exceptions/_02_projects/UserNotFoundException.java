package org.java_fundamentals._08_exceptions._02_projects;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }
}
