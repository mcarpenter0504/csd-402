/* 
Name: Madilyn Carpenter
Date: 11/16/2025
Assignment 10
Purpose: Defines the abstract base class that stores common division information and requires a display method.
*/

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
