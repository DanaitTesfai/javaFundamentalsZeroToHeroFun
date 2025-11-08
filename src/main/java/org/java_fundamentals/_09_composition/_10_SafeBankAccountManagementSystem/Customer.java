package org.java_fundamentals._09_composition._10_SafeBankAccountManagementSystem;

public class Customer extends User{
    private Account account = new Account(); //Composition - Customer has an account.


    public Customer(String username, String password) throws InvalidInputException {
        super(username, password,"CUSTOMER", false);  // Customer must be approved by admin first.
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer  |  Username: " + getUsername() + ", Role: " + getRole() +
                ", Approval state: " + isApprovalState() + ", Balance: $" + String.format("%.2f",account.getBalance()));
    }
}
