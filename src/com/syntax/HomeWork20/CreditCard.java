package com.syntax.HomeWork20;

public class CreditCard {
     /*Create a class CreditCard and define variable balance and interest. Create an instance method
    that will calculate interest based on the given balance. Create 2 subclasses: Visa and AX. In AX class
    override method calculate interest. Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    CreditCard(double balance) {
        this.balance = balance;
    }

    void calculateInterest() {
        interest = balance * 0.18;
        System.out.println("Yearly Interest is " + interest);
    }
}

class Visa extends CreditCard {
    Visa(double balance) {
        super(balance);
    }
}

class AX extends CreditCard {
    AX(double balance) {
        super(balance);

    }

    @Override
    void calculateInterest() {
        interest = balance * 0.13;
        System.out.println("AX Yearly Interest is " + interest);
    }


}

