package com.syntax.HomeWork22;

public class HP extends Computer {
    HP(String name, int price) {
        super(name, price);
    }

    @Override
    void getName() {
        super.getName();
    }

    @Override
    void getPrice() {
        super.getPrice();
    }

    void getModel() {
        System.out.println("Model of " + name + " is Envy");
    }
}
