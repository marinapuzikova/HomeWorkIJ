package com.syntax.HomeWork26;

import java.util.ArrayList;
import java.util.Iterator;

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
        cars.add(1, "Ferrari");//will be added at index number 1

        System.out.println("First way to retrieve cars from an array: ");
        System.out.println(cars);
        System.out.println("____________________________________________");
        System.out.println("Second way to retrieve cars from an array: ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) + " has " + cars.get(i).length() + " characters");//length() method is for string ,size() method for lists and length is for arrays

        }
        System.out.println("____________________________________________");
        System.out.println("Third way to retrieve cars from an array:");
        for (String car : cars) {// because we are only using loop to access the elements there is no harm in using the loop
            System.out.print(car + " ");
        }
        System.out.println("____________________________________________");
        System.out.println("Fourth way to retrieve cars from an array:");
        int i = 0;
        while (i < cars.size()) {
            System.out.println(cars.get(i));
            i++;
        }
        System.out.println("____________________________________________");
        System.out.println("Fifth way to retrieve cars from an array:");
        Iterator<String>iterator=cars.iterator();
        while (iterator.hasNext()){//hasNext() returns true if there are still any elements in Iterator
            String arr= iterator.next();
            System.out.println(arr);
        }
        System.out.println("**********************");
        System.out.println(cars.get(cars.size()-1));
        }
    }


