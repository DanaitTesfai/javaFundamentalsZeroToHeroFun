package org.java_fundamentals._09_composition._10_SafeBankAccountManagementSystem;

public class InvalidInputException extends Exception{
    public InvalidInputException(String message) {
        super(message);
    }
}
