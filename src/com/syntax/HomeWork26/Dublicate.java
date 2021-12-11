package com.syntax.HomeWork26;

import java.util.*;

public class Dublicate {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println("Original List:");
        System.out.println(aList);
        HashSet<String> hashSet=new HashSet<>(aList);
        System.out.println("Removing duplicates names:");
        System.out.println(hashSet);

    }

}


