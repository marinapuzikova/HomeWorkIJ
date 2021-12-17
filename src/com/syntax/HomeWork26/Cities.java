package com.syntax.HomeWork26;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Cities {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {


        Set<String> cities = new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Moscow");
        cities.add("Rome");
        cities.add("Istanbul");
        cities.add("Samara");
        cities.add("Atlanta");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println("List of cities " + cities);
    }
}
