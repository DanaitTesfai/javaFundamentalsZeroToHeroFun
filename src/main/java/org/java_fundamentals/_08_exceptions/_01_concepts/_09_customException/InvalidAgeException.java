package org.java_fundamentals._08_exceptions._01_concepts._09_customException;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
