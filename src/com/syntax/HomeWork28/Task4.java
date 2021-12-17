package com.syntax.HomeWork28;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task4 {
    /*
    Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     */
    public static void main(String[] args) {
        Map<String, Integer> employee = new LinkedHashMap<>();
        employee.put("Stephan Moor", 105000);
        employee.put("Alex White", 132000);
        employee.put("Ann Klein", 128000);
        employee.put("John Smith", 155000);

        Set<Map.Entry<String, Integer>> entrySet = employee.entrySet();
        Map.Entry<String, Integer> highestSalary = null;
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (highestSalary == null || entry.getValue().compareTo(highestSalary.getValue()) > 0) {
                highestSalary = entry;
            }
        }
        System.out.println(highestSalary.getKey() + " =$" + highestSalary.getValue());
    }
}

