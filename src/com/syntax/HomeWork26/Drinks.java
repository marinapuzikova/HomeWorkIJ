package com.syntax.HomeWork26;

import java.util.ArrayList;
import java.util.List;

public class Drinks {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water
    public static void main(String[] args) {


        List<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("milk");
        drinks.add("orange Juice");
        drinks.add("tea");

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(drinks.get(i));
                drinks.add(i, "water");
            }
        }
        System.out.println(drinks);
    }
}


