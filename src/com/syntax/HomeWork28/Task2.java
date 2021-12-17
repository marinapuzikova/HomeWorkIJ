package com.syntax.HomeWork28;

import java.util.HashMap;

public class Task2 {
    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        HashMap<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(123456, "Mobile Phone");
        bestBuy.put(123457, "Video Camera");
        bestBuy.put(123458, "Dryer");
        bestBuy.put(123459, "Car Stereo");
        bestBuy.put(1234510, "LapTop");
        System.out.println(bestBuy.entrySet());//it will return us both keys and values
    }
}
