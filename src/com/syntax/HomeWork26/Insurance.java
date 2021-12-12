package com.syntax.HomeWork26;

public abstract class Insurance {
    /*
    Create a class Insurance that will have an attribute as insuranceName
    and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel
    and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public String insuranceName;//whenever we have instance variable we should always create a Constructor

    public Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;
    //String insuranceName if same name field is present in child class and parent class then we should use super keyword with field name
    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    @Override
    public void getQuote() {
        System.out.println("We received "+insuranceName +" insurance quote for the car model " + carModel);
    }@Override
    public void cancelInsurance() {

        System.out.println(insuranceName + " for the car "+ carModel + " is cancelled.");
    }}

class Pet extends Insurance {
    String petType;
    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }
    @Override
    public void getQuote() {
        System.out.println("We received "+insuranceName + " insurance quote for the pet "+ petType );
    }@Override
    public void cancelInsurance() {
        System.out.println(insuranceName + " for the pet type: " + petType+" is cancelled");
    }}

class Health extends Insurance {
    public Health(String insuranceName) {
        super(insuranceName);}
    @Override
    public void getQuote() {
        System.out.println("We received "+insuranceName+" quote");
    }@Override
    public void cancelInsurance() {
        System.out.println(insuranceName +" is cancelled" );
    }
}
