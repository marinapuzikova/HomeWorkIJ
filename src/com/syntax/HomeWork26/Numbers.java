package com.syntax.HomeWork26;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    /*
    Create an arrayList of even numbers from 1 to 50.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        for (int j = 0; j < numbers.size(); j++) {
            if ((numbers.get(j) % 5) == 0) {
                numbers.remove(j);
            }
        }

        System.out.println(numbers);
    }

}


