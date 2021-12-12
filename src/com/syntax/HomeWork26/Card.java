package com.syntax.HomeWork26;

public abstract class Card {
    /*
    Create a Card class that will have implemented  and unimplemented methods
    and a constructor that will initializes credit card type.
    Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String cardType;
    double currentAPR;
    double balance;
    Card( String cardType) {

        this.cardType = cardType;
    }
    public void balance(){

        System.out.println("Credit card "+cardType + " has a balance of " + balance);
    }
    abstract void aprFee();

}
class City extends Card{
    public City(String cardType,double currentAPR,double balance) {
        super(cardType);
        super.currentAPR=currentAPR;
        super.balance=balance;
    }

    @Override
    public void balance() {

        System.out.println("Credit card "+cardType + " has a balance of " + balance);
    }

    @Override
    void aprFee() {
        System.out.println("Current APR fee of "+cardType+" is "+(currentAPR/12)*balance);

    }
}
class Chase extends Card{
    public Chase(String cardType,double currentAPR,double balance) {
        super(cardType);
        super.currentAPR=currentAPR;
        super.balance=balance;
    }

    @Override
    public void balance() {

        System.out.println("Credit card "+cardType + " has a balance of " + balance);
    }

    @Override
    void aprFee() {
        System.out.println("Current APR fee of "+cardType+" is "+(currentAPR/12)*balance);
    }
}
class Discover extends Card{
    public Discover(String cardType,double currentAPR,double balance) {
        super(cardType);
        super.currentAPR=currentAPR;
        super.balance=balance;
    }

    @Override
    public void balance() {

        System.out.println("Credit card "+cardType + " has a balance of " + balance);
    }

    @Override
    void aprFee() {
        System.out.println("Current APR fee of "+cardType+" is "+(currentAPR/12)*balance);
    }
}

