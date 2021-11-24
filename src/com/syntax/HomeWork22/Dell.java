package com.syntax.HomeWork22;

public class Dell extends Computer {
    Dell(String name, int price) {
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

    void ram() {
        System.out.println(name + " has 8GB RAM");
    }
}

