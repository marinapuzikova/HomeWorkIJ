package com.syntax.HomeWork26;

import java.util.Iterator;
import java.util.TreeSet;

public class Countries {
    /*
    Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.
     */
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Russia");
        countries.add("United States");
        countries.add("Mexico");
        countries.add("Spain");
        countries.add("Italy");
        countries.add("Antigua");
        System.out.println("Countries in alphabetic order:"+countries);

        System.out.println("Countries in alphabetic order:");
        Iterator<String> country = countries.iterator();
        while (country.hasNext()) {
            System.out.print(country.next()+" ");
        }
    }
}

