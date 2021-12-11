package com.syntax.HomeWork26;

import java.util.ArrayList;

public class Cars {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
     */
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Lexus");

        System.out.println("First way to retrieve cars from an array: ");
        System.out.println(cars);
        System.out.println("Second way to retrieve cars from an array: ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i)+" ");
        }
        System.out.println();
        System.out.println("Third way to retrieve cars from an array:");
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}

