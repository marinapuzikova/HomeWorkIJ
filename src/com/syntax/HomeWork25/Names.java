package com.syntax.HomeWork25;

import java.util.ArrayList;

public class Names {
    /*
    Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {


        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Marina");
        listOfNames.add("Irina");
        listOfNames.add("Eleni");
        listOfNames.add("Olga");
        listOfNames.add("Anna");

        System.out.println(listOfNames.isEmpty());
        System.out.println(listOfNames.contains("Jack"));
        System.out.println("Array contains " + listOfNames.size() + " elements");
        System.out.println("Names inside of array are " + listOfNames);


    }
}
