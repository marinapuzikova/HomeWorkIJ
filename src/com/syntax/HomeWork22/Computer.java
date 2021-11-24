package com.syntax.HomeWork22;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    String name;
    int price;

    Computer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void getName() {
        System.out.println("Brand of this computer is " + name);
    }

    void getPrice() {
        System.out.println("Price of this computer is " + price);
    }
}
