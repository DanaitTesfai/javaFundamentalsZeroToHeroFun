package org.java_fundamentals._09_composition._10_SafeBankAccountManagementSystem;

public class Admin extends User{

    public Admin(String username, String password) throws InvalidInputException {
        super(username, password, "ADMIN" , true);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin  |  Username: " + getUsername() + ", Role: " + getRole() + ", Approval state: " + isApprovalState());
    }
}
