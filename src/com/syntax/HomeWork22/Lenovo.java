package com.syntax.HomeWork22;

public class Lenovo extends Computer {
    Lenovo(String name, int price) {
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

    void foldable() {
        System.out.println("Lenovo laptop is foldable");
    }
}
