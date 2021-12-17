package com.syntax.HomeWork28;

import java.util.Collection;
import java.util.LinkedList;

public class Task6 {
    /*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        Collection<Integer> numbers = new LinkedList<>();

       numbers.add(10);
       numbers.add(10);
       numbers.add(15);
       numbers.add(15);

        Integer sum=0;
        for (Integer num:numbers) {
            sum= sum + num;
        }
        System.out.println("Sum of all numbers is: " + sum);

    }
}
