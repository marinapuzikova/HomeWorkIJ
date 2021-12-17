package com.syntax.HomeWork28;

import java.util.LinkedList;
import java.util.List;

public class Task5 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        StringBuilder stringBuilder = new StringBuilder();
        for (String item : list) {
            stringBuilder.append(item);
        }

        System.out.println(stringBuilder.toString());
    }
}
