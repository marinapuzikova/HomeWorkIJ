package com.syntax.HomeWork22;

public class Apple extends Computer {
    Apple(String name, int price) {
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

    void getAppleUrl() {
        System.out.println("http://apple.com");
    }
}
