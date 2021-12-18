package com.syntax.HomeWork28;

import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {
        Map<Integer, Person> personMap = new TreeMap<>();

        personMap.put(1, new Person("John","Smith",30,90000));
        personMap.put(2, new Person("Ann", "Klein", 35, 78000));
        personMap.put(3, new Person("Alex", "White", 45, 86000));

        for (Integer key : personMap.keySet()) {
            Person person = personMap.get(key);
            System.out.println(key + " " + person.toString());
        }
        for(Person per: personMap.values()){//retrieving values
            System.out.println(per);

        }
    }
}
