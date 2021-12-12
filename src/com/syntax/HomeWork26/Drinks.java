package com.syntax.HomeWork26;

import java.util.ArrayList;
import java.util.List;

public class Drinks {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water
    public static void main(String[] args) {


        List<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("milk");
        drinks.add("Orange Juice");
        drinks.add("tea");
//not changing the size of the list and updating the elements so we can NOT use enhanced forloop
        /*for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).toLowerCase().contains("a") || drinks.get(i).contains("e")) {
                //drinks.remove(drinks.get(i));
                //drinks.add(i, "water");
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);

         */
        for (int i = 0; i < drinks.size(); i++) {//another way to solve thos task

            if (drinks.get(i).toLowerCase().replaceAll("[ae]", "").length() < drinks.get(i).length()) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);

    }
}


