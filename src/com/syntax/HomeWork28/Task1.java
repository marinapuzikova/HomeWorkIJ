package com.syntax.HomeWork28;

import java.util.*;

public class Task1 {
    /*
   Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {

        TreeMap<String, String> capitalMatch = new TreeMap<>();
        capitalMatch.put("Russia", "Moscow");
        capitalMatch.put("USA", "Washington DC");
        capitalMatch.put("Italy", "Rome");
        capitalMatch.put("Aruba", "Oranjestad");
        capitalMatch.put("Costa Rica", "San Jose");
        Set<String> keys = capitalMatch.keySet();
        for (String key : keys) {
            System.out.println("key is " + key + " and value is " + capitalMatch.get(key));
        }
        Iterator<String> iterator1= keys.iterator();
        while (iterator1.hasNext()) {
            String key= iterator1.next();
            System.out.println("key is " + key + " and value is " + capitalMatch.get(key));
        }

        //Printing all values from a country map using for each loop
        Collection<String> values = capitalMatch.values();// //print all values by Collection
        for (String value : values) {
            System.out.println(value);
        }
        //Printing all values from a country map using iterator.
        Iterator<String> iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            String value = iterator2.next();
            System.out.println(value);
        }
    }

}
