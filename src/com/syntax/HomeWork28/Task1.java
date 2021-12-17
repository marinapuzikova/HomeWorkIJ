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

        Set<Map.Entry<String, String>> entrySet = capitalMatch.entrySet();
        for (Map.Entry<String, String> entry : entrySet//printing all keys and values using for each loop
        ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator<Map.Entry<String, String>> iterator = capitalMatch.entrySet().iterator();//printing all keys and values using for each loop
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
        }
        System.out.println(capitalMatch);


        Collection<String> values = capitalMatch.values();// //print all values by Collection
        System.out.println(values);
        Iterator<String> iterator2 = capitalMatch.values().iterator();
        while (iterator2.hasNext()) {
            String value = iterator2.next();

        }
        System.out.println(capitalMatch);
    }

}
