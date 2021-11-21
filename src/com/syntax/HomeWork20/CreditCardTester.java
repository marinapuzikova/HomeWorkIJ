package com.syntax.HomeWork20;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(15000);
        creditCard.calculateInterest();
        Visa visa = new Visa(12000);
        visa.calculateInterest();
        AX ax = new AX(5000);
        ax.calculateInterest();
    }
}
